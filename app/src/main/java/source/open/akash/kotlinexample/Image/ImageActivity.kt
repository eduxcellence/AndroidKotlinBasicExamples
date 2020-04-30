package source.open.akash.kotlinexample.Image

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_image.*
import source.open.akash.kotlinexample.Image.ImageButton.ImageButtonActivity
import source.open.akash.kotlinexample.Image.ImageSwitcher.ImageswitcherActivity
import source.open.akash.kotlinexample.Image.ImageView.ImageViewActivity
import source.open.akash.kotlinexample.R

class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        imageViewDemo.setOnClickListener {
            val intent = Intent(this, ImageViewActivity::class.java)
            startActivity(intent)
        }
        imageButtonDemo.setOnClickListener {
            val intent = Intent(this, ImageButtonActivity::class.java)
            startActivity(intent)
        }
        imageSwitcherDemo.setOnClickListener {
            val intent = Intent(this, ImageswitcherActivity::class.java)
            startActivity(intent)
        }

    }
}
