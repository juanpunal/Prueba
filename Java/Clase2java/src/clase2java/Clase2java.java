
package clase2java;

import java.util.Scanner;


public class Clase2java {

   
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre: ");       
        String nombre = entrada.nextLine();
        
        /*System.out.println("Ingrese su edad: ");
        int date = entrada.nextInt();
        System.out.println("Bienvenid@" + nombre);
        System.out.println("Edad: " + date);*/
        
        System.out.println("Ingrese su contraseña: ");
        String pass = entrada.nextLine();
        
        Ingreso ingresar = new Ingreso();
        ingresar.setUsuario(nombre);
        ingresar.setPass(pass);
        if(ingresar.validar()){
            System.out.println("Bienvenid@ " + ingresar.getUsuario());
        }else{
            System.out.println("Los datos son incorrectos");
        }
        
        
        
        
    }
    
}
