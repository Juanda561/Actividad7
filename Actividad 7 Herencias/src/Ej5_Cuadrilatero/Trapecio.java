
package Ej5_Cuadrilatero;

public class Trapecio extends Cuadrilatero {

    public Trapecio(float punto1_x, float punto1_y, float punto2_x, float punto2_y, float punto3_x, float punto3_y, float punto4_x, float punto4_y) {
        super(punto1_x, punto1_y, punto2_x, punto2_y, punto3_x, punto3_y, punto4_x, punto4_y);
    }

    public double BaseMenor(){
        double dis= Math.sqrt(Math.pow(getPunto2_x()-getPunto1_x(), 2)+Math.pow(getPunto2_y()-getPunto1_y(), 2));
        return dis;
    }
    
    public double BaseMayor(){
        double dis= Math.sqrt(Math.pow(getPunto4_x()-getPunto3_x(), 2)+Math.pow(getPunto4_y()-getPunto3_y(), 2));
        return dis;
    }
    
    public double DistanciaHipotenusa(){
        double dis= Math.sqrt(Math.pow(getPunto4_x()-getPunto2_x(), 2)+Math.pow(getPunto4_y()-getPunto2_y(), 2));
        return dis;
    }
    
    public double alturaTrapecio(){
        double cateto1= BaseMayor()-BaseMenor();
        double cateto1r=Math.pow(cateto1, 2);
        double hipotenusar=Math.pow(DistanciaHipotenusa(), 2);
        double restaHipotenusarYcateto1r=hipotenusar-cateto1r;
        double h=Math.sqrt(restaHipotenusarYcateto1r);
        return h;
    }
    
    public double areaTrapecio(){
        return (BaseMayor()+BaseMenor()*alturaTrapecio())/2;
    }
    
    public void ImprimirInfoTrapecio(Trapecio t1){
        System.out.println("");
        System.out.println("*****Trapecio*****");
        System.out.println("Coordenadas 1: ("+getPunto1_x()+","+getPunto1_y()+")");
        System.out.println("Coordenadas 2: ("+getPunto2_x()+","+getPunto2_y()+")");
        System.out.println("Coordenadas 3: ("+getPunto3_x()+","+getPunto3_y()+")");
        System.out.println("Coordenadas 4: ("+getPunto4_x()+","+getPunto4_y()+")");
        System.out.println("La base mayor es: "+t1.BaseMayor());
        System.out.println("La Base menor es: "+t1.BaseMenor());
        System.out.printf("La altura del Trapecio es: %.2f%n ",t1.alturaTrapecio());
        System.out.println("El area del Trapecio es: "+t1.areaTrapecio());
    }

    
    
    
}
