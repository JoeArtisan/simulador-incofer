package directores;

import componentes.Tren;
import recorridos.Dia;
import recorridos.Trayecto;
import constructores.BaseRecorrido;
import recorridos.Horario;

public class Director {
    
    public void construirRecorrido(BaseRecorrido builder, Trayecto trayecto, Dia dia) {
        builder.setDia(dia);
        builder.setTrayecto(trayecto);
        builder.setTren(new Tren());          
        builder.setHorario(new Horario(trayecto, dia));
    }
}