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

class Post3Line(val context: Context) {

    private val image: ImageView =(context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout=(context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost= NineLinePost(context , layout)

   fun post35() {

        image.load(R.drawable.people)
        val lineNum = 3
        val backGround = "546e7a"
        val tranparency = 8
        val lineA = arrayOf(
            "החיים קורים",
            "זה שאתה בטוח שהם קורים לך",
            "זה פשוט טעות כואבת.",
        )
        val marginA = arrayOf(
            arrayOf(0, 5, 0, -1),
            arrayOf(0, 36, 0, -1),
            arrayOf(0, 100, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 23, 20, 23)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        //  val col = "#f6ff03"
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 1
        )
    }
}