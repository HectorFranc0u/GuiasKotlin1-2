package com.example.hellowolrld

fun main(){
    var caso1 = 2

    var res1 =  arreglo(caso1)

    println(res1)

}

fun arreglo(Valor : Int){
    var res = ArrayList<Int>()
    var x = 0

    while(x < (Valor - 1)){
        var Arreglo = ArrayList<Int>()
    }
   /*for(i  in 0 until Valor){
       res.add(Valor)
   }
    res.forEach{
        println(it)
    }

    */
}


/*
    El algoritmo deberá aceptar un número y generar un arreglo identidad que refleje n columnas y n
    filas.
    Ejemplo:
    Sí el número ingresado es 2:
    •res=[[2,2],[2,2],[8]] donde 8 = [2+2]+[2+2]
    Sí el número ingresado es 3:
    •res [[3,3,3],[3,3,3],[3,3,3][27]] donde 27 = [ 3+3+3]+[3+3+3]+[3+3+3]
 */