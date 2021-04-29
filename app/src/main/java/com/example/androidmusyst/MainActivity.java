package com.example.androidmusyst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton authorButton = (MaterialButton)findViewById(R.id.authorMainButton);
        MaterialButton albumButton = (MaterialButton)findViewById(R.id.albumMainButton);
        MaterialButton playlistButton = (MaterialButton)findViewById(R.id.playlistMainButton);

        authorButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, AuthorActivity.class);
                startActivity(intent);
            }
        });
    }
}