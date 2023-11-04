package com.example.phonesbrand

import android.app.Application
import com.example.phonesbrand.ui.di.appModule
import com.example.phonesbrand.ui.di.phoneViewModels
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin


class PhonesApplication : Application() {
    //val dependencyContainer = DependencyContainer()
    override fun onCreate() {
        super.onCreate()
        startKoin {
            // declare used Android context
            androidContext(this@PhonesApplication)
            // declare modules
            modules(listOf(appModule, phoneViewModels))
        }
    }
}