package source.open.akash.kotlinexample.AlertDialog.ListViewInAlertDialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import source.open.akash.kotlinexample.R

class ListViewAlertDialogActivity : AppCompatActivity() {

    val singersList = arrayOf("Arijit Singh", "Himesh Reshammiya", "Neha Kakkar", "B Praak", "Shreya Goshal")
    var checkedItem = 1
    var checkBoxCheckedItem = booleanArrayOf(true, false, true, false, false)
    val positiveButtonClick = { dialog: DialogInterface, which: Int ->
        Toast.makeText(
            applicationContext,
            "Done", Toast.LENGTH_SHORT
        ).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_alert_dialog)

    }

    fun alertClick(view: View) {
        when (view.id) {
            R.id.simpleListAlertDialogDemo -> simpleListAlertDialogDemo()
            R.id.radioListAlertDialogDemo -> radioListAlertDialogDemo()
            R.id.checkboxAlertDialogDemo -> checkboxAlertDialogDemo()


        }

    }

    fun simpleListAlertDialogDemo() {

        val alertDialogBuilder = AlertDialog.Builder(this@ListViewAlertDialogActivity)
//using with Operations decalring alert dialog builder functions
        with(alertDialogBuilder) {
            setTitle("Select Single Singers From Given List")
            //  setMessage("Do Not Use Message Here :OtherWise it does not Show List ")   ??Warning
            setCancelable(false)
            setItems(singersList) { dialog, which ->
                Toast.makeText(applicationContext, singersList[which] + " is clicked", Toast.LENGTH_SHORT).show()
            }
            setPositiveButton("Ok", positiveButtonClick)
            show()
        }


    }

    fun radioListAlertDialogDemo() {
//using withSimples decalring alert dialog builder functions
        val alertDialogBuilder = AlertDialog.Builder(this@ListViewAlertDialogActivity)
        alertDialogBuilder.setTitle("Select Single Singers From Given List")
        //  setMessage("Do Not Use Message Here :OtherWise it does not Show List ")  ??Warning
        alertDialogBuilder.setCancelable(false)
        alertDialogBuilder.setSingleChoiceItems(singersList, checkedItem) { dialog, which ->
            when (which) {
                which -> {
                    Toast.makeText(
                        this@ListViewAlertDialogActivity, singersList[which],
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

        }
        alertDialogBuilder.setPositiveButton("Yes") { _, _ ->
            Toast.makeText(
                this@ListViewAlertDialogActivity, "You have pressed Agree Button",
                Toast.LENGTH_SHORT
            ).show()
            finish()
        }
        alertDialogBuilder.setNegativeButton("No") { _, _ ->
            Toast.makeText(
                this@ListViewAlertDialogActivity, "You have pressed Disagree Button",
                Toast.LENGTH_SHORT
            ).show()
            finish()
        }
        alertDialogBuilder.setNeutralButton("Cancel") { _, _ ->
            Toast.makeText(
                this@ListViewAlertDialogActivity, "You have pressed Cancel Button",
                Toast.LENGTH_SHORT
            ).show()
            finish()
        }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()

    }

    fun checkboxAlertDialogDemo() {
        val alertDialogBuilder = AlertDialog.Builder(this@ListViewAlertDialogActivity)
        alertDialogBuilder.setTitle("Select Multiple Singers From Given List")
        //  setMessage("Do Not Use Message Here :OtherWise it does not Show List ") ??Warning
        alertDialogBuilder.setCancelable(false)
        alertDialogBuilder.setMultiChoiceItems(singersList, checkBoxCheckedItem) { dialog, which, _ ->
            when (which) {
                which -> {
                    Toast.makeText(
                        this@ListViewAlertDialogActivity, singersList[which],
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

        }
        alertDialogBuilder.setPositiveButton("Yes") { _, _ ->
            Toast.makeText(
                this@ListViewAlertDialogActivity, "You have pressed Agree Button",
                Toast.LENGTH_SHORT
            ).show()
            finish()
        }
        alertDialogBuilder.setNegativeButton("No") { _, _ ->
            Toast.makeText(
                this@ListViewAlertDialogActivity, "You have pressed Disagree Button",
                Toast.LENGTH_SHORT
            ).show()
            finish()
        }
        alertDialogBuilder.setNeutralButton("Cancel") { _, _ ->
            Toast.makeText(
                this@ListViewAlertDialogActivity, "You have pressed Cancel Button",
                Toast.LENGTH_SHORT
            ).show()
            finish()
        }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}


