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

class Post2Lines(val context: Context) {

    private val image: ImageView = (context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost = NineLinePost(context, layout)
    fun post25() {
        image.load(R.drawable.monk2)
        val lineNum = 2
        val backGround = "004d40"
        val tranparency = 0
        val lineA = arrayOf(
            "אי עשייה גוררת  אי עשייה ,",
            "עשייה גוררת  עשייה."
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 40, 0, -1)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        val textSizeA = arrayOf(0, 26)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 4
        )
    }


}
