package source.open.akash.kotlinexample.Intent.ExplicitIntentActivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import source.open.akash.kotlinexample.R

class SharedElementTransitionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_element_transition)
    }

    override fun onBackPressed() {
        supportFinishAfterTransition()
    }
}
