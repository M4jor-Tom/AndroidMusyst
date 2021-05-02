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

public class AuthorActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String>
{
    private static EditText _searchBar;
    private static MaterialButton _searchMaterialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);

        setSearchBar((EditText)findViewById(R.id.authorSearchBar));
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
        return new AuthorNameLoader(getApplicationContext());
    }

    @Override
    public void onLoadFinished(@NonNull Loader<String> loader, String data)
    {
        System.out.println(toString() + "::onLoadFinished() " + data);
        AuthorActivity.getSearchBar().setText(data);
    }

    @Override
    public void onLoaderReset(@NonNull Loader<String> loader)
    {

    }

    public static EditText getSearchBar()
    {
        return _searchBar;
    }

    protected static void setSearchBar(EditText searchBar)
    {
        _searchBar = searchBar;
    }

    protected static MaterialButton getSearchMaterialButton()
    {
        return _searchMaterialButton;
    }

    protected static void setSearchMaterialButton(MaterialButton searchMaterialButton)
    {
        _searchMaterialButton = searchMaterialButton;
    }
}