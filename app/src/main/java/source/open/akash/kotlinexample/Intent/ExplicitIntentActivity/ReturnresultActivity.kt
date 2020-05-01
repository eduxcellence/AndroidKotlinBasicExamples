package source.open.akash.kotlinexample.Intent.ExplicitIntentActivity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_returnresult.*
import source.open.akash.kotlinexample.R

class ReturnresultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_returnresult)

        btnReturn.setOnClickListener {
            if (edtreturn.text.isNullOrEmpty()) {
                Toast.makeText(applicationContext, "Enter Some Dtat to return", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val returnIntent = Intent()
                returnIntent.putExtra("returnData", edtreturn.text.toString())
                setResult(Activity.RESULT_OK, returnIntent)
                finish()
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val returnIntent = Intent()
        setResult(Activity.RESULT_CANCELED, returnIntent)
        finish()
    }
}
