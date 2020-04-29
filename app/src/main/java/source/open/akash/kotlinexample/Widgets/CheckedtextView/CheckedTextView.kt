package source.open.akash.kotlinexample.Widgets.CheckedtextView

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_checked_text_view.*
import source.open.akash.kotlinexample.R

class CheckedTextView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checked_text_view)

        checkedTextView.setOnClickListener {
            checkedTextView.toggle()
        }
    }
}
