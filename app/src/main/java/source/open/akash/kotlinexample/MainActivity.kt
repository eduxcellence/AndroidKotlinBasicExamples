package source.open.akash.kotlinexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import source.open.akash.kotlinexample.Widgets.Widgets


/**
 * Created by Akash Kumar  of Eduxcellence on 4/28/2020.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     WidgetsDemo.setOnClickListener {
         startActivity(Intent(this@MainActivity, Widgets::class.java))

     }

    }
}
