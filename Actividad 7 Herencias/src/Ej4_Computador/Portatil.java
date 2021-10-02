
package Ej4_Computador;

public class Portatil extends Computador{
    
    private float peso;

    public Portatil(float peso, int codigo, double precio, String eslogan) {
        super(codigo, precio, eslogan);
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void MostrarInfoPortatil(Portatil a){
        System.out.println("Portatil");
        System.out.println("Codigo: "+a.getCodigo());
        System.out.println("Peso "+a.getPeso());
        System.out.println("Precio $"+a.getPrecio());
        System.out.println("Eslogan: "+a.getEslogan());
        System.out.println("");
    }
    
}
