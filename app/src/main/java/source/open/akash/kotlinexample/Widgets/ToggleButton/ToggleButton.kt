package source.open.akash.kotlinexample.Widgets.ToggleButton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_toggle_button.*
import source.open.akash.kotlinexample.R


class ToggleButton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)

        toogleButton.setOnClickListener {

            if (toogleButton.isChecked) {
                val img = applicationContext.resources.getDrawable(R.drawable.ic_volume_up_black_24dp)
                img.setBounds(0, 0, 50, 50)
                toogleButton.setCompoundDrawables(img, null, null, null)
            } else {
                val img = applicationContext.resources.getDrawable(R.drawable.ic_volume_off_black)
                img.setBounds(0, 0, 50, 50)
                toogleButton.setCompoundDrawables(img, null, null, null)
            }
        }

    }
}
