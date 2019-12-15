package com.ARashad96.androidbeginnerdeveloperkit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class showandhidegame extends AppCompatActivity {
    TextView text;
    Button show;
    Button hide;
    Button github;
    Button info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showandhidegame);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        text = findViewById(R.id.text);

        show = findViewById(R.id.show);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.getAlpha() == 0) {
                    text.setAlpha(1);
                    Toast.makeText(showandhidegame.this, "Yeaaaaaaaaaaaaaaaa!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(showandhidegame.this, "I am here already", Toast.LENGTH_SHORT).show();
                }
            }
        });
        hide = findViewById(R.id.hide);
        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text.getAlpha() == 1) {
                    text.setAlpha(0);
                    Toast.makeText(showandhidegame.this, "Nooooooooooooooooo!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(showandhidegame.this, "No way you could see me", Toast.LENGTH_SHORT).show();
                }
            }
        });
        github = findViewById(R.id.github);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ARashad96/showandhidegame"));
                startActivity(intent);
            }
        });
        info = findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new android.app.AlertDialog.Builder(showandhidegame.this)
                        .setIcon(R.drawable.profile)
                        .setTitle("App info")
                        .setMessage("This app is performing a simple show and hide text using buttons, toast, textview and linearlayout.")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                        .show();
            }
        });
    }
}
