/*
El equipo de diseño de software ha presentado el siguiente modelo de clases para
construir un aplicativo en el que se simule el comportamiento de los diferentes
integrantes de un equipo de futbol (Futbolista, entrenador, masajista).
El jefe del proyecto, después de revisar el modelo, indica que requiere algunas mejoras que permitan su optimización
y que eviten la duplicidad de código y reutilización de clases, para lo cual, sugiere tener en cuenta el concepto de 
herencia.
Proponga un nuevo diseño UML a partir del presentado por el equipo de diseño, que permita aprovechar las 
características que ofrece la herencia y satisfacer el requerimiento del jefe de proyecto.
*/
package Ej1_Futbolista;

public class Main {
    
    public static void main(String[] args) {
        Futbolista f1= new  Futbolista(10, "Volante", 1954930543, "Juan", "Ronaldinho", 24);
        f1.Concentrarse();
        
        Entrenador e1=new Entrenador("0001", 1943430542, "Carlos", "Lindarte", 36);
        e1.Concentrarse();
    
        Masajista m1= new Masajista("Masajista de entrenamient", 4, 1583934532, "Jose", "Lopez", 37);
        System.out.print("El masajista "+m1.getNombre()+" ");
        m1.darMasaje();
        System.out.println(" al futbolista "+f1.getNombre()+" con el dorsal #"+f1.getDorsal());
        m1.Concentrarse();
    }
    
    
    
}
