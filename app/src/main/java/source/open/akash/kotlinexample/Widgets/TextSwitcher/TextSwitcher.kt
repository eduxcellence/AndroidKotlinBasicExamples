package source.open.akash.kotlinexample.Widgets.TextSwitcher

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.ViewSwitcher
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_text_switcher.*
import source.open.akash.kotlinexample.R

class TextSwitcher : AppCompatActivity() {
    var index: Int = -1
    val textArray = arrayOf("Cute", "Selfish", "Beautiful", "Handsome", "Good Behaviour")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_switcher)

        tvHeader.text = "This is TextViewer Example"
        tvSwitcher.setFactory(object : ViewSwitcher.ViewFactory {
            override fun makeView(): View {
                val textView = TextView(this@TextSwitcher)
                textView.textSize = 18f
                textView.gravity = Gravity.CENTER
                return textView
            }

        })

        previous.setOnClickListener {
            if (index > 0) {
                index -= 1
                tvSwitcher.setText(textArray[index])
            }
        }
        next.setOnClickListener {
            if (index < textArray.size - 1) {
                index += 1
                tvSwitcher.setText(textArray[index])
            }
        }


    }
}
