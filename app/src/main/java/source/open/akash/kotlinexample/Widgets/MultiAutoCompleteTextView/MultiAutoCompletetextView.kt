package source.open.akash.kotlinexample.Widgets.MultiAutoCompleteTextView


import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_multi_auto_completetext_view.*
import source.open.akash.kotlinexample.R

class MultiAutoCompletetextView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_auto_completetext_view)

        val inputItemsList = arrayListOf<String>(
            "Apple", "Apricot", "Dragon Fruit", "Pineberry", "Pineapple",
            "Cranberry", "Lime", "Banana", "Guava", "Coconut", "Pear", "Avocado", "Star Fruit"
        )
        tvInputs.text = inputItemsList.toString()

        val arrayAdapter =
            ArrayAdapter<String>(this@MultiAutoCompletetextView, android.R.layout.simple_list_item_1, inputItemsList)

        multiautoCompleteTextView.setAdapter(arrayAdapter)
        multiautoCompleteTextView.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())
    }
}
