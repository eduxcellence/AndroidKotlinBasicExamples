package source.open.akash.kotlinexample.AlertDialog.SimpleAlertDialog

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_simple_alert_dialog.*
import source.open.akash.kotlinexample.R

class SimpleAlertDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_alert_dialog)

        simpleAlertButton.setOnClickListener {
            val alertDialogBuilder = AlertDialog.Builder(this@SimpleAlertDialogActivity)
            alertDialogBuilder.setTitle("Simple Alert Dialog Example")
            alertDialogBuilder.setMessage("Press Below Button to get Action")
            alertDialogBuilder.setCancelable(false)
            alertDialogBuilder.setPositiveButton("Agree") { _, _ ->
                Toast.makeText(
                    this@SimpleAlertDialogActivity, "You have pressed Agree Button",
                    Toast.LENGTH_SHORT
                ).show()
                finish()
            }
            alertDialogBuilder.setNegativeButton("Disagree") { _, _ ->
                Toast.makeText(
                    this@SimpleAlertDialogActivity, "You have pressed Disagree Button",
                    Toast.LENGTH_SHORT
                ).show()
                finish()
            }
            alertDialogBuilder.setNeutralButton("Cancel") { _, _ ->
                Toast.makeText(
                    this@SimpleAlertDialogActivity, "You have pressed Cancel Button",
                    Toast.LENGTH_SHORT
                ).show()
                finish()
            }

            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        }

    }
}
