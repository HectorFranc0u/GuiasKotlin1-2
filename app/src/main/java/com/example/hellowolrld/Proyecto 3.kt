package com.example.hellowolrld

fun main(){
    var caso1: Array<Int?> = arrayOf(1, 2, 3)
    var caso2: Array<Int?> = arrayOf(null, 2, 3)
    var caso3: Array<Int?> = arrayOf(4, 5, 6)
    var caso4: Array<Int?> = arrayOf(2, 4, 1)
    var caso5: Array<Int?> = arrayOf(null, null, 2)
    var caso6: Array<Int?> = arrayOf(3, 3, 3)
    var caso7: Array<Int?> = arrayOf(3, 2, 1)
    var caso8: Array<Int?> = arrayOf(10, 11, null)
    var caso9: Array<Int?> = arrayOf(6, 2, 1)
    var caso10: Array<Int?> = arrayOf(1, 1, 1)

    var res1 = compararvalores(caso1)
    var res2 = compararvalores(caso2)
    var res3 = compararvalores(caso3)
    var res4 = compararvalores(caso4)
    var res5 = compararvalores(caso5)
    var res6 = compararvalores(caso6)
    var res7 = compararvalores(caso7)
    var res8 = compararvalores(caso8)
    var res9 = compararvalores(caso9)
    var res10 = compararvalores(caso10)

    println("caso1 Test passed ${res1==6}")
    println("caso2 Test passed ${res2==-100}")
    println("caso3 Test passed ${res3==15}")
    println("caso4 Test passed ${res4==-2}")
    println("caso5 Test passed ${res5==-100}")
    println("caso6 Test passed ${res6==0}")
    println("caso7 Test passed ${res7==-1}")
    println("caso8 Test passed ${res8==-100}")
    println("caso9 Test passed ${res9==-1}")
    println("caso10 Test passed ${res10==0}")
}

fun compararvalores(collection:Array<Int?>): Int{
    var res : Int = -1
    var val1 = collection.component1()
    var val2 = collection.component2()
    var val3 = collection.component3()
    if (val1 == null || val2 == null || val3 == null){
        res = -100
    }
    else if (val1 == val2 && val1 == val3){
        res = 0
    }
    else if (val1 != null && val2 != null && val3 != null){
        if (val1 > val2 && val1 > val3){
            res =  -1
        }
        else if (val2 > val3 && val2 > val1){
            res = -2
        }
        else{
            res = val1 + val2 + val3
        }
    }
    return res
}

/*
    Deberá realizar un programa que reciba 3 valores y devuelva -1 sí el primer número es mayor, -
    2 sí el segundo número es mayor, 0 sí todos los números son iguales y la suma sí el último
    número es mayor.
    Restricciones:
    •En caso que un número sea null se devolverá -100
    •Agregar 10 casos de prueba.
 */