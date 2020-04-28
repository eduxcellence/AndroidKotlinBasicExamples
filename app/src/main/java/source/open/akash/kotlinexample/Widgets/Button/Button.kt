package source.open.akash.kotlinexample.Widgets.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_button.*
import source.open.akash.kotlinexample.R

class Button : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        ButtonDemo.text=getString(R.string.click_me)
        ButtonDemo2.text=getString(R.string.click_me_2)
        ButtonDemo.setOnClickListener {

        }
        ButtonDemo2.setOnClickListener {
            Toast.makeText(this@Button,ButtonDemo.text,Toast.LENGTH_SHORT).show()
        }
    }
    fun buttonClickUsingXML(view: View)

    {
        if(view.id==R.id.ButtonDemo)
        Toast.makeText(this@Button,ButtonDemo.text,Toast.LENGTH_SHORT).show()
    }
}
