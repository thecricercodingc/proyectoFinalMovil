package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class VacunaAdapter(private val context: Context, private val vacunas: List<Vacuna>)  : BaseAdapter(){
    override fun getCount(): Int {
        return vacunas.size
    }

    override fun getItem(position: Int): Any {
        return this.vacunas.get(position);
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.vacuna_item,parent,false)

        var txtNombreVacuna = view.findViewById<TextView>(R.id.txtNombreVacuna)
        var txtCantidadComponente = view.findViewById<TextView>(R.id.txtCantidadComponente)

        var vacuna = this.vacunas.get(position) as Vacuna
        txtNombreVacuna.text = vacuna.nombreComponente
        txtCantidadComponente.text = vacuna.cantidadComponente.toString()

        return view
    }

}