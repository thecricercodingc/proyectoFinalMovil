package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnNext: Button = findViewById(R.id.btnSignUp);
        btnNext.setOnClickListener{
            val inputCorreo: EditText = findViewById(R.id.inputEmailSignUp);
            val correoIngresado = inputCorreo.text.toString();
            if (correoIngresado.trim().equals("")) {
                Toast.makeText (this, "Correo no valido", Toast.LENGTH_LONG).show();
                return@setOnClickListener
            }
            var intent = Intent(this, SignUpPw:: class.java)
            intent.putExtra("email", correoIngresado)
            startActivity(intent)
        }
    }
}