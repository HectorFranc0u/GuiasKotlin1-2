package com.example.hellowolrld

fun main(){
    var caso1: Array<Int> = arrayOf(2, 2, 4, 1)
    var caso2: Array<Int> = arrayOf(4, 1, 3, 10)
    var caso3: Array<Int> = arrayOf(10, 2, 6, 7, 11)
    var caso4: Array<Int> = arrayOf(1, 3, 6, 8, 10)
    var caso5: Array<Int> = arrayOf(9, 1, 3, 1,22, 51)
    var caso6: Array<Int> = arrayOf(3, 5, 1, 10)
    var caso7: Array<Int> = arrayOf(60, 12, 6, 12)
    var caso8: Array<Int> = arrayOf(1, 2, 5, 9,15, 50, 100, 50)
    var caso9: Array<Int> = arrayOf(9, 2, 3, 4)
    var caso10: Array<Int> = arrayOf(12, 2, 4, 5, 2 ,5)

    var res1 = SearchData(caso1, 1)
    var res2 = SearchData(caso2, 3)
    var res3 = SearchData(caso3, 10)
    var res4 = SearchData(caso4, 6)
    var res5 = SearchData(caso5, 22)
    var res6 = SearchData(caso6, 3)
    var res7 = SearchData(caso7, 60)
    var res8 = SearchData(caso8, 100)
    var res9 = SearchData(caso9, 9)
    var res10 = SearchData(caso10, 2)

    println("searchData Test passed ${res1==3}")
    println("searchData Test passed ${res2==2}")
    println("searchData Test passed ${res3==0}")
    println("searchData Test passed ${res4==2}")
    println("searchData Test passed ${res5==4}")
    println("searchData Test passed ${res6==0}")
    println("searchData Test passed ${res7==0}")
    println("searchData Test passed ${res8==6}")
    println("searchData Test passed ${res9==0}")
    println("searchData Test passed ${res10==1}")

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