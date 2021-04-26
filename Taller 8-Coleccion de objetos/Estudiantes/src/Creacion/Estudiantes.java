
package Creacion;

public class Estudiantes implements Comparable <Estudiantes>{
    
    private String Nombre,Apellido,Sexo,Condicion;
    private double nota;

    public Estudiantes(String Nombre, String Apellido, String Sexo, String Condicion, double nota) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.Condicion = Condicion;
        this.nota = nota;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the Condicion
     */
    public String getCondicion() {
        return Condicion;
    }

    /**
     * @param Condicion the Condicion to set
     */
    public void setCondicion(String Condicion) {
        this.Condicion = Condicion;
    }

    /**
     * @return the nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
   
     
    @Override
    public String toString() {
        return "Estudiante{" + "Nombre=" + Nombre + ", apellido=" + Apellido + ", Sexo=" + Sexo + ", Condicion=" + Condicion + ", Nota=" + nota + '}';
    }

    @Override
    public int compareTo(Estudiantes o) {
      return this.Apellido.compareTo(o.Apellido);    }

}
