
package Ej8_Banco;

public class ClientePreferente extends Cliente {
    
    private int num_fondos;
    
    private Fondo fondo;
    
    public ClientePreferente(int num_fondos, String nombre, String apellido, String nif, int num_cuenta, int saldo) {
        super(nombre, apellido, nif, num_cuenta, saldo);
        this.num_fondos = num_fondos;
    }
    
    public ClientePreferente( String nif, String nombre, String apellido, int num_cuenta, int saldo) {
        super(nif, nombre, apellido, num_cuenta, saldo);
        //this.numFondos = numFondos;
        //this.fondo = fondo;
    }

    public int getNum_fondos() {
        return num_fondos;
    }

    public void setNum_fondos(int num_fondos) {
        this.num_fondos = num_fondos;
    }

    public Fondo getFondo() {
        return fondo;
    }

    public void setFondo(Fondo fondo) {
        this.fondo = fondo;
    }
    
    
    
    @Override
    public String toString(){
        return super.toString()+"Numero de fondos: "+num_fondos;
    }
    
}
