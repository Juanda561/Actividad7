
package Ej7_Automovil;

public class Vagoneta extends Automovil {
    
    private int cantidad_de_pasajeros;

    public Vagoneta(int cantidad_de_pasajeros, String numero_de_serie_del_motor, String marca, int año, int precio) {
        super(numero_de_serie_del_motor, marca, año, precio);
        this.cantidad_de_pasajeros = cantidad_de_pasajeros;
    }
    
    @Override
    public String toString(){
        return "\n"
              +"Tipo de auto: Vagoneta\n"
              +"N° serie del motor: "+getNumero_de_serie_del_motor()+"\n"
              +"Marca: "+getMarca()+"\n"
              +"Año: "+getAño()+"\n"
              +"Precio: "+getPrecio()+"\n"
              +"Cantidad de pasajeros: "+cantidad_de_pasajeros;
    }
    
}
