package com.sg.generalpost12

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.sg.generalpost12.data.CONSTANT
import com.sg.generalpost12.postim.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var oneLine: OneLinePost
    lateinit var twoLines: TwoLinePost
    lateinit var threeLines: ThreeLinePost
    lateinit var fourLinesPost: FourLinePost
    lateinit var fiveLinesPost: FiveLinesPost
    lateinit var sixLinesPost: SixLinePost
    lateinit var nineLinesPost: NineLinePost
    lateinit var nineLinesPost1: NineLinePost1

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
        nineLinesPost = NineLinePost(this, mainLayout)
        nineLinesPost1 = NineLinePost1(this, mainLayout)


        //  post10()

        //  post20()
        //  post21()

        //   post30()

        //  post40()

        //  post50()
        //  post51()

        //  post60()
        // post90()
        post90a()


    }

    private fun post10() {
        imageView.load(R.drawable.talking)
        val strings = arrayOf(
            "כל אחד מדבר את מה שהוא."
        )
        val margin = arrayOf(
            arrayOf(0, 0, 15, 1)
        )
        val padding = arrayOf(10, 0, 10, 0)

        oneLine.createPost1("263238", 3, strings, margin, padding, 23f)
    }

    private fun post20() {
        imageView.load(R.drawable.sad)
        val strings = arrayOf(
            "אין בעיות בעולם",
            "חוץ מאלה שאצלך בראש"
        )
        val margin = arrayOf(
            arrayOf(0, 0, 20, 40),
            arrayOf(0, 0, 50, 2)
        )
        val padding = arrayOf(10, 0, 10, 0)

        twoLines.createPost2("263238", 10, strings, margin, padding, 26f, radius = 20)
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

    private fun post40() {
        imageView.load(R.drawable.climb)
        val strings = arrayOf(
            "על תהיה הכי טוב",
            "זה לא יצליח לך לאורך זמן,",
            "לך על משהו יותר ממשי",
            "תהיה הכי אתה."

        )
        val margin = arrayOf(
            arrayOf(0, 5, 5, 0),
            arrayOf(0, 45, 10, 0),
            arrayOf(0, 85, 40, 0),
            arrayOf(0, 125, 160, 0)
        )
        val padding = arrayOf(5, 0, 5, 0)

        fourLinesPost.createPost4("263238", 2, strings, margin, padding, 24f, radius = 10)
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

    private fun post51() {
        imageView.load(R.drawable.man)
        val strings = arrayOf(
            "ההבדל בין:",
            "טמבל רגיל",
            "לטמבל עם תואר של דוקטור",
            "הוא רק הכבוד",
            "שאתה חולק לכל אחד מהם."
        )
        val margin = arrayOf(
            arrayOf(0, 5, 5, 0),
            arrayOf(0, 35, 10, 0),
            arrayOf(0, 65, 15, 0),
            arrayOf(0, 95, 20, 0),
            arrayOf(0, 130, 40, 0)
        )
        val padding = arrayOf(0, 0, 0, 0)

        fiveLinesPost.createPost5("263238", 7, strings, margin, padding, 24f)
    }

    private fun post60() {
        imageView.load(R.drawable.man)
        val strings = arrayOf(
            "ההבדל בין:",
            "טמבל רגיל",
            "לטמבל עם תואר של דוקטור",
            "הוא רק הכבוד",
            "הוא רק הכבוד",
            "שאתה חולק לכל אחד מהם."
        )
        val margin = arrayOf(
            arrayOf(0, 5, 5, 0),
            arrayOf(0, 35, 10, 0),
            arrayOf(0, 65, 15, 0),
            arrayOf(0, 95, 20, 0),
            arrayOf(0, 95, 20, 0),
            arrayOf(0, 130, 40, 0)
        )
        val padding = arrayOf(0, 0, 0, 0)

        sixLinesPost.createPost6("263238", 7, strings, margin, padding, 24f)
    }

    private fun post90() {
        imageView.load(R.drawable.night)
        val strings = arrayOf(
            "זה שהסתדרת עם השנים זה לא אומר שאתה מסודר,",
            "זה שאתה עסוק כל הזמן זה לא אומר שאתה עושה משהו,",
            "זה שאתה אוכל כל הזמן זה לא אומר שאתה שבע,",
            "זה שיש לך הכל זה לא אומר שאתה לא רוצה עוד,",
            "זה שאתה נח כל היום זה לא אומר שאתה לא עייף,",
            "זה שיש לך חברים זה לא אומר שאתה לא בודד,",
            "זה שהחכמת עם השנים זה לא אומר שאתה חכם,",
            "זה שאתה לא עושה שום דבר זה לא אומר שיש לך זמן,",
            "זה שיש בך את האלוהי זה לא אומר שאתה אלוהים."

        )
        val margin = arrayOf(
            arrayOf(0, 0, 2, 0),
            arrayOf(0, 70, 2, 0),
            arrayOf(0, 140, 2, 0),
            arrayOf(0, 210, 2, 0),
            arrayOf(0, 280, 2, 0),
            arrayOf(0, 350, 2, 0),
            arrayOf(0, 420, 2, 0),
            arrayOf(0, 490, 2, 0),
            arrayOf(0, 560, 2, 0)
        )
        val padding = arrayOf(5, 0, 5, 0)

        nineLinesPost.createPost9(
            "263238",
            2,
            strings,
            margin,
            padding,
            25f,
            // textColor = "f6ff03",
            radius = 10,
            fontFamily = 0
        )
    }

    private fun post90a() {
        imageView.load(R.drawable.night)
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "זה שהסתדרת עם השנים זה לא אומר שאתה מסודר,",
            "זה שאתה עסוק כל הזמן זה לא אומר שאתה עושה משהו,",
            "זה שאתה אוכל כל הזמן זה לא אומר שאתה שבע,",
            "זה שיש לך הכל זה לא אומר שאתה לא רוצה עוד,",
            "זה שאתה נח כל היום זה לא אומר שאתה לא עייף,",
            "זה שיש לך חברים זה לא אומר שאתה לא בודד,",
            "זה שהחכמת עם השנים זה לא אומר שאתה חכם,",
            "זה שאתה לא עושה שום דבר זה לא אומר שיש לך זמן,",
            "זה שיש בך את האלוהי זה לא אומר שאתה אלוהים."
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 2, 0),
            arrayOf(0, 70, 2, 0),
            arrayOf(0, 140, 2, 0),
            arrayOf(0, 210, 2, 0),
            arrayOf(0, 280, 2, 0),
            arrayOf(0, 350, 2, 0),
            arrayOf(0, 420, 2, 0),
            arrayOf(0, 490, 2, 0),
            arrayOf(0, 560, 2, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
       // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 25,16,25,25,25,16,25,25,25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col="#f6ff03"
        val col1="#1de9b6"
        val textColorA = arrayOf("toto", col, col,col, col, col, col, col, col, col1)

        nineLinesPost1.createPost91(
            backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }

}