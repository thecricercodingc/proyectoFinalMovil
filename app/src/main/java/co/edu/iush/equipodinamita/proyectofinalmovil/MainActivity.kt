package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSigIn: Button = findViewById(R.id.btnSignIn);
        btnSigIn.setOnClickListener{
            val NewScreen = Intent(this, SignIn:: class.java)
            startActivity(NewScreen)
        }

        val btnEmergencyHome: Button = findViewById(R.id.btnEmergencyHome)
        btnEmergencyHome.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:4564324")
            startActivity(intent)
        }
    }
}