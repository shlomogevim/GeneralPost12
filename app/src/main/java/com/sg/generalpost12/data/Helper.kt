package com.sg.generalpost12.data

import com.sg.generalpost12.R

class Helper {
    fun getTransfo(index:Int)=
        when (index){
            1->"1A"
            2->"33"
            3->"4D"
            4->"66"
            5->"80"
            6->"99"
            7->"B3"
            8->"CC"
            9->"E6"
            10->"FF"
            else->"00"
        }

    fun getFamilyFont(index:Int)=
        when (index){
            1-> R.font.ankaclm_bold_webfont
            2->R.font.danayadalefalefalef_normal
            3->R.font.davidlibre_regular
            31->R.font.davidlibre_bold
            32->R.font.davidlibre_medium
            4->R.font.gveretlevinalefalefalef_regular
            5->R.font.stamashkenazclmwebfont
            6->R.font.stamsefaradclmwebfont
            7->R.font.varelaround_regular
            8->R.font.yiddishkeitalefalefalef_bold

            else->R.font.davidlibre_regular
        }
}