
package Ej5_Cuadrilatero;

public class Rectangulo extends Cuadrilatero{

    public Rectangulo(float punto1_x, float punto1_y, float punto2_x, float punto2_y, float punto3_x, float punto3_y, float punto4_x, float punto4_y) {
        super(punto1_x, punto1_y, punto2_x, punto2_y, punto3_x, punto3_y, punto4_x, punto4_y);
    }

    public double base(){
        double dis= Math.sqrt(Math.pow(getPunto2_x()-getPunto1_x(), 2)+Math.pow(getPunto2_y()-getPunto1_y(), 2));
        return dis;
    }
    
    public double altura(){
        double dis= Math.sqrt(Math.pow(getPunto4_x()-getPunto2_x(), 2)+Math.pow(getPunto4_y()-getPunto2_y(), 2));
        return dis;
    }
    
    public void ImprimirInfoRectangulo(Rectangulo r1){
        System.out.println("");
        System.out.println("*****Rectangulo*****");
        System.out.println("Coordenadas 1: ("+getPunto1_x()+","+getPunto1_y()+")");
        System.out.println("Coordenadas 2: ("+getPunto2_x()+","+getPunto2_y()+")");
        System.out.println("Coordenadas 3: ("+getPunto3_x()+","+getPunto3_y()+")");
        System.out.println("Coordenadas 4: ("+getPunto4_x()+","+getPunto4_y()+")");
        System.out.println("Tamaño de la base: "+base());
        System.out.println("Tamaño de la altura: "+altura());
        System.out.println("El area del Rectangulo es: "+base()*altura());
    }
    
}
