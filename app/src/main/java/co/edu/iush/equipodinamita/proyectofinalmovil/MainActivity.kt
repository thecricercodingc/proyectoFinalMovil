package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSigIn: Button = findViewById(R.id.btnSignIn);
        btnSigIn.setOnClickListener{
            val NewScreen = Intent(this, SignIn:: class.java)
            startActivity(NewScreen)
        }
    }
}