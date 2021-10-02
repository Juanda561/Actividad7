
package Ej2_Empleado;

public class Operario extends Empleado {

    public Operario(String nombre) {
        super(nombre);
    }
    
    @Override
    public String toString(){
        return "Empleado "+super.getNombre();
    }
    
}
