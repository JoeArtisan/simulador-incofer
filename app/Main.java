
package app;

public class Main {
        
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Simulador simulador = Simulador.getInstance();
        simulador.inicializar();
    }
}