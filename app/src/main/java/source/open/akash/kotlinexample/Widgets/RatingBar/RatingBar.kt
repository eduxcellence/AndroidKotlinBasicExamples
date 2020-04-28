package source.open.akash.kotlinexample.Widgets.RatingBar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_rating_bar.*
import source.open.akash.kotlinexample.R

class RatingBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)
        //ratingBar ,rating,fromuser
        ratingBar.numStars = 5
        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            tvRate.text = "Your Rating is : $rating  "

        }
    }
}
