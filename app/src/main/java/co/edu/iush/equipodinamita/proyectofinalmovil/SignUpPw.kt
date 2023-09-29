package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpPw : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_pw)

        val extras = intent.extras
        var email:String? = "";
        if (extras != null) {
            email = extras.getString("email")
        }

        val usuarios = BaseDatos.usuarios

        val btnPw: Button = findViewById(R.id.btnSignUpPw);
        btnPw.setOnClickListener{
            val inputPW1: EditText = findViewById(R.id.inputSignUpPw1)
            val inputPW2: EditText = findViewById(R.id.inputSignUpPw2)
            val pwIngresada1 = inputPW1.text.toString()
            val pwIngresada2 = inputPW2.text.toString()

            if (pwIngresada1.equals("") || pwIngresada1.equals("")) {
                Toast.makeText (this, "Ingresa una contraseña", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (!pwIngresada1.equals(pwIngresada2)) {
                Toast.makeText (this, "Las contraseñas no coinciden", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (email == null) {
                return@setOnClickListener
            }
            usuarios.add(UsuarioModel(email, pwIngresada1));

            Toast.makeText (this, "Usuario añadido", Toast.LENGTH_LONG).show()

            val intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

    }
}