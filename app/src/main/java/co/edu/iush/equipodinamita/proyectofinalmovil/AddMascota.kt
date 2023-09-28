package co.edu.iush.equipodinamita.proyectofinalmovil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import java.util.ArrayList

class AddMascota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_mascota)

        val spinnerTipoMascota : Spinner = findViewById(R.id.typesPetSpinner)
        val tiposMascota = mutableListOf("Ave", "Perro", "Gato")
        val adapter = ArrayAdapter(this,
            R.layout.spinner_mascota_item, tiposMascota)
        spinnerTipoMascota.adapter = adapter
    }
}