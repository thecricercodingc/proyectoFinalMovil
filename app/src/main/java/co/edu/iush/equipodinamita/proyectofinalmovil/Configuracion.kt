package co.edu.iush.equipodinamita.proyectofinalmovil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Configuracion : AppCompatActivity() {
    private lateinit var adaptador:ConfiguracionAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)

        val listaNotas = this.findViewById<ListView>(R.id.listaConfiguracion)

        adaptador = ConfiguracionAdapter(this, BaseDatos.configuracion)
        listaNotas.adapter = adaptador
    }
}