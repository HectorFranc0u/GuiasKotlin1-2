package com.example.hellowolrld

fun main(){
    var caso1: Array<Int?> = arrayOf(2, null, 4, 1)
    var caso2: Array<Int?> = arrayOf(4, 1, 3, 10)
    var caso3: Array<Int?> = arrayOf()

    var res1 = sumArray(caso1)
    var res2 = sumArray(caso2)
    var res3 = sumArray(caso3)

    println(res1)
    println(res2)
    println(res3)
}

fun sumArray(collection : Array<Int?>):Int{
    var res = 0
    var i = 0
    if(collection.isNotEmpty()){
        if(!collection.contains(null)){
            while(i <= collection.size) res += collection[i]!!
        }
        else{
            res = -2
        }
    }
    else{
        res = -1
    }
    return res
}


/*
    Realice la suma de una colección de datos pasados por parámetros
    a un función.
    Restricciones:
    ◦Deberá sumar solo los valores de tipo Int
    ◦Deberá devolver la suma de todos los datos como resultado.
    ◦Deberá aceptar valores null como parámetros.
    ◦Sí el valor es null devolverá -2
    ◦Y sí el array contiene 0 elementos devolverá -1
    ◦Deberá desarrollar 10 casos de prueba donde se demuestre
    que la función trabaja correctamente.
 */