package com.sg.generalpost12.postim.old

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.res.ResourcesCompat
import com.sg.generalpost12.data.Helper

class SixLinePost  (val contex: Context, val layout: ConstraintLayout) {

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()
    val helper=Helper()

    /*

    fun createPost3(
        backGround: String,
        tran: Int=0,
        strings: Array<String>,
        margin: Array<Array<Int>>,
        padding: Array<Int>,
        textSize: Float,
        textColor:String="f6ff03",
        fontFamily:Int=0
    ) {
        val fontAddress=helper.getFamilyFont(fontFamily)
        val tra = helper.getTransfo(tran)

        val textView1 = TextView(contex)
        textView1.text = strings[0]
        textView1.textSize = textSize
        textView1.id = View.generateViewId()
        textView1.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView1.setBackgroundColor(Color.parseColor("#$tra$backGround"))
        textView1.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView1.gravity = Gravity.CENTER*/

    fun createPost6(
        backGround: String,
        tran: Int=0,
        strings: Array<String>,
        margin: Array<Array<Int>>,
        padding: Array<Int>,
        textSize: Float,
        textColor:String="f6ff03",
        fontFamily:Int=0
    ) {
        val fontAddress=helper.getFamilyFont(fontFamily)
        val tra = helper.getTransfo(tran)

        val textView1 = TextView(contex)
        textView1.text = strings[0]
        textView1.textSize = textSize
        textView1.id = View.generateViewId()
        textView1.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView1.setBackgroundColor(Color.parseColor("#$tra$backGround"))
        textView1.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView1.gravity = Gravity.CENTER

        val textView2 = TextView(contex)
        textView2.text = strings[1]
        textView2.textSize = textSize
        textView2.id = View.generateViewId()
        textView2.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView2.setBackgroundColor(Color.parseColor("#$tra$backGround"))
        textView2.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView2.gravity = Gravity.CENTER

        val textView3 = TextView(contex)
        textView3.text = strings[2]
        textView3.textSize = textSize
        textView3.id = View.generateViewId()
        textView3.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView3.setBackgroundColor(Color.parseColor("#$tra$backGround"))
        textView3.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView3.gravity = Gravity.CENTER

        val textView4 = TextView(contex)
        textView4.text = strings[3]
        textView4.textSize = textSize
        textView4.id = View.generateViewId()
        textView4.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView4.setBackgroundColor(Color.parseColor("#$tra$backGround"))
        textView4.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView4.gravity = Gravity.CENTER

        val textView5 = TextView(contex)
        textView5.text = strings[4]
        textView5.textSize = textSize
        textView5.id = View.generateViewId()
        textView5.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView5.setBackgroundColor(Color.parseColor("#$tra$backGround"))
        textView5.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView5.gravity = Gravity.CENTER

        val textView6 = TextView(contex)
        textView6.text = strings[5]
        textView6.textSize = textSize
        textView6.id = View.generateViewId()
        textView6.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView6.setBackgroundColor(Color.parseColor("#$tra$backGround"))
        textView6.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView6.gravity = Gravity.CENTER


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
        val lp4 = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        val lp5 = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        val lp6 = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )

        textView1.layoutParams = lp1
        textView2.layoutParams = lp2
        textView3.layoutParams = lp3
        textView4.layoutParams = lp4
        textView5.layoutParams = lp5
        textView6.layoutParams = lp6

        layout.addView(textView1)
        layout.addView(textView2)
        layout.addView(textView3)
        layout.addView(textView4)
        layout.addView(textView5)
        layout.addView(textView6)

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
        if (margin[0][2]>0) {
            containSet.connect(
                textView1.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT, margin[0][2].toPx()
            )
        }
        if (margin[0][3]>0){
            containSet.connect(
                textView1.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM,margin[0][3].toPx()
            )
        }
        //  containSet.connect(textView.id,ConstraintSet.BOTTOM,ConstraintSet.PARENT_ID,ConstraintSet.BOTTOM,100.toPx())


        if (margin[1][0] > 0) {
            containSet.connect(
                textView2.id,
                ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.LEFT, margin[1][0].toPx()
            )
        }
        if (margin[1][1] > 0) {
            containSet.connect(
                textView2.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, margin[1][1].toPx()
            )
        }
        if (margin[1][2]>0) {
            containSet.connect(
                textView2.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT, margin[1][2].toPx()
            )
        }
        if (margin[1][3]>0){
            containSet.connect(
                textView2.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, margin[1][3].toPx()
            )
        }
        //containSet.connect(textView1.id,ConstraintSet.RIGHT,ConstraintSet.PARENT_ID,ConstraintSet.RIGHT,100.toPx())
        //  containSet.connect(textView1.id,ConstraintSet.BOTTOM,ConstraintSet.PARENT_ID,ConstraintSet.BOTTOM,100.toPx())
        if (margin[2][0] > 0) {
            containSet.connect(
                textView3.id,
                ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.LEFT, margin[2][0].toPx()
            )
        }
        if (margin[2][1] > 0) {
            containSet.connect(
                textView3.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, margin[2][1].toPx()
            )
        }
        if (margin[2][2]>0) {
            containSet.connect(
                textView3.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT, margin[2][2].toPx()
            )
        }
        if (margin[2][3]>0){
            containSet.connect(
                textView3.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, margin[2][3].toPx()
            )
        }


        if (margin[3][0] > 0) {
            containSet.connect(
                textView4.id,
                ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.LEFT, margin[3][0].toPx()
            )
        }
        if (margin[3][1] > 0) {
            containSet.connect(
                textView4.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, margin[3][1].toPx()
            )
        }
        if (margin[3][2]>0) {
            containSet.connect(
                textView4.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT, margin[3][2].toPx()
            )
        }
        if (margin[3][3]>0){
            containSet.connect(
                textView4.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, margin[3][3].toPx()
            )
        }

        if (margin[4][0] > 0) {
            containSet.connect(
                textView5.id,
                ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.LEFT, margin[4][0].toPx()
            )
        }
        if (margin[4][1] > 0) {
            containSet.connect(
                textView5.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, margin[4][1].toPx()
            )
        }
        if (margin[4][2]>0) {
            containSet.connect(
                textView5.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT, margin[4][2].toPx()
            )
        }
        if (margin[4][3]>0){
            containSet.connect(
                textView5.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, margin[4][3].toPx()
            )
        }
        if (margin[5][0] > 0) {
            containSet.connect(
                textView6.id,
                ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.LEFT, margin[5][0].toPx()
            )
        }
        if (margin[5][1] > 0) {
            containSet.connect(
                textView6.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, margin[5][1].toPx()
            )
        }
        if (margin[5][2]>0) {
            containSet.connect(
                textView6.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT, margin[5][2].toPx()
            )
        }
        if (margin[5][3]>0){
            containSet.connect(
                textView6.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, margin[5][3].toPx()
            )
        }

        containSet.applyTo(layout)

    }


}