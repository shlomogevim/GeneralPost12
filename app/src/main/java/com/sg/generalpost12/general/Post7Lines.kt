package com.sg.generalpost12.general

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.generalpost12.R
import com.sg.generalpost12.data.CONSTANT
import com.sg.generalpost12.postim.NineLinePost

class Post7Lines (val context: Context) {

    private val image: ImageView =(context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout =(context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost= NineLinePost(context , layout)
    val lineNum = 7
     fun post70() {
        image.load(R.drawable.man_searching)
        image.scaleY=.55f
        val backGround = "9e9e9e"
        val tranparency = 2
        val lineA = arrayOf(
            "האדם שמחפש משמעות בחיים",
            "דומה לאחד שקיבל כלי מופלא",
            "והוא ממש נבוך מהמתנה הזו,",
            "מצד אחד",
            "הוא שמע מכולם שהכלי הזה מדהים ברמות,",
            "אבל מהצד השני",
            "הוא לא יודע  מה לעזאזל עושים עם זה."
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 45, 0, -1),
            arrayOf(0, 90, 0, -1),
            arrayOf(0, -1, 40, 185),
            arrayOf(0, -1, 0, 115),
            arrayOf(0, -1, 0, 70),
            arrayOf(0, -1, 0, 0)
        )

        val paddingA = arrayOf(0, 0, 0, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24, 16, 25, 25, 25, 16, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val col2 = "#212121"
        val textColorA = arrayOf(CONSTANT, col2, col, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 17,fontFamily = 31
        )
    }
    fun post71() {
        image.load(R.drawable.between_them)
        val backGround = "9e9e9e"
        val transparency = 0
        val lineA = arrayOf(
            "להגיד את הדבר הנכון",
            "במקום הלא נכון זה חוסר טקט,",
            "להגיד את הדבר הלא נכון",
            "במקום הנכון זה סתם טיפשות,",
            "החכמה",
            "להגיד את הדבר הנכון",
            "במקום הנכון."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 180),
            arrayOf(0, -1, 0, 150),
            arrayOf(0, -1, 0, 120),
            arrayOf(0, -1, 0, 90),
            arrayOf(-1, -1, 5, 60),
            arrayOf(-1, -1, 60, 30),
            arrayOf(-1, -1, 200, 0)
        )

        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 24, 16, 25, 25, 25, 16, 25)
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 17,fontFamily = 31
        )
    }
}