
package Ej6_EmpleadoSalarios;

public class EmpleadoXHora extends Empleado {
    
    private int horast;

    public EmpleadoXHora(int horast, String nombre, String apellido) {
        super(nombre, apellido);
        this.horast = horast;
    }
    
 
    
    public double Salario(){
        double horasExtra,salarioHorasExtras,salarioTotal, salario;
        
        //si las horas trabajas superan las 40 horas
        if (horast>40) {
            salario=40*3786;//multiplicamos las 40 horas por el valor de cada hora 
            horasExtra=horast-40;//calcular las horas extras, osea las mas de 40
            salarioHorasExtras=horasExtra*5287;//esas horas extras las multiplicamos por el valor de cada hora
            salarioTotal=salario+salarioHorasExtras;//sumamos el valor de las 40 horas y el valor de las horas extras
        }else{
            salarioTotal=horast*3786;// si no trabajó mas de 40 horas, se multiplica por el valor de la hora trabajada 
         }
        return salarioTotal;
    }
    
    public void MostrarInfoEmpleadoXHora(){
        setSalario(Salario());
        System.out.println("");
        System.out.println("***Empleado por hora*****");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Su salario semanal es: "+getSalario());
    }
}
