package source.open.akash.kotlinexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import source.open.akash.kotlinexample.AlertDialog.AlertDialogActivity
import source.open.akash.kotlinexample.Toast.ToastActivity
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
        ToastDemo.setOnClickListener {
            startActivity(Intent(this@MainActivity, ToastActivity::class.java))

        }
        AlertDialogDemo.setOnClickListener {
            startActivity(Intent(this@MainActivity, AlertDialogActivity::class.java))

        }

    }
}
