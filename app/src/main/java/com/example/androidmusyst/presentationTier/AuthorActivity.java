package com.example.androidmusyst.presentationTier;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidmusyst.R;
import com.google.android.material.button.MaterialButton;

public class AuthorActivity extends SearchableActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);

        setSearchBar((EditText)findViewById(R.id.authorSearchBar));
        setSearchMaterialButton((MaterialButton)findViewById(R.id.authorSearchMaterialButton));
    }
}