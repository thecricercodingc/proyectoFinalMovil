package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class HistoriaClinica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historia_clinica)

        val idMascota = intent.getIntExtra("idMascota", -1)
        val mascota: Pet = BaseDatos.mascotas.find { pet -> pet.id == idMascota } as Pet

        val txtNombreMascotaHC: TextView = findViewById(R.id.txtNombreMascotaHC)
        val txtEdadHC: TextView = findViewById(R.id.txtEdadHC)
        val txtRazaHC: TextView = findViewById(R.id.txtRazaHC)
        val txtPersonalidadHC: TextView = findViewById(R.id.txtPersonalidadHC)
        val txtConcentradoHC: TextView = findViewById(R.id.txtConcentradoHC)
        val imgMascotaHC: ImageView = findViewById(R.id.imgMascotaHC)


        imgMascotaHC.setImageResource(R.drawable.mascotaej)
        txtNombreMascotaHC.text = mascota.nombre
        txtEdadHC.text = mascota.edad.toString() + " Años"
        txtRazaHC.text = mascota.raza
        txtPersonalidadHC.text = mascota.personalidad
        txtConcentradoHC.text = mascota.concentrado

        val btnCerrarHC: ImageButton = findViewById(R.id.btnCerrarHC)
        val btnVacunas: Button = findViewById(R.id.btnVacunas)
        val btnUVisita: Button = findViewById(R.id.btnUVisita)

        btnCerrarHC.setOnClickListener {
            finish()
        }
        btnVacunas.setOnClickListener {
            val intent = Intent(this,Vacunas::class.java)
            intent.putExtra("idMascota", idMascota)
            startActivity(intent)
        }
        btnUVisita.setOnClickListener {
            val intent = Intent(this,UltimaVisita::class.java)
            intent.putExtra("idMascota", idMascota)
            startActivity(intent)
        }
    }
}