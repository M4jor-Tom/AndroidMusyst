package com.example.androidmusyst.config;

import com.example.androidmusyst.Versionyst.src.versionystPackage.*;

public class AndroidMusistVersionable extends versionystPackage.Versionable
{
    public AndroidMusistVersionable()
    {
        super();
        getDependencies().put("Versionyst", 4);
    }

    @Override
    public Integer getVersionId() {
        return null;
    }
}