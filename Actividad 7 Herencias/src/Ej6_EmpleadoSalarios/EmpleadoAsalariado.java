
package Ej6_EmpleadoSalarios;

public class EmpleadoAsalariado extends Empleado {

    public EmpleadoAsalariado(String nombre, String apellido, double salario) {
        super(nombre, apellido);
        setSalario(salario);
    }
    
    
    //independientemente de las horast, el asalariado tiene un salario fijo;
    public void MostrarInfoEmpleadoAsalariado(){
        System.out.println("");
        System.out.println("*****Empleado Asalariado*****");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Su salario semanal es fijo, y es: "+getSalario());
    }
    
    

    
    
    
    
    
}
