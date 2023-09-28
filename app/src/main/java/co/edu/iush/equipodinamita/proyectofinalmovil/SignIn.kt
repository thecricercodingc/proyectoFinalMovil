package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val usuarios = BaseDatos.usuarios

        val btnNext: Button = findViewById(R.id.btnSignInNext);
        btnNext.setOnClickListener{
            val inputCorreo: EditText = findViewById(R.id.inputEmail)
            val correoIngresado = inputCorreo.text.toString()
            val result = usuarios.find { user -> user.correo == correoIngresado}
            if(result != null){
                val NewScreen = Intent(this, SignInPw:: class.java)
                startActivity(NewScreen)
            }else{
                Toast.makeText (this, "Correo no registrado", Toast.LENGTH_SHORT).show()
            }
        }

    }
}