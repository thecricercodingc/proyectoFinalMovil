package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridView


class DashboardPetClient : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_pet_client)

        val btnAddPet: Button = findViewById(R.id.btnAddPetDashboardPetClient)
        btnAddPet.setOnClickListener{
            val intent = Intent(this,AddMascota::class.java)
            startActivity(intent)
        }

        val btnEmergencyHome: Button = findViewById(R.id.btnEmergencyDashboardPetClient)
        btnEmergencyHome.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:4564324")
            startActivity(intent)
        }

        val btnConfiguracion:Button = findViewById(R.id.btnSettingDashboardPetClient)
        btnConfiguracion.setOnClickListener {
            val NewScreen = Intent(this, Configuracion:: class.java)
            startActivity(NewScreen)
        }
    }
    override fun onResume() {
        super.onResume()
        val usuarios = BaseDatos.usuarios
        var idUsuario = intent.getIntExtra("idUsuario", -1)

        val result: UsuarioModel = usuarios.find { user -> user.id == idUsuario} as UsuarioModel


        var mascotas = result.mascotas
        var adaptador = PetAdapter(this,mascotas.toList())

        val petGrid = this.findViewById<GridView>(R.id.petGrid)
        petGrid.adapter = adaptador
    }
}