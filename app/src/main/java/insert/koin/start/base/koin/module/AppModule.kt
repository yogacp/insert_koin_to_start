package insert.koin.start.base.koin.module

import insert.koin.start.base.data.network.AppDataStore
import insert.koin.start.base.data.network.AppRepository
import insert.koin.start.presentation.homepage.presenter.HomePagePresenter
import org.koin.dsl.module.module

/**
 * Created by Yoga C. Pranata on 05/10/2018.
 * Android Engineer
 */
val appModule = module {

    // Single instance for Repository
    single<AppRepository> { AppDataStore() }

    // Presenter Factory
    factory { HomePagePresenter(get()) }
}