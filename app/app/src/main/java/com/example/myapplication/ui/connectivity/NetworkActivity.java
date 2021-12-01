package com.example.myapplication.ui.connectivity;

import android.content.Context;

import com.android.volley.Cache;
import com.android.volley.toolbox.DiskBasedCache;

public class NetworkActivity {
    private Context mContext;
    Cache cache;

    public NetworkActivity(Context mContext) {
        this.mContext = mContext;
        this.cache = new DiskBasedCache(mContext.getCacheDir(), 1024 * 1024);
    }
}
