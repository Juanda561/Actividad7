
package Ej3_Persona;

public class ProfesorInterino  extends Profesor{
    
    private int numero;

    public ProfesorInterino(int numero, String id, String nombres, String apellidos, String fecha) {
        super(id, nombres, apellidos, fecha);
        this.numero = numero;
    }
    
    public ProfesorInterino(){
        
    }
    
}
