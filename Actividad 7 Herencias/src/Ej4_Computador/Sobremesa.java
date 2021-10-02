
package Ej4_Computador;

public class Sobremesa extends Computador {
    
    private String descripcion_del_tipo_de_torre;

    public Sobremesa(String descripcion_del_tipo_de_torre, int codigo, double precio, String eslogan) {
        super(codigo, precio, eslogan);
        this.descripcion_del_tipo_de_torre = descripcion_del_tipo_de_torre;
    }

    public String getDescripcion_del_tipo_de_torre() {
        return descripcion_del_tipo_de_torre;
    }

    public void setDescripcion_del_tipo_de_torre(String descripcion_del_tipo_de_torre) {
        this.descripcion_del_tipo_de_torre = descripcion_del_tipo_de_torre;
    }
    
    public void MostrarInfoSobreMesa(Sobremesa a){
        System.out.println("Sobremesa");
        System.out.println("Descripcion de la torre: "+a.getDescripcion_del_tipo_de_torre());
        System.out.println("Codigo: "+a.getCodigo());
        System.out.println("Precio $"+a.getPrecio());
        System.out.println("Eslogan: "+a.getEslogan());
        System.out.println("");
    }
    
}
