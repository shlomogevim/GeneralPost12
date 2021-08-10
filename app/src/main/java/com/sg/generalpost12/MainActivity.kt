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

        oneLine = OneLinePost(this, mainLayout)
        twoLines = TwoLinePost(this, mainLayout)
        threeLines = ThreeLinePost(this, mainLayout)
        fourLinesPost = FourLinePost(this, mainLayout)
        fiveLinesPost = FiveLinesPost(this, mainLayout)
        sixLinesPost = SixLinePost(this, mainLayout)


        //  post10()      // 1 lines

       // post20()      // 2 lines
      //  post21()      // 2 lines

      //   post30()      // 3 lines

       //  post50()      // 5 lines

         post60()      // 6 lines


    }

    private fun post10() {
        imageView.load(R.drawable.talking)
        val strings = arrayOf(
            "כל אחד מדבר את מה שהוא."
        )
        val margin = arrayOf(
            arrayOf(0, 0, 15, 1)
        )
        val padding = arrayOf(30, 0, 30, 0)

        oneLine.createPost1("263238", 3, strings, margin, padding, 23f)
    }

    private fun post20() {
        imageView.load(R.drawable.sad)
        val strings = arrayOf(
            "אין בעיות בעולם",
            "חוץ מאלה שאצלך בראש"
        )
        val margin = arrayOf(
            arrayOf(0, 0, 10, 40),
            arrayOf(0, 0, 40, 2)
        )
        val padding = arrayOf(0, 0, 0, 0)

        twoLines.createPost2("263238", 4, strings, margin, padding, 26f)
    }

    private fun post21() {
        imageView.load(R.drawable.pinocchio)
        val strings = arrayOf(
            "לאמת פנים רבות",
            "אחד מהם הוא השקר."
        )
        val margin = arrayOf(
            arrayOf(0, 0, 10, 40),
            arrayOf(0, 0, 2, 2)
        )
        val padding = arrayOf(0, 0, 0, 0)

          twoLines.createPost2("263238", 4, strings, margin, padding, 26f)
    }

    private fun post30() {
        imageView.load(R.drawable.city)
        val strings = arrayOf(
            "הבלי עולם הזה",
            "זו המציאות הרגילה",
            "שאין בה קורטוב של קדושה.",
        )
        val margin = arrayOf(
            arrayOf(0, 0, 5, 48),
            arrayOf(0, 0, 10, 25),
            arrayOf(0, 0, 15, 2)
        )
        val padding = arrayOf(0, 0, 0, 0)

        threeLines.createPost3("263238", 0, strings, margin, padding, 24f)
    }

    private fun post50() {
        imageView.load(R.drawable.love)
        val st1 = "בסוף מה נשאר לך?"
        val st2 = " רק אהבה "

        val strings = arrayOf(
            "בזמנים שהכול נשבר מסביב",
            "וכל גל נראה מאיים ואינסופי",
            "ניזכר במשפט של אריק איינשטיין בערוב ימיו:",
            "\"" + st1,
            st2 + "\""
        )
        val margin = arrayOf(
            arrayOf(0, 5, 5, 0),
            arrayOf(0, 35, 5, 0),
            arrayOf(0, 65, 5, 0),
            arrayOf(0, 125, 5, 0),
            arrayOf(0, 155, 220, 0)
        )
        val padding = arrayOf(0, 0, 0, 0)

        fiveLinesPost.createPost5("263238", 0, strings, margin, padding, 24f)
    }

    private fun post60() {
        imageView.load(R.drawable.man)
        val strings = arrayOf(
            "ההבדל בין:",
            "טמבל רגיל",
            "לטמבל עם שלושה תארים",
            "באוניברסיטה",
            "הוא רק הכבוד",
            "שאתה חולק לכל אחד מהם."
        )
        val margin = arrayOf(
            arrayOf(0, 0, 5, 155),
            arrayOf(0, 0, 5, 125),
            arrayOf(0, 0, 5, 95),
            arrayOf(0, 0, 200, 65),
            arrayOf(0, 0, 5, 35),
            arrayOf(0, 0, 45, 5)
        )
        val padding = arrayOf(0, 0, 0, 0)

        sixLinesPost.createPost6("263238", 6, strings, margin, padding, 24f)
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