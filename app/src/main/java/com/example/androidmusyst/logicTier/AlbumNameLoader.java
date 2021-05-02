package com.example.androidmusyst.logicTier;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import com.example.androidmusyst.MusicFindyst.src.musicFindystPackage.TooMuchQueriesException;
import com.example.androidmusyst.presentationTier.AlbumActivity;
import com.example.androidmusyst.presentationTier.MainActivity;

public class AlbumNameLoader extends AsyncTaskLoader<String>
{
    public AlbumNameLoader(@NonNull Context context) {
        super(context);
    }

    @Nullable
    @Override
    public String loadInBackground()
    {
        String potentialTypo = AlbumActivity.getSearchBar().getText().toString();
        try
        {
            String albumName = MainActivity.getLogicInterface().correctAlbumName(potentialTypo);
            System.out.println(toString() + "::loadInBackGround() " + potentialTypo + " then " + albumName);
            return albumName;
        }
        catch(TooMuchQueriesException e)
        {
            Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_LONG).show();
        }
        return potentialTypo;
    }
}