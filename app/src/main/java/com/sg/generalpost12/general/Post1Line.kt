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

class Post1Line (val context: Context) {

    private val image: ImageView = (context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost = NineLinePost(context, layout)
    fun post12() {
        image.load(R.drawable.death)
        val lineNum = 1
        val backGround = "263238"
        val tranparency = 1
        val lineA = arrayOf(
            "גם מחיים שלווים לגמרי מתים בסוף."
        )
        val marginA = arrayOf(arrayOf(0, -1, 0, 0))

        val paddingA = arrayOf(40, 0, 40, 0)

        val textSizeA = arrayOf(0, 36)

        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20
        )
    }
}