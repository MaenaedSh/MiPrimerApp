package com.miprimerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesYConstantes()
        tipoDeDatos()
        sentenciaIf()
        sentenciaWhen()
        arrays()
        maps()
    }

    private fun variablesYConstantes (){
        //Variables
        var myFirstVariable= "Bienvenidos a Android Studio"
        var mySecondVariable=1
        myFirstVariable= "Algo diferente"

        println(myFirstVariable)

        //Constantetes
        val myFirstConstant = myFirstVariable
    }

    private fun tipoDeDatos(){
        val myString:String="Hola"
        val myString2="Bienvenidos"

        val myString3= myString + myString2

        println(myString3)
        Log.e(tag: "Concatenar", myString3)

        Log.e(tag: "Concatenar2", msg: "Esto es lo que se concatena ${myString2} seguir con esto")

        val myInt=1
        val myInt2=2

        Log.e(tag: "Enteros ", msg: "${myInt} ${myInt2}")

        //Boolean

        val myBool:Boolean=true
        val myBool2= false

        println(myBool==myBool2)
        println(myBool && myBool2)
    }

    private fun sentenciaIf(){
        val myNumber=10

        //Operadores Condicionales
        // > mayor que
        // < menor que
        // >= mayor igual que
        // <> != desigualdad
        // == igual que
        // ===igualdad (Extrincto con tipos de datos)

        if (myNumber <10){
            println("$myNumber es menor que 10")
        }
        else{
            println("$myNumber no es menor que 10")
        }
    }
    private fun sentenciaWhen(){
        val pais= "Colombia"

        when(pais){
            "Mexico", "Peru", "Colombia" -> {
                println("El idioma es español")
            }
            "EEUU"->{
                println("El idioma es Ingles")
            }
            else ->{
                println("No conocemos el idioma")
            }
        }

        //When con (int)
        val edad= 30

        when(edad){
            0,1,2 ->{
                println("Ere un bebé")
            }
            in 3..10 ->{ //Rango de numeros
                println("Erees un niño")
            }
            in 11..17 ->{
                println("Erees un adolescente")
            }
        }
    }

    private fun arrays(){
        val nombre= "Carlos"
        val apellido= "Sancho"
        val empresa= "GeekPark"
        val edad= "27"

        val myArray= arrayListOf<String>()

        //Añadir datos
        myArray.add(nombre)
        myArray.add(apellido)
        myArray.add(empresa)
        myArray.add(edad)

        println(myArray)

        myArray.addAll(listOf("Hola", "Bienvenidos al curso de kotlin"))
        println(myArray)

        val myEmpresa=myArray[2]
        println(myEmpresa)

        //Eliminar
        myArray.removeAt(2)
        println(myArray)

        //Recorrer datos
        myArray.forEach{
            println(it)
        }

        myArray.count()
        myArray.clear()
    }
    private fun maps(){
        var myMap: Map<String,Int>= mapOf()
        println(myMap)

        //Añadir
        myMap= mapOf("Carlos" to 29, "Hugo" to 26, "Sara" to 3)

        myMap = mutableMapOf("Carlos" to 29, "Hugo" to 26, "Sara" to 3)
        myMap["Ana"]=7
        myMap.put("Mariua", 8)
        println(myMap)

        //Acceso a datos
        println(myMap["Ana"])

        //Eliminar
        myMap.remove("Carlos")
        println(myMap)
    }
}
