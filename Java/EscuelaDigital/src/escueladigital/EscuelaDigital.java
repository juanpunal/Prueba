
package escueladigital;

import Alumnos.Alumno;
import Docentes.Docente;


public class EscuelaDigital {

    public static void main(String[] args) {
        Docente docente1 = new Docente(14,"Arturo", "Pucci", 35);
        Alumno alumno1 = new Alumno(43,"sol", "Perez", 15, 8);
        
        Campus campus = new Campus(14,"WEB");
        campus.setPassword("123456");
        
        
        Campus docente = new Campus(15,"WEB");
        docente.setPassword("123456docente");
        
        if(docente.ingresar(15, "12456docent")){
            System.out.println("Ingresaste correctamente");
        }
        else{
            System.out.println("Contraseña o Id incorrecto");

        }
        
        
                
                
                
               
    }
    
}
