package source.open.akash.kotlinexample.Intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_intent_demo.*
import source.open.akash.kotlinexample.Intent.ExplicitIntentActivity.ExplicitActivity
import source.open.akash.kotlinexample.Intent.ImlicitIntentActivity.ImplicitActivity
import source.open.akash.kotlinexample.R

class IntentActivityDemo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_demo)
        explicit.setOnClickListener {
            val intent = Intent(
                this@IntentActivityDemo,
                ExplicitActivity::class.java
            )

            startActivity(intent)
        }
        implicit.setOnClickListener {
            val intent = Intent(
                this@IntentActivityDemo,
                ImplicitActivity::class.java
            )

            startActivity(intent)
        }
    }
}
