
package calculadora;

import Operaciones.Operaciones;
import java.util.Scanner;

public class Calculadora {

   
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingresar el primer numero: ");
        float num1 = ingreso.nextFloat();
        System.out.println("Ingresar el segundo numero: ");
        float num2 = ingreso.nextFloat();
        System.out.println("Ingresar la operacion a realizar: ");
        String op = ingreso.next();
        
        Operaciones operacion = new Operaciones(num1,num2,op);
        System.out.println("El resultado es: " + operacion.operaciones());
        
        
        
        
        
    }
    
}
