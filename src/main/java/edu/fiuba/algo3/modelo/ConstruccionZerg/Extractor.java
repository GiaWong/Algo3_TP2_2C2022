package edu.fiuba.algo3.modelo.ConstruccionZerg;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Unidades.Zangano;
import java.util.ArrayList;
import java.util.List;

public class Extractor extends  ConstruccionZerg {

    private List<Zangano> zanganos = new ArrayList<Zangano>();

    public Extractor(){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        Vida_Total = 750;
        vida = Vida_Total;
        tiempoConstruccion = 6;
    }
    public void agregar(Zangano unZangano){
        if (this.estaDisponible() && zanganos.size() < 3){
            zanganos.add(unZangano);
        } else {
            //Lanzar un error o algo
        }
    }

    public int recolectar(Volcan volcan) {
        if (this.estaDisponible()) {
            return volcan.recolectar(zanganos.size() * 10);
        }
        return 0;
    }
    @Override
    public void avanzarTurno() {
        this.regenerarVida();


    }
    public void regenerarVida(){
        if(vida <= (Vida_Total-10)){
            vida += 10;
        }
    }
}
