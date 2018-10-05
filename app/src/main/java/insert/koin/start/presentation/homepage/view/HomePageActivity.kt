package insert.koin.start.presentation.homepage.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import insert.koin.start.R
import insert.koin.start.presentation.homepage.contract.HomePageContract
import insert.koin.start.presentation.homepage.presenter.HomePagePresenter
import kotlinx.android.synthetic.main.activity_homepage.*
import org.koin.android.ext.android.inject

/**
 * Created by Yoga C. Pranata on 05/10/2018.
 * Android Engineer
 */
class HomePageActivity : AppCompatActivity(), HomePageContract.View {

    val mPresenter: HomePagePresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        initView()
    }

    override fun initView() {
        mPresenter.view = this
        mPresenter.getHelloWorld()
    }

    override fun setTextView(response: String) {
        tvHomepage.text = response
    }

}