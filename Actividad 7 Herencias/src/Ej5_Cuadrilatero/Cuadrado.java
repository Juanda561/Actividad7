
package Ej5_Cuadrilatero;

public class Cuadrado extends Cuadrilatero {

    public Cuadrado(float punto1_x, float punto1_y, float punto2_x, float punto2_y, float punto3_x, float punto3_y, float punto4_x, float punto4_y) {
        super(punto1_x, punto1_y, punto2_x, punto2_y, punto3_x, punto3_y, punto4_x, punto4_y);
    }
    
    public double base(){
        double dis= Math.sqrt(Math.pow(getPunto2_x()-getPunto1_x(), 2)+Math.pow(getPunto2_y()-getPunto1_y(), 2));
        return dis;
    }
    
    public void ImprimiAreaCuadrado(){
        System.out.println("");
        System.out.println("*****Cuadrado*****");
        System.out.println("Coordenadas 1: ("+getPunto1_x()+","+getPunto1_y()+")");
        System.out.println("Coordenadas 2: ("+getPunto2_x()+","+getPunto2_y()+")");
        System.out.println("Coordenadas 3: ("+getPunto3_x()+","+getPunto3_y()+")");
        System.out.println("Coordenadas 4: ("+getPunto4_x()+","+getPunto4_y()+")");
        System.out.println("El tamaño de sus lados iguales es: "+base());
        System.out.println("El area del cuadrado es: "+Math.pow(base(), 2));
            
    }
    
    
}
