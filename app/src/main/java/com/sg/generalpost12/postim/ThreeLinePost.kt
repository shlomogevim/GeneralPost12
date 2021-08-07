package com.sg.generalpost12.postim

import android.content.Context
import android.content.res.Resources
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class ThreeLinePost(val contex: Context, val layout: ConstraintLayout) {

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()

    fun createPost3(strig1: String, string2: String, string3: String, textSize: Float) {
        val textView1 = TextView(contex)
        textView1.text = strig1
        textView1.textSize = textSize
        textView1.id = View.generateViewId()

        val textView2 = TextView(contex)
        textView2.text = string2
        textView2.textSize = textSize
        textView2.id = View.generateViewId()

        val textView3 = TextView(contex)
        textView3.text = string3
        textView3.textSize = textSize
        textView3.id = View.generateViewId()


        val lp1 = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        val lp2 = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        val lp3 = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )

        textView1.layoutParams = lp1
        textView2.layoutParams = lp2
        textView3.layoutParams = lp3

        layout.addView(textView1)
        layout.addView(textView2)
        layout.addView(textView3)

        val containSet = ConstraintSet()
        containSet.clone(layout)

        containSet.connect(
            textView1.id,
            ConstraintSet.LEFT,
            ConstraintSet.PARENT_ID,
            ConstraintSet.LEFT, 100.toPx()
        )
        containSet.connect(
            textView1.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP, 550.toPx()
        )
        containSet.connect(
            textView1.id,
            ConstraintSet.RIGHT,
            ConstraintSet.PARENT_ID,
            ConstraintSet.RIGHT, 10.toPx()
        )
        //  containSet.connect(textView1.id,ConstraintSet.BOTTOM,ConstraintSet.PARENT_ID,ConstraintSet.BOTTOM,100.toPx())

        containSet.connect(
            textView2.id,
            ConstraintSet.LEFT,
            ConstraintSet.PARENT_ID,
            ConstraintSet.LEFT, 10.toPx()
        )
        containSet.connect(
            textView2.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP, 580.toPx()
        )
        //containSet.connect(textView2.id,ConstraintSet.RIGHT,ConstraintSet.PARENT_ID,ConstraintSet.RIGHT,100.toPx())
        //  containSet.connect(textView2.id,ConstraintSet.BOTTOM,ConstraintSet.PARENT_ID,ConstraintSet.BOTTOM,100.toPx())

        containSet.connect(
            textView3.id,
            ConstraintSet.LEFT,
            ConstraintSet.PARENT_ID,
            ConstraintSet.LEFT, 100.toPx()
        )
        containSet.connect(
            textView3.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP, 550.toPx()
        )
        containSet.connect(
            textView3.id,
            ConstraintSet.RIGHT,
            ConstraintSet.PARENT_ID,
            ConstraintSet.RIGHT, 10.toPx()
        )
        //  containSet.connect(textView3.id,ConstraintSet.BOTTOM,ConstraintSet.PARENT_ID,ConstraintSet.BOTTOM,100.toPx())


        containSet.applyTo(layout)

    }


}










