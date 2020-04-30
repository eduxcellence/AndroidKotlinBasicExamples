package source.open.akash.kotlinexample.Image.ImageButton

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_image_button.*
import source.open.akash.kotlinexample.R

class ImageButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)
        imageButton.setOnClickListener {
            Toast.makeText(applicationContext, "Image Button Pressed", Toast.LENGTH_SHORT).show()
        }
    }
}
