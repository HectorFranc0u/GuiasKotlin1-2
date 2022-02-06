package com.example.hellowolrld

import java.util.Comparator

fun main() {
        var caso1: Array<Int?> = arrayOf(3, 2, 1)
        var caso2: Array<Int?> = arrayOf()
        var caso3: Array<Int?> = arrayOf(2, null, 6)
        var caso4: Array<Int?> = arrayOf()
        var caso5: Array<Int?> = arrayOf(null, null, 2)
        var caso6: Array<Int?> = arrayOf(3, 3, 4)
        var caso7: Array<Int?> = arrayOf(1, 6, 7)
        var caso8: Array<Int?> = arrayOf(10, 11, null)
        var caso9: Array<Int?> = arrayOf()
        var caso10: Array<Int?> = arrayOf(1, 1, 1)

        var res1 = ordenar(caso1)
        var res2 = ordenar(caso2)
        var res3 = ordenar(caso3)
        var res4 = ordenar(caso4)
        var res5 = ordenar(caso5)
        var res6 = ordenar(caso6)
        var res7 = ordenar(caso7)
        var res8 = ordenar(caso8)
        var res9 = ordenar(caso9)
        var res10 = ordenar(caso10)

        println("caso1 Test passed ${res1.contentEquals(arrayOf(3, 2, 1))}")
        println("caso2 Test passed ${res2.contentEquals(arrayOf())}")
        println("caso3 Test passed ${res3.contentEquals(arrayOf())}")
        /* println("caso4 Test passed ${res4==-2}")
        println("caso5 Test passed ${res5==-100}")
        println("caso6 Test passed ${res6==0}")
        println("caso7 Test passed ${res7==-1}")
        println("caso8 Test passed ${res8==-100}")
        println("caso9 Test passed ${res9==-1}")
        println("caso10 Test passed ${res10==0}")

         */
}

fun ordenar(collection : Array<Int?>): Array<Int?>{

    var res : Array<Int?> = arrayOf(1)
    if (!collection.contains(null)){
        if(collection.isNotEmpty()){

        }
        else{
            res = arrayOf()
        }
    }
    else{
        res = arrayOf()
    }

    return res
}



/*
    Creará un programa que lea una secuencia de números y que
    devuelva una arreglo de datos ordenado, deberá aceptar valores
    nulos.
    Restricciones:
    •El array que recibirá será de números enteros.
    •Sí la secuencia de datos es null deberá devolver un array
    vació.
    •Sí la secuencia es vaciá o no contiene elementos deberá
    devolver el array vacio.
    •De lo contrario devolverá los números ordenados de mayor a
    menor.
    •Deberá desarrollar 10 casos de prueba donde se demuestre que
    la función trabaja correctamente.
 */