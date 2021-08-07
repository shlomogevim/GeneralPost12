package com.sg.generalpost12.postim

import android.app.Activity
import android.content.Context
import android.content.res.Resources
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_main.*

class TwoLinePost(val contex: Context, val layout: ConstraintLayout) {


    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()

    fun createPost2(
        strig1: String,
        string2: String,
        array: Array<Array<Int>>,
        textSize: Float
    ) {
        val textView = TextView(contex)



        textView.text = strig1
        textView.textSize = textSize
        textView.id = View.generateViewId()

        val textView1 = TextView(contex)
        textView1.text = string2
        textView1.textSize = textSize
        textView1.id = View.generateViewId()


        val lp = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        val lp1 = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )

        textView.layoutParams = lp
        textView1.layoutParams = lp1

        layout.addView(textView)



        layout.addView(textView1)

        val containSet = ConstraintSet()
        containSet.clone(layout)
        if (array[0][0] > 0) {
            containSet.connect(
                textView.id,
                ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.LEFT, array[0][0].toPx()
            )
        }
        if (array[0][1] > 0) {
            containSet.connect(
                textView.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, array[0][1].toPx()
            )
        }
        if (array[0][2]>0) {
            containSet.connect(
                textView.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT, array[0][2].toPx()
            )
        }
        if (array[0][3]>0){
            containSet.connect(
                textView.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM,array[0][3].toPx()
            )
        }
        //  containSet.connect(textView.id,ConstraintSet.BOTTOM,ConstraintSet.PARENT_ID,ConstraintSet.BOTTOM,100.toPx())


        if (array[1][0] > 0) {
            containSet.connect(
                textView1.id,
                ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.LEFT, array[1][0].toPx()
            )
        }
        if (array[1][1] > 0) {
            containSet.connect(
                textView1.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, array[1][1].toPx()
            )
        }
        if (array[1][2]>0) {
            containSet.connect(
                textView1.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT, array[1][2].toPx()
            )
        }
        if (array[1][3]>0){
            containSet.connect(
                textView1.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, array[1][3].toPx()
            )
        }
        //containSet.connect(textView1.id,ConstraintSet.RIGHT,ConstraintSet.PARENT_ID,ConstraintSet.RIGHT,100.toPx())
        //  containSet.connect(textView1.id,ConstraintSet.BOTTOM,ConstraintSet.PARENT_ID,ConstraintSet.BOTTOM,100.toPx())


        containSet.applyTo(layout)

    }


}
