package co.edu.iush.equipodinamita.proyectofinalmovil

import android.content.Intent
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