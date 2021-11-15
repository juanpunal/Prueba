
package escueladigital;


public class Campus {
    public int id;
    public String nombre;
    private String password;
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    Campus(int id, String nombre){
        
        this.id = id;
        this.nombre = nombre;
        
    }
    
    public boolean ingresar(int id, String password){
        return this.id == id && (this.password == null ? password == null : this.password.equals(password));
        
    }
    
}
