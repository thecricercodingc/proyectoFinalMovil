package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class ResumePet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resume_pet)

        val idMascota = intent.getIntExtra("idMascota", -1)
        val mascota: Pet = BaseDatos.mascotas.find{ pet -> pet.id == idMascota } as Pet
        val nombre = mascota.nombre
        val fechaNacimiento = mascota.fechaNacimiento

        val textNombreMascota: TextView = findViewById(R.id.txtNombreMascota)
        val textFechaNMascota: TextView = findViewById(R.id.textFechaNMascota)
        val imgFotoMascota: ImageView = findViewById(R.id.imgFotoMascota)

        textNombreMascota.text = nombre
        textFechaNMascota.text = fechaNacimiento
        imgFotoMascota.setImageResource(R.drawable.mascotaej)

        val btnHistoriaClinica: Button = findViewById(R.id.btnHistoriaClinica)
        val btnCerrarResumePet: ImageButton = findViewById(R.id.btnCerrarResumePet)
        val btnInicio: Button = findViewById(R.id.btnInicio)

        btnInicio.setOnClickListener{
            finish()
        }
        btnCerrarResumePet.setOnClickListener{
            finish()
        }
        btnHistoriaClinica.setOnClickListener {
            val intent = Intent(this,HistoriaClinica::class.java)
            intent.putExtra("idMascota", idMascota)
            startActivity(intent)
        }
    }
}