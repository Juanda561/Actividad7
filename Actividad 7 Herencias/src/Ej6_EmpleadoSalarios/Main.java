
package Ej6_EmpleadoSalarios;

public class Main {
    
    public static void main(String[] args) {
        
        EmpleadoXHora exh1= new EmpleadoXHora(45, "Juan David", "Ayala");
        exh1.MostrarInfoEmpleadoXHora();
        
        EmpleadoXHora exh2= new EmpleadoXHora(40, "Roberto José", "Manjarrez");
        exh2.MostrarInfoEmpleadoXHora();
        
        EmpleadoAsalariado ea1=new EmpleadoAsalariado("Mario", "Molina Zapata",150000);
        ea1.MostrarInfoEmpleadoAsalariado();
        
        EmpleadoXComision exc=new EmpleadoXComision(3, "Kelly", "Riquett");
        exc.MostrarInfoEmpleadoXComision();
        
        EmpleadoAsalariadoXComision eaxc=new EmpleadoAsalariadoXComision(3, "Lorenzo", "Lopez Mendoza", 100000);
        eaxc.MostrarInfoEmpleadoAsalariadoXComision();
    }
    
}
