package source.open.akash.kotlinexample.Image.ImageSwitcher

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_imageswitcher.*
import source.open.akash.kotlinexample.R

class ImageswitcherActivity : AppCompatActivity() {
    var index = -1
    var arrImage =
        intArrayOf(R.drawable.ic_audiotrack, R.drawable.ic_volume_off_black, R.drawable.ic_volume_up_black_24dp)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imageswitcher)
        imageSwitcher.setFactory {
            val imageView = ImageView(applicationContext)
            imageView.scaleType = ImageView.ScaleType.FIT_XY
            imageView

        }

        prevImage.setOnClickListener {
            if (index > 0) {
                index -= 1
                imageSwitcher.setImageResource(arrImage[index])
            }
        }
        nextImage.setOnClickListener {
            if (index < arrImage.size - 1) {
                index += 1
                imageSwitcher.setImageResource(arrImage[index])
            }
        }


    }
}
