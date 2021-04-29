package com.example.androidmusyst.presentationTier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.androidmusyst.R;
import com.example.androidmusyst.Versionyst.src.versionystPackage.Versionyst;
import com.example.androidmusyst.config.AndroidMusistVersionable;
import com.google.android.material.button.MaterialButton;

import java.util.HashMap;

import resourcePackage.ResourcystVersionable;

public class MainActivity extends AppCompatActivity
{
    public static void versionsCheck()
    {
        //Variables initialization
        HashMap<String, Integer> existingDependencies = new HashMap<>();
        versionystPackage.Versionable[] versionables =
                {
                        new AndroidMusistVersionable(),
                        new Versionyst(),
                        new ResourcystVersionable()
                };

        //Versions setting
        existingDependencies.put("AndroidMusistVersionable", versionables[0].getVersionId());
        existingDependencies.put("Versionyst", versionables[1].getVersionId());
        existingDependencies.put("ResourcystVersionable", versionables[2].getVersionId());

        //Versions checking
        for(versionystPackage.Versionable versionable: versionables)
            versionable.checkSubPackagesVersions(existingDependencies);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        versionsCheck();

        MaterialButton authorButton = (MaterialButton)findViewById(R.id.authorMainButton);
        MaterialButton albumButton = (MaterialButton)findViewById(R.id.albumMainButton);
        MaterialButton playlistButton = (MaterialButton)findViewById(R.id.playlistMainButton);

        authorButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, AuthorActivity.class);
                startActivity(intent);
            }
        });

        albumButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(intent);
            }
        });

        playlistButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });
    }
}