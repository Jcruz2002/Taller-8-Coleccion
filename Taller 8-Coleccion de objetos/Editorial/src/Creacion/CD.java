/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacion;

/**
 *
 * @author jdavi
 */
public class CD extends Publicacion {
    
    private int Minutos;

    public CD(int Minutos, String Titulo, int precio) {
        super(Titulo, precio);
        this.Minutos = Minutos;
    }

    /**
     * @return the Minutos
     */
    public int getMinutos() {
        return Minutos;
    }

    /**
     * @param Minutos the Minutos to set
     */
    public void setMinutos(int Minutos) {
        this.Minutos = Minutos;
    }

    @Override
    public String toString() {
        return super.toString() +
               "Tiempo duracion   : " + Minutos ;
    }

       
    

    
}
