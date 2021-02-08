package com.mindorks.bootcamp.learndagger.di.modules;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private MyApplication application;

    public ApplicationModule(MyApplication myApplication) {
        this.application = myApplication;
    }

    @Singleton
    @Provides
    NetworkService provideNetworkService() {
        return new NetworkService(application, "abc");
    }

    @Singleton
    @Provides
    DatabaseService provideDatabaseService() {
        return new DatabaseService(application, "xyz", 1);
    }
}

