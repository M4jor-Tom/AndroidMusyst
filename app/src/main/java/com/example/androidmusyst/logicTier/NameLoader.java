package com.example.androidmusyst.logicTier;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import com.example.androidmusyst.MusicFindyst.src.musicFindystPackage.TooMuchQueriesException;
import com.example.androidmusyst.presentationTier.AlbumActivity;
import com.example.androidmusyst.presentationTier.MainActivity;

abstract public class NameLoader extends AsyncTaskLoader<String>
{
    private EditText _searchBar;

    public NameLoader(@NonNull Context context, EditText searchBar)
    {
        super(context);
        setSearchBar(searchBar);
    }

    protected EditText getSearchBar()
    {
        return _searchBar;
    }

    protected void setSearchBar(EditText searchBar)
    {
        _searchBar = searchBar;
    }
}