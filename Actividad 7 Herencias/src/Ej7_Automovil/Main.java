
package Ej7_Automovil;


public class Main {

    public static void main(String[] args) {
        
        Automovil a=new Automovil("564HM3G9994313", "Mazda", 2016, 50000000);
        AutoCompacto ac1=new AutoCompacto(5,"466HM2U2000001", "Chevrolet", 2013, 45000000);
        AutoDeLujo adl1=new AutoDeLujo(2, "GAF23232LLLF2255", "FERRARI", 2017, 500000000);
        Vagoneta v1=new Vagoneta(8, "KL323567771011", "TOYOTA", 2015, 60000000);
        Camioneta c1=new Camioneta(600, 1, 4, "44GLAORTF23411", "Ford", 2015, 80000000);
        
        System.out.println(a);
        System.out.println(ac1);
        System.out.println(adl1);
        System.out.println(v1);
        System.out.println(c1);
    }
    
}
