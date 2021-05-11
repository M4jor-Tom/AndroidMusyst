package com.example.androidmusyst.logicTier;

import android.content.Context;

import com.example.androidmusyst.MusicFindyst.src.musicFindystPackage.GoogleMusicScraper;

public class Logic extends GoogleMusicScraper implements LogicInterface
{
    private Context _context;

    public Logic(Context context)
    {
        super();
        setContext(context);
    }

    private Context getContext()
    {
        return _context;
    }

    private void setContext(Context context)
    {
        _context = context;
    }
}