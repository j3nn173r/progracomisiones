
package nuevacomision;

import clases.comisiones.Empleado;
import clases.comisiones.TablaComision;
import java.util.*;

public class TestComision {
    
    static Set<Empleado> empleados = new HashSet<>();

    public static void main(String[] args) {
        TablaComision tabla;
        Empleado empleado1 = new Empleado("Camila",5,6,3);
    
        empleados.add(empleado1);
        empleados.add(new Empleado("Jorge",10,5,3));
        
        tabla = new TablaComision(empleados);
        tabla.ventasEnero();
        tabla.ventasFebrero();
       
    }
}
