package com.example.androidmusyst.presentationTier;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidmusyst.R;

public class AuthorActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);

        EditText authorSearchBar = (EditText)findViewById(R.id.authorSearchBar);
    }
}