 class Persona(var nombre:String, var apellido:String)

 constructor(){
 }
 constructor(nombre:String, apellido:String):this()
 {
 nombre=n
 apellido=a
 }
fun main(){
 var persona = Persona("Yesser","Miranda")
 var nueva = Persona()
 nueva.nombre = "Juan"
 nueva.apellido = "Lopez"
 println(persona.nombre)
 println(nueva.nombre)
}
