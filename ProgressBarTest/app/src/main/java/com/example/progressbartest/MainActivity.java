package com.example.progressbartest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

//public class MainActivity extends AppCompatActivity
//{
//    private  ProgressBar progressBar;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.activity_main);
//        Button button=(Button) findViewById(R.id.button);
//        final ProgressBar progressBar=(ProgressBar) findViewById(R.id.progressBar_1);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                            if(progressBar.getVisibility() == View.GONE) {
//                                progressBar.setVisibility(View.VISIBLE);
//                            }
//                            else {
//                                progressBar.setVisibility(View.GONE);
//
//                    }
//                }
//
//        });
//
//    }
//
//}
//public class MainActivity extends AppCompatActivity implements View.OnClickListener
//{
//    private  ProgressBar progressBar;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Button button=(Button) findViewById(R.id.button);
//        progressBar=(ProgressBar) findViewById(R.id.progressBar_1);
//        button.setOnClickListener(this);
//    }
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()) {
//                    case R.id.bottom:
//                    if (progressBar.getVisibility() == View.GONE) {
//                        progressBar.setVisibility(View.VISIBLE);
//                    } else {
//                        progressBar.setVisibility(View.GONE);
//
//                    }
//                    break;
//                    default:
//                        break;
//                }
//            }
//
//    }
public class MainActivity extends AppCompatActivity
{
    private  ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);
        final ProgressBar progressBar=(ProgressBar) findViewById(R.id.progressBar_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(progressBar.getVisibility() == View.GONE) {
//                    progressBar.setVisibility(View.VISIBLE);
//                }
//                else {
//                    progressBar.setVisibility(View.GONE);
//
//                }
                int progress=progressBar.getProgress();
                progress=progress+10;
                progressBar.setProgress(progress);
            }

        });

    }

}


