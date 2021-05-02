package com.example.androidmusyst.presentationTier;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

abstract public class SearchableActivity extends AppCompatActivity
{
    private EditText _searchBar;
    private MaterialButton _searchMaterialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    protected EditText getSearchBar()
    {
        return _searchBar;
    }

    protected void setSearchBar(EditText searchBar)
    {
        _searchBar = searchBar;
    }

    protected MaterialButton getSearchMaterialButton()
    {
        return _searchMaterialButton;
    }

    protected void setSearchMaterialButton(MaterialButton searchMaterialButton)
    {
        _searchMaterialButton = searchMaterialButton;
    }
}