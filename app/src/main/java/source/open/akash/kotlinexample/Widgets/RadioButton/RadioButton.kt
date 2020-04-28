package source.open.akash.kotlinexample.Widgets.RadioButton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_radio_button.*
import source.open.akash.kotlinexample.R

class RadioButton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)
        radioButton1 . text = getString(R.string.colorAccent)
        radioButton2 . text = getString(R.string.colorPrimary)
        radioButton3 . text = getString(R.string.colorPrimarydark)
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId)
            {
                R.id.radioButton1->group.setBackgroundResource(R.color.colorAccent)
                R.id.radioButton2->group.setBackgroundResource(R.color.colorPrimary)
                R.id.radioButton3->group.setBackgroundResource(R.color.colorPrimaryDark)
            }

        }
    }
}
