
package Ej7_Automovil;

public class Camioneta extends Automovil {
    
    private int capacidad_carga_en_kg;
    private int cantidad_ejes;
    private int cantidad_rodadas;

    public Camioneta(int capacidad_carga_en_kg, int cantidad_ejes, int cantidad_rodadas, String numero_de_serie_del_motor, String marca, int año, int precio) {
        super(numero_de_serie_del_motor, marca, año, precio);
        this.capacidad_carga_en_kg = capacidad_carga_en_kg;
        this.cantidad_ejes = cantidad_ejes;
        this.cantidad_rodadas = cantidad_rodadas;
    }

    @Override
    public String toString(){
        return "\n"
              +"Tipo de auto: Camioneta\n"
              +"N° serie del motor: "+getNumero_de_serie_del_motor()+"\n"
              +"Capacidad de carga (Kg): "+capacidad_carga_en_kg+"\n"
              +"Cantidad de ejes: "+cantidad_ejes+"\n"
              +"Cantidad de rodadas: "+cantidad_rodadas+"\n"
              +"Marca: "+getMarca()+"\n"
              +"Año: "+getAño()+"\n"
              +"Precio: "+getPrecio();
    }
    
    
    
}
