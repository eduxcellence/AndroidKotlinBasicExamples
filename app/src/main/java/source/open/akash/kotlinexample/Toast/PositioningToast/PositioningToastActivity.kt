package source.open.akash.kotlinexample.Toast.PositioningToast

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import source.open.akash.kotlinexample.R

class PositioningToastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_positioning_toast)

    }

    fun toastClickPosition(view: View) {
        when (view.id) {
            R.id.toastLeft -> {
                var toast = Toast.makeText(
                    this@PositioningToastActivity, "This is Left Position Toast ",
                    Toast.LENGTH_LONG
                )
                toast.setGravity(Gravity.START, 0, 0)
                toast.show()
            }
            R.id.toastRight -> {
                var toast = Toast.makeText(
                    this@PositioningToastActivity, "This is Right Position Toast ",
                    Toast.LENGTH_LONG
                )
                toast.setGravity(Gravity.END, 0, 0)
                toast.show()
            }
            R.id.toastBottom -> {
                var toast = Toast.makeText(
                    this@PositioningToastActivity, "This is Bottom Position Toast ",
                    Toast.LENGTH_LONG
                )
                toast.setGravity(Gravity.BOTTOM, 0, 0)
                toast.show()
            }
            R.id.toastCenter -> {
                var toast = Toast.makeText(
                    this@PositioningToastActivity, "This is Center Position Toast ",
                    Toast.LENGTH_LONG
                )
                toast.setGravity(Gravity.CENTER, 0, 0)
                toast.show()
            }
            R.id.toastTop -> {
                var toast = Toast.makeText(
                    this@PositioningToastActivity, "This is Top Position Toast ",
                    Toast.LENGTH_LONG
                )
                toast.setGravity(Gravity.TOP, 0, 0)
                toast.show()
            }
            R.id.toastTopLeft -> {
                var toast = Toast.makeText(
                    this@PositioningToastActivity, "This is Top Left Position Toast ",
                    Toast.LENGTH_LONG
                )
                toast.setGravity(Gravity.TOP or Gravity.START, 0, 0)
                toast.show()
            }
            R.id.toastTopRight -> {
                var toast = Toast.makeText(
                    this@PositioningToastActivity, "This is Top Right Position Toast ",
                    Toast.LENGTH_LONG
                )
                toast.setGravity(Gravity.TOP or Gravity.END, 0, 0)
                toast.show()
            }
        }

    }
}
