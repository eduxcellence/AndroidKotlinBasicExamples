package source.open.akash.kotlinexample.Widgets.Switch

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_switch.*
import source.open.akash.kotlinexample.R

class SwitchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch)
        switch1.setOnClickListener {
            if (switch1.isChecked)
                Toast.makeText(this@SwitchActivity, "Switch is ON", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this@SwitchActivity, "Switch is OFF", Toast.LENGTH_SHORT).show()
        }
    }
}
