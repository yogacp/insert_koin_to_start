package insert.koin.start

import android.app.Application
import insert.koin.start.base.koin.module.appModule
import org.koin.android.ext.android.startKoin

/**
 * Created by Yoga C. Pranata on 05/10/2018.
 * Android Engineer
 */
class MainApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(appModule))
    }
}