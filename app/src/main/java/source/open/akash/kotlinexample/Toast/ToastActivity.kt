package source.open.akash.kotlinexample.Toast

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_toast.*
import source.open.akash.kotlinexample.R
import source.open.akash.kotlinexample.Toast.ColoredToast.ColoredToastActivity
import source.open.akash.kotlinexample.Toast.CustomToast.CustomToastActivity
import source.open.akash.kotlinexample.Toast.PositioningToast.PositioningToastActivity
import source.open.akash.kotlinexample.Toast.SimpleToast.SimpleToastActivity

class ToastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)
        simpleToastDemo.setOnClickListener {
            val intent = Intent(this, SimpleToastActivity::class.java)
            startActivity(intent)
        }
        customToastDemo.setOnClickListener {
            val intent = Intent(this, CustomToastActivity::class.java)
            startActivity(intent)
        }
        positioningToastDemo.setOnClickListener {
            val intent = Intent(this, PositioningToastActivity::class.java)
            startActivity(intent)
        }
        coloredToastDemo.setOnClickListener {
            val intent = Intent(this, ColoredToastActivity::class.java)
            startActivity(intent)
        }
    }
}
