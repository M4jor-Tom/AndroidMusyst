package com.example.androidmusyst.config;

import com.example.androidmusyst.Versionyst.src.versionystPackage.*;

public class AndroidMusistVersionable extends Versionable
{
    public AndroidMusistVersionable()
    {
        super();
        getDependencies().put("Versionyst", 5);
        getDependencies().put("ResourcystVersionable", 5);
        getDependencies().put("MusicFindystVersionable", 9);
    }

    @Override
    public Integer getVersionId() {
        return 1;
    }

    @Override
    protected String getPackageName() {
        return "AndroidMusyst";
    }
}