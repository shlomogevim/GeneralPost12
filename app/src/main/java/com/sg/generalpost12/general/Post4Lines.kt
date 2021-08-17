package com.sg.generalpost12.general

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.generalpost12.R
import com.sg.generalpost12.data.CONSTANT
import com.sg.generalpost12.postim.NineLinePost

class Post4Lines (val context: Context) {

    private val image: ImageView =(context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout =(context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost= NineLinePost(context , layout)
     fun post46() {
        val lineNum = 4
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
        val lineNum = 4
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
}