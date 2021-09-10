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

class Post5Lines (val context: Context) {

    private val image: ImageView =(context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout =(context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost= NineLinePost(context , layout)
    val lineNum = 5
    fun post50() {
        image.load(R.drawable.love)
        val st1 = "בסוף מה נשאר לך?"
        val st2 = " רק אהבה "
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "בזמנים שהכול נשבר מסביב",
            "וכל גל נראה מאיים ואינסופי",
            "ניזכר במשפט של אריק איינשטיין בערוב ימיו:",
            "\"" + st1,
            st2 + "\""
        )
        val marginA = arrayOf(
            arrayOf(0, 5, 5, 0),
            arrayOf(0, 35, 5, 0),
            arrayOf(0, 65, 5, 0),
            arrayOf(0, 125, 5, 0),
            arrayOf(0, 155, 220, 0)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24, 16, 25, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }

    fun post51() {
        image.load(R.drawable.man)
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "ההבדל בין:",
            "טמבל רגיל",
            "לטמבל עם תואר של דוקטור",
            "הוא רק הכבוד",
            "שאתה חולק לכל אחד מהם."
        )
        val marginA = arrayOf(
            arrayOf(0, 5, 5, 0),
            arrayOf(0, 35, 10, 0),
            arrayOf(0, 65, 15, 0),
            arrayOf(0, 95, 20, 0),
            arrayOf(0, 130, 40, 0)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24, 16, 25, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }


    fun post52() {
        image.load(R.drawable.wheat)
        val backGround = "263238"
        val tranparency = 4
        val lineA = arrayOf(
            "שיהיו ימינו ארוכים עד מעבר לקצה השדות,",
            "שהשמש החמימה תטה לנו חסד מידי פעם,",
            "שצל העצים הגדולים יהיה רחב ומזמין,",
            "שנהיה פחות בסיפור שלנו על החיים",
            "ויותר בחיים."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 250),
            arrayOf(0, -1, 0, 180),
            arrayOf(0, -1, 0, 110),
            arrayOf(0, -1, 0, 40),
            arrayOf(0, -1, 0, 5)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24, 16, 25, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 25
        )
    }
    fun post53() {
        image.load(R.drawable.worry)
        val backGround = "263238"
        val transparency = 0
        val lineA = arrayOf(
            "כל הטרדות שלך",
            "גדולות כקטנות,",
            "הן עוגנים השומרים אותך",
            "לבל תתנפץ",
            "בחוסר המשמעות של הקיום היומיומי."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 160),
            arrayOf(0, -1, 0, 130),
            arrayOf(0, -1, 0, 100),
            arrayOf(0, -1, 0, 65),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 26, 16, 25, 25, 25)
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 25
        )
    }
    fun post54() {
        image.load(R.drawable.war_kashda)
        val backGround = "143d59"
        val transparency = 7
        val lineA = arrayOf(
            "מלחמות גדולות",
            "מלחמות קטנות,",
            "בחלק מהם ניצחתי",
            "ובחלק פחות,",
            "והמוצלחות ביותר היו אילו שלא היו."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 490),
            arrayOf(0, -1, 0, 450),
            arrayOf(0, -1, 0, 410),
            arrayOf(0, -1, 0, 370),
            arrayOf(0, -1, 0, 300)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 26, 16, 25, 25, 25)
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 25
        )
    }
    fun post55() {
        image.load(R.drawable.rich)
        val backGround = "143d59"
        val transparency = 7
        val lineA = arrayOf(
            "אתה רוצה דברים מסוימים",
            "שלא בגלל שאין לך אותם",
            "כמו",
            "שאתה לא יודע",
            "שבעצם יש לך כבר אותם."
        )
           val marginA = arrayOf(
            arrayOf(0, -1, 0, 160),
            arrayOf(0, -1, 0, 120),
            arrayOf(0, -1, 0, 80),
            arrayOf(0, -1, 0, 40),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 26, 16, 25, 25, 25)
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 25
        )
    }
    fun post56() {
        image.load(R.drawable.sea)
        val backGround = "143d59"
        val transparency = 7
        val lineA = arrayOf(
            " יש אנשים האומרים ",
            " שהיופי עובר עם הגיל, ",
            " לא מכיר את האנשים האלה ",
            " אבל בטוח ",
            "שהם לא מכירים את הים הגדול."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 160),
            arrayOf(0, -1, 0, 120),
            arrayOf(0, -1, 0, 80),
            arrayOf(0, -1, 0, 40),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 26)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 25,fontFamily = 4
        )
    }
    fun post57() {
        image.load("https://cdn.pixabay.com/photo/2019/09/23/09/27/pomegranate-4498054_1280.jpg")
        val backGround = "143d59"
        val transparency = 0
        val lineA = arrayOf(
            "היחיד שיכול ליצור בשבילך",
            " שנה טובה ",
            " הוא אתה ",
            " כי אתה הוא היוצר היחידי ",
            "של הטוב והרע בעולמך."
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 40, 0, -1),
            arrayOf(0, 80, 0, -1),
            arrayOf(0, -1, 0, 40),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 26)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 25,fontFamily = 4
        )
    }
}