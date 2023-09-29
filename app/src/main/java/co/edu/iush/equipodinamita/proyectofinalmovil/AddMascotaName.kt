package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AddMascotaName : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_mascota_name)

        val btnGuardarMascota: Button = findViewById(R.id.btnGuardarMascota)
        btnGuardarMascota.setOnClickListener {
            val inputNombreMascota: EditText = findViewById(R.id.inputNombreMascota)
            val nombreMascota = inputNombreMascota.text.toString()

            BaseDatos.mascotas.add(Pet(2,nombreMascota, "12-05-2020", 3,"papilón", "mascotaej", "calmada","Agility",
                4.5F,
                BaseDatos.historiaClinica,
                BaseDatos.vacunas
            ))
            finish()
        }
    }
}