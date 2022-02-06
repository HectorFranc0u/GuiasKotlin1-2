package com.example.hellowolrld

fun main(){
    var caso1: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var caso2: Array<Int> = arrayOf()
    var caso3: Array<Int> = arrayOf(5, 5, 6, 1, 2, 3)
    var caso4: Array<Int> = arrayOf(4, 6, 1, 2, 3, 1)
    var caso5: Array<Int> = arrayOf()
    var caso6: Array<Int> = arrayOf(3, 2, 1)
    var caso7: Array<Int> = arrayOf(1, 2, 3)
    var caso8: Array<Int> = arrayOf(11, 12, 11, 10)
    var caso9: Array<Int> = arrayOf()
    var caso10: Array<Int> = arrayOf(1, 8, 23, 22, 30)

    var res1 = sumArrays(caso1)
    var res2 = sumArrays(caso2)
    var res3 = sumArrays(caso3)
    var res4 = sumArrays(caso4)
    var res5 = sumArrays(caso5)
    var res6 = sumArrays(caso6)
    var res7 = sumArrays(caso7)
    var res8 = sumArrays(caso8)
    var res9 = sumArrays(caso9)
    var res10 = sumArrays(caso10)

    println("caso1 Test passed ${res1==55}")
    println("caso2 Test passed ${res2==-1}")
    println("caso3 Test passed ${res3==22}")
    println("caso4 Test passed ${res4==17}")
    println("caso5 Test passed ${res5==-1}")
    println("caso6 Test passed ${res6==6}")
    println("caso7 Test passed ${res7==6}")
    println("caso8 Test passed ${res8==44}")
    println("caso9 Test passed ${res9==-1}")
    println("caso10 Test passed ${res10==84}")

}

fun sumArrays(collection:Array<Int>): Int{
    var res : Int = 0
    if (collection.isEmpty()){
        res = -1
    }
    else{
        res = collection.sum()
    }
    return res
}

/*
    Deberá crear un programa que lea un arreglo de datos que sume
    los números pasados en el array.
    Restricciones:
    •Sí el array es vació deberá devolver -1
    •No aceptará valores nulos.
    •Retornará un valor entero con la suma.
    •Deberá anexar 10 casos de prueba para la función donde se
    demuestre que cumple con los requerimientos.
 */