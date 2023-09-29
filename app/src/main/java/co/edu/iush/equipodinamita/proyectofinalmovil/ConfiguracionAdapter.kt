package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ConfiguracionAdapter(private val context: Context, val listaDeConfiguraciones: MutableList<ConfiguracionModel>) : BaseAdapter()  {
    override fun getCount(): Int {
        return listaDeConfiguraciones.size
    }

    override fun getItem(p0: Int): Any {
        return listaDeConfiguraciones.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.activity_configuracion_item,p2,false)

        var textNombre = view.findViewById<TextView>(R.id.textNombreConfiguracion)

        var image = view.findViewById<ImageView>(R.id.imageOpcionConfiguracion)


        var configuracion = this.listaDeConfiguraciones.get(p0) as ConfiguracionModel

        textNombre.text = configuracion.nombre
        image.setImageResource(R.drawable.)

        return view
    }
}