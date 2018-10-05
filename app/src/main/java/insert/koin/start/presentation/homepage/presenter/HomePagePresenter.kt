package insert.koin.start.presentation.homepage.presenter

import insert.koin.start.base.data.network.AppRepository
import insert.koin.start.presentation.homepage.contract.HomePageContract

/**
 * Created by Yoga C. Pranata on 05/10/2018.
 * Android Engineer
 */
class HomePagePresenter (val repository: AppRepository) : HomePageContract.UserActionListener {

    var view: HomePageContract.View? = null

    override fun getHelloWorld() {
        val response =  repository.requestHelloWorld()
        view?.setTextView(response)
    }

}