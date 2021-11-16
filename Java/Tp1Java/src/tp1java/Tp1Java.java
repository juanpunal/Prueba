
package tp1java;

import java.util.Scanner;


public class Tp1Java {

   
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);
        System.out.println("Cual es tu nombre: ");
        String nombre = escaner.nextLine();
        System.out.println("Cual es tu apellido: ");
        String apellido = escaner.nextLine();
        System.out.println("Cual es tu edad: ");
        String edad = escaner.nextLine();        
        System.out.println("Cual es tu hobbie: ");
        String hobbie = escaner.nextLine();        
        System.out.println("Cual es tu editor de codigo preferido: ");
        String editor = escaner.nextLine();        
        System.out.println("¿Que sitema operativo utilizas? ");
        String sistema = escaner.nextLine();
        System.out.println("Tu nombre es " + nombre +" "+ apellido + "tenes " + edad +" años, te gusta " + hobbie + " como editor de codigo usas " + editor + " en el sistema operativo " + sistema);


        
    }
    
}
