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
import com.example.androidmusyst.logicTier.AlbumNameLoader;
import com.google.android.material.button.MaterialButton;

public class AlbumActivity extends SearchableActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        setSearchBar((EditText)findViewById(R.id.albumSearchBar));
        setSearchMaterialButton((MaterialButton)findViewById(R.id.albumSearchMaterialButton));

        getSearchMaterialButton().setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View v)
            {
                getSupportLoaderManager().initLoader(1, null, AlbumActivity.this).forceLoad();
                return false;
            }
        });
    }

    @NonNull
    @Override
    public Loader<String> onCreateLoader(int id, @Nullable Bundle args)
    {
        return new AlbumNameLoader(getApplicationContext(), getSearchBar());
    }
}