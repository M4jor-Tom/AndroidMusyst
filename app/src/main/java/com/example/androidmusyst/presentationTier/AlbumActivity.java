package com.example.androidmusyst.presentationTier;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import com.example.androidmusyst.R;
import com.google.android.material.button.MaterialButton;

public class AlbumActivity extends AppCompatActivity
{
    private static EditText _searchBar;
    private static MaterialButton _searchMaterialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        setSearchBar((EditText)findViewById(R.id.albumSearchBar));
        setSearchMaterialButton((MaterialButton)findViewById(R.id.albumSearchMaterialButton));
    }

    public static EditText getSearchBar()
    {
        return _searchBar;
    }

    protected static void setSearchBar(EditText searchBar)
    {
        _searchBar = searchBar;
    }

    protected static MaterialButton getSearchMaterialButton()
    {
        return _searchMaterialButton;
    }

    protected static void setSearchMaterialButton(MaterialButton searchMaterialButton)
    {
        _searchMaterialButton = searchMaterialButton;
    }
}