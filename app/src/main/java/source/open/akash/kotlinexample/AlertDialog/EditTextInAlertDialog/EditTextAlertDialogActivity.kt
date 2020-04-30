package source.open.akash.kotlinexample.AlertDialog.EditTextInAlertDialog

import android.content.DialogInterface
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_edit_text_alert_dialog.*
import source.open.akash.kotlinexample.R

class EditTextAlertDialogActivity : AppCompatActivity() {

    val negativeButtonClick = { _: DialogInterface, which: Int ->
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text_alert_dialog)
        buttonEdittextAlert.setOnClickListener {
            val alertDialogBuilder = AlertDialog.Builder(this@EditTextAlertDialogActivity)
            val layoutInflater = layoutInflater
            val view = layoutInflater.inflate(R.layout.alertedittextlayout, null)
            val edtName = view.findViewById(R.id.edtName) as EditText
            val edtPassword = view.findViewById(R.id.edtPassword) as EditText
            with(alertDialogBuilder) {
                setTitle("Login details : ")
                setView(view)
                setCancelable(false)
                setPositiveButton("Login") { _, _ ->
                    if (edtName.text.isNullOrEmpty() && edtPassword.text.isNullOrEmpty()) {
                        Toast.makeText(
                            applicationContext,
                            "Empty User ID  or Password", Toast.LENGTH_SHORT
                        ).show()

                    } else {
                        Toast.makeText(
                            applicationContext,
                            "${edtName.text} You are successfully Login", Toast.LENGTH_SHORT
                        ).show()

                    }

                }

                setNegativeButton("Exit", negativeButtonClick)
                show()
            }
        }

    }
}
