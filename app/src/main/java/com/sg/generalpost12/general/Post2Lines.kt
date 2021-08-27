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
  fun post20() {
        image.load(R.drawable.sad)
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

    fun post21() {
        image.load(R.drawable.pinocchio)
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
    fun post222() {
        image.load(R.drawable.future)
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
    fun post23() {
        image.load(R.drawable.man_in_the_forest)
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
    fun post24() {
        image.load(R.drawable.fight)
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
    fun post25() {
        image.load(R.drawable.monk2)
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
    fun post26() {
        image.load(R.drawable.fragile)
        val backGround = "757575"
        val tranparency = 8
        val lineA = arrayOf(
            "ככל  שהחיים נעשים שבירים יותר,",
            "כך הם יותר מובנים."
        )
        val marginA = arrayOf(
            arrayOf(0, 0, 0, -1),
            arrayOf(0, 100, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 30)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, tranparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 4
        )
    }
    fun post227() {
        image.load(R.drawable.creation)
        val backGround = "757575"
        val transparency = 8
        val lineA = arrayOf(
            " האלוהים ברא את היצירה ",
            " האדם  את  הביקורת. "
        )
        val marginA = arrayOf(
            arrayOf(0, 5, 0, -1),
            arrayOf(0, 55, 0, -1)
        )
        val paddingA = arrayOf(0, 0, 0, 0)
        val textSizeA = arrayOf(0, 30)
        val col = "#ffffff"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 4
        )
    }
    fun post28() {
        image.load(R.drawable.life)
        val backGround = "efc9af"
        val transparency = 3
        val lineA = arrayOf(
            "אתה לא עושה לאף אחד טובה שאתה מבסוט מהחיים",
            "פרט לעצמך ."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 50),
            arrayOf(0, -1, 0, 0)
        )
        val paddingA = arrayOf(5, 0, 5, 0)
        val textSizeA = arrayOf(0, 30)
        val col = "#104c91"
        val textColorA = arrayOf(CONSTANT, col)
        nineLinesPost.createPost(
            lineNum, backGround, transparency, lineA, marginA, paddingA, textSizeA, textColorA,
            radius = 15,fontFamily = 4
        )
    }
    fun post29() {
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
    fun post30() {
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
    fun post31() {
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
    fun post32() {
        image.load(R.drawable.wise1)
        val backGround = "efc9af"
        val transparency = 8
        val lineA = arrayOf(
            "חכם לא עושה דברים",
            "שטיפש סובל מהם על בסיס קבוע."
        )
        val marginA = arrayOf(
            arrayOf(0, -1, 0, 102),
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
    fun post233() {
        image.load(R.drawable.wise10)
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
    fun post234() {
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
    fun post235() {
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
    fun post236() {
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
    fun post237() {
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

}
