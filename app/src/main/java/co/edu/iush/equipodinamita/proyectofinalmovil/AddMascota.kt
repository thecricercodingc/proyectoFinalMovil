package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import java.util.ArrayList

class AddMascota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_mascota)

        val spinnerTipoMascota : Spinner = findViewById(R.id.typesPetSpinner)
        val tiposMascota = mutableListOf("Ave", "Perro", "Gato", "Roedor")
        val adapter = ArrayAdapter(this,
            R.layout.spinner_mascota_item, tiposMascota)
        spinnerTipoMascota.adapter = adapter

        val btnNextAddMascota: Button = findViewById(R.id.btnNextAddMascota)
        btnNextAddMascota.setOnClickListener{
            val intent = Intent(this,ReconocerMascotaImg::class.java)
            startActivity(intent)
            finish()
        }
    }
}