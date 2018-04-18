package com.example.user.hci;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MapsActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView Cay1, Cay2, Cay3;
    private ImageView BackGround;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        addView();

    }

    private void addView() {
        Typeface font = Typeface.createFromAsset(getAssets(), "fa-solid-900.ttf");
        Cay1 = (TextView)findViewById(R.id.tv_cay1);
        Cay2 = (TextView)findViewById(R.id.tv_cay2);
        Cay3 = (TextView)findViewById(R.id.tv_cay3);
        Cay1.setTypeface(font);
        Cay2.setTypeface(font);
        Cay3.setTypeface(font);
        Cay1.setText("\uf1bb");
        Cay2.setText("\uf1bb");
        Cay3.setText("\uf1bb");

        Cay1.setOnClickListener(this);
        Cay2.setOnClickListener(this);
        Cay3.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id==R.id.tv_cay1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Tưới Cây");
            builder.setMessage("Bạn có muốn tưới cây này không ?");
            builder.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            builder.setPositiveButton("Đồng Ý", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(MapsActivity.this, TuoiCayActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("dulieu","Cây số 1");
                    intent.putExtra("MyPackage",bundle);
                    startActivity(intent);
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }else if(id ==R.id.tv_cay2){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Tưới Cây");
            builder.setMessage("Bạn có muốn tưới cây này không ?");
            builder.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            builder.setPositiveButton("Đồng Ý", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(MapsActivity.this, TuoiCayActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("dulieu","Cây số 2");
                    intent.putExtra("MyPackage",bundle);
                    startActivity(intent);
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        }else if(id==R.id.tv_cay3){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Tưới Cây");
            builder.setMessage("Bạn có muốn tưới cây này không ?");
            builder.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            builder.setPositiveButton("Đồng Ý", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(MapsActivity.this, TuoiCayActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("dulieu","Cây số 3");
                    intent.putExtra("MyPackage",bundle);
                    startActivity(intent);
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
    }

//    private void showalertDialog() {
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Tưới Cây");
//        builder.setMessage("Bạn có muốn tưới cây này không ?");
//        builder.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                dialogInterface.dismiss();
//            }
//        });
//        builder.setPositiveButton("Đồng Ý", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//            }
//        });
//        AlertDialog alertDialog = builder.create();
//        alertDialog.show();
    }


