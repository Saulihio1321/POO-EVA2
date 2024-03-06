/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_sobrecarga.constructores;

/**
 *
 * @author invitado
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona(){
    nombre = "sin nombre ";
    apellidos = "sin apellido";
    edad = 0;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   public void imprimirDatos(){
       System.out.println("nombre" + nombre);
       System.out.println("apellidos" + edad);
       System.out.println("edad" + edad);
   }

   
    
    
}
