package co.edu.iush.equipodinamita.proyectofinalmovil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ListView

class Vacunas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacunas)
    }
    override fun onResume() {
        super.onResume()

        var vacunas = BaseDatos.vacunas
        var adaptador = VacunaAdapter(this,vacunas.toList())

        val vacunaList = this.findViewById<ListView>(R.id.listVacunas)
        vacunaList.adapter = adaptador
    }
}