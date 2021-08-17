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

class Post3Lines(val context: Context) {

    private val image: ImageView =(context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout=(context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost= NineLinePost(context , layout)

   fun post35() {
        image.load(R.drawable.people)
        val lineNum = 3
        val backGround = "546e7a"
        val tranparency = 8
        val lineA = arrayOf(
            "החיים קורים ,",
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

    fun post36() {
        image.load(R.drawable.old_and_haapy)
        val lineNum = 3
        val backGround = "546e7a"
        val tranparency = 8
        val lineA = arrayOf(
            "המתכון הבטוח שלא  להזדקן",
            "הוא פשוט",
            "להישאר צעיר.",
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 80),
            arrayOf(0, -1, 0, 40),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 25, 20, 23)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        //  val col = "#f6ff03"
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 4
        )
    }
    fun post37() {
        image.load(R.drawable.tv)
        val lineNum = 3
        val backGround = "546e7a"
        val tranparency = 8
        val lineA = arrayOf(
            "מתכון  בדוק  לזוגיות:",
            "דברו  ביניכם",
            "רק  בפרסומות.",
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 100),
            arrayOf(0, -1, 0, 50),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 30, 20, 23)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        //  val col = "#f6ff03"
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 5
        )
    }
}