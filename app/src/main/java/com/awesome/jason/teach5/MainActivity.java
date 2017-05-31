package com.awesome.jason.teach5;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String filename;
    Context context;
    ProgressBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateTask ct = new CreateTask(filename, MainActivity.this, bar);
        ct.onPreExecute();



        /*    Context context = null;
        final File file = new File(context.getFilesDir(),"numbers.txt");
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    FileOutputStream outputStream;
                    try {
                        outputStream = openFileOutput("numbers.txt", Context.MODE_PRIVATE);
                        for (int i = 0; i<= 10; i++) {
                            outputStream.write(i);
                            Thread.sleep(250);
                        }
                        outputStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v){
                try (BufferedReader br = new BufferedReader(new FileReader(file))){
                    List list = new ArrayList();
                    for (int i = 0; i< 10; i++) {
                        ;
                        Thread.sleep(250);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
                                   }
        );
*/
    }

}
