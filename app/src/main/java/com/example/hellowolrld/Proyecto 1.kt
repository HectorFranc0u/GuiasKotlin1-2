package com.example.hellowolrld

fun main(){
    var res1 = Suma(6, 6)
    var res2 = Suma(3, 7)
    var res3 = Suma(null, 5)
    var res4 = Suma(6, 2)
    var res5 = Suma(1, 4)
    var res6 = Suma(null, null)
    var res7 = Suma(3, null)
    var res8 = Suma(6, 7)
    var res9 = Suma(9, 1)
    var res10 = Suma(3, 1)

    println("Test1 passed ${res1==12}")
    println("Test2 passed ${res2==10}")
    println("Test3 passed ${res3==5}")
    println("Test4 passed ${res4==8}")
    println("Test5 passed ${res5==5}")
    println("Test6 passed ${res6== -2}")
    println("Test7 passed ${res7==3}")
    println("Test8 passed ${res8==13}")
    println("Test9 passed ${res9==10}")
    println("Test10 passed ${res10==4}")
}

fun Suma(n1: Int?, n2: Int?): Int{
    var res = -2
    if (n1 != null && n2 != null){
        if (n1 >= 0 && n2 >= 0){
            res = n1 + n2
        }
        else if(n1 < 0 || n2 < 0){
            res = -1
        }
    }
    else if (n1 == null && n2 !=null){
        res = n2
    }
    else if (n1 != null && n2 == null){
        res = n1
    }
    else if (n1 == null && n2 == null){
        res = -2
    }
    return res
}

/*
    Realice un función que se encargue de sumar 2 números, la
    función deberá aceptar 2 parámetros y retornar como resultado la
    suma de ambos.
    Restricciones:
    ◦Deberá aceptar valores nulos.
    ◦Sí uno de los valores es menor a 0, el resultado de la suma
    será -1.
    ◦Sí los valores son nulos deberá devolver -2.
    ◦En caso que no se cumplan las restricciones anteriores
    deberá devolver la suma de las variables.
    ◦Sí solo uno de los valores es nulo deberá devolver el valor
    que no es nulo.
    ◦Deberá anexar 10 casos de prueba para la función donde se
    demuestre que cumple con los requerimientos.
 */