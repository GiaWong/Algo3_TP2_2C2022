package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.Casilla;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;

import java.util.ArrayList;
import java.util.List;


public class Extractor extends Construccion{

    private final int TIEMPO_CONSTRUCCION = 6;

    private final int GAS_POR_TURNO = 10;
    private int turnos;
    private int gasExtraido;

    private List<Zangano> zanganos = new ArrayList<>();


    @Override
    public void avanzarTurno(int j) {

        this.turnos += j;
        for(int i = 0; i < j; j++){

            this.recolectar();
        }
    }


    @Override
    public boolean estaDisponible() {
        return (this.turnos == TIEMPO_CONSTRUCCION);
    }


    public void recibeDanio(int i) {
    }

    public  Extractor() {
        zanganos.clear();
    }

    public int obtenerVida() {
        return 0;
    }

    public void cargarZerg(Zangano zangano) {
        zanganos.add(zangano);
    }

    public void recolectar() {
        gasExtraido += (GAS_POR_TURNO * zanganos.size());
    }

    public int gasRecolectado() {
        return 0;
    }
}
