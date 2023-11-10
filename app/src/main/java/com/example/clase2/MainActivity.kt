package com.example.clase2

import android.annotation.SuppressLint
import android.app.PendingIntent.getActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.clase2.MainActivity2

class MainActivity : AppCompatActivity() {

    var tipo = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TextTitulo = findViewById<TextView>(R.id.txtTitulo)
        TextTitulo.text= getString(R.string.titulo_app)

        // Area del Triangulo
        val Editbase = findViewById<EditText>(R.id.txtBase)
        val Editaltura = findViewById<EditText>(R.id.txtAltura)
        val TextAreaTriangulo = findViewById<TextView>(R.id.txtAreaTriangulo)
        val BtnAreaTriangulo = findViewById<Button>(R.id.btnAreaTriangulo)

        TextAreaTriangulo.text=""


        BtnAreaTriangulo.setOnClickListener {
            tipo = 1
           // var area = areas( Editbase.text.toString().toDouble(), Editaltura.text.toString().toDouble(), 0.0, tipo)
           // TextAreaTriangulo.text= area.toString()
            val main2= Intent(this, MainActivity2::class.java)
            startActivity(main2)

        }

        // Area del Rectangulo

        val EditBaseRec = findViewById<EditText>(R.id.txtBaseRec)
        val EditAlturaRec = findViewById<EditText>(R.id.txtAlturaRec)
        val TextAreaRectangulo = findViewById<TextView>(R.id.txtAreaRec)
        val BtnAreaRectangulo = findViewById<Button>(R.id.btnAreaRectangulo)
        TextAreaRectangulo.text=""


        BtnAreaRectangulo.setOnClickListener {
            tipo=2
            var area = areas( EditBaseRec.text.toString().toDouble(), EditAlturaRec.text.toString().toDouble(), 0.0, tipo)
            TextAreaRectangulo.text= area.toString()
        }


        // Area del Circulo

        val TextPi = findViewById<TextView>(R.id.txtpi)
        val EditRadio = findViewById<EditText>(R.id.txtRadio)
        val TextAreaCirculo = findViewById<TextView>(R.id.txtAreaCirculo)
        val BtnAreaCirculo = findViewById<Button>(R.id.btnAreaCirculo)
        TextAreaCirculo.text=""
        TextPi.text= getString(R.string.pi_value)


        BtnAreaCirculo.setOnClickListener {
            tipo=3
            var area = areas( TextPi.text.toString().toDouble(), EditRadio.text.toString().toDouble(), 0.0, tipo)
            TextAreaCirculo.text = area.toString()
        }


        // Area del trapecio

        val EditBaseMayor = findViewById<EditText>(R.id.txtBaseMayor)
        val EditBaseMenor = findViewById<EditText>(R.id.txtBaseMenor)
        val EditAlturaTrap = findViewById<EditText>(R.id.txtAlturaTrap)
        val TextAreaTrapecio = findViewById<TextView>(R.id.txtAreaTrapecio)
        val BtnAreaTrapecio = findViewById<Button>(R.id.btnAreaTrapecio)
        TextAreaTrapecio.text= ""


        BtnAreaTrapecio.setOnClickListener {
            tipo=4
            var area = areas( EditBaseMayor.text.toString().toDouble(), EditBaseMenor.text.toString().toDouble(), EditAlturaTrap.text.toString().toDouble(), tipo)
            TextAreaTrapecio.text = area.toString()
        }



    }

    fun areas(x: Double, y: Double, z:Double, tipo: Int): Double {
        var Area = 0.0
        if(tipo == 1){
            // x == base
            // y == altura
           Area = (x * y)/2

        }
        else if(tipo == 2){
            // x == base
            // y == altura
            Area= x * y

        }
        else if(tipo == 3){
            // x == pi
            // y == radio
            Area= x*y*y
        }
        else if(tipo == 4){
            // x == base mayor
            // y == base menor
            // z == altura

            Area = ((x+y)/2)*z
        }
        return Area

    }


}


