package com.example.hellowolrld

fun main(){
    var caso1: Array<Int> = arrayOf(2, 2, 4, 1)
    var caso2: Array<Int> = arrayOf(4, 1, 3, 10)
    var caso3: Array<Int> = arrayOf(10, 2, 6, 7, 11)
    var caso4: Array<Int> = arrayOf(7, 1, 3, 4,15, 12, 123, 11)
    var caso5: Array<Int> = arrayOf(9, 1, 3, 1,22, 51)
    var caso6: Array<Int> = arrayOf(1, 2, 5, 9,15, 50, 100, 50)
    var caso7: Array<Int> = arrayOf(1, 2, 5, 9,15, 50, 100, 50)
    var caso8: Array<Int> = arrayOf(1, 2, 5, 9,15, 50, 100, 50)
    var caso9: Array<Int> = arrayOf(1, 2, 5, 9,15, 50, 100, 50)
    var caso10: Array<Int> = arrayOf(1, 2, 5, 9,15, 50, 100, 50)
    var res1 = SearchData(caso1, 1) //0
    var res2 = SearchData(caso2, 9) //3
    var res3 = SearchData(caso3, 100) //6
    println("searchData(caso1, n=1) Test passed ${res1==0}")
    println("searchData(caso2, n=9) Test passed ${res2==3}")
    println("searchData(caso3, n=100) Test passed ${res3==6}")
}

fun SearchData(collection:Array<Int>, number: Int): Int{
    collection.forEachIndexed({p, i -> if(i==number) return p})
    return -1
}

/*
    Haga un programa que reciba una colección de datos como parámetro y un dato a buscar y a
    partir de esa información devuelva la posición donde se encuentra el dato en la colección.
    Restricciones:
    •No aceptará valores nulos.
    •Deberá devolver la posición del array donde se encuentra el dato.
    •Agregar 10 casos de prueba.
 */