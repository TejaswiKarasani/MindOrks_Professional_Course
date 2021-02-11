package com.mindorks.bootcamp.learndagger.di.modules;

import android.app.Activity;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.ui.MainActivity;
import com.mindorks.bootcamp.learndagger.ui.MainViewModel;

import dagger.Module;
import dagger.Provides;
@Module
public class ActivityModule {

    private Activity activity;

    public ActivityModule(MainActivity activity) {
        this.activity = activity;
    }

    @Provides
    MainViewModel provideMainViewModel(NetworkService networkService,
                                       DatabaseService databaseService){
        return new MainViewModel(databaseService, networkService);
    }
}
