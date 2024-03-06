 package com.example.botao

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.botao.ui.theme.BotaoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

        var btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener{view : View? ->

            var txtAlcool = findViewById<EditText>(R.id.txtPrecoAlcool)

            var precoAlcool = txtAlcool.text.toString().toDouble()
            var txtGasolna = findViewById<EditText>(R.id.txtPrecoGasolina)
            var precoGasolina = txtGasolna.text.toString().toDouble()

            var resultado: Double= precoAlcool / precoGasolina
            var mensagem = ""
            if (resultado > 0.7){
                mensagem = "Gasolina"
            }
            else if (resultado < 0.7) {
                mensagem "Alcool
            }

            else if (resultado < 0.7){
                mensagem = "tanto faz"
            }

            Toast.makeText( context: this, mensage, Toast.LENGTH_LONG).show()

    }

    }
}