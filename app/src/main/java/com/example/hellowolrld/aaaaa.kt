package com.example.hellowolrld

fun main(){
    var val1 : Array<Int> = arrayOf(1, 2)
    var val2 : Array<Int> = arrayOf(3, 4)
    var val3 = val1.plus(val2)
    for (i in val3){
        println(i)
    }
}