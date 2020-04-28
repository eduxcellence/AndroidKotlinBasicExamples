package source.open.akash.kotlinexample.Widgets.Spinner

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_spinner.*
import source.open.akash.kotlinexample.R

class SpinnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        val listDropdown = mutableListOf<String>("Select", "Modi Ji", "Manmohan Singh Ji ", "Ram Nath Kovind Ji ")
        val arrayAdapter = ArrayAdapter(this@SpinnerActivity, android.R.layout.simple_spinner_item, listDropdown)
        spinner.adapter = arrayAdapter

    }
}
