package com.example.hellowolrld

fun main(){
    var caso1 = null
    var caso2: Array<Int> = arrayOf(4, 1, 3, 10)
    var caso3: Array<Int> = arrayOf()
    var caso4: Array<Int> = arrayOf(3, 4, 1, 2, 6, 4, 1)
    var caso5: Array<Int> = arrayOf(2, 3, 1, 5, 1)
    var caso6: Array<Int> = arrayOf()
    var caso7 = null
    var caso8: Array<Int> = arrayOf(1, 2, 3 ,1)
    var caso9 = null
    var caso10: Array<Int> = arrayOf()


    var res1 = sumArray(caso1)
    var res2 = sumArray(caso2)
    var res3 = sumArray(caso3)
    var res4 = sumArray(caso4)
    var res5 = sumArray(caso5)
    var res6 = sumArray(caso6)
    var res7 = sumArray(caso7)
    var res8 = sumArray(caso8)
    var res9 = sumArray(caso9)
    var res10 = sumArray(caso10)

    println("Test1 passed ${res1==-2}")
    println("Test2 passed ${res2==18}")
    println("Test3 passed ${res3==-1}")
    println("Test4 passed ${res4==21}")
    println("Test5 passed ${res5==12}")
    println("Test6 passed ${res6== -1}")
    println("Test7 passed ${res7==-2}")
    println("Test8 passed ${res8==7}")
    println("Test9 passed ${res9==-2}")
    println("Test10 passed ${res10==-1}")
}

fun sumArray(collection : Array<Int>?):Int {
    var res = 0
    if (collection != null){
        if (collection.isNotEmpty()){
            res = collection.sum()
        }
        else{
            res = -1
        }
    }
    else{
        res = -2
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