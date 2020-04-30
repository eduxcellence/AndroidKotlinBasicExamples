package source.open.akash.kotlinexample.AlertDialog

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import source.open.akash.kotlinexample.AlertDialog.EditTextInAlertDialog.EditTextAlertDialogActivity
import source.open.akash.kotlinexample.AlertDialog.ListViewInAlertDialog.ListViewAlertDialogActivity
import source.open.akash.kotlinexample.AlertDialog.SimpleAlertDialog.SimpleAlertDialogActivity
import source.open.akash.kotlinexample.R

class AlertDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)
        simpleAlertDialogDemo.setOnClickListener {
            val intent = Intent(this, SimpleAlertDialogActivity::class.java)
            startActivity(intent)
        }
        listAlertDialogDemo.setOnClickListener {
            val intent = Intent(this, ListViewAlertDialogActivity::class.java)
            startActivity(intent)
        }
        editTextAlertDialogDemo.setOnClickListener {
            val intent = Intent(this, EditTextAlertDialogActivity::class.java)
            startActivity(intent)
        }
    }
}
