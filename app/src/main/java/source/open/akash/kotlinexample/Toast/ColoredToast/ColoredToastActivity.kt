package source.open.akash.kotlinexample.Toast.ColoredToast

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_colored_toast.*
import source.open.akash.kotlinexample.R

class ColoredToastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colored_toast)
        coloredToast.setOnClickListener {
            val toast = Toast.makeText(this@ColoredToastActivity, "This is Colored Toast", Toast.LENGTH_SHORT)
            val view = toast.view
            view.setBackgroundResource(R.drawable.toastcoloredback)
            val coloredToastText = view.findViewById<TextView>(android.R.id.message)
            coloredToastText.setTextColor(Color.parseColor("#ffffff"))
            toast.show()
        }
    }
}
