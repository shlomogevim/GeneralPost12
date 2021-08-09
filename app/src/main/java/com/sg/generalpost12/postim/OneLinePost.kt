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

class OneLinePost  (val contex: Context, val layout: ConstraintLayout) {

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()

    fun createPost1( backGround:String,strings:Array<String>, array: Array<Array<Int>>, textSize: Float
    ) {
        val textView1 = TextView(contex)
        textView1.text = strings[0]
        textView1.textSize = textSize
        textView1.gravity=Gravity.CENTER
        textView1.setBackgroundColor(Color.parseColor(backGround))
        textView1.setPadding(30,0,30,0)

        textView1.id = View.generateViewId()

        val lp1 = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )

        textView1.layoutParams = lp1

        layout.addView(textView1)

        val containSet = ConstraintSet()
        containSet.clone(layout)

        if (array[0][0] > 0) {
            containSet.connect(
                textView1.id,
                ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.LEFT, array[0][0].toPx()
            )
        }
        if (array[0][1] > 0) {
            containSet.connect(
                textView1.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, array[0][1].toPx()
            )
        }
        if (array[0][2]>0) {
            containSet.connect(
                textView1.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT, array[0][2].toPx()
            )
        }
        if (array[0][3]>0){
            containSet.connect(
                textView1.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM,array[0][3].toPx()
            )
        }
        containSet.applyTo(layout)
    }

}