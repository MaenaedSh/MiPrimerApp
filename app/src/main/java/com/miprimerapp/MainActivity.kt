package com.miprimerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.TextView
import com.miprimerapp.Extensiones.cambioTexto
import com.miprimerapp.Extensiones.toggleVisibility
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var elTextoGuardado: String= " " //Se puede ocupar en cualquier bloque

    private val key = "USER_KEY"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prefs = PreferenceManager.getDefaultSharedPreferences(this)


        val elTexto= findViewById<TextView>(R.id.txtInicio)

        elTexto.text = "ya Cambio"

        //Otra forma
        txtInicio.text= prefs.getString(key, "No hay nada")
        //btnInicio.text= "MI BOTÓN CAMBIÓ"

        elTextoGuardado= btnInicio.text.toString()

        btnInicio.setOnClickListener {
            //cambiarTextoBoton(btnInicio)
            btnInicio.cambioTexto(elTextoGuardado)
            val editor = prefs.edit()
            editor.remove(key)
            editor.apply()
        }
        btnNuevo.setOnClickListener{
            //cambiarTextoBoton(btnNuevo)

            //btnNuevo.cambioTexto(elTextoGuardado)
            btnInicio.toggleVisibility()
        }

        //ALT + Enter: corrige errores

        /*variablesYConstantes()
        tipoDeDatos()
        sentenciaIf()
        sentenciaWhen()
        arrays()
        maps()
        loops()*/
    }

    /*
    private fun cambiarTextoBoton(myBoton: Button){
        if (myBoton.text == elTextoGuardado){
            myBoton.text = "Boton presionado"
        }else{
            myBoton.text = elTextoGuardado
        }
    }*/

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
        //Log.e(tag: "Concatenar", myString3)

        //Log.e(tag: "Concatenar2", msg: "Esto es lo que se concatena ${myString2} seguir con esto")

        val myInt=1
        val myInt2=2

        //Log.e(tag: "Enteros ", msg: "${myInt} ${myInt2}")

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
        var myMap: Map<String,Int> = mapOf()
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

    private fun loops(){
        val nombre= "Carlos"
        val apellido= "Sancho"
        val empresa= "GeekPark"
        val edad= "27"

        val myArray= listOf(nombre, apellido, empresa, edad)
        val myMap = mutableMapOf("Carlos" to 29, "Hugo" to 26, "Sara" to 3)

        //For
        for (myString in myArray){
            println(myString)
        }
        for (myElement in myMap){
            println(myElement)
        }

        for (myElement in myMap){
            println("${myElement.key}-${myElement.value}")
        }
        for (x in 0 until 10){ //Con until se cuentade 0 a 9
            println("${x}")
        }
        for (x in 0..10 step 2){
            println(x)
        }
        for (x in 10 downTo 0 step 3){
            println(x)
        }

        val myNumericArray = (0..20)
        for (perrito in myNumericArray){
            println(perrito)
        }


        //While
        var x=0

        while (x <10){
            println(x)
            //x++
            x+=2
        }
    }
}
