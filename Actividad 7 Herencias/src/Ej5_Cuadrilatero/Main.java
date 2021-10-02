
package Ej5_Cuadrilatero;

public class Main {
    
    public static void main(String[] args) {
        
        Trapecio t1= new Trapecio(-3, 4, 3, 4, -3, -2, 6, -2);
        t1.ImprimirInfoTrapecio(t1);
        
        Rectangulo r1= new Rectangulo(-3, 4, 6, 4, -3, -2, 6, -2);
        r1.ImprimirInfoRectangulo(r1);
        
        Cuadrado c1=new Cuadrado(-1, 2, 3, 2, -1, -2, 3, -2);
        c1.ImprimiAreaCuadrado();
        
    }  
    
    
    
    
    
}
