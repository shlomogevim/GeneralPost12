package com.sg.generalpost12.data

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
}