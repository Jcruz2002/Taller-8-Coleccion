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
public class Libro extends Publicacion{
    
    private int NPaginas;

    public Libro(int NPaginas, String Titulo, int precio) {
        super(Titulo, precio);
        this.NPaginas = NPaginas;
    }

    /**
     * @return the NPaginas
     */
    public int getNPaginas() {
        return NPaginas;
    }

    /**
     * @param NPaginas the NPaginas to set
     */
    public void setNPaginas(int NPaginas) {
        this.NPaginas = NPaginas;
    }

    @Override
    public String toString() {
        return super.toString() +  
               "Numero de Paginas : " + NPaginas;
    }
    
    
    
}
