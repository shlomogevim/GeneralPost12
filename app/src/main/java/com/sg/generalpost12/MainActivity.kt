package com.sg.generalpost12

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import coil.load
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        post1()





    }

    private fun post1() {
        imageView.load(R.drawable.sad)
        twoLineText("אין בעיות בעולם","חוץ מאלה שאצלך בראש",24f)
    }

    private fun twoLineText(strig1: String, string2: String, textSize: Float) {
        val textView= TextView(this)
        textView.text=strig1
        textView.textSize=textSize
        textView.id= View.generateViewId()

        val textView1= TextView(this)
        textView1.text=string2
        textView1.textSize=textSize
        textView1.id= View.generateViewId()


        val lp = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        val lp1 = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )

        textView.layoutParams=lp
        textView1.layoutParams=lp1

        mainLayout.addView(textView)
        mainLayout.addView(textView1)

        val containSet = ConstraintSet()
        containSet.clone(mainLayout)

        /*containSet.connect(textView.id,
            ConstraintSet.LEFT,
            ConstraintSet.PARENT_ID,
            ConstraintSet.LEFT,100.toPx())*/
        containSet.connect(textView.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP,550.toPx())
          containSet.connect(textView.id,ConstraintSet.RIGHT,ConstraintSet.PARENT_ID,ConstraintSet.RIGHT,10.toPx())
        //  containSet.connect(textView.id,ConstraintSet.BOTTOM,ConstraintSet.PARENT_ID,ConstraintSet.BOTTOM,100.toPx())

        containSet.connect(textView1.id,
            ConstraintSet.LEFT,
            ConstraintSet.PARENT_ID,
            ConstraintSet.LEFT,10.toPx())
        containSet.connect(textView1.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP,580.toPx())
        //containSet.connect(textView.id,ConstraintSet.RIGHT,ConstraintSet.PARENT_ID,ConstraintSet.RIGHT,100.toPx())
        //  containSet.connect(textView.id,ConstraintSet.BOTTOM,ConstraintSet.PARENT_ID,ConstraintSet.BOTTOM,100.toPx())


        containSet.applyTo(mainLayout)

    }
}