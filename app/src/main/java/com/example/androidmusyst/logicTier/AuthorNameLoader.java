package com.example.androidmusyst.logicTier;

import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;

import com.example.androidmusyst.MusicFindyst.src.musicFindystPackage.TooMuchQueriesException;
import com.example.androidmusyst.presentationTier.AuthorActivity;
import com.example.androidmusyst.presentationTier.MainActivity;

public class AuthorNameLoader extends NameLoader
{
    public AuthorNameLoader(@NonNull Context context, EditText searchBar)
    {
        super(context, searchBar);
    }

    @Nullable
    @Override
    public String loadInBackground()
    {
        String potentialTypo = getSearchBar().getText().toString();
        try
        {
            String authorName = MainActivity.getLogicInterface().correctAuthorName(potentialTypo);
            System.out.println(toString() + "::loadInBackGround() " + potentialTypo + " then " + authorName);
            return authorName;
        }
        catch(TooMuchQueriesException e)
        {
            Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_LONG).show();
        }
        return potentialTypo;
    }
}