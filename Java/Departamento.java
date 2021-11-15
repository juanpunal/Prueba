
package personal;


public class Departamento extends Personal{
    
    public String departamento;
    
    
    public Departamento(String nombre, String apellido, String domicilio, int edad, String departamento) {
        super(nombre, apellido, domicilio, edad);
        this.departamento = departamento;
        
    }
    
    public String mostrarDatos(){
        return "Nombre: " + nombre + "\n Apellido: " + apellido + "\n Domicilio "
                + domicilio + "\n Edad: " + edad + "\n Sueldo: " + getSueldo();
    }
    
    
    
}
