package source.open.akash.kotlinexample.Toast.CustomToast

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_custom_toast.*
import kotlinx.android.synthetic.main.custom_toast_layout.*
import source.open.akash.kotlinexample.R

class CustomToastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_toast)
        val layoutInflater: LayoutInflater = layoutInflater
        val viewCustom = layoutInflater.inflate(R.layout.custom_toast_layout, customLayout)
        customToastButton.setOnClickListener {
            val toast = Toast.makeText(this@CustomToastActivity, "Custom Activity Toast", Toast.LENGTH_LONG)
            toast.view = viewCustom
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }
    }
}
