package com.sg.generalpost12.general

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.generalpost12.R
import com.sg.generalpost12.data.CONSTANT
import com.sg.generalpost12.postim.NineLinePost

class Post5Lines (val context: Context) {

    private val image: ImageView =(context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout =(context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost= NineLinePost(context , layout)
   fun post53() {
        image.load(R.drawable.worry)
        val lineNum = 5
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
        val lineNum = 5
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
}