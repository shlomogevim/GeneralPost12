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
    lateinit var post4Lines: Post4Lines
    lateinit var post5Lines: Post5Lines
    lateinit var post6Lines: Post6Lines
    lateinit var post7Lines: Post7Lines
    lateinit var post8Lines: Post8Lines
    lateinit var post9Lines: Post9Lines


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nineLinesPost = NineLinePost(this, mainLayout)

        post1Line = Post1Line(this)
        post2Line = Post2Lines(this)
        post3Line = Post3Lines(this)
        post4Lines = Post4Lines(this)
        post5Lines = Post5Lines(this)
        post6Lines = Post6Lines(this)
        post7Lines = Post7Lines(this)
        post8Lines = Post8Lines(this)
        post9Lines = Post9Lines(this)


        //  post1Line.post10()
        //post1Line.post11()
        // post1Line.post12()

        //  post2Line.post20()
        //  post2Line.post21()
        //  post2Line.post222()
        //  post2Line.post23()
        //  post2Line.post24()+
        //  post2Line.post25()+
        //  post2Line.post26()
            //  post2Line.post227()
        // post2Line.post28()
        // post2Line.post29()+
        // post2Line.post30()
        // post2Line.post31()
        // post2Line.post32()
      // post2Line.post233()
      // post2Line.post234()
          //post2Line.post235()+
     // post2Line.post236()
     // post2Line.post237()

        //post3Line.post30()
        //post3Line.post31()
        //post3Line.post32()
        //post3Line.post33()
        //post3Line.post34()
        //post3Line.post35()
        // post3Line.post36()+
        // post3Line.post37()
        // post3Line.post38()
        //post3Line.post39()
        // post3Line.post40()
        //post3Line.post41()
        //  post3Line.post42()
       //  post3Line.post43()+
       // post3Line.post344()
        //post3Line.post345()
       // post3Line.post346()
      //  post3Line.post347()
     // post3Line.post348()
            // post3Line.post349()+

        //post4Lines.post40()
        //post4Lines.post41()
        //post4Lines.post42()
        //post4Lines.post43()
        //post4Lines.post44()
        //post4Lines.post45()+
        //post4Lines.post46()
        //post4Lines.post47()
        //post4Lines.post48()
       // post4Lines.post49()+
        // post4Lines.post450()
        // post4Lines.post451()+
          // post4Lines.post452()
            //  post4Lines.post453()+
             post4Lines.post454()

        //post5Lines.post50()
        //post5Lines.post51()
        //post5Lines.post52()
        //post5Lines.post53()
        // post5Lines.post54()+
        // post5Lines.post55()
        // post5Lines.post56()
            // post5Lines.post57()+

        //post6Lines.post60()
        //post6Lines.post61()


        // post7Lines.post70()
        // post7Lines.post71()


        // post9Lines.post90()


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