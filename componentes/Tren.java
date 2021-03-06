package componentes;

import java.util.ArrayList;
import java.util.Iterator;
import componentes.Vagon;
import recorridos.Trayecto;

public class Tren {
    private final ArrayList<Vagon> vagones;
    
    public Tren() {
        vagones = new ArrayList<Vagon>();
        setVagones();
    } 
    
    private void setVagones(){
        for (int i = 1; i < 5; i++) {
            vagones.add(new Vagon(i));
        }
    }
    
    public void desplazarPasajeros(Trayecto trayecto) {
        Iterator<Vagon> v = vagones.iterator();
        
        String ingreso = "Ingreso Pasajeros: " ;
        String bajantes = "Salen Pasajeros: ";
        String sentados = "Sentados Pasajeros: " ;
        
        while (v.hasNext()) {
            Vagon vagon = v.next();
            bajantes += vagon.bajarPasajeros();
            ingreso += vagon.subirPasajeros(trayecto);
            sentados += vagon.sentarPasajeros();
        }
        
        System.out.println(bajantes + "\n" + ingreso + "\n" + sentados);
    }

    
    public void totalPasajeros() {
        Iterator<Vagon> vga = vagones.iterator();
        String transportado = "\nTotal Pasajeros Transportados: ";
        String recaudado = "Total Recaudado: ";
        int tt = 0, tn = 0, tj = 0, tr = 0, ta = 0, rt = 0, rn = 0, rj = 0, rr = 0;
        
        while (vga.hasNext()) {
            Vagon vagon = vga.next();
            tt += vagon.total_transportado;
            tn += vagon.total_transportado_ninos;
            tj += vagon.total_transportado_joven;
            tr += vagon.total_transportado_regular;
            ta += vagon.total_transportado_adulto;
            rt += vagon.total_recaudado;
            rn += vagon.total_recaudado_ninos;
            rj += vagon.total_recaudado_joven;
            rr += vagon.total_recaudado_regular;
        }
        
        String t = transportado.concat(tt + " (Niños "+tn+",").concat("Joven "+tj+",").concat("Regular "+tr+",").concat("Adulto Mayor "+ta+")");
        String r = recaudado.concat(rt + " colones (Niños "+rn+",").concat("Joven "+rj+",").concat("Regular "+rr+",").concat("Adulto Mayor 0)");
        
        System.out.println(t + "\n" + r);
    }
}