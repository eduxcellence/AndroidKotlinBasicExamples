package source.open.akash.kotlinexample.DateTime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_date_time.*
import source.open.akash.kotlinexample.Intent.ImlicitIntentActivity.toast
import source.open.akash.kotlinexample.R
import java.util.*

class DateTimeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_time)

        //date picker using xml attribute
        val calendar: Calendar = Calendar.getInstance()
        datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH), { view, year, monthOfYear, dayOfMonth ->
                toast("Date: ${datePicker.dayOfMonth} ${datePicker.month} ${datePicker.year}")

            })

        //time picker using xml attribute
        timePicker.setOnTimeChangedListener({ view, hourOfDay, minute ->
            toast("Time : $hourOfDay : $minute")
        })


    }
}
