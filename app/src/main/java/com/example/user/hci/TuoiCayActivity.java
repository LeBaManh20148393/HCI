package com.example.user.hci;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TuoiCayActivity extends AppCompatActivity {
    private ListView DanhSachCay;
    private Spinner ChonCay;
    private Button Tuoi;
    private TextView thongbao;
    Integer keyword;
    String getlulieu;

    final String arr[] = {"Cây số 1", "Cây số 2", "Cây số 3", "Cây số 4", "Cây số 5", "Cây số 6"};
    ArrayList<String> arrDone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuoi_cay);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        addView();
        arrDone = new ArrayList<String>();
        final ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrDone);
        DanhSachCay.setAdapter(adapter1);
        //arrDone.add("");
        laydulieuMaps();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arr);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        ChonCay.setAdapter(adapter);
        ChonCay.setOnItemSelectedListener(new MyProcessEvent());
        Tuoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String CayCanTuoi = thongbao.getText().toString();
                arrDone.add(CayCanTuoi);
                adapter1.notifyDataSetChanged();
            }
        });


    }

    public void laydulieuMaps() {
        Intent callerIntent = getIntent();
        Bundle getBundle = callerIntent.getBundleExtra("MyPackage");
        getlulieu = getBundle.getString("dulieu");
        arrDone.add(getlulieu);
    }

    private void addView() {
        DanhSachCay = (ListView) findViewById(R.id.lv_listtree);
        ChonCay = (Spinner) findViewById(R.id.sp_danhsachcay);
        Tuoi = (Button) findViewById(R.id.btn_tuoi);
        thongbao = (TextView) findViewById(R.id.tv_checked);
    }

    private class MyProcessEvent implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            thongbao.setText(arr[arg2]);
        }

        public void onNothingSelected(AdapterView<?> arg0) {
            thongbao.setText("");
        }
    }
}
