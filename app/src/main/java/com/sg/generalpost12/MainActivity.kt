package com.sg.generalpost12

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.sg.generalpost12.data.CONSTANT
import com.sg.generalpost12.general.*
import com.sg.generalpost12.postim.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var nineLinesPost: NineLinePost
    lateinit var post1Line: Post1Line
    lateinit var post2Line: Post2Lines
    lateinit var post3Line: Post3Lines
    lateinit var post4Lines:Post4Lines
    lateinit var post5Lines:Post5Lines




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nineLinesPost = NineLinePost(this, mainLayout)

        post1Line= Post1Line(this)
        post2Line=Post2Lines(this)
        post3Line=Post3Lines(this)
        post4Lines= Post4Lines(this)
        post5Lines= Post5Lines(this)



      //  post1Line.post12()

        //  post2Line.post25()+

       //post3Line.post35()
      // post3Line.post36()+
      // post3Line.post37()

        //post4Lines.post46()
       // post4Lines.post47()

        //post5Lines.post53()
        post5Lines.post54()









        // basicFun()

        // post10()
        // post11()

        //  post20()
        //  post21()
         //post22()
         //post23()
       // post24()

        //  post30()
         // post31()
         // post32()
        // post33()
        // post34()

        //  post40()
       // post41()
       // post42()
       // post43()
       // post44()
      // post45()+

        //   post50()
        //   post51()
             // post52()

       // post60()
       // post61()

       // post70()



       // post90()

    }

    private fun basicFun() {
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

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()

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

    private fun post11() {
        imageView.load(R.drawable.light_forest)
        val lineNum = 1
        val backGround = "263238"
        val tranparency = 1
        val lineA = arrayOf(
            "אתה הוא האור שבו אתה חי."
        )
        val marginA = arrayOf(arrayOf(0, 0, 0, 0))
        val paddingA = arrayOf(40, 0, 40, 0)

        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 30)

        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20
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
    private fun post22() {
        imageView.load(R.drawable.future)
        val lineNum = 2
        val backGround = "263238"
        val tranparency = 4
        val lineA = arrayOf(
            "העתיד הוא ההיסטוריה",
            "רק עם תאריך אחר."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 55),
            arrayOf(0, -1, 0, 10)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        val textSizeA = arrayOf(0, 29)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15
        )
    }
    private fun post23() {
        imageView.load(R.drawable.man_in_the_forest)
        val lineNum = 2
        val backGround = "263238"
        val tranparency = 4
        val lineA = arrayOf(
            "ונתתי את האור וחושך לפניך",
            "ובחרת באור."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 45),
            arrayOf(0, -1, 0, 10)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        val textSizeA = arrayOf(0, 29)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15
        )
    }
    private fun post24() {
        imageView.load(R.drawable.fight)
        val lineNum = 2
        val backGround = "004d40"
        val tranparency = 4
        val lineA = arrayOf(
            "אם אתה לא יכול להטיב עם המצב",
            "אז על תתערב."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 40),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        val textSizeA = arrayOf(0, 29)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 1
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
    private fun post32() {
        imageView.load(R.drawable.good_life)
        val lineNum = 3
        val backGround = "e0e0e0"
        val tranparency = 0
        val lineA = arrayOf(
            "הדרך לחיים נכונים יותר:",
            "להגיב פחות",
            "ולהכיל יותר.",
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 75),
            arrayOf(0, -1, 40,40),
            arrayOf(0, -1, 170, 5)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 28)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        //  val col = "#f6ff03"
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 0
        )
    }
    private fun post33() {
        imageView.load(R.drawable.demon)
        val lineNum = 3
        val backGround = "e0e0e0"
        val tranparency = 0
        val lineA = arrayOf(
            "עוצמת השדים שלך",
            "תלויה",
            "בחשיבות שאתה מעניק להם.",
        )
        val marginA = arrayOf(
            arrayOf(0, 20, 0, -1),
            arrayOf(0, 50, 0,-1),
            arrayOf(0, 80, 0, -1)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 28)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        //  val col = "#f6ff03"
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 0
        )
    }
    private fun post34() {
        imageView.load(R.drawable.girl_in_sea)
        val lineNum = 3
        val backGround = "9e9e9e"
        val tranparency = 8
        val lineA = arrayOf(
            "המשמעות (הכללית) של החיים",
            "מוגדרת במדויק על ידי",
            "חוסר המשמעות (הפרטית) שלהם.",
        )
        val marginA = arrayOf(
            arrayOf(0, 5, 0, -1),
            arrayOf(0, 77, 0,-1),
            arrayOf(0, 115, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 23,20,23)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        //  val col = "#f6ff03"
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20,fontFamily = 1
        )
    }
  /*  private fun post35() {
        imageView.load(R.drawable.people)
        val lineNum = 3
        val backGround = "9e9e9e"
        val tranparency = 8
        *//*החיים קורים
זה שאני בטוח שהם קורים לי
זה פשוט טעות כואבת .+
*//*
        val lineA = arrayOf(
            "החיים קורים",
            "זה שאתה בטוח שהם קורים לך",
            "זה פשוט טעות כואבת.",
        )
        val marginA = arrayOf(
            arrayOf(0, 5, 0, -1),
            arrayOf(0, 77, 0,-1),
            arrayOf(0, 115, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 23,20,23)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        //  val col = "#f6ff03"
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20,fontFamily = 1
        )
    }*/
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
    private fun post41() {
      // imageView.load(R.drawable.happy)
        imageView.load(R.drawable.smiley)

        val lineNum = 4
        val backGround = "263238"
        val tranparency = 0
        val lineA = arrayOf(
            "פסימיות",
            "זה לחשוב שיש מישהו מאושר ממך,",
            "אופטימיות",
            "זה להבין שאין אחד כזה."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 130),
            arrayOf(0, -1, 0, 75),
            arrayOf(0, -1, 0, 35),
            arrayOf(0, -1, 0, 5)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 20)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#00695c"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 1
        )
    }
    private fun post42() {
        imageView.load(R.drawable.time)

        val lineNum = 4
        val backGround = "eeeeee"
        val tranparency = 4
        val lineA = arrayOf(
            "האויב של הטוב",
            "הוא הטוב יותר,",
            "האויב של הרגע",
            "הוא הרגע הבא."
        )
        /*האויב של הטוב הוא טוב יותר
האויב של הרגע הזה הוא הרגע הבא
*/
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 125),
            arrayOf(0, -1, 0, 85),
            arrayOf(0, -1, 0, 45),
            arrayOf(0, -1, 0, 5)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 26)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#00695c"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 1
        )
    }
    private fun post43() {
        imageView.load(R.drawable.playground)

        val lineNum = 4
        val backGround = "eeeeee"
        val tranparency = 8
        val lineA = arrayOf(
            "לקטנים",
            "העולם הזה הוא מגרש משחקים,",
            "לגדולים",
            "מגרש בלי משחקים."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 122),
            arrayOf(0, -1, 0, 65),
            arrayOf(0, -1, 0, 35),
            arrayOf(0, -1, 0, 5)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 20)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#00695c"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 1
        )
    }

    private fun post44() {
        imageView.load(R.drawable.war)

        val lineNum = 4
        val backGround = "eeeeee"
        val tranparency = 8
        val lineA = arrayOf(
            "היכולת שלך לחיות בשלום עם עצמך",
            "תלויה בכישרון שלך",
            "לבחור בקפידה",
            "להילחם רק את המלחמות שמתאימות לך."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 250),
            arrayOf(0, -1, 0, 220),
            arrayOf(0, -1, 0, 190),
            arrayOf(0, -1, 0, 132)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 20)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#00695c"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 1
        )
    }
    private fun post45() {
        val lineNum = 4
        imageView.load(R.drawable.prison)
        imageView.scaleY=1.05f

        val backGround = "eeeeee"
        val tranparency = 8
        val lineA = arrayOf(
            "האנשים",
            "חיים כדרכם",
            "מתוך תא הכלא",
            "של מה שהם חושבים שהם."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 90),
            arrayOf(0, -1, 0, 60),
            arrayOf(0, -1, 0, 30),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 20)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#00695c"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 10,fontFamily = 1
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

    private fun post60() {
        imageView.load(R.drawable.bible)
        val lineNum = 6
        val backGround = "263238"
        val tranparency = 8
        val lineA = arrayOf(
            "אתה חי בתוך אגדה עתיקה",
            "גן העדן והגיהנום נמצאים כאן ועכשיו,",
            "הכוח שמחליט לאיפה תלך עכשיו הוא:",
            "אתה",
            "מה שנותר פתוח",
            "זו אמונה באגדות עתיקות."
        )
         val marginA = arrayOf(
            arrayOf(0, -1, 0, 305),
            arrayOf(0, -1, 0, 230),
            arrayOf(0, -1, 0, 155),
            arrayOf(0, -1, 0, 100),
            arrayOf(0, -1, 0, 55),
            arrayOf(0, -1, 0, 10)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 27, 27, 27, 33, 27, 27)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15
        )
    }

    private fun post61() {
        imageView.load(R.drawable.pill)
        val lineNum = 6
        val backGround = "263238"
        val tranparency = 6
        val lineA = arrayOf(
            "המיינד",
            "הוא כדור הרגעה",
            "מהאין סופיות של החיים,",
            "טוב להשתמש בו מידי פעם",
            "אבל כדי לשמור קשר טוב למציאות",
            "רצוי שלא להתמכר אליו יותר מידי."
        )

        val marginA = arrayOf(
            arrayOf(0, -1, 0, 270),
            arrayOf(0, -1, 0, 230),
            arrayOf(0, -1, 0, 190),
            arrayOf(0, -1, 0, 150),
            arrayOf(0, -1, 0, 80),
            arrayOf(0, -1, 0, 10)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 30, 25, 25, 25, 25, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val textColorA = arrayOf(CONSTANT, col, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15
        )
    }


    private fun post70() {
        imageView.load(R.drawable.man_searching)
       imageView.scaleY=.55f
      //  imageView.scaleX=.9f
        val lineNum = 7
       // val backGround = "263238"
        val backGround = "9e9e9e"
        val tranparency = 2
        val lineA = arrayOf(
            "האדם שמחפש משמעות בחיים",
            "דומה לאחד שקיבל כלי מופלא",
            "והוא ממש נבוך מהמתנה הזו,",
            "מצד אחד",
            "הוא שמע מכולם שהכלי הזה מדהים ברמות,",
            "אבל מהצד השני",
            "הוא לא יודע  מה לעזאזל עושים עם זה."
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 45, 0, -1),
            arrayOf(0, 90, 0, -1),
            arrayOf(0, -1, 40, 185),
            arrayOf(0, -1, 0, 115),
            arrayOf(0, -1, 0, 70),
            arrayOf(0, -1, 0, 0)
        )

        val paddingA = arrayOf(0, 0, 0, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 24, 16, 25, 25, 25, 16, 25)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        val col = "#f6ff03"
        val col1 = "#1de9b6"
        val col2 = "#212121"
        val textColorA = arrayOf(CONSTANT, col2, col, col, col, col, col, col1)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 17,fontFamily = 31
        )
    }

    private fun post90() {
        /*זה שאתה יודע הרבה על דיכאונות ואיך לצאת מהם זה לא אומר שאתה לא מדוכא
זה שאתה יועץ נישואים זה לא אומר שהזוגיות שלך מוצלחת
זה שאתה פסיכולוג זה לא אומר שאתה נמצא באופן שיגרתי לפני התמוטטות עצבים
זה שאתה יודע הרבה על החיים זה לא אומר שאתה חי בטוב
*/
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