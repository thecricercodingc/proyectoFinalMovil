package co.edu.iush.equipodinamita.proyectofinalmovil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class UltimaVisita : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ultima_visita)

        val idMascota = intent.getIntExtra("idMascota", -1)
        val mascota: Pet = BaseDatos.mascotas.find { pet -> pet.id == idMascota } as Pet

        val imgMascotaUV: ImageView = findViewById(R.id.imgMascotaUV)
        val txtNombreUV: TextView = findViewById(R.id.txtNombreUV)
        val txtPesoUV: TextView = findViewById(R.id.txtPesoUV)
        val txtCrUV: TextView = findViewById(R.id.txtCrUV)
        val txtFechaM_UV: TextView = findViewById(R.id.txtFechaM_UV)
        val txtNM_UV: TextView = findViewById(R.id.txtNM_UV)
        val txtNotaUV: EditText = findViewById(R.id.txtNotaUV)
        val btnCerrarUV: ImageButton = findViewById(R.id.btnCerrarUV)

        imgMascotaUV.setImageResource(R.drawable.mascotaej)
        txtNombreUV.text = mascota.nombre
        txtPesoUV.text = mascota.peso.toString() + " Kg"
        txtCrUV.text = mascota.historiaClinica.condicionRespiratoria.descripcion + " " + mascota.historiaClinica.condicionRespiratoria.presion.toString() + " mmHg"
        txtFechaM_UV.text = mascota.historiaClinica.visitas.get(mascota.historiaClinica.visitas.size - 1).fecha
        txtNM_UV.text = mascota.historiaClinica.medicamentos.get(mascota.historiaClinica.medicamentos.size - 1).nombreMedicamento + " mg"
        val notas = mascota.historiaClinica.visitas.get(mascota.historiaClinica.visitas.size - 1).notas
        txtNotaUV.setText(notas)
        btnCerrarUV.setOnClickListener {
            finish()
        }
    }
}