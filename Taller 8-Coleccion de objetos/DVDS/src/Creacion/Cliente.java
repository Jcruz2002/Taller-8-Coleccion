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
public class Cliente {
    
    private long DNI;
    private String Nombre;
    private final int LIMITE_DVD = 100;
    private final int LIMITE = 5;
    private DVD[] DvdRegistrados;
    private int nDvd;
    
    

    public Cliente(long DNI, String Nombre) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.DvdRegistrados= new DVD[this.LIMITE_DVD];
        this.nDvd=0;
    }

    /**
     * @return the DNI
     */
    public long getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(long DNI) {
        this.DNI = DNI;
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
     * @return the DvdRegistrados
     */
    public DVD[] getDvdRegistrados() {
        return DvdRegistrados;
    }

    /**
     * @param DvdRegistrados the DvdRegistrados to set
     */
    public void setDvdRegistrados(DVD[] DvdRegistrados) {
        this.DvdRegistrados = DvdRegistrados;
    }

    /**
     * @return the nDvd
     */
    public int getnDvd() {
        return nDvd;
    }

    /**
     * @param nDvd the nDvd to set
     */
    public void setnDvd(int nDvd) {
        this.nDvd = nDvd;
    }
    
    
    
     public boolean RegistrarDVD(long Codigo, String Titulo, String Autor, String fechai, String fechafin){
        if(this.getnDvd() < this.LIMITE){
            DVD j = new DVD(Codigo,Titulo,Autor,fechai,fechafin);
            this.DvdRegistrados[this.nDvd]=j;
            this.nDvd++;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isLimitePedido(){
        return this.nDvd>=this.LIMITE_DVD;
    }

    
}
