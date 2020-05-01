package source.open.akash.kotlinexample.Intent.ExplicitIntentActivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import source.open.akash.kotlinexample.R

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //fetching data from Intent and show in textview of given activity
        secondActivityData.text = intent.getStringExtra("data")
    }
}
