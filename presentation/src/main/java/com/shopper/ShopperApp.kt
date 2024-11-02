package com.shopper

import android.app.Application
import com.domain.di.domainModule
import com.shopper.di.presentationModule
import com.data.di.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ShopperApp :Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ShopperApp)
            modules(listOf(
                presentationModule,
                domainModule,
                dataModule
            ))
        }
    }
}
