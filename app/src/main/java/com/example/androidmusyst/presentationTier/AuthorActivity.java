package com.example.androidmusyst.presentationTier;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;

import com.example.androidmusyst.MusicFindyst.src.musicFindystPackage.TooMuchQueriesException;
import com.example.androidmusyst.R;
import com.example.androidmusyst.logicTier.AuthorNameLoader;
import com.google.android.material.button.MaterialButton;

public class AuthorActivity extends SearchableActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);

        setSearchBar((EditText)findViewById(R.id.authorSearchBar));
        setCorrectMaterialButton((MaterialButton)findViewById(R.id.authorCorrectMaterialButton));
        setSearchMaterialButton((MaterialButton)findViewById(R.id.authorSearchMaterialButton));

        getSearchMaterialButton().setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View v)
            {
                getSupportLoaderManager().initLoader(0, null, AuthorActivity.this).forceLoad();
                return false;
            }
        });
    }

    @NonNull
    @Override
    public Loader<String> onCreateLoader(int id, @Nullable Bundle args)
    {
        return new AuthorNameLoader(getApplicationContext(), getSearchBar());
    }
}