package source.open.akash.kotlinexample.Widgets.CheckBox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_check_box.*
import kotlinx.android.synthetic.main.activity_main.*
import source.open.akash.kotlinexample.R

class CheckBox : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        checkBox1.text=getString(R.string.first_cb)
        checkBox2.text=getString(R.string.second_cb)
         GetCheckBox.text=getString(R.string.getCB)
        GetCheckBox.setOnClickListener {

            if(checkBox1.isChecked&&checkBox2.isChecked)
            {
           Toast.makeText(this@CheckBox,"Both ${checkBox1.text} " +
                   "&& ${checkBox2.text} is Checked ",Toast.LENGTH_SHORT).show()
            }else if(checkBox1.isChecked)
            {
                Toast.makeText(this@CheckBox,"Only ${checkBox1.text} " +
                        "is Checked ",Toast.LENGTH_SHORT).show()
            }else if(checkBox2.isChecked)
            {
                Toast.makeText(this@CheckBox,"Only " +
                        " ${checkBox2.text} is Checked ",Toast.LENGTH_SHORT).show()
            }else
            {
                Toast.makeText(this@CheckBox,"Both ${checkBox1.text} " +
                        "&& ${checkBox2.text} is Not Checked ",Toast.LENGTH_SHORT).show()
            }
        }

    }
}
