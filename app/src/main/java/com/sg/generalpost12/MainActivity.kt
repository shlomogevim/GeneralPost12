package com.sg.generalpost12

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.sg.generalpost12.data.CONSTANT
import com.sg.generalpost12.postim.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var nineLinesPost: NineLinePost


    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nineLinesPost = NineLinePost(this, mainLayout)


        // post10()

        //  post20()
        //  post21()


        //  post30()
         // post31()

        //  post40()

        //   post50()
        //   post51()
          post52()


       // post90()


        //  post90a()
        // post80a()
        // post70a()
        // post60a()
        // post50a()
        // post40a()
        // post30a()
        // post20a()
        // post10a()


    }

    private fun post10() {
        imageView.load(R.drawable.talking)
        val lineNum = 1
        val backGround = "263238"
        val tranparency = 3
        val lineA = arrayOf(
            "כל אחד מדבר את מה שהוא."
        )
        val marginA = arrayOf(arrayOf(0, 0, 15, 1))
        val paddingA = arrayOf(10, 0, 10, 0)

        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 23)

        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }

    private fun post20() {
        imageView.load(R.drawable.sad)
        val lineNum = 2
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "אין בעיות בעולם",
            "חוץ מאלה שאצלך בראש"
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 20, 40),
            arrayOf(0, 0, 50, 2)
        )
        val paddingA = arrayOf(10, 0, 10, 0)

        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 26, 16)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }


    private fun post21() {
        imageView.load(R.drawable.pinocchio)
        val lineNum = 2
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "לאמת פנים רבות",
            "אחד מהם הוא השקר."
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 10, 40),
            arrayOf(0, 0, 2, 2)
        )
        val paddingA = arrayOf(0, 0, 0, 0)

        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 26, 16)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col1)
        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }


    private fun post30() {
        imageView.load(R.drawable.city)
        val lineNum = 3
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "הבלי עולם הזה",
            "זו המציאות הרגילה",
            "שאין בה קורטוב של קדושה.",
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 5, 48),
            arrayOf(0, 0, 10, 25),
            arrayOf(0, 0, 15, 2)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24, 16, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }
    private fun post31() {
        imageView.load(R.drawable.road)
        val lineNum = 3
        val backGround = "e0e0e0"
        val tranparency = 7
        val lineA = arrayOf(
            "הדרך שלך",
            "היא לא תמיד הכי נוחה בעולם",
            "אבל היא תמיד הדרך שלך.",
        )
        val marginA = arrayOf(
            arrayOf(0, 5, 0, -1),
            arrayOf(0, 40, 0,-1),
            arrayOf(0, 75, 0, -1)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24, 16, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
      //  val col = "#f6ff03"
        val col = "#424242"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 31
        )
    }

    private fun post40() {
        imageView.load(R.drawable.climb)
        val lineNum = 4
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "על תהיה הכי טוב",
            "זה לא יצליח לך לאורך זמן,",
            "לך על משהו יותר ממשי",
            "תהיה הכי אתה."
        )
        val marginA = arrayOf(
            arrayOf(0, 5, 5, 0),
            arrayOf(0, 45, 10, 0),
            arrayOf(0, 85, 40, 0),
            arrayOf(0, 125, 160, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24, 16, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10
        )
    }


    private fun post50() {
        imageView.load(R.drawable.love)
        val st1 = "בסוף מה נשאר לך?"
        val st2 = " רק אהבה "
        val lineNum = 5
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "בזמנים שהכול נשבר מסביב",
            "וכל גל נראה מאיים ואינסופי",
            "ניזכר במשפט של אריק איינשטיין בערוב ימיו:",
            "\"" + st1,
            st2 + "\""
        )
        val marginA = arrayOf(
            arrayOf(0, 5, 5, 0),
            arrayOf(0, 35, 5, 0),
            arrayOf(0, 65, 5, 0),
            arrayOf(0, 125, 5, 0),
            arrayOf(0, 155, 220, 0)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24, 16, 25, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }

    private fun post51() {
        imageView.load(R.drawable.man)

        val lineNum = 5
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "ההבדל בין:",
            "טמבל רגיל",
            "לטמבל עם תואר של דוקטור",
            "הוא רק הכבוד",
            "שאתה חולק לכל אחד מהם."
        )
        val marginA = arrayOf(
            arrayOf(0, 5, 5, 0),
            arrayOf(0, 35, 10, 0),
            arrayOf(0, 65, 15, 0),
            arrayOf(0, 95, 20, 0),
            arrayOf(0, 130, 40, 0)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24, 16, 25, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }


    private fun post52() {
        imageView.load(R.drawable.wheat)

        val lineNum = 5
        val backGround = "263238"
        val tranparency = 4
        val lineA = arrayOf(
            "שיהיו ימינו ארוכים עד מעבר לקצה השדות,",
            "שהשמש החמימה תטה לנו חסד מידי פעם,",
            "שצל העצים הגדולים יהיה רחב ומזמין,",
            "שנהיה פחות בסיפור שלנו על החיים",
            "ויותר בחיים."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 250),
            arrayOf(0, -1, 0, 180),
            arrayOf(0, -1, 0, 110),
            arrayOf(0, -1, 0, 40),
            arrayOf(0, -1, 0, 5)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24, 16, 25, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 25
        )
    }


    private fun post90() {
        imageView.load(R.drawable.night)
        val lineNum = 9
        val backGround = "263238"
        val tranparency = 2
        val stringA = arrayOf(
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
        val textSizeA = arrayOf(0, 25, 16, 25, 25, 25, 16, 25, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf("toto", col, col, col, col, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, stringA, marginA, paddingA, textSizeA, textColorA
        )
    }


    private fun post10a() {
        imageView.load(R.drawable.night)
        val lineNum = 1
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "זה שיש בך את האלוהי זה לא אומר שאתה אלוהים."
        )
        val marginA = arrayOf(
            arrayOf(0, 560, 2, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf("toto", col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }

    private fun post20a() {
        imageView.load(R.drawable.night)
        val lineNum = 2
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "זה שאתה לא עושה שום דבר זה לא אומר שיש לך זמן,",
            "זה שיש בך את האלוהי זה לא אומר שאתה אלוהים."
        )
        val marginA = arrayOf(
            arrayOf(0, 490, 2, 0),
            arrayOf(0, 560, 2, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 25, 16)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf("toto", col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }

    private fun post30a() {
        imageView.load(R.drawable.night)
        val lineNum = 3
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "זה שהחכמת עם השנים זה לא אומר שאתה חכם,",
            "זה שאתה לא עושה שום דבר זה לא אומר שיש לך זמן,",
            "זה שיש בך את האלוהי זה לא אומר שאתה אלוהים."
        )
        val marginA = arrayOf(
            arrayOf(0, 420, 2, 0),
            arrayOf(0, 490, 2, 0),
            arrayOf(0, 560, 2, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 25, 16, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf("toto", col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }

    private fun post40a() {
        imageView.load(R.drawable.night)
        val lineNum = 4
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "זה שיש לך חברים זה לא אומר שאתה לא בודד,",
            "זה שהחכמת עם השנים זה לא אומר שאתה חכם,",
            "זה שאתה לא עושה שום דבר זה לא אומר שיש לך זמן,",
            "זה שיש בך את האלוהי זה לא אומר שאתה אלוהים."
        )
        val marginA = arrayOf(
            arrayOf(0, 350, 2, 0),
            arrayOf(0, 420, 2, 0),
            arrayOf(0, 490, 2, 0),
            arrayOf(0, 560, 2, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 25, 16, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf("toto", col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }

    private fun post50a() {
        imageView.load(R.drawable.night)
        val lineNum = 5
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "זה שאתה נח כל היום זה לא אומר שאתה לא עייף,",
            "זה שיש לך חברים זה לא אומר שאתה לא בודד,",
            "זה שהחכמת עם השנים זה לא אומר שאתה חכם,",
            "זה שאתה לא עושה שום דבר זה לא אומר שיש לך זמן,",
            "זה שיש בך את האלוהי זה לא אומר שאתה אלוהים."
        )
        val marginA = arrayOf(
            arrayOf(0, 280, 2, 0),
            arrayOf(0, 350, 2, 0),
            arrayOf(0, 420, 2, 0),
            arrayOf(0, 490, 2, 0),
            arrayOf(0, 560, 2, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 25, 16, 25, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf("toto", col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }

    private fun post60a() {
        imageView.load(R.drawable.night)
        val lineNum = 6
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "זה שיש לך הכל זה לא אומר שאתה לא רוצה עוד,",
            "זה שאתה נח כל היום זה לא אומר שאתה לא עייף,",
            "זה שיש לך חברים זה לא אומר שאתה לא בודד,",
            "זה שהחכמת עם השנים זה לא אומר שאתה חכם,",
            "זה שאתה לא עושה שום דבר זה לא אומר שיש לך זמן,",
            "זה שיש בך את האלוהי זה לא אומר שאתה אלוהים."
        )
        val marginA = arrayOf(
            arrayOf(0, 210, 2, 0),
            arrayOf(0, 280, 2, 0),
            arrayOf(0, 350, 2, 0),
            arrayOf(0, 420, 2, 0),
            arrayOf(0, 490, 2, 0),
            arrayOf(0, 560, 2, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 25, 16, 25, 25, 25, 16)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf("toto", col, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }

    private fun post70a() {
        imageView.load(R.drawable.night)
        val lineNum = 7
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "זה שאתה אוכל כל הזמן זה לא אומר שאתה שבע,",
            "זה שיש לך הכל זה לא אומר שאתה לא רוצה עוד,",
            "זה שאתה נח כל היום זה לא אומר שאתה לא עייף,",
            "זה שיש לך חברים זה לא אומר שאתה לא בודד,",
            "זה שהחכמת עם השנים זה לא אומר שאתה חכם,",
            "זה שאתה לא עושה שום דבר זה לא אומר שיש לך זמן,",
            "זה שיש בך את האלוהי זה לא אומר שאתה אלוהים."
        )
        val marginA = arrayOf(
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
        val textSizeA = arrayOf(1, 25, 16, 25, 25, 25, 16, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf("toto", col, col, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }

    private fun post80a() {
        imageView.load(R.drawable.night)
        val lineNum = 8
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
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
        val textSizeA = arrayOf(1, 25, 16, 25, 25, 25, 16, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf("toto", col, col, col, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA
        )
    }

    private fun post90a() {
        imageView.load(R.drawable.night)
        val lineNum = 9
        val backGround = "263238"
        val tranparency = 2
        val stringA = arrayOf(
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
        val textSizeA = arrayOf(1, 25, 16, 25, 25, 25, 16, 25, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf("toto", col, col, col, col, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, stringA, marginA, paddingA, textSizeA, textColorA
        )
    }


}