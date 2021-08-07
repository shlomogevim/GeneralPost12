package com.sg.generalpost12

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import coil.load
import com.sg.generalpost12.postim.FiveLines
import com.sg.generalpost12.postim.FourLinePost
import com.sg.generalpost12.postim.TwoLinePost
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var twoLines: TwoLinePost
    lateinit var fiveLines: FiveLines

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        twoLines = TwoLinePost(this, mainLayout)
        fiveLines = FiveLines(this, mainLayout)


        //  creatPost1()
        creatPost2()


    }

    private fun creatPost2() {
        imageView.load(R.drawable.love)
        val array = arrayOf(
            arrayOf(0, 5, 5, 0),
            arrayOf(0, 35, 5, 0),
            arrayOf(0, 65, 5, 0),
            arrayOf(0, 115, 35, 0),
            arrayOf(0, 150, 220, 0)
        )
        val st1 = "בסוף מה נשאר לך?"
        val st2 = " רק אהבה "

        val strings = arrayOf(
            "בזמנים שהכול נשבר מסביב",
            "וכל גל נראה מאיים ואינסופי",
            "ניזכר במשפט של אריק איינשטיין בערוב ימיו:",
            "\""+st1,
            st2+"\""
        )
        fiveLines.createPost5(1,strings, array, 18f)
    }

    private fun creatPost1() {
        imageView.load(R.drawable.sad)
        val array = arrayOf(
            arrayOf(0, 0, 10, 40),
            arrayOf(0, 0, 40, 10)
        )
        twoLines.createPost2(
            "אין בעיות בעולם",
            "חוץ מאלה שאצלך בראש",
            array, 26f
        )
    }


    private fun post1() {
        imageView.load(R.drawable.sad)
        twoLineText("אין בעיות בעולם", "חוץ מאלה שאצלך בראש", 24f)
    }

    private fun twoLineText(strig1: String, string2: String, textSize: Float) {
        val textView = TextView(this)
        textView.text = strig1
        textView.textSize = textSize
        textView.id = View.generateViewId()

        val textView1 = TextView(this)
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

        mainLayout.addView(textView)
        mainLayout.addView(textView1)

        val containSet = ConstraintSet()
        containSet.clone(mainLayout)

        /*containSet.connect(textView.id,
            ConstraintSet.LEFT,
            ConstraintSet.PARENT_ID,
            ConstraintSet.LEFT,100.toPx())*/
        containSet.connect(
            textView.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP, 550.toPx()
        )
        containSet.connect(
            textView.id,
            ConstraintSet.RIGHT,
            ConstraintSet.PARENT_ID,
            ConstraintSet.RIGHT,
            10.toPx()
        )
        //  containSet.connect(textView.id,ConstraintSet.BOTTOM,ConstraintSet.PARENT_ID,ConstraintSet.BOTTOM,100.toPx())

        containSet.connect(
            textView1.id,
            ConstraintSet.LEFT,
            ConstraintSet.PARENT_ID,
            ConstraintSet.LEFT, 10.toPx()
        )
        containSet.connect(
            textView1.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP, 580.toPx()
        )
        //containSet.connect(textView.id,ConstraintSet.RIGHT,ConstraintSet.PARENT_ID,ConstraintSet.RIGHT,100.toPx())
        //  containSet.connect(textView.id,ConstraintSet.BOTTOM,ConstraintSet.PARENT_ID,ConstraintSet.BOTTOM,100.toPx())


        containSet.applyTo(mainLayout)

    }
}