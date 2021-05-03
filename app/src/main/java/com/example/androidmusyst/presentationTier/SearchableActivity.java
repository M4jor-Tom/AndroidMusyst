package com.example.androidmusyst.presentationTier;

import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import com.google.android.material.button.MaterialButton;

abstract public class SearchableActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String>
{
    private EditText _searchBar;
    private MaterialButton _searchMaterialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }


    public EditText getSearchBar()
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

    @Override
    public void onLoadFinished(@NonNull Loader<String> loader, String data)
    {
        System.out.println(toString() + "::onLoadFinished() " + data);
        getSearchBar().setText(data);
    }

    @Override
    public void onLoaderReset(@NonNull Loader<String> loader)
    {

    }
}