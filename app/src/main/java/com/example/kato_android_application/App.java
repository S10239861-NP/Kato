package com.example.kato_android_application;

import android.content.Context;

public class App {
    private Context context = null;

    public static App instance = new App();

    public String tag = "";

    private App()
    {

    }

    public void init(Context applicationContext)
    {
        this.context = applicationContext;

        this.tag = this.context.getString(R.string.app_name);
    }
}
