
package constructores;

import recorridos.Horario;
import componentes.Tren;
import recorridos.Dia;
import recorridos.Trayecto;

public interface BaseRecorrido {
    void setTrayecto(Trayecto trayecto); 
    void setDia(Dia dia); 
    void setHorario(Horario horario);    
    void setTren(Tren tren);
}