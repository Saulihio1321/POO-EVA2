/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_9_final;

/**
 *
 * @author invitado
 */
public abstract class Productos {
    private String nombre;
    private Double precio;

    public Productos() {
        this.nombre = "---";
        this.precio = 0.0;
    }

    public Productos(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        String cade = "";
        cade += "Nombre: " + nombre + "\n" + "Precio:"  + precio;
        return cade;
    } 
    
}
