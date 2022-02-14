package com.sg.generalpost12.general

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.generalpost12.R
import com.sg.generalpost12.data.CONSTANT
import com.sg.generalpost12.postim.NineLinePost

class Post3Lines(val context: Context) {

    private val image: ImageView = (context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost = NineLinePost(context, layout)
    var lineNum = 3
    fun post30() {
        image.load(R.drawable.city)
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

    fun post31() {
        image.load(R.drawable.road)
        val backGround = "e0e0e0"
        val tranparency = 7
        val lineA = arrayOf(
            "הדרך שלך",
            "היא לא תמיד הכי נוחה בעולם",
            "אבל היא תמיד הדרך שלך.",
        )
        val marginA = arrayOf(
            arrayOf(0, 5, 0, -1),
            arrayOf(0, 40, 0, -1),
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
            radius = 10, fontFamily = 31
        )
    }


    fun post33() {
        image.load(R.drawable.demon)
        val backGround = "e0e0e0"
        val tranparency = 0
        val lineA = arrayOf(
            "עוצמת השדים שלך",
            "תלויה",
            "בחשיבות שאתה מעניק להם.",
        )
        val marginA = arrayOf(
            arrayOf(0, 20, 0, -1),
            arrayOf(0, 50, 0, -1),
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

    fun post34() {
        image.load(R.drawable.girl_in_sea)
        val backGround = "9e9e9e"
        val tranparency = 8
        val lineA = arrayOf(
            "המשמעות (הכללית) של החיים",
            "מוגדרת במדויק על ידי",
            "חוסר המשמעות (הפרטית) שלהם.",
        )
        val marginA = arrayOf(
            arrayOf(0, 5, 0, -1),
            arrayOf(0, 77, 0, -1),
            arrayOf(0, 115, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(1, 23, 20, 23)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        //  val col = "#f6ff03"
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 1
        )
    }

    fun post35() {
        image.load(R.drawable.people)
        val backGround = "546e7a"
        val tranparency = 8
        val lineA = arrayOf(
            "החיים קורים ,",
            "זה שאתה בטוח שהם קורים לך",
            "זה פשוט טעות כואבת.",
        )
        val marginA = arrayOf(
            arrayOf(0, 5, 0, -1),
            arrayOf(0, 36, 0, -1),
            arrayOf(0, 100, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 23, 20, 23)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        //  val col = "#f6ff03"
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 1
        )
    }

    fun post36() {
        image.load(R.drawable.old_and_haapy)
        val backGround = "546e7a"
        val tranparency = 8
        val lineA = arrayOf(
            "המתכון הבטוח שלא  להזדקן",
            "הוא פשוט",
            "להישאר צעיר.",
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 80),
            arrayOf(0, -1, 0, 40),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 25, 20, 23)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        //  val col = "#f6ff03"
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 4
        )
    }

    fun post37() {
        image.load(R.drawable.tv)
        val backGround = "546e7a"
        val tranparency = 8
        val lineA = arrayOf(
            "מתכון  בדוק  לזוגיות:",
            "דברו  ביניכם",
            "רק  בפרסומות.",
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 100),
            arrayOf(0, -1, 0, 50),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        // val textSizeA = arrayOf(0, 25)
        val textSizeA = arrayOf(0, 30, 20, 23)
        //val textColorA = arrayOf(CONSTANT, "#f6ff03")
        //  val col = "#f6ff03"
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 5
        )
    }

    fun post38() {
        image.load(R.drawable.chair2)
        val backGround = "546e7a"
        val tranparency = 8
        val lineA = arrayOf(
            "כל מה שאתה חושב שיפתור את כל הבעיות שלך",
            "הוא לא,",
            "במקרה הטוב הוא יפנה אותך לבעיות אחרות.",
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 65, 0, -1),
            arrayOf(0, 100, 0, -1)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        val textSizeA = arrayOf(0, 22, 20, 23)
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 7
        )
    }

    fun post39() {
        image.load(R.drawable.world)
        val backGround = "546e7a"
        val tranparency = 8
        val lineA = arrayOf(
            "הכל נכון ,",
            "אבל רק מעט מכל הנכון הזה",
            "מתאים לך ברגע זה.",
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 35, 0, -1),
            arrayOf(0, 70, 0, -1)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        val textSizeA = arrayOf(0, 22, 20, 23)
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 7
        )
    }

