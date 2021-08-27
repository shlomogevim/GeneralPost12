package com.sg.generalpost12.general

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.generalpost12.R
import com.sg.generalpost12.postim.NineLinePost
import kotlinx.android.synthetic.main.activity_main.*

class Post9Lines (val context: Context) {

    private val image: ImageView =(context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout =(context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost= NineLinePost(context , layout)
    val lineNum = 9
     fun post90() {
        /*זה שאתה יודע הרבה על דיכאונות ואיך לצאת מהם זה לא אומר שאתה לא מדוכא
זה שאתה יועץ נישואים זה לא אומר שהזוגיות שלך מוצלחת
זה שאתה פסיכולוג זה לא אומר שאתה נמצא באופן שיגרתי לפני התמוטטות עצבים
זה שאתה יודע הרבה על החיים זה לא אומר שאתה חי בטוב
*/
        image.load(R.drawable.night)
        val backGround = "263238"
        val tranparency = 2
        val stringA = arrayOf(
            "זה שהסתדרת עם השנים זה לא אומר שאתה מסודר,",
            "זה שאתה עסוק כל הזמן זה לא אומר שאתה עושה משהו,",
            "זה שאתה אוכל כל הזמן זה לא אומר שאתה שבע,",
            "זה שיש לך הכל זה לא אומר שאתה לא רוצה עוד,",
            "זה שאתה נח כל היום זה לא אומר שאתה לא עייף,",
            "זה שיש לך חברים זה לא אומר שאתה לא בודד,",
            "זה שהחכמת עם השנים זה לא אומר שאתה חכם,",
            "זה שאתה לא עושה שום דבר זה לא אומר שיש לך זמן,",
            "זה שיש בך את האלוהי זה לא אומר שאתה אלוהים."
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 2, 0),
            arrayOf(0, 70, 2, 0),
            arrayOf(0, 140, 2, 0),
            arrayOf(0, 210, 2, 0),
            arrayOf(0, 280, 2, 0),
            arrayOf(0, 350, 2, 0),
            arrayOf(0, 420, 2, 0),
            arrayOf(0, 490, 2, 0),
            arrayOf(0, 560, 2, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 25, 16, 25, 25, 25, 16, 25, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf("toto", col, col, col, col, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, stringA, marginA, paddingA, textSizeA, textColorA
        )
    }
}