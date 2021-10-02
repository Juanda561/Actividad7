
package Ej2_Empleado;

public class Oficial extends Operario{

    public Oficial(String nombre) {
        super(nombre);
    }

   @Override
    public String toString(){
        return "Empleado "+super.getNombre();
    }
    
    
    
}
