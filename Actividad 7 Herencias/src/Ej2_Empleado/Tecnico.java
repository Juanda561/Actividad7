
package Ej2_Empleado;

public class Tecnico extends Operario{

    public Tecnico(String nombre) {
        super(nombre);
    }
    
    @Override
    public String toString(){
        return "Empleado "+super.getNombre();
    }
    
}
