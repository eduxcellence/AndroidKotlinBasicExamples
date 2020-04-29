package source.open.akash.kotlinexample.Widgets

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_widgets.*
import source.open.akash.kotlinexample.R
import source.open.akash.kotlinexample.Widgets.AutoCompletetextView.AutoCompleteTextView
import source.open.akash.kotlinexample.Widgets.Button.Button
import source.open.akash.kotlinexample.Widgets.CheckBox.CheckBox
import source.open.akash.kotlinexample.Widgets.CheckedtextView.CheckedTextView
import source.open.akash.kotlinexample.Widgets.EditText.EditText
import source.open.akash.kotlinexample.Widgets.MultiAutoCompleteTextView.MultiAutoCompletetextView
import source.open.akash.kotlinexample.Widgets.ProgressBar.ProgressActivity
import source.open.akash.kotlinexample.Widgets.RadioButton.RadioButton
import source.open.akash.kotlinexample.Widgets.RatingBar.RatingBar
import source.open.akash.kotlinexample.Widgets.ScrollView.ScrollView
import source.open.akash.kotlinexample.Widgets.Spinner.SpinnerActivity
import source.open.akash.kotlinexample.Widgets.Switch.SwitchActivity
import source.open.akash.kotlinexample.Widgets.TextSwitcher.TextSwitcher
import source.open.akash.kotlinexample.Widgets.TextView.TextView
import source.open.akash.kotlinexample.Widgets.ToggleButton.ToggleButton

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
        SpinnerDemo.setOnClickListener {
            val intent = Intent(this, SpinnerActivity::class.java)
            startActivity(intent)
        }
        SwitchDemo.setOnClickListener {
            val intent = Intent(this, SwitchActivity::class.java)
            startActivity(intent)
        }
        ProgressDemo.setOnClickListener {
            val intent = Intent(this, ProgressActivity::class.java)
            startActivity(intent)
        }
        AutoCompleteTextViewDemo.setOnClickListener {
            val intent = Intent(this, AutoCompleteTextView::class.java)
            startActivity(intent)
        }
        MultiAutoCompleteTextViewDemo.setOnClickListener {
            val intent = Intent(this, MultiAutoCompletetextView::class.java)
            startActivity(intent)
        }
        TextSwitcherDemo.setOnClickListener {
            val intent = Intent(this, TextSwitcher::class.java)
            startActivity(intent)
        }
        CheckedTextViewDemo.setOnClickListener {
            val intent = Intent(this, CheckedTextView::class.java)
            startActivity(intent)
        }
        ToggleButtonDemo.setOnClickListener {
            val intent = Intent(this, ToggleButton::class.java)
            startActivity(intent)
        }
        ScrollViewDemo.setOnClickListener {
            val intent = Intent(this, ScrollView::class.java)
            startActivity(intent)
        }
    }
}
