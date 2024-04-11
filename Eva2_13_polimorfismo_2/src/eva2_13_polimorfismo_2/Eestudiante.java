/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_polimorfismo_2;

/**
 *
 * @author invitado
 */
public class Eestudiante extends Persona{

    private String noControl;

    public Eestudiante() {
        super();
        this.noControl = "";
    }

    public Eestudiante(String noControl, String nombre, String apellido) {
        super(nombre, apellido);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    @Override
    public String toString() {
        return super.toString() + " " + noControl; 
    }
}
