package com.sg.generalpost12.postim

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.TextView

import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.marginLeft
import com.sg.generalpost12.data.Helper

class OneLinePost(val contex: Context, val layout: ConstraintLayout) {

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()
    val helper = Helper()

    fun createPost1(
        backGround: String,
        tran: Int,
        strings: Array<String>,
        margin: Array<Array<Int>>,
        padding: Array<Int>,
        textSize: Float
    ) {
        val textView1 = TextView(contex)
        textView1.id = View.generateViewId()
        textView1.text = strings[0]
        textView1.textSize = textSize
        textView1.gravity = Gravity.CENTER

        val tra = helper.getTransfo(tran)
        textView1.setBackgroundColor(Color.parseColor("#" + tra + backGround))

        textView1.setPadding(padding[0], padding[1], padding[2], padding[3])

        val lp1 = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )

        textView1.layoutParams = lp1

        layout.addView(textView1)

        val containSet = ConstraintSet()
        containSet.clone(layout)

        if (margin[0][0] > 0) {
            containSet.connect(
                textView1.id,
                ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.LEFT, margin[0][0].toPx()
            )
        }
        if (margin[0][1] > 0) {
            containSet.connect(
                textView1.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, margin[0][1].toPx()
            )
        }
        if (margin[0][2] > 0) {
            containSet.connect(
                textView1.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT, margin[0][2].toPx()
            )
        }
        if (margin[0][3] > 0) {
            containSet.connect(
                textView1.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, margin[0][3].toPx()
            )
        }
        containSet.applyTo(layout)
    }

}