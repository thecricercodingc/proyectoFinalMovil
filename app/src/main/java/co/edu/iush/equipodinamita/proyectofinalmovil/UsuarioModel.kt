package co.edu.iush.equipodinamita.proyectofinalmovil

class UsuarioModel(var id: Int, var nombre: String, var correo: String, var contraseña: String, var mascotas: MutableList<Pet>) {
    constructor(correo: String, contraseña: String) : this(BaseDatos.usuarios.size, "", correo, contraseña, mutableListOf<Pet>()) {
        this.correo = correo;
        this.contraseña = contraseña;
    }
}