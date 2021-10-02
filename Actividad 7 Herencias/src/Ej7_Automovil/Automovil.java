
package Ej7_Automovil;

public class Automovil {
    
    private String numero_de_serie_del_motor;
    private String marca;
    private int año;
    private int precio;

    public Automovil(String numero_de_serie_del_motor, String marca, int año, int precio) {
        this.numero_de_serie_del_motor = numero_de_serie_del_motor;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }

    public String getNumero_de_serie_del_motor() {
        return numero_de_serie_del_motor;
    }

    public void setNumero_de_serie_del_motor(String numero_de_serie_del_motor) {
        this.numero_de_serie_del_motor = numero_de_serie_del_motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "\n"
              +"Automovil\n"
              +"N° serie del motor: "+numero_de_serie_del_motor+"\n"
              +"Marca: "+marca+"\n"
              +"Año: "+año+"\n"
              +"Precio: "+precio+"\n" ;
    }
    
    
}
