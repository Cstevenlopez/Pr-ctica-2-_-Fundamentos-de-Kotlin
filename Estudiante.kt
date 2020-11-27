class Estudiante(nombre:String, apellido:String,
var asignatura:String,
 var profesor:String):
 Persona(nombre,apellido)
 open class Persona 
 println("Asignatura: ${estudiante.asignatura} con ${estudiante.nombre}")
