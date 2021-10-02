
package Ej4_Computador;

public class Main {
    
    public static void main(String[] args) {
                
        Portatil p1=new Portatil(15 , 1234, 1500000, "Ideal para sus viajes");
        Portatil p2=new Portatil(11 , 5435, 1300000, "Ideal para sus viajes");
        
        Sobremesa s1= new Sobremesa("Ryzen 5, memoria Ram 4GB, 1T de almacenamiento", 1254, 800000, "Es el que más pesa, pero el que menos cuesta");
        Sobremesa s2= new Sobremesa("Intel Core i7, memoria Ram 6GB, 1T de almacenamiento", 1234, 700000, "Es el que más pesa, pero el que menos cuesta");
        
        p1.MostrarInfoPortatil(p1);
        p1.MostrarInfoPortatil(p2);
        
        s1.MostrarInfoSobreMesa(s1);
        s1.MostrarInfoSobreMesa(s2);
    }
    
}
