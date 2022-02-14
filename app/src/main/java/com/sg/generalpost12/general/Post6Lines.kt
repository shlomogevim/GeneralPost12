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
    /*fun post354() {
        image.load("https://cdn.pixabay.com/photo/2018/01/26/08/32/nature-3108066__480.jpg")
        val backGround = "428289"
        val transparency = 0
        val lineA = arrayOf(
            " גן העדן והגיהנום ",
            "הם לא מקומות   בעולם הבא,",
            "הם יותר צורת מחשבות שלך   בעולם הזה.",
        )
        val di = 5
        val marginA = arrayOf(
            arrayOf(0, 0+di, 0,-1 ),
            arrayOf(0, 40+di, 0,-1 ),
            arrayOf(0, 110+di, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 24)
        val col = "#007591"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15, fontFamily = 240
        )

    }*/

    /* fun post63() {
        image.load("https://cdn.pixabay.com/photo/2018/01/26/08/32/nature-3108066__480.jpg")
        val backGround = "428289"
        val tranparency = 0
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
    }*/

    fun post662() {

        image.load("https://cdn.pixabay.com/photo/2018/01/26/08/32/nature-3108066__480.jpg")
        val backGround = "428289"
        val tranparency = 0
        val lineA = arrayOf(
            " גן העדן והגיהנום ",
            "הם לא מקומות",
            "בעולם הבא,",
            "הם יותר צורת",
            "המחשבות שלך",
            "בעולם הזה.",
            "" +
                    ""
        )
        val di = 60
        val marginA = arrayOf(
            arrayOf(0, 0+di, 0, -1),
            arrayOf(0, 40+di, 0, -1),
            arrayOf(0, 80+di, 0, -1),
            arrayOf(0, 120+di, 0, -1),
            arrayOf(0, 160+di, 0, -1),
            arrayOf(0, 200+di, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0,24)
        val col = "#007591"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 240
        )
    }

}