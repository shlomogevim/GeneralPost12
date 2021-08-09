package com.sg.generalpost12

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import coil.load
import com.sg.generalpost12.postim.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var oneLine: OneLinePost
    lateinit var twoLines: TwoLinePost
    lateinit var threeLines: ThreeLinePost
    lateinit var fourLinesPost: FourLinePost
    lateinit var fiveLinesPost: FiveLinesPost
    lateinit var sixLinesPost: SixLinePost

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        oneLine = OneLinePost (this, mainLayout)
        twoLines = TwoLinePost(this, mainLayout)
        threeLines = ThreeLinePost(this, mainLayout)
        fourLinesPost = FourLinePost(this, mainLayout)
        fiveLinesPost = FiveLinesPost(this, mainLayout)
        sixLinesPost = SixLinePost(this, mainLayout)

         //post1()      // 2 lines
        // post2()      // 5 lines
        // post3()      // 3 lines
        // post4()      // 6 lines
            //  post5()      // 2 lines
              post6()      // 1 lines


    }
    private fun post6() {
        imageView.load(R.drawable.talking)
        val array = arrayOf(
            arrayOf(0, 0, 15, 1)
        )
        val strings = arrayOf(
            "כל אחד מדבר את מה שהוא."
        )
        oneLine.createPost1("#263238", strings, array, 23f)
    }
    private fun post5() {
        imageView.load(R.drawable.pinocchio)
        val array = arrayOf(
            arrayOf(0, 0, 10, 40),
            arrayOf(0, 0, 40, 10)
        )
        val strings = arrayOf(
            "לאמת פנים רבות",
            "אחד מהם הוא השקר."
        )
        twoLines.createPost2(0, strings, array, 26f)
    }
    private fun post4() {
        imageView.load(R.drawable.man)
        val array = arrayOf(
            arrayOf(0, 0, 5, 155),
            arrayOf(0, 0, 5, 125),
            arrayOf(0, 0, 5, 95),
            arrayOf(0, 0, 200, 65),
            arrayOf(0, 0, 5, 35),
            arrayOf(0, 0, 45, 5)
        )
        val strings = arrayOf(
            "ההבדל בין:",
            "טמבל רגיל",
            "לטמבל עם שלושה תארים",
            "באוניברסיטה",
            "הוא רק הכבוד",
            "שאתה חולק לכל אחד מהם."
        )
        sixLinesPost.createPost6(0, strings, array, 22f)
    }
    private fun post3() {
        imageView.load(R.drawable.city)
        val array = arrayOf(
            arrayOf(0, 0, 5, 65),
            arrayOf(0, 0, 5, 35),
            arrayOf(0, 0, 5, 5)
        )
        val strings = arrayOf(
            "הבלי עולם הזה",
            "זו המציאות הרגילה",
            "שאין בה קורטוב של קדושה.",
            )
        threeLines.createPost3(0, strings, array, 22f)
    }
    private fun post2() {
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
            "\"" + st1,
            st2 + "\""
        )
        fiveLinesPost.createPost5(1, strings, array, 18f)
    }
    private fun post1() {
        imageView.load(R.drawable.sad)
        val array = arrayOf(
            arrayOf(0, 0, 10, 40),
            arrayOf(0, 0, 40, 10)
        )
        val strings = arrayOf(
            "אין בעיות בעולם",
            "חוץ מאלה שאצלך בראש"
        )
        twoLines.createPost2(0, strings, array, 26f)
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