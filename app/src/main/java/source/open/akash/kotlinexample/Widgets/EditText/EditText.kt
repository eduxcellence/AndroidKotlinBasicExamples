package source.open.akash.kotlinexample.Widgets.EditText

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_edit_text.*
import source.open.akash.kotlinexample.R

class EditText : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)


        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
              //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Toast.makeText(this@EditText, editText.text, Toast.LENGTH_SHORT).show()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
              //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
               // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

            }


        })


    }
}
