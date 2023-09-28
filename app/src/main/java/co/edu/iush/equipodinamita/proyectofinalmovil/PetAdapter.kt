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

class PetAdapter(private val context: Context, private val mascotas: List<Pet>)  : BaseAdapter(){
    override fun getCount(): Int {
        return mascotas.size
    }

    override fun getItem(position: Int): Any {
        return this.mascotas.get(position);
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.pet_item,parent,false)

        var btnHuella = view.findViewById<ImageButton>(R.id.btnHuella)
        var txtPetName = view.findViewById<TextView>(R.id.txtPetName)

        var mascota = this.mascotas.get(position) as Pet

        txtPetName.text = mascota.nombre

        btnHuella.setOnClickListener{
            val intent = Intent(context,ResumePet::class.java)
            intent.putExtra("idMascota", mascota.id)
            context.startActivity(intent)
        }

        return view
    }

}