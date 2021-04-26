
package Creacion;

public class Publicacion {
    
    private String Titulo;
    private int precio;

    public Publicacion(String Titulo, int precio) {
        this.Titulo = Titulo;
        this.precio = precio;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

 
    public String toString() {
        return "Titulo            : " + Titulo +"\n"+ 
               "Precio            : " + precio +"\n";
    }
    
    
    
    
    
}
