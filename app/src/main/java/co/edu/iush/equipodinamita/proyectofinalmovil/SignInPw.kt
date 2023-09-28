package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInPw : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_pw)


        val usuarios = BaseDatos.usuarios

        val btnPw: Button = findViewById(R.id.btnSignInPw);
        btnPw.setOnClickListener{
            val inputPW: EditText = findViewById(R.id.inputPw)
            val pwIngresada = inputPW.text.toString()
            val result = usuarios.find { user -> user.contraseña == pwIngresada}
            if(result != null){
                val NewScreen = Intent(this, DashboardPetClient:: class.java)
                NewScreen.putExtra("idUsuario", result.id)
                startActivity(NewScreen)
            }else{
                Toast.makeText (this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show()
            }
        }

    }
}