    fun post40() {
        image.load(R.drawable.fench)
        val backGround = "293250"
        val tranparency = 4
        val lineA = arrayOf(
            "שני דברים צריך האדם בחייו:",
            "אישור שלא  להיות  מושלם",
            "ורצון שלא  להיות  סמרטוט.",
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 35, 0, -1),
            arrayOf(0, 70, 0, -1)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        val textSizeA = arrayOf(0, 22, 20, 23)
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 4
        )
    }

    fun post41() {
        image.load(R.drawable.justice)
        val backGround = "f0a07c"
        val tranparency = 8
        val lineA = arrayOf(
            "אל תמהר להיות צודק",
            "תן לאחרים להיות צודקים ראשונים,",
            "כי צודק מי שצודק אחרון.",
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 120),
            arrayOf(0, -1, 0, 60),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        val textSizeA = arrayOf(0, 22, 20, 23)
        val col = "#4a274f"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 1
        )
    }

    fun post42() {
        image.load(R.drawable.joy)
        val backGround = "2b3252"
        val transparency = 6
        val lineA = arrayOf(
            "כדאי לך להנות מהחיים",
            "כל זמן שאתה עדיין חי,",
            "אחר כך יהיה לך קצת קשה יותר.",
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 30, 0, -1),
            arrayOf(0, 60, 0, -1)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        val textSizeA = arrayOf(0, 22, 20, 23)
        val col = "#fad744"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 1
        )
    }

    fun post43() {
        image.load(R.drawable.joy16)
        val backGround = "2b3252"
        val transparency = 0
        val lineA = arrayOf(
            "הדבר הכי חשוב בחיים",
            "זה לדעת",
            "שאתה עדיין לא מת.",
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 70),
            arrayOf(0, -1, 0, 35),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        val textSizeA = arrayOf(0, 24, 20, 23)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 1
        )
    }

    fun post344() {
        image.load(R.drawable.optimist)
        val backGround = "428289"
        val transparency = 5
        val lineA = arrayOf(
            "אופטימיות,",
            "זה לראות את המשך הדרך",
            "גם אחרי השביל.",
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 90),
            arrayOf(0, -1, 0, 45),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        val textSizeA = arrayOf(1, 32, 26, 26)
        val col = "#ffd04e"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 3
        )
    }

    fun post345() {
        image.load(R.drawable.road10)
        val backGround = "428289"
        val transparency = 5
        val lineA = arrayOf(
            "כדאי שתחיה את החיים בטוב",
            " כי כל דרך אחרת ",
            "תהיה הרבה פחות נוחה.",
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 90),
            arrayOf(0, -1, 0, 45),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        val textSizeA = arrayOf(0, 26, 26, 26)
        val col = "#ffd04e"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 20, fontFamily = 4
        )
    }

    fun post346() {
        image.load(R.drawable.friend)
        val backGround = "428289"
        val transparency = 5
        val lineA = arrayOf(
            "  זה לא משנה כמה האקס שלך דביל  ",
            " כאקס ",
            "תמיד הוא מוסיף עוד מרחב לעולם הנפשי שלך.",
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 40, 0, -1),
            arrayOf(0, 80, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 22, 26, 26)
        val col = "#ffd04e"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15, fontFamily = 4
        )
    }

    fun post347() {
        image.load("https://cdn.pixabay.com/photo/2016/06/29/22/02/parking-space-1487891_1280.jpg")
        val backGround = "428289"
        //val transparency = 5
        val transparency = 0
        val lineA = arrayOf(
            "תאורטית בעולם הזה",
            "אתה יכול לעשות מה שאתה רוצה,",
            "מעשית אתה מוגבל במה שאתה.",
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 80),
            arrayOf(0, -1, 0, 40),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 24, 26, 26)
        // val col = "#ffd04e"
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15, fontFamily = 4
        )
    }

    fun post348() {
        image.load("https://cdn.pixabay.com/photo/2018/01/16/07/30/grass-3085457_1280.jpg")
        //  image.load(R.drawable.parking)
        val backGround = "428289"
        //val transparency = 5
        val transparency = 0
        val lineA = arrayOf(
            "החכמה",
            "  להתחיל לחיות לפני המוות  ",
            " אחר כך זה יהיה קצת מאוחר. ",
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 80),
            arrayOf(0, -1, 0, 40),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 24, 26, 26)
        // val col = "#ffd04e"
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15, fontFamily = 4
        )
    }

    fun post349() {
        image.load("https://cdn.pixabay.com/photo/2016/09/10/17/18/book-1659717_1280.jpg")
        val backGround = "428289"
        val transparency = 0
        val lineA = arrayOf(
            "שני דברים צריך הבן אדם:",
            " לחיות בשגרה מעניינת ",
            " ולדעת להודות על השגרה הזו. ",
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 40, 0, -1),
            arrayOf(0, 80, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 24, 26, 26)
        // val col = "#ffd04e"
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15, fontFamily = 4
        )
    }

    fun post350() {
        image.load("https://cdn.pixabay.com/photo/2016/04/27/20/38/girl-1357485_1280.jpg")
        val backGround = "767a77"
        val transparency = 3
        val lineA = arrayOf(
            "אתה לא עושה לאף אחד טובה",
            "שאתה מבסוט מהחיים,",
            "פרט לעצמך.",
        )


        val marginA = arrayOf(
            arrayOf(0, -1, 0, 90),
            arrayOf(0, -1, 0, 50),
            arrayOf(0, -1, 0, 10)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        val textSizeA = arrayOf(0, 30)
        val col = "#d3d8d4"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15, fontFamily = 170
        )
    }


    fun post351() {
        image.load("https://cdn.pixabay.com/photo/2021/06/03/00/06/sheet-music-6305620_1280.jpg")
        val backGround = "428289"
        val transparency = 0
        val lineA = arrayOf(
            "האומנות לחיות",
            "זה לראות את הקסם",
            "מאחורי כל הבנאליות הזו.",
        )
        val di = 10
        val marginA = arrayOf(
            arrayOf(0, 0 + di, 0, -1),
            arrayOf(0, 40 + di, 0, -1),
            arrayOf(0, 80 + di, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 28)
        val col = "#107896"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15, fontFamily = 380
        )
    }

    fun post352() {
        image.load("https://cdn.pixabay.com/photo/2015/07/14/06/09/man-844211_1280.jpg")
        val backGround = "428289"
        val transparency = 0
        val lineA = arrayOf(
            "הדרך לחיים נכונים יותר:",
            "להגיב פחות",
            "ולהכיל יותר.",
        )
        val di = 5
        val marginA = arrayOf(
            arrayOf(0, 0 + di, 0, -1),
            arrayOf(0, 35 + di, 0, -1),
            arrayOf(0, 70 + di, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 28)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15, fontFamily = 200
        )

    }
   fun post353() {
       image.load("https://cdn.pixabay.com/photo/2014/05/03/01/01/tunnel-336693_1280.jpg")
       val backGround = "428289"
       val transparency = 0
       val lineA = arrayOf(
           " אין חושך בעולם ",
           "אבל יש מקומות",
           "שהאור לא מגיע אליהם.",
       )
       /*אין חושך בעולם
אבל יש מקומות
שהאור לא מגיע אליהם.
*/
       val di = 5
       val marginA = arrayOf(
           arrayOf(0, -1, 0, 80),
           arrayOf(0, -1, 0, 40),
           arrayOf(0, -1, 0, 0)
       )
       val paddingA = arrayOf(0, 0, 0, 0)
       val textSizeA = arrayOf(0, 32)
       val col = "#ffffff"
       val textColorA = arrayOf(CONSTANT, col, col)

       nineLinesPost.createPost(
           lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
           radius = 15, fontFamily = 110
       )

   }
    fun post354() {
        image.load("https://cdn.pixabay.com/photo/2018/01/26/08/32/nature-3108066__480.jpg")
        val backGround = "428289"
        val transparency = 0
        val lineA = arrayOf(
            " גן העדן והגיהנום ",
            "הם לא מקומות   בעולם הבא,",
            "הם יותר צורת מחשבות שלך   בעולם הזה.",
        )
        val di = 5
        val marginA = arrayOf(
            arrayOf(0, 0+di, 0,-1 ),
            arrayOf(0, 40+di, 0,-1 ),
            arrayOf(0, 110+di, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 24)
        val col = "#007591"
        val textColorA = arrayOf(CONSTANT, col, col)

        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15, fontFamily = 240
        )

    }
}