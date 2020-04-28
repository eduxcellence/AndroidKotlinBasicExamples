package source.open.akash.kotlinexample.Widgets.TextView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_text_view.*
import source.open.akash.kotlinexample.R

class TextView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)
        textView.text=getString(R.string.textString)
    }
}
