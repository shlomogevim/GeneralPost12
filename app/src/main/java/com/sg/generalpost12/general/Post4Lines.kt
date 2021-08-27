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

class Post4Lines (val context: Context) {

    private val image: ImageView =(context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout =(context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost= NineLinePost(context , layout)
    val lineNum = 4
   fun post40() {
        image.load(R.drawable.climb)
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "על תהיה הכי טוב",
            "זה לא יצליח לך לאורך זמן,",
            "לך על משהו יותר ממשי",
            "תהיה הכי אתה."
        )
        val marginA = arrayOf(
            arrayOf(0, 5, 5, 0),
            arrayOf(0, 45, 10, 0),
            arrayOf(0, 85, 40, 0),
            arrayOf(0, 125, 160, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24, 16, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10
        )
    }
   fun post41() {
        image.load(R.drawable.smiley)
        val backGround = "263238"
        val tranparency = 0
        val lineA = arrayOf(
            "פסימיות",
            "זה לחשוב שיש מישהו מאושר ממך,",
            "אופטימיות",
            "זה להבין שאין אחד כזה."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 130),
            arrayOf(0, -1, 0, 75),
            arrayOf(0, -1, 0, 35),
            arrayOf(0, -1, 0, 5)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 20)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#00695c"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 1
        )
    }
  fun post42() {
        image.load(R.drawable.time)
        val backGround = "eeeeee"
        val tranparency = 4
        val lineA = arrayOf(
            "האויב של הטוב",
            "הוא הטוב יותר,",
            "האויב של הרגע",
            "הוא הרגע הבא."
        )
        /*האויב של הטוב הוא טוב יותר
האויב של הרגע הזה הוא הרגע הבא
*/
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 125),
            arrayOf(0, -1, 0, 85),
            arrayOf(0, -1, 0, 45),
            arrayOf(0, -1, 0, 5)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 26)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#00695c"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 1
        )
    }
  fun post43() {
        image.load(R.drawable.playground)
        val backGround = "eeeeee"
        val tranparency = 8
        val lineA = arrayOf(
            "לקטנים",
            "העולם הזה הוא מגרש משחקים,",
            "לגדולים",
            "מגרש בלי משחקים."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 122),
            arrayOf(0, -1, 0, 65),
            arrayOf(0, -1, 0, 35),
            arrayOf(0, -1, 0, 5)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 20)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#00695c"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 1
        )
    }

   fun post44() {
        image.load(R.drawable.war)
        val backGround = "eeeeee"
        val tranparency = 8
        val lineA = arrayOf(
            "היכולת שלך לחיות בשלום עם עצמך",
            "תלויה בכישרון שלך",
            "לבחור בקפידה",
            "להילחם רק את המלחמות שמתאימות לך."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 250),
            arrayOf(0, -1, 0, 220),
            arrayOf(0, -1, 0, 190),
            arrayOf(0, -1, 0, 132)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 20)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#00695c"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 1
        )
    }
  fun post45() {
        image.load(R.drawable.prison)
        image.scaleY=1.05f
        val backGround = "eeeeee"
        val tranparency = 8
        val lineA = arrayOf(
            "האנשים",
            "חיים כדרכם",
            "מתוך תא הכלא",
            "של מה שהם חושבים שהם."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 90),
            arrayOf(0, -1, 0, 60),
            arrayOf(0, -1, 0, 30),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 20)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#00695c"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 1
        )
    }
    fun post46() {
        image.load(R.drawable.light_holl)
        val backGround = "e65100"
        val transparency = 6
        val lineA = arrayOf(
            "וגם באם תגיע לאור,",
            "הרי אחרי חצי שעה תקום לראות טלוויזיה",
            "כי מתחיל האח הגדול",
            "ויש הדחה כפולה."
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 40, 0, -1),
            arrayOf(0, 108, 0, -1),
            arrayOf(0, 148, 0, -1)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24)
        val col = "#eeff41"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 3
        )
    }
    fun post47() {
        image.load(R.drawable.funeral)
        val backGround = "f4b41a"
        val transparency = 8
        val lineA = arrayOf(
            "ישנם אנשים קרובים",
            "שבהלוויה שלהם",
            "אתה פחות סופד להם",
            "ויותר סופד לעצמך."
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 40, 0, -1),
            arrayOf(0, 80, 0, -1),
            arrayOf(0, 120, 0, -1)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24)
        val col = "#143d59"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 3
        )
    }
    fun post48() {
        image.load(R.drawable.mask)
        val backGround = "f4b41a"
        val transparency = 0
        val lineA = arrayOf(
            "פוליטיקלי קורקט",
            "זה היכולת של האדם",
            "לקרוא ליום לילה וללילה יום",
            "בשם האמונות שלו."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 90),
            arrayOf(0, -1, 0, 60),
            arrayOf(0, -1, 0, 30),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 3
        )
    }
    fun post49() {
        image.load(R.drawable.talking_with_the_sea)
        val backGround = "f4b41a"
        val transparency = 0
        val lineA = arrayOf(
            "שיחות עם הים",
            "כמו רוב השיחות עם בני האדם,",
            "לא יצאת חכם יותר",
            "אבל לפחות אמרת את מה שאתה חושב."
        )

        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 25, 0, -1),
            arrayOf(0, 80, 0, -1),
            arrayOf(0, 110, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 20)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 1
        )
    }
    fun post450() {
        image.load(R.drawable.sunrise)
        val backGround = "9fe2b3"
        val transparency = 1
        val lineA = arrayOf(
            "השאלה היא פחות:",
            "מה קורה כאן,",
            "ויותר, איפה אני בכל",
            " מה שקורה כאן."
        )

        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 30, 0, -1),
            arrayOf(0, 60, 0, -1),
            arrayOf(0, 90, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 22)
        val col = "#954100"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 1
        )
    }
    fun post451() {
        image.load(R.drawable.mud)
        val backGround = "558b2f"
        //val transparency = 10
        val transparency = 3
        val lineA = arrayOf(
            "את האיזורים הרדודים בעולם",
            "אתה לא יכול להאשים ברדידות,",
            "אתה יכול להאשים רק את עצמך",
            " שאתה נמצא יותר מידי זמן באיזורים האלה."
        )

        val marginA = arrayOf(
            arrayOf(0, 60, 0, -1),
            arrayOf(0, 120, 0, -1),
            arrayOf(0, 180, 0, -1),
            arrayOf(0, 240, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 22)
       // val col = "#e3e46d"
        val col = "#ffff00"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 1
        )
    }
    fun post452() {
        image.load(R.drawable.hair)
        val backGround = "558b2f"
        val transparency = 1
        val lineA = arrayOf(
            " החיים שלך זה כמו השיער ",
            " יש ימים שהם מסתדרים לך, ",
            "ואז אתה מרגיש טוב עם עצמך",
            " ויש ימים שלא. "
        )

        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 45, 0, -1),
            arrayOf(0, 90, 0, -1),
            arrayOf(0, 135, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 26)
        val col = "#ffff00"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 4
        )
    }
    fun post453() {
        image.load("https://cdn.pixabay.com/photo/2012/02/24/16/56/beach-16698_1280.jpg")
        val backGround = "558b2f"
        val transparency = 0
        val lineA = arrayOf(
            " תן לי את הכישרון ",
            " לראות הבלים כהבלים, ",
            "עם האמת הפשוטה",
            " אני כבר אסתדר. "
        )
        val di=35

        val marginA = arrayOf(
            arrayOf(0, 0+di, 0, -1),
            arrayOf(0, 45+di, 0, -1),
            arrayOf(0, 90+di, 0, -1),
            arrayOf(0, 135+di, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 26)
        val col = "#ffff00"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 4
        )
    }
}