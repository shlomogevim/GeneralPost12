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
            1-> R.font.a101_ankaclm_bold_webfont
            2->R.font.a210_danayadalefalefalef_normal
            3->R.font.a220_davidlibre_regular
            31->R.font.a221_davidlibre_bold
            32->R.font.a222_davidlibre_medium
            4->R.font.a100_gveretlevinalefalefalef_regular



            100->R.font.a100_gveretlevinalefalefalef_regular
            101->R.font.a101_ankaclm_bold_webfont
            102->R.font.a102_varelaround_regular
            103->R.font.a103_gadi_almog_regular_aaa
            104->R.font.a104_danayadalefalefalef_normal


            109->R.font.a109_yiddishkeitalefalefalef_bold
            110->R.font.a110_abraham_regular

            120->R.font.a120_aharoniclm_bold_webfont
            121->R.font.a121_aharoniclm_boldoblique_webfont
            122->R.font.a122_aharoniclm_book_webfont
            123->R.font.a122_aharoniclm_bookoblique_webfont
            130->R.font.a131_alef_bold
            131->R.font.a130_alef_regular

            140->R.font.a140_amaticasc_regular
            141->R.font.a141_amaticasc_bold


            210->R.font.a210_danayadalefalefalef_normal

            383->R.font.a383_keteryg_medium_webfont

            else->R.font.a220_davidlibre_regular
        }
}