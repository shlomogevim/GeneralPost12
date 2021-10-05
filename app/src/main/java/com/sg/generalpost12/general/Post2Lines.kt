package com.sg.generalpost12.general

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.generalpost12.R
import com.sg.generalpost12.data.CONSTANT
import com.sg.generalpost12.postim.NineLinePost

class Post2Lines(val context: Context) {

    private val image: ImageView = (context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.mainLayout)
    private val nineLinesPost = NineLinePost(context, layout)
    val lineNum = 2
  fun post200() {
        image.load("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg")
        val backGround = "000000"
        val tranparency = 6
        val lineA = arrayOf(
            "אין בעיות בעולם",
            "חוץ מאלה שאצלך בראש."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 37),
            arrayOf(0, -1, 0, 5)
        )
        val paddingA = arrayOf(10, 0, 10, 0)

        val textSizeA = arrayOf(0, 26)

        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)

        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            fontFamily = 430,radius = 5
        )
    }

    fun post201() {
        image.load(R.drawable.pinocchio)
        val backGround = "263238"
        val tranparency = 2
        val lineA = arrayOf(
            "לאמת פנים רבות",
            "  אחד מהם הוא השקר."
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 30, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)

        val textSizeA = arrayOf(0, 26)
        val col = "#a7aba8"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            fontFamily = 467
        )
    }
    fun post202() {
        image.load("https://cdn.pixabay.com/photo/2019/03/31/07/37/black-hole-4092609_1280.jpg")
        val backGround = "263238"
        val transparency = 0
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
        val col = "#b3b7b4"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 509
        )
    }
    fun post203() {
        image.load("https://cdn.pixabay.com/photo/2018/02/13/22/02/light-3151723_1280.jpg")
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
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 25)
        val col = "#f6ff03"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 551
        )
    }
    fun post204() {
        image.load("https://cdn.pixabay.com/photo/2021/01/09/21/09/antelope-5903514_1280.jpg")
        val backGround = "004d40"
        val transparency = 0
        val lineA = arrayOf(
            "אם אתה לא יכול להטיב את המצב",
            "אז על תתערב."
        )
        val di=10
        val marginA = arrayOf(
            arrayOf(0, 0+di, 0, -1),
            arrayOf(0, 72+di, 0, -1)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        val textSizeA = arrayOf(0, 29)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 600
        )
    }
    fun post205() {
        image.load("https://cdn.pixabay.com/photo/2020/01/06/10/16/theravada-buddhism-4745053_1280.jpg")
        val backGround = "004d40"
        val tranparency = 0
        val lineA = arrayOf(
            "אי עשייה גוררת  אי עשייה ,",
            "עשייה גוררת  עשייה."
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 40, 0, -1)
        )
        val paddingA = arrayOf(10, 0, 10, 0)
        val textSizeA = arrayOf(0, 26)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 4
        )
    }
    fun post206() {
        image.load("https://cdn.pixabay.com/photo/2015/09/16/21/07/egg-943413_1280.jpg")
        val backGround = "757575"
        val tranparency = 0
        val lineA = arrayOf(
            "ככל  שהחיים נעשים שבירים יותר,",
            "כך הם יותר מובנים."
        )
        val di=35
        val marginA = arrayOf(
            arrayOf(0, 0+di, 0, -1),
            arrayOf(0, 100+di, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 30)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 541
        )
    }
    fun post207() {
        image.load("https://cdn.pixabay.com/photo/2020/01/14/19/09/crayon-4766037_1280.jpg")
        val backGround = "757575"
        val transparency = 6
        val lineA = arrayOf(
            " האלוהים ברא את היצירה ",
            " האדם  את  הביקורת. "
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 40, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 30)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 110
        )
    }

    fun post208() {
        image.load(R.drawable.view)
        val backGround = "efc9af"
        val transparency = 0
        val lineA = arrayOf(
            "אתה בוחר מן הסתם להגיע למקומות מסוימים,",
            "אבל החיים בוחרים לך את סוג החוויה שם."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 100),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        val textSizeA = arrayOf(0, 30)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 4
        )
    }
    fun post209() {
        image.load(R.drawable.long_road)
        val backGround = "efc9af"
        val transparency = 0
        val lineA = arrayOf(
            "אם אין לך דרך אחרת זמינה טובה יותר",
            "אין טעם לקטר על הדרך בה אתה הולך."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 100),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        val textSizeA = arrayOf(0, 30)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 4
        )
    }
    fun post210() {
        image.load(R.drawable.fool)
        val backGround = "efc9af"
        val transparency = 7
        val lineA = arrayOf(
            "זה שאתה מאמין בהבלים",
            "זה לא עושה אותם פחות הבלים."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 103),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        val textSizeA = arrayOf(0, 30)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 4
        )
    }
    fun post211() {
        image.load("https://cdn.pixabay.com/photo/2016/02/11/12/01/buddhism-1193442_1280.jpg")
        val backGround = "efc9af"
        val transparency = 10
        val lineA = arrayOf(
            "חכם לא עושה דברים",
            "שטיפש סובל מהם על בסיס קבוע."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 80),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        val textSizeA = arrayOf(0, 25)
        val col = "#1f8ac0"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 103
        )
    }
    fun post212() {
        image.load("R.drawable.wise10")
        val backGround = "efc9af"
        val transparency = 8
        val lineA = arrayOf(
            "הטיפש בטוח בחכמתו",
            "החכם בטוח בטיפשוטו."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 55),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        val textSizeA = arrayOf(0, 30)
        val col = "#1f8ac0"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 4
        )
    }
    fun post213() {
        image.load(R.drawable.fool10)
        val backGround = "e64a19"
        val transparency = 8
        val lineA = arrayOf(
            "   להיתפס כטמבל בעיני עצמך   ",
            "זה הרבה יותר גרוע מלהיות טמבל."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 82),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 24)
        val col = "#ffe25f"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 4
        )
    }
    fun post214() {
        image.load(R.drawable.sunrise10)
        val backGround = "e64a19"
        val transparency = 4
        val lineA = arrayOf(
            "אתה לא יכול להרוויח משהו אמיתי בחיים האלה",
            "פרט לזכות הזאת לחיות את הרגע הזה."
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 98, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 24)
        val col = "#ffe25f"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 5,fontFamily = 1
        )
    }
    fun post215() {
        image.load(R.drawable.success)
        val backGround = "4ac4e2"
        val transparency = 7
        val lineA = arrayOf(
            "ההצלחה שלך נמדדת",
            "רק לפי האמונה שבך שאתה מצליח."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 65),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 24)
        val col = "#004e68"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 5,fontFamily = 1
        )
    }
    fun post216() {
        image.load(R.drawable.cave)
        val backGround = "4ac4e2"
        val transparency = 0
        val lineA = arrayOf(
            "החיים האלה דורשים ממך להתנהל בהגיון,",
            "למרות שהם עצמם ממש לא הגיוניים."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 65),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 24)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 4,fontFamily = 1
        )
    }

    fun post217() {

        image.load("https://cdn.pixabay.com/photo/2018/07/05/11/47/hand-3518161_1280.png")

        val backGround = "4ac4e2"
        val transparency = 0
        val lineA = arrayOf(
            "אתה לא מספיק טוב",
            "כדי להבין כמה טוב."
        )
        val di=15

        val marginA = arrayOf(
            arrayOf(0, 0+di, 0, -1),
            arrayOf(0, 50+di, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 36)
        val col = "#06a2bf"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 4,fontFamily = 530
        )
    }

}
