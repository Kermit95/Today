package io.github.kermit95.today.main;

import android.app.Application;
import android.content.Context;


/**
 * Created by kermit on 16/3/16.
 */
public class App extends Application{

    private static App instance;

    public static Context getInstance(){
        return instance;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
