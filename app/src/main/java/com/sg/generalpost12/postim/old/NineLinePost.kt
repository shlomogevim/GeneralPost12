package com.sg.generalpost12.postim.old

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

class NineLinePost  (val contex: Context, val layout: ConstraintLayout) {

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()
    val helper = Helper()


    fun createPost9(
        backGround: String,
        tran: Int=0,
        strings: Array<String>,
        margin: Array<Array<Int>>,
        padding: Array<Int>,
        textSize: Float,
      //  textColor:String="f6ff03",
        fontFamily:Int=0,
        radius:Int=0
    ) {
        val fontAddress=helper.getFamilyFont(fontFamily)
        val tra = helper.getTransfo(tran)
        val shape= GradientDrawable()
        shape.cornerRadius=radius.toPx().toFloat()
        shape.setColor(Color.parseColor("#$tra$backGround"))

        val textView1 = TextView(contex)
        textView1.text = strings[0]
        textView1.textSize = textSize
        textView1.id = View.generateViewId()
        textView1.background=shape
        textView1.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView1.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView1.gravity = Gravity.CENTER


        val textView2 = TextView(contex)
        textView2.text = strings[1]
        textView2.textSize = textSize
        textView2.id = View.generateViewId()
        textView2.typeface = ResourcesCompat.getFont(contex, fontAddress)
        // textView2.setBackgroundColor(Color.parseColor("#$tra$backGround"))
        textView2.background=shape
        textView2.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView2.gravity = Gravity.CENTER

        val textView3 = TextView(contex)
        textView3.text = strings[2]
        textView3.textSize = textSize
        textView3.id = View.generateViewId()
        textView3.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView3.background=shape
        textView3.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView3.gravity = Gravity.CENTER

        val textView4 = TextView(contex)
        textView4.text = strings[3]
        textView4.textSize = textSize
        textView4.id = View.generateViewId()
        textView4.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView4.background=shape
        textView4.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView4.gravity = Gravity.CENTER

        val textView5 = TextView(contex)
        textView5.text = strings[4]
        textView5.textSize = textSize
        textView5.id = View.generateViewId()
        textView5.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView5.background=shape
        textView5.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView5.gravity = Gravity.CENTER

        val textView6 = TextView(contex)
        textView6.text = strings[5]
        textView6.textSize = textSize
        textView6.id = View.generateViewId()
        textView6.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView6.background=shape
        textView6.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView6.gravity = Gravity.CENTER

        val textView7 = TextView(contex)
        textView7.text = strings[6]
        textView7.textSize = textSize
        textView7.id = View.generateViewId()
        textView7.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView7.background=shape
        textView7.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView7.gravity = Gravity.CENTER

        val textView8 = TextView(contex)
        textView8.text = strings[7]
        textView8.textSize = textSize
        textView8.id = View.generateViewId()
        textView8.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView8.background=shape
        textView8.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView8.gravity = Gravity.CENTER

        val textView9 = TextView(contex)
        textView9.text = strings[8]
        textView9.textSize = textSize
        textView9.id = View.generateViewId()
        textView9.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView9.background=shape
        textView9.setPadding(padding[0].toPx(), padding[1].toPx(), padding[2].toPx(), padding[3].toPx())
        textView9.gravity = Gravity.CENTER

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
        val lp7 = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        val lp8 = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        val lp9 = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )

        textView1.layoutParams = lp1
        textView2.layoutParams = lp2
        textView3.layoutParams = lp3
        textView4.layoutParams = lp4
        textView5.layoutParams = lp5
        textView5.layoutParams = lp6
        textView5.layoutParams = lp7
        textView5.layoutParams = lp8
        textView5.layoutParams = lp9

        layout.addView(textView1)
        layout.addView(textView2)
        layout.addView(textView3)
        layout.addView(textView4)
        layout.addView(textView5)
        layout.addView(textView6)
        layout.addView(textView7)
        layout.addView(textView8)
        layout.addView(textView9)

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

        if (margin[6][0] > 0) {
            containSet.connect(
                textView7.id,
                ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.LEFT, margin[6][0].toPx()
            )
        }
        if (margin[6][1] > 0) {
            containSet.connect(
                textView7.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, margin[6][1].toPx()
            )
        }
        if (margin[6][2]>0) {
            containSet.connect(
                textView7.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT, margin[6][2].toPx()
            )
        }
        if (margin[6][3]>0){
            containSet.connect(
                textView7.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, margin[6][3].toPx()
            )
        }

        if (margin[7][0] > 0) {
            containSet.connect(
                textView8.id,
                ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.LEFT, margin[7][0].toPx()
            )
        }
        if (margin[7][1] > 0) {
            containSet.connect(
                textView8.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, margin[7][1].toPx()
            )
        }
        if (margin[7][2]>0) {
            containSet.connect(
                textView8.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT, margin[7][2].toPx()
            )
        }
        if (margin[7][3]>0){
            containSet.connect(
                textView8.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, margin[7][3].toPx()
            )
        }
        if (margin[8][0] > 0) {
            containSet.connect(
                textView9.id,
                ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.LEFT, margin[8][0].toPx()
            )
        }
        if (margin[8][1] > 0) {
            containSet.connect(
                textView9.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, margin[8][1].toPx()
            )
        }
        if (margin[8][2]>0) {
            containSet.connect(
                textView9.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT, margin[8][2].toPx()
            )
        }
        if (margin[8][3]>0){
            containSet.connect(
                textView9.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, margin[8][3].toPx()
            )
        }

        containSet.applyTo(layout)

    }


}