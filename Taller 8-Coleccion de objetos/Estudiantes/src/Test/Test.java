
package Test;

import java.util.*;
import Creacion.*;

public class Test {
    
    public static void main(String[] args) {
        
        List<Estudiantes> Programacion = new ArrayList(); 
        
        Estudiantes jesus  = new Estudiantes("Jesus", "De La Cruz", "Masculino","Regular", 3);
        Estudiantes andres = new Estudiantes("Andres", "Rosado", "Masculino","Condicional", 4);
        Estudiantes luis   = new Estudiantes("Luis", "Peña", "Masculino","Condicional", 5);
        
        Programacion.add(jesus);
        Programacion.add(andres);
        Programacion.add(luis);
        
        System.out.println("Estudiantes de Algotitmos y Progrmacion");
        imprimirElementos(Programacion);
        imprimirEstCondicion(Programacion);
        System.out.println("Lista de estudiantes de nota mayor a menor :");
        OrdenarNotaMayor(Programacion, new OrdenarNotaMayor());
        System.out.println("Lista de estudiantes de nota menor a mayor :");
        OrdenarNotaMenor(Programacion, new OrdenarNotaMenor());
        System.out.println("Lista de estudiantes ordenada por apelldio");
        OrdenarApellido(Programacion);
        
    }
    
    public static void imprimirElementos(List<Estudiantes> progra){
        System.out.println("Listado de estudiantes: " + progra.size());
        System.out.printf("%-20s %-20s %-20s %-20s %s%n", "Nombre", "Apellido", "Sexo", "Condicion", "Nota");
        System.out.println("----------------------------------------------------------------------------------------");
        for (Estudiantes e : progra) {
            System.out.printf("%-20s %-20s %-20s %-20s %.2f%n", 
                              e.getNombre(), 
                              e.getApellido(), 
                              e.getSexo(), 
                              e.getCondicion(),
                              e.getNota());
        }
        System.out.println("----------------------------------------------------------------------------------------\n");
    }
    
    public static void imprimirEstCondicion(List<Estudiantes>progra){
        System.out.println("Listado de estudiantes por Condicion: ");
        System.out.printf("%-20s %-20s %-20s %-20s %s%n", "Nombre", "Apellido", "Sexo", "Condicion", "Nota");
        System.out.println("----------------------------------------------------------------------------------------");
        for (Estudiantes e : progra) {
            if(e.getCondicion().equals("Condicional"))
            {
                System.out.printf("%-20s %-20s %-20s %-20s %.2f%n", 
                              e.getNombre(), 
                              e.getApellido(), 
                              e.getSexo(), 
                              e.getCondicion(),
                              e.getNota());
            }
        }
        System.out.println("----------------------------------------------------------------------------------------\n");
    }
    
    public static void OrdenarNotaMayor(List<Estudiantes> progra, Comparator ord){
        
        List<Estudiantes> listaMayor = new ArrayList(progra);
        Collections.sort(listaMayor, ord);
        imprimirElementos(listaMayor);
        
    }
    
     public static void OrdenarNotaMenor(List<Estudiantes> progra, Comparator ord){
        
        List<Estudiantes> listaMayor = new ArrayList(progra);
        Collections.sort(listaMayor, ord);
        imprimirElementos(listaMayor);
        
    }
     
     public static void OrdenarApellido(List<Estudiantes> progra){
        
        List<Estudiantes> lista = new ArrayList(progra);
        Collections.sort(lista);
        imprimirElementos(lista);
        
    }
}
