package source.open.akash.kotlinexample.Widgets

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_widgets.*
import source.open.akash.kotlinexample.R
import source.open.akash.kotlinexample.Widgets.Button.Button
import source.open.akash.kotlinexample.Widgets.CheckBox.CheckBox
import source.open.akash.kotlinexample.Widgets.EditText.EditText
import source.open.akash.kotlinexample.Widgets.RadioButton.RadioButton
import source.open.akash.kotlinexample.Widgets.RatingBar.RatingBar
import source.open.akash.kotlinexample.Widgets.TextView.TextView

class Widgets : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widgets)

        TextViewDemo.setOnClickListener {
            val intent = Intent(this, TextView::class.java)
            startActivity(intent)
        }
        EditTextDemo.setOnClickListener {
            val intent = Intent(this, EditText::class.java)
            startActivity(intent)

        }
        ButtonViewDemo.setOnClickListener {
            val intent = Intent(this, Button::class.java)
            startActivity(intent)
        }
        RadioButtonDemo.setOnClickListener {
            val intent = Intent(this, RadioButton::class.java)
            startActivity(intent)
        }
        CheckBoxDemo.setOnClickListener {
            val intent = Intent(this, CheckBox::class.java)
            startActivity(intent)
        }
        RatingBarDemo.setOnClickListener {
            val intent = Intent(this, RatingBar::class.java)
            startActivity(intent)
        }
    }
}
