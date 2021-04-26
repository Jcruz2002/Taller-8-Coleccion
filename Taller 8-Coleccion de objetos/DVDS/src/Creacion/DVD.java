
package Creacion;

public class DVD {
    
    private long codigo;
    private String Titulo,Autor;
    private String fechaIn,fechaFin;

    public DVD(long codigo, String Titulo, String Autor,String FchIn, String FchFin) {
        this.codigo = codigo;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.fechaIn=FchIn;
        this.fechaFin=FchFin;
    }

    /**
     * @return the codigo
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
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
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     * @return the fechaIn
     */
    public String getFechaIn() {
        return fechaIn;
    }

    /**
     * @param fechaIn the fechaIn to set
     */
    public void setFechaIn(String fechaIn) {
        this.fechaIn = fechaIn;
    }

    /**
     * @return the fechaFin
     */
    public String getFechaFin() {
        return fechaFin;
    }

 
    
}
