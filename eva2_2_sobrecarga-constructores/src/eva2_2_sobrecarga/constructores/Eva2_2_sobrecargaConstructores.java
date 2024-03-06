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
public class Eva2_2_sobrecargaConstructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        perso1.imprimirDatos();
        
        Persona perso2 = new Persona("pedro", "paramo", 70);
        perso2.imprimirDatos();
        perso2.setNombre("juan");
        perso2.setApellidos("perez");
        perso2.setEdad(70);
        perso2.imprimirDatos();
    }
    
}
