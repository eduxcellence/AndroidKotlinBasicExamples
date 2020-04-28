package source.open.akash.kotlinexample.Widgets.ProgressBar

import android.app.ProgressDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_progress.*
import source.open.akash.kotlinexample.R

class ProgressActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)

        //showing Progress Bar indetermination
        progressBar1.isIndeterminate = true

        buttonProgressBar.text = "Progress Bar Example"
        //showing progress bar on Click of Button
        buttonProgressBar.setOnClickListener {
            var valueProgress = 0
            Thread(Runnable {
                while (valueProgress < 100) {
                    valueProgress++
                    try {
                        Thread.sleep(30)
                        progressBar2.progress = valueProgress
                    } catch (exp: InterruptedException) {
                        exp.printStackTrace()
                    }

                }
            }).start()
        }
        buttonProgressDialog.text = "Progress Dialog Example"
        buttonProgressDialog.setOnClickListener {
            val progressDialog = ProgressDialog(this@ProgressActivity)
            progressDialog.setTitle("Progress Dialog Example")
            progressDialog.setMessage("Click On Screen to dismiss Progress Dialog")
            progressDialog.show()
        }


    }
}
