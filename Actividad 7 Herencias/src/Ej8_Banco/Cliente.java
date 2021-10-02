
package Ej8_Banco;

public class Cliente {
    
    private String nombre;
    private String apellido;
    private String nif;
    private int num_cuenta;
    private int saldo;

    public Cliente(String nif, String nombre, String apellido, int num_cuenta, int saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString(){
        return "NIF: "+nif+"\n"
               +"Nombre: "+nombre+"\n"
               +"Apellido: "+apellido+"\n"
               +"N° Cuenta: "+num_cuenta+"\n"
               +"Saldo: "+saldo+"\n" ;
    }
    
}
