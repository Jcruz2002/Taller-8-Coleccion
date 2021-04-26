

package Creacion;

import java.util.Comparator;

public class OrdenarNotaMenor implements Comparator<Estudiantes>{
    
    @Override
    public int compare(Estudiantes t, Estudiantes t1) {
        if(t.getNota()>t1.getNota()) return 1;
        else if(t.getNota()<t1.getNota()) return -1;
        else return 0;
    }
    
    
}
