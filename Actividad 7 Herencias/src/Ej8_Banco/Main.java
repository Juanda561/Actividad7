
package Ej8_Banco;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        String nif,numero;
        
        Scanner sc=new Scanner(System.in);
        int saldo,num_fondos,num_cuenta,num_cliente=0;
        double saldo_mensual=0;
    
        String[] nombre={"Alejandro","Maria","Pablo","Alberto","Camilo","Hector","Rosa","Carlos","Jesus","Daniel"};
        String[] apellido={"Manjarrez Lopez","Hernandez","Rollero","Martinez","Garcia","Ayala","Gaviria","Primo","Salcedo Higuaran","Obregón"};
    
        do {
            
            num_cliente=(int)(Math.random()*10);
            
        } while (num_cliente<1);
        
        Cliente []c1 = new Cliente[num_cliente];
        
        System.out.println("*****CLIENTE*****");
        
        for (int i = 0; i < num_cliente; i++) {
            Fondo f1 = new Fondo();
            nif = String.valueOf((int)(Math.random()*10000)); 
            num_cuenta=(int)(Math.random()*100000);
            
            do{
               saldo=(int)(Math.random()*1000); 
            }while(saldo<100);
            
            c1[i] = new Cliente(nif,nombre[(int)(Math.random()*10)],apellido[(int)(Math.random()*10)],num_cuenta,saldo);
        }
        for (int i = 0; i < num_cliente; i++) {
            System.out.print("\nCliente N°: "+(i+1)+"\n"+c1[i].toString());   
        }
        
        
        ClientePreferente []cp1 = new ClientePreferente[num_cliente];
        System.out.println("\n *****CLIENTE PREFERENTE*****");
        
              
              do{
                num_cliente=(int)(Math.random()*10);
            }while(num_cliente<1); 
               
        
        for (int i = 0; i < num_cliente; i++) {
            nif = String.valueOf((int)(Math.random()*10000));
            num_cuenta=(int)(Math.random()*10);
            do{
               saldo=(int)(Math.random()*1000); 
            }while(saldo<100);
               
            
                cp1[i] = new ClientePreferente(nif,nombre[(int)(Math.random()*10)],apellido[(int)(Math.random()*10)],num_cuenta,saldo);
                System.out.println("\nC.P. N°: "+(i+1)+"\n"+cp1[i].toString());
                Fondo miFondo = new Fondo();
                System.out.print("Ingrese el numero de FONDOS: ");
                do{
                    num_fondos=sc.nextInt();
                }while(num_fondos<1);
                for (int j = 0; j < num_fondos; j++) {
                    System.out.println("INGRESANDO FONDO N°: "+(j+1));
                    System.out.print(" Ingrese el numero de FONDO: ");
                    numero=String.valueOf(sc.next());
                    System.out.print(" Ingrese el SALDO MENSUAL: ");
                    do{
                        saldo_mensual=sc.nextDouble();
                    }while(saldo_mensual<1);
                    miFondo.setNumero(numero);
                    miFondo.setSaldo_mensual(saldo_mensual);
                    System.out.println( miFondo.toString());
                }
        }
        
    }
    
}
