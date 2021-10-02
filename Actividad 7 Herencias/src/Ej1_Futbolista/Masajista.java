
package Ej1_Futbolista;

public class Masajista extends Persona{
    
    private String titulacion;
    private int anios_experiencia;

    public Masajista(String titulacion, int anios_experiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anios_experiencia = anios_experiencia;
    }
    
    @Override
    public void Concentrarse(){
        System.out.println("El masajista va a concentrarse");
    }
    
    @Override
    public void Viajar(){
        System.out.println("El masajista va a viajar");
    }
    
    public void darMasaje(){
        System.out.println("va a dar un masaje");
    }
    
}
