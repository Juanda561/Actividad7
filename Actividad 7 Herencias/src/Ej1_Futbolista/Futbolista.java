
package Ej1_Futbolista;

public class Futbolista extends Persona{
 
    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    
    
    @Override
    public void Concentrarse(){
        System.out.println("El futbolista va a concentrarse");
    }
    
    @Override
    public void Viajar(){
        System.out.println("El futbolista va a viajar");
    }
    
    public void jugarPartido(){
        System.out.println("El jugador juega un partido");
    }
    
    public void entrenar(){
        System.out.println("El jugador está entrenando");
    }
    
}
