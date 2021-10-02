
package Ej8_Banco;

public class Fondo {
    
    private String numero;
    private double saldo_mensual;

    public Fondo() {
        this.numero = "";
        this.saldo_mensual = 0;
    }
    
    public Fondo(String numero, double saldo_mensual) {
        this.numero = numero;
        this.saldo_mensual = saldo_mensual;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo_mensual() {
        return saldo_mensual;
    }

    public void setSaldo_mensual(double saldo_mensual) {
        this.saldo_mensual = saldo_mensual;
    }
    
    @Override
    public String toString(){
        return "numero: "+numero+"\n"
              +"Saldo Mensual: "+saldo_mensual;
    }
    
}
