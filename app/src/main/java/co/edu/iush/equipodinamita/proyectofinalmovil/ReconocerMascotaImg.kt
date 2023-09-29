package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ReconocerMascotaImg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reconocer_mascota_img)

        val imageButton: ImageButton = findViewById(R.id.imageButton)
        val imageButton2: ImageButton = findViewById(R.id.imageButton2)
        val imageButton5: ImageButton = findViewById(R.id.imageButton5)
        val imageButton6: ImageButton = findViewById(R.id.imageButton6)


        imageButton.setOnClickListener{
            val intent = Intent(this,AddMascotaName::class.java)
            startActivity(intent)
            finish()
        }
        imageButton2.setOnClickListener{
            val intent = Intent(this,AddMascotaName::class.java)
            startActivity(intent)
            finish()
        }
        imageButton5.setOnClickListener{
            val intent = Intent(this,AddMascotaName::class.java)
            startActivity(intent)
            finish()
        }
        imageButton6.setOnClickListener{
            val intent = Intent(this,AddMascotaName::class.java)
            startActivity(intent)
            finish()
        }
    }
}