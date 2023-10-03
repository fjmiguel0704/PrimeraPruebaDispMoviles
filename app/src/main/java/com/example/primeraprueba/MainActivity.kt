package com.example.primeraprueba

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.primeraprueba.databinding.ActivityMainBinding
import com.example.primeraprueba.databinding.OtraVistaBinding
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Binding para poder acceder a los elementos de una vista, en este caso "otra_vista",
        // por ejemplo al TextoNombre y modifcar su color
        val otraVista = OtraVistaBinding.inflate(layoutInflater)
        setContentView(otraVista.root)
        otraVista.TextoNombre.setTextColor(R.color.azul)

        //Accede al botón y muestra un mensaje emergente
        otraVista.BotonVolver.setOnClickListener {
            val toast =
                Toast.makeText(applicationContext, "¡Me has pulsado!", Toast.LENGTH_SHORT).show()
        }

        //Acceder al texto y modificarlo
        val texto = findViewById<TextView>(R.id.TextoNombre)
        texto.text="Hola soy yo"

        /*val PI: Double = 2.1415
        val numero: Int = 7
        var exponente: Int = 3
        var resultado: Double = PI + numero
        Log.d("CONSULTA", resultado.toString())

        Log.d("CONSULTA", potencia(numero, exponente))*/
    }
}
/*private fun potencia(num: Int, exp: Int): String{
    var result: Double = num.toDouble().pow(exp.toDouble())
    return "El resultado es: $result"
}*/