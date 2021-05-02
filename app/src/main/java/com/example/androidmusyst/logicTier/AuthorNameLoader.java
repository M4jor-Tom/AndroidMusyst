package com.example.androidmusyst.logicTier;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;

import com.example.androidmusyst.MusicFindyst.src.musicFindystPackage.TooMuchQueriesException;
import com.example.androidmusyst.presentationTier.AuthorActivity;
import com.example.androidmusyst.presentationTier.MainActivity;

public class AuthorNameLoader extends AsyncTaskLoader<String>
{
    private String _authorName;

    public AuthorNameLoader(@NonNull Context context)
    {
        super(context);
    }

    @Nullable
    @Override
    public String loadInBackground()
    {
        try
        {
            String potentialTypo = AuthorActivity.getSearchBar().getText().toString();
            String authorName = MainActivity.getLogicInterface().correctAuthorName(potentialTypo);
            System.out.println(toString() + "::loadInBackGround() " + potentialTypo + " then " + authorName);
            return authorName;
        }
        catch(TooMuchQueriesException e)
        {
            Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_LONG).show();
        }
        return getAuthorName();
    }

    private String getAuthorName()
    {
        return _authorName;
    }

    public void setAuthorName(String authorName)
    {
        _authorName = authorName;
    }
}