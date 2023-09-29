package co.edu.iush.equipodinamita.proyectofinalmovil

import java.util.Date

class BaseDatos {

    companion object{
        var visitas = mutableListOf(VisitaModel(1, "20-03-2022","Esta muy bien estable y sin molestias"))
        var medicamentos = mutableListOf(MedicamentoModel("Metronidazol", "20-03-2023"))
        var historiaClinica = HistoriaClinicaModel(1,visitas, medicamentos, condicionRespiratoriaModel(209.2F,"Estable"))
        var vacunas = mutableListOf(Vacuna(1,"Albendazol", 7F, "12-12-2022"),Vacuna(1,"Metronidazol", 7F, "12-12-2022") )

        var mascotas = mutableListOf(Pet(1,"Carlota", "12-05-2020", 3,"papilón", "mascotaej", "calmada", "Agility",4.5F, historiaClinica, vacunas))

        var usuarios = mutableListOf(UsuarioModel(1,"Cristian", "cc@gmail.com","12345", mascotas))

        var configuracion = mutableListOf(ConfiguracionModel("account", "perfil"), ConfiguracionModel("bell", "Notificaciones"), ConfiguracionModel("bag", "Politicas y reglamentos"), ConfiguracionModel("tool", "Configuracion avanzada"), ConfiguracionModel("door", "Cerrar sesion"))
    }
}