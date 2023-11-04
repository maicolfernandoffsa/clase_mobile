package com.example.clase2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
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
            val Areatriangulo = Editaltura.text.toString().toInt() * Editbase.text.toString().toInt() /2
            TextAreaTriangulo.text= Areatriangulo.toString()
        }

        // Area del Rectangulo

        val EditBaseRec = findViewById<EditText>(R.id.txtBaseRec)
        val EditAlturaRec = findViewById<EditText>(R.id.txtAlturaRec)
        val TextAreaRectangulo = findViewById<TextView>(R.id.txtAreaRec)
        val BtnAreaRectangulo = findViewById<Button>(R.id.btnAreaRectangulo)
        TextAreaRectangulo.text=""

        BtnAreaRectangulo.setOnClickListener {
            val AreaRectangulo = EditBaseRec.text.toString().toInt() * EditAlturaRec.text.toString().toInt()
            TextAreaRectangulo.text= AreaRectangulo.toString()
        }


        // Area del Circulo

        val TextPi = findViewById<TextView>(R.id.txtpi)
        val EditRadio = findViewById<EditText>(R.id.txtRadio)
        val TextAreaCirculo = findViewById<TextView>(R.id.txtAreaCirculo)
        val BtnAreaCirculo = findViewById<Button>(R.id.btnAreaCirculo)
        TextAreaCirculo.text=""
        TextPi.text= getString(R.string.pi_value)

        BtnAreaCirculo.setOnClickListener {
            val AreaCirculo = 3.1416 * EditRadio.text.toString().toInt() * EditRadio.text.toString().toInt()
            if( AreaCirculo.toDouble() > 2000){
                val Descuento = AreaCirculo.toDouble() - (AreaCirculo.toDouble()*0.5)
                TextAreaCirculo.text=
                    "${AreaCirculo}es mayor a 2000 por lo tanto el descuento es de:${Descuento}"
            }
            else{
                TextAreaCirculo.text= AreaCirculo.toString()
            }



        }


        // Area del trapecio

        val EditBaseMayor = findViewById<EditText>(R.id.txtBaseMayor)
        val EditBaseMenor = findViewById<EditText>(R.id.txtBaseMenor)
        val EditAlturaTrap = findViewById<EditText>(R.id.txtAlturaTrap)
        val TextAreaTrapecio = findViewById<TextView>(R.id.txtAreaTrapecio)
        val BtnAreaTrapecio = findViewById<Button>(R.id.btnAreaTrapecio)
        TextAreaTrapecio.text= ""

        BtnAreaTrapecio.setOnClickListener {
            val AreaTrapecio = ((EditBaseMayor.text.toString().toInt() +EditBaseMenor.text.toString().toInt())/2)*EditAlturaTrap.text.toString().toInt()
            TextAreaTrapecio.text= AreaTrapecio.toString()
        }



    }
}


