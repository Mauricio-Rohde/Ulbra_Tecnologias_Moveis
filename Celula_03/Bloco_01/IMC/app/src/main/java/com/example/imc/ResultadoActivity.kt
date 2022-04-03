package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado2.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado2)

        val imc = intent.getParcelableExtra<IMC>("value")
        txtNome.text = imc.nome.toString()
        txtResult.text = imc.calcular()
        txtIMC.text = imc.imc.toString()
        txtPeso.text = imc.peso.toString()
        txtAltura.text = imc.altura.toString()



    }
}
