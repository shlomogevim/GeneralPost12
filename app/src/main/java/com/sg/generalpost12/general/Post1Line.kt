package com.sg.generalpost12.general

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.generalpost12.R
import com.sg.generalpost12.data.CONSTANT
import com.sg.generalpost12.postim.NineLinePost

class Post1Line (val context: Context) {

    private val image: ImageView = (context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost = NineLinePost(context, layout)
    val lineNum = 1
     fun post100() {
        image.load("https://cdn.pixabay.com/photo/2015/08/26/11/06/people-talking-908342_1280.jpg")
        val backGround = "263238"
        val transparency = 4
        val lineA = arrayOf(
            "כל אחד מדבר את מה שהוא."
        )
        val marginA = arrayOf(arrayOf(0, 0, 0, -1))
        val paddingA = arrayOf(10, 0, 10, 0)

        val textSizeA = arrayOf(1, 30)

        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            fontFamily = 200
        )
    }

  fun post101() {
        image.load("https://cdn.pixabay.com/photo/2018/02/13/23/41/nature-3151869_1280.jpg")
        val backGround = "263238"
        val tranparency = 0
        val lineA = arrayOf(
            "אתה הוא האור שבו אתה חי."
        )
        val marginA = arrayOf(arrayOf(0, 0, 0, 0))
        val paddingA = arrayOf(40, 0, 40, 0)

        val textSizeA = arrayOf(1, 30)

        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20,fontFamily = 300
        )
    }
    fun post102() {
        image.load("https://cdn.pixabay.com/photo/2013/07/18/15/09/death-164761_1280.jpg")
        val backGround = "263238"
        val transparency = 1
        val lineA = arrayOf(
            "גם מחיים שלווים לגמרי מתים בסוף."
        )
        val marginA = arrayOf(arrayOf(0, -1, 0, 0))

        val paddingA = arrayOf(0, 0, 0, 0)

        val textSizeA = arrayOf(0, 30)

        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20,fontFamily = 381
        )
    }
}