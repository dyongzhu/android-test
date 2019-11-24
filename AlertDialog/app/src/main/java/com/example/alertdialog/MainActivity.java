package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button_1);
        Button button2=(Button) findViewById(R.id.button_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
               dialog.setTitle("This is Dialog");
               dialog.setMessage("something important");
               dialog.setCancelable(false);

                dialog.setPositiveButton("确定",new DialogInterface.OnClickListener(){
                   @Override
                   public  void onClick(DialogInterface dialog,int which){}
              });
               dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                   }
               });
               dialog.show();
            }
    });
         button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
                 progressDialog.setTitle("进度提示框");
                 progressDialog.setMessage("加载中。。。。");
                 progressDialog.setCancelable(true);
                 progressDialog.show();
             }
         });
    }

}
