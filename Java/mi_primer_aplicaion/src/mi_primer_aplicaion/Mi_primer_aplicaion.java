
package mi_primer_aplicaion;

import accesorios.Auto;

public class Mi_primer_aplicaion {
    
    
    
    
    public static void main(String[] args) {
        int numeros;
        numeros = 10;
        float resultado;
        resultado = numeros + 17;
        System.out.println(resultado );
        Juego Jugador = new Juego(10, 200, "Mario", "Bowser", "Luigi");
        System.out.println("Nombre " + Jugador.personajes); 
        System.out.println(Jugador.mostrarDatos());
        
        
        Auto miAuto = Auto(250, 4,"azul", "k", "2005", "hjf 436");
    }

   
}
    
    
