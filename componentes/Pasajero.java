package componentes;

public class Pasajero {
    private int edad;

    public Pasajero() {
        this.edad = establecerEdad();
    } 
    
    public int obtenerEdad(){
        return (int) edad;
    }
    
    private int establecerEdad(){
        return (int) Math.floor((Math.random()* 90) + 1);
    }
}