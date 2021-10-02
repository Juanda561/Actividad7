/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej6_EmpleadoSalarios;

public class EmpleadoXComision extends Empleado{

    private int numero_de_ventas;

    public EmpleadoXComision(int numero_de_ventas, String nombre, String apellido) {
        super(nombre, apellido);
        this.numero_de_ventas = numero_de_ventas;
    }

    public int getNumero_de_ventas() {
        return numero_de_ventas;
    }

    public void setNumero_de_ventas(int numero_de_ventas) {
        this.numero_de_ventas = numero_de_ventas;
    }
    
    public double salario(){
        
        double ganancia_x_auto_vendido=60000;//esto se gana el empleado por venta
        return numero_de_ventas*ganancia_x_auto_vendido;//calculamos cuanto puede ganar por venta
        
    }
    
    public void MostrarInfoEmpleadoXComision(){
        System.out.println("");
        System.out.println("*****Empleados por Comision*****");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Su salario semanal es: "+salario());
    }
    
}
