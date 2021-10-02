/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej6_EmpleadoSalarios;

public class EmpleadoAsalariadoXComision extends EmpleadoXComision {

    public EmpleadoAsalariadoXComision(int numero_de_ventas, String nombre, String apellido, double salario) {
        super(numero_de_ventas, nombre, apellido);
        setSalario(salario);
    }
    
    public double CalcularSalario(){
        double c,z,ganancia_x_auto_vendido=60000;
        c=getNumero_de_ventas()*ganancia_x_auto_vendido;//calculamos cuanto gana por venta
        z=((getSalario()*10)/100)+(getSalario());//se calcula el 10% de su salario base, y eso se suma con su salario base
        return z+c;//se suma todo, y eso es lo que gana semanalmente
    }
    
    public void MostrarInfoEmpleadoAsalariadoXComision(){
        System.out.println("");
        System.out.println("*****Empleado Asalariado por Comision*****");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Su salario es: "+CalcularSalario());
    }
    
    
    
    
    
}
