package source.open.akash.kotlinexample.Toast.SimpleToast

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import source.open.akash.kotlinexample.R

class SimpleToastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_toast)

    }

    fun toastClick(view: View) {
        when (view.id) {
            R.id.buttonShortToast -> Toast.makeText(
                this@SimpleToastActivity, "This is Simple Short toast",
                Toast.LENGTH_SHORT
            ).show()

            R.id.buttonLongToast -> Toast.makeText(
                this@SimpleToastActivity, "This is Simple Long toast",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
