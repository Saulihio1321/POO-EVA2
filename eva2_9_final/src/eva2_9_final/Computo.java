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
public final class Computo extends Electronica {
    private int ram;
    private String hd;
    private String procesador;

    public Computo() {
        this.ram = 0;
        this.hd = "---";
        this.procesador = "----";
    }

    public Computo(int ram, java.lang.String hd, java.lang.String procesador) {
        this.ram = ram;
        this.hd = hd;
        this.procesador = procesador;
    }
    

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public java.lang.String getHd() {
        return hd;
    }

    public void setHd(java.lang.String hd) {
        this.hd = hd;
    }

    public java.lang.String getProcesador() {
        return procesador;
    }

    public void setProcesador(java.lang.String procesador) {
        this.procesador = procesador;
    }
    
    @Override
    public String toString(){
    String cade = super.toString() + "\n";
        cade += "ram " + ram + "\n" + "hd " + hd + "\n" + "Procesador" + procesador;
        return cade;
    
    }
    
    
}
