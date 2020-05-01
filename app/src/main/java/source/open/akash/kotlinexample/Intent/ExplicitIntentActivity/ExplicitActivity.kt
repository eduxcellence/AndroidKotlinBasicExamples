package source.open.akash.kotlinexample.Intent.ExplicitIntentActivity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import kotlinx.android.synthetic.main.activity_explicit.*
import source.open.akash.kotlinexample.R


class ExplicitActivity : AppCompatActivity() {
    val RequestCodeForResult = 101
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit)

        explicitOne.setOnClickListener {
            if (!edtText.text.isNullOrEmpty()) {
                val intent = Intent(
                    this@ExplicitActivity,
                    SecondActivity::class.java
                )
                intent.putExtra(
                    "data",
                    edtText.text.toString()
                )  //sending data from this or current activity to second activity
                startActivity(intent)
            } else {
                Toast.makeText(
                    this@ExplicitActivity,
                    "Need Some Data to Proceed Second Activity",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        explicitTwo.setOnClickListener {
            val intent = Intent(this@ExplicitActivity, SharedElementTransitionActivity::class.java)
// Pass data object in the bundle and populate details activity.
// Pass data object in the bundle and populate details activity.
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                imgTransOne as ImageView,
                ViewCompat.getTransitionName(imgTransOne)!!

            )
            startActivity(intent, options.toBundle())
        }

        explicitThree.setOnClickListener {
            val intent = Intent(
                this@ExplicitActivity,
                ReturnresultActivity::class.java
            )
            startActivityForResult(intent, RequestCodeForResult)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RequestCodeForResult && resultCode == Activity.RESULT_OK) {
            Toast.makeText(
                applicationContext,
                "Activity Return :${data!!.getStringExtra("returnData")}",
                Toast.LENGTH_SHORT
            ).show()

        } else {
            Toast.makeText(applicationContext, "Activity cancelled", Toast.LENGTH_SHORT).show()
        }
    }

}
