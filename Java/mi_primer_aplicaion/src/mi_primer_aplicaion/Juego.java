
package mi_primer_aplicaion;


public class Juego{
    
    private int puntos, vidas;
    public String personajes, enemigos, aliados; 
    
    Juego(int puntos, int vidas, String personajes, String enemigos, String aliados) {
        
        this.puntos = puntos;
        this.vidas = vidas;
        this.personajes = personajes;
        this.aliados = aliados;
        this.enemigos = enemigos;
    }
    
    String mostrarDatos(){
        
        return "Hola soy " + this.personajes + " y tengo " + this.vidas + " vidas";
    }
    
    

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
}
