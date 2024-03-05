/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_sobrecarga_metodos;

/**
 *
 * @author invitado
 */
public class Eva2_1_sobrecarga_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("la suma de 5 + 4 = " + sumar(5,4));
        System.out.println("la suma de 3.1 + 2.5 =" + sumar(3.1,2.5));
        System.out.println("la suma de hola + mundo =" + sumar("hola","mundo"));
        sumar();
    }
    
    public static int sumar (int num1, int num2){
        return num1 + num2;
    }
    public static double sumar (double num1, double num2){
        return num1 + num2;
    }
    public static String sumar (String num1, String num2){
        return num1 + num2;
    }
    public static void sumar(){
        System.out.println("metodo que no hace nada");
    
    }
}
