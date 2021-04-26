
package Test;

import Creacion.*;
import java.util.*;

public class Test {
    
    public static void main(String[] args) {
        
        List<Cliente> dvd = new ArrayList();
        
        Cliente jesus = new Cliente(1212,"Jesus");
        registrardvd(jesus,1313,"Batman", "Andres", "24/04/2021", "31/04/2021");
        registrardvd(jesus, 1515, "SuperMan", "Juan", "24/04/2021", "1/05/2021");
        dvd.add(jesus);
        Cliente andres = new Cliente(1616,"Andres");
        registrardvd(andres,2222, "SpiderMan", "Guillermo", "24/04/2021","16/05/2021");
        registrardvd(andres,3333, "Iron-Man", "Luis", "24/04/2021","20/05/2021");
        dvd.add(andres);
        imprimirElementos(dvd);
       
    }
    
    public static void imprimirElementos(List<Cliente> dvd){
        System.out.println("Listado de clientes: " );
        for (Cliente e : dvd) {
        System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("DNI    : "+ e.getDNI());
            System.out.println("Nombre : "+ e.getNombre());
        System.out.println("---------------------------------------------------------------------------------------------------");
             imprimirElementos(e);
        }
        System.out.println("---------------------------------------------------------------------------------------------------\n");
    }
    
    public static void imprimirElementos(Cliente p){
        
        System.out.println("Lista de dvd prestados");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s%n", "Codigo", "Titulo", "Autor", "Fecha de inicio", "Fecha entrega");
        System.out.println("---------------------------------------------------------------------------------------------------");
        for(int i=0; i<p.getnDvd();i++)
        {
        DVD j = p.getDvdRegistrados()[i];
            System.out.printf("%-20d %-20s %-22s %-20s %-20s%n", 
                              j.getCodigo(), 
                              j.getTitulo(), 
                              j.getAutor(), 
                              j.getFechaIn(),
                              j.getFechaFin());         
        }
        
    }
    
     public static void registrardvd(Cliente jesus, long Codigo, String titulo, String Autor, String fecha, String fechafin){
        if(jesus.isLimitePedido()){
            System.out.println("No es posible registrar pedido, ya se cumplio el limite");
        }
        else{
            jesus.RegistrarDVD(Codigo, titulo, Autor, fecha, fechafin);
        }
        
    }
     
}
