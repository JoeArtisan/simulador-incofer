package constructores;

import recorridos.Horario;
import componentes.Tren;
import recorridos.Dia;
import recorridos.Recorrido;
import recorridos.Trayecto;

public class ConstructorRecorrido implements BaseRecorrido {
    private Trayecto trayecto;   
    private Dia dia; 
    private Tren tren;   
    private Horario horario;
    
    @Override
    public void setTrayecto(Trayecto trayecto) {
        this.trayecto = trayecto;
    }

    @Override
    public void setDia(Dia dia) {
        this.dia = dia;
    }

    @Override
    public void setTren(Tren tren) {
        this.tren = tren;
    }

    @Override
    public void setHorario(Horario horario) {
        this.horario = horario;
    }   
  
    public Recorrido getResult() {
        return new Recorrido(trayecto, dia, tren, horario);
    }
}
