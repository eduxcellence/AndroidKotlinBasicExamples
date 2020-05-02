package source.open.akash.kotlinexample.Intent.ImlicitIntentActivity

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_implicit.*
import source.open.akash.kotlinexample.ManagePermissions
import source.open.akash.kotlinexample.R
import java.io.IOException

class ImplicitActivity : AppCompatActivity() {

    val CAMERAREQUEST = 225
    val REQUEST_GALLERY_CODE = 335

    companion object {
        var permissionGrant: Boolean = false
    }

    private val PermissionsRequestCode = 123
    private lateinit var managePermissions: ManagePermissions

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit)
        //for using camera ,we have to permissions from user as per policy of mobile devices
        // from Marshmallow permissions are
        // Manifest.permission.CAMERA,
        // Manifest.permission.WRITE_EXTERNAL_STORAGE
        setupPermissions()
        implicitThree.setOnClickListener {
            if (!permissionGrant) {
                setupPermissions()
            } else {
                val intentCamera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(intentCamera, CAMERAREQUEST)
            }

        }

        implicitOne.setOnClickListener {
            val mailIntent = Intent(Intent.ACTION_SEND)
            mailIntent.data = Uri.parse("Email")

            //for multiple recipients
            val contactsArray = arrayOf("abc@gmail.com", "def@gmail.com", "ghi@gmail.com")
            mailIntent.putExtra(Intent.EXTRA_EMAIL, contactsArray)
            mailIntent.putExtra(Intent.EXTRA_SUBJECT, "Put Your Subject Here")
            mailIntent.putExtra(Intent.EXTRA_TEXT, "Put Your Email Content")
            mailIntent.type = "message/rfc822"
            val sendMail = Intent.createChooser(mailIntent, "Launch your Mail using Below APP's")
            startActivity(sendMail)
        }

        implicitTwo.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW)
            mapIntent.data = Uri.parse("geo:26.70,80.19")
            val startMap = Intent.createChooser(mapIntent, "Launch Maps")
            startActivity(startMap)
        }
        implicitFour.text = "PHONE CALL : 8888888888"
        implicitFour.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_CALL)
            callIntent.data = Uri.parse("tel:" + 8888888888)
            if (ActivityCompat.checkSelfPermission(
                    this@ImplicitActivity,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                toast("Grant Permission to Call")
                requestCallPermission()
            } else {
                startActivity(callIntent)
            }
        }
        implicitFive.setOnClickListener {
            val openGalleryIntent = Intent()
            openGalleryIntent.type = "image/*"
            openGalleryIntent.action = Intent.ACTION_GET_CONTENT
            startActivityForResult(
                Intent.createChooser(openGalleryIntent, "Select Image "),
                REQUEST_GALLERY_CODE
            )

        }
    }

    fun requestCallPermission() {
        ActivityCompat.requestPermissions(
            this@ImplicitActivity,
            arrayOf(android.Manifest.permission.CALL_PHONE), 1
        )
    }

    private fun setupPermissions() {
        // Initialize a list of required permissions to request runtime
        val list = listOf<String>(
            Manifest.permission.CAMERA,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        )
        // Initialize a new instance of ManagePermissions class
        managePermissions = ManagePermissions(this, list, PermissionsRequestCode)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
            managePermissions.checkPermissions()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CAMERAREQUEST && resultCode == Activity.RESULT_OK) {
            val imageBitmap = data!!.extras!!.get("data") as Bitmap
            imageDemo.setImageBitmap(imageBitmap)
        } else if (requestCode == REQUEST_GALLERY_CODE && resultCode == Activity.RESULT_OK) {
            if (data != null) {
                try {
                    val bitmapImage: Bitmap =
                        MediaStore.Images.Media.getBitmap(application.contentResolver, data.data)
                    imageDemo.setImageBitmap(bitmapImage)

                } catch (exc: IOException) {
                    exc.printStackTrace()
                }
            }
        } else if (resultCode == Activity.RESULT_CANCELED) {
            toast("Cancelled")
        }
    }

    // Receive the permissions request result
    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            PermissionsRequestCode -> {
                val isPermissionsGranted = managePermissions
                    .processPermissionsResult(requestCode, permissions, grantResults)

                if (isPermissionsGranted) {
                    // Do the task now
                    permissionGrant = true
                    toast("Permissions granted.")
                } else {
                    permissionGrant = false
                    toast("Permissions denied.")
                }
                return
            }
        }
    }
}


// Extension function to show toast message
fun Context.toast(message: String) {
    if (message.equals("Permissions already granted.")) {
        ImplicitActivity.permissionGrant = true
    } else {
        ImplicitActivity.permissionGrant = false
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


}

