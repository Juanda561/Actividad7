
package Ej2_Empleado;

public class Directivo  extends Empleado{

    public Directivo(String nombre) {
        super(nombre);
    }
    
    @Override
    public String toString(){
        return "Empleado "+super.getNombre();
    }
    
}
