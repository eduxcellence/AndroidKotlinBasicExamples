package source.open.akash.kotlinexample.Image.ImageView

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_image_view.*
import source.open.akash.kotlinexample.R

class ImageViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)
        imageView.setOnClickListener {
            Toast.makeText(applicationContext, "Image View Pressed", Toast.LENGTH_SHORT).show()
        }
    }
}
