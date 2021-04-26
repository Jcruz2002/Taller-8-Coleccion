
package Test;

import Creacion.*;
import java.util.*;

public class Test {
    
    public static void main(String[] args) {
        
        List<Publicacion> publi = new ArrayList();
        
        AdicionarLibros(publi);
        AdicionarCD(publi);
        Buscar(publi);
        imprimirElementos(publi);
        ModificarElemento(publi);
        imprimirElementos(publi);
        eliminarELemento(publi);
        imprimirElementos(publi);
        
    }
    
    public static void AdicionarLibros(List<Publicacion> publi){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Adicionar libro");
        System.out.print("Nombre de libro   : ");
        String titu = entrada.nextLine();
        System.out.print("Precio            : ");
        int precio = entrada.nextInt();
        System.out.print("Numero de Paginas : ");
        int n = entrada.nextInt();
        
        Libro a = new Libro(n,titu,precio);
        publi.add(a);        
        System.out.println("----------------------------------------------------------------------------------------");

        
        
    }
    
     public static void AdicionarCD(List<Publicacion> publi){    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Adicionar CD");
        System.out.print("Nombre de CD           : ");
        String titu = entrada.nextLine();
        System.out.print("Precio                 : ");
        int precio = entrada.nextInt();
        System.out.print("Tiempo de reproduccion : ");
        int n = entrada.nextInt();
        
        CD b = new CD(n,titu,precio);
        publi.add(b);
        System.out.println("----------------------------------------------------------------------------------------");

    }
     
     public static void imprimirElementos(List<Publicacion> p){
        
        System.out.println("Listado de Editorial: " + p.size());
        for (Publicacion e : p) {
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------");
        }         
    }
     
    public static void Buscar(List<Publicacion> p) {

        Publicacion encontrado = null;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elemento a buscar");
        System.out.print("Nombre : ");
        String t = entrada.nextLine();

        for (Publicacion e : p) {
            if (e.getTitulo().equals(t)) {
                encontrado = e;
                break;
            }
        }
            if (encontrado == null) {
                System.out.println("No se encuentra registrado");
            } else {
                System.out.println("Registro encontrado: ");
                System.out.println(encontrado);
            }
     
        System.out.println("----------------------------------------------------------------------------------------\n");
    }
    
     public static void eliminarELemento(List<Publicacion> pu){
        Publicacion eliminado = null;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elemento a eliminar");
        System.out.print("Nombre : ");
        String t = entrada.nextLine();

        Iterator<Publicacion> it = pu.iterator();
        while (it.hasNext()) {
            Publicacion e = it.next();
            if (e.getTitulo().equals(t)) {
                it.remove();
                eliminado = e;
                break;
            }
        }
        if(eliminado == null)
            System.out.println("No se encuentra registrado");
        else{
            System.out.println("Resgitro eliminado: ");
            System.out.println(eliminado);
        }    
        System.out.println("----------------------------------------------------------\n");
    }
     
     
     public static void ModificarElemento(List<Publicacion> p) {

        Publicacion modificado = null;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elemento a Modificar");
        System.out.print("Nombre : ");
        String t = entrada.nextLine();

        for (Publicacion e : p) {
            if (e.getTitulo().equals(t)) {
                modificado = e;
                break;
            }
        }
            if (modificado == null) {
                System.out.println("No se encuentra registrado");
            } else {
                
                System.out.println("Valores a cambiar: ");
                System.out.print("Nombre : ");
                String ti = entrada.nextLine();
                modificado.setTitulo(ti);
                System.out.print("Precio : ");
                int pre = entrada.nextInt();
                modificado.setPrecio(pre);
            }
     
        System.out.println("----------------------------------------------------------------------------------------\n");
    }
     
    
    
    
    
}



    
    
    

