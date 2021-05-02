package com.example.androidmusyst.logicTier;

import android.content.Context;

import com.example.androidmusyst.MusicFindyst.src.musicFindystPackage.GoogleMusicScraper;

public class Logic extends GoogleMusicScraper implements LogicInterface
{
    private Context _context;
    private AuthorNameLoader _authorNameLoader;

    public Logic(Context context)
    {
        super();
        setContext(context);
        setAuthorNameLoader(new AuthorNameLoader(getContext()));
    }

    private Context getContext()
    {
        return _context;
    }

    private void setContext(Context context)
    {
        _context = context;
    }

    private AuthorNameLoader getAuthorNameLoader()
    {
        return _authorNameLoader;
    }

    private void setAuthorNameLoader(AuthorNameLoader authorNameLoader)
    {
        _authorNameLoader = authorNameLoader;
    }
}