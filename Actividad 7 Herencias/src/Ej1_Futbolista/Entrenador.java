
package Ej1_Futbolista;

public class Entrenador extends Persona{

    private String id_federacion;

    public Entrenador(String id_federacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.id_federacion = id_federacion;
    }
    
    @Override
    public void Concentrarse(){
        System.out.println("El entrenador va a concentrarse");
    }
    
    @Override
    public void Viajar(){
        System.out.println("El entrenador va a viajar");
    }
    
    public void dirigirPartido(){
        System.out.println("El entrenador está dirigiendo el partido");
    }
    
    public void dirigirEntrenamiento(){
        System.out.println("El entrenador está en el entrenamiento");
    }
    
}
