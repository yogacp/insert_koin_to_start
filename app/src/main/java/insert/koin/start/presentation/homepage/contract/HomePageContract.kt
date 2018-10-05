package insert.koin.start.presentation.homepage.contract

/**
 * Created by Yoga C. Pranata on 05/10/2018.
 * Android Engineer
 */
class HomePageContract {
    interface View {
        fun initView()
        fun setTextView(response: String)
    }

    interface UserActionListener {
        fun getHelloWorld()
    }
}