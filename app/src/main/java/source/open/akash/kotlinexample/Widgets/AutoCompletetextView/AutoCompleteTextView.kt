package source.open.akash.kotlinexample.Widgets.AutoCompletetextView

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_auto_complete_text_view.*
import source.open.akash.kotlinexample.R

class AutoCompleteTextView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete_text_view)

        val inputItemsList = arrayListOf<String>(
            "Apple", "Apricot", "Dragon Fruit", "Pineberry", "Pineapple",
            "Cranberry", "Lime", "Banana", "Guava", "Coconut", "Pear", "Avocado", "Star Fruit"
        )
        tvInputs.text = inputItemsList.toString()

        val arrayAdapter =
            ArrayAdapter<String>(this@AutoCompleteTextView, android.R.layout.simple_list_item_1, inputItemsList)

        autoCompleteTextView.setAdapter(arrayAdapter)

    }
}
