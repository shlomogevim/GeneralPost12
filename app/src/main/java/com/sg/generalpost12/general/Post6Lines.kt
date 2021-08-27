package com.sg.generalpost12.general

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.generalpost12.R
import com.sg.generalpost12.data.CONSTANT
import com.sg.generalpost12.postim.NineLinePost
import kotlinx.android.synthetic.main.activity_main.*

class Post6Lines (val context: Context) {

    private val image: ImageView =(context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout =(context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost= NineLinePost(context , layout)
    val lineNum = 6
    fun post60() {
        image.load(R.drawable.bible)
        val backGround = "263238"
        val tranparency = 8
        val lineA = arrayOf(
            "אתה חי בתוך אגדה עתיקה",
            "גן העדן והגיהנום נמצאים כאן ועכשיו,",
            "הכוח שמחליט לאיפה תלך עכשיו הוא:",
            "אתה",
            "מה שנותר פתוח",
            "זו אמונה באגדות עתיקות."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 305),
            arrayOf(0, -1, 0, 230),
            arrayOf(0, -1, 0, 155),
            arrayOf(0, -1, 0, 100),
            arrayOf(0, -1, 0, 55),
            arrayOf(0, -1, 0, 10)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 27, 27, 27, 33, 27, 27)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15
        )
    }

   fun post61() {
        image.load(R.drawable.pill)
        val backGround = "263238"
        val tranparency = 6
        val lineA = arrayOf(
            "המיינד",
            "הוא כדור הרגעה",
            "מהאין סופיות של החיים,",
            "טוב להשתמש בו מידי פעם",
            "אבל כדי לשמור קשר טוב למציאות",
            "רצוי שלא להתמכר אליו יותר מידי."
        )

        val marginA = arrayOf(
            arrayOf(0, -1, 0, 270),
            arrayOf(0, -1, 0, 230),
            arrayOf(0, -1, 0, 190),
            arrayOf(0, -1, 0, 150),
            arrayOf(0, -1, 0, 80),
            arrayOf(0, -1, 0, 10)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 30, 25, 25, 25, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15
        )
    }
    fun post62() {
        image.load(R.drawable.gometry)
        val backGround = "263238"
        val tranparency = 8
        val lineA = arrayOf(
            "הגאומטריה של הסבל:",
            "במשולש הקיום שלך שלשה קודקודים: ",
            "מה שאתה צריך,",
            "מה שאתה רוצה",
            "ומה שיש לך,",
            "וככול ששטח המשולש קטן יותר" +
                    " אתה פחות סובל."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 280),
            arrayOf(0, -1, 0, 200),
            arrayOf(0, -1, 0, 160),
            arrayOf(0, -1, 0, 120),
            arrayOf(0, -1, 0, 80),
            arrayOf(0, -1, 0, 10)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        val textSizeA = arrayOf(0, 27, 25, 25, 25, 25, 25)
        val col = "#F4611E"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 31
        )
    }
}