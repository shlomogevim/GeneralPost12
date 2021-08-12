package com.sg.generalpost12.postim

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.Gravity
import android.view.View
import android.widget.TextView

import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.res.ResourcesCompat
import com.sg.generalpost12.data.Helper

class OneLinePost(val contex: Context, val layout: ConstraintLayout) {

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()
    val helper = Helper()

    fun createPost1(
        backGround: String,
        tran: Int = 0,
        strings: Array<String>,
        margin: Array<Array<Int>>,
        padding: Array<Int>,
        textSize: Float,
        textColor: String = "f6ff03",
        fontFamily: Int = 0,
        radius: Int = 0
    ) {
        /*
        val textView1 = TextView(contex)
        textView1.text = strings[0]
        textView1.textSize = textSize
        textView1.id = View.generateViewId()
        textView1.background=shape
        textView1.typeface = ResourcesCompat.getFont(contex, fontAddress)
      //  textView1.setBackgroundColor(Color.parseColor("#$tra$backGround"))
        textView1.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView1.gravity = Gravity.CENTER*/

        val fontAddress=helper.getFamilyFont(fontFamily)
        val tra = helper.getTransfo(tran)
        val shape= GradientDrawable()
        shape.cornerRadius=radius.toPx().toFloat()
        shape.setColor(Color.parseColor("#$tra$backGround"))


        val textView1 = TextView(contex)
        textView1.id = View.generateViewId()
        textView1.text = strings[0]
        textView1.textSize = textSize
        textView1.setTextColor(Color.parseColor("#$textColor"))
        textView1.background=shape
        textView1.typeface = ResourcesCompat.getFont(contex, fontAddress)
      //  textView1.setBackgroundColor(Color.parseColor("#$tra$backGround"))

        textView1.setPadding(
            padding[0].toPx(),
            padding[1].toPx(),
            padding[2].toPx(),
            padding[3].toPx()
        )

        textView1.gravity = Gravity.CENTER

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