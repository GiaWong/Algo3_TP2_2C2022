package edu.fiuba.algo3.modelo.RefineriaGas;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Zerg.Zangano;

public class Extractor extends Construccion{

    private boolean contieneGas = false;
    private Zangano zangano;

    public Extractor(GasVespeno tamanio) {
        super();

    }




    public void conGasVespeno(GasVespeno gasVespeno) {
        this.contieneGas = true;
    }

    public boolean contieneGas() {
        return this.contieneGas;
    }

    public void producirGas(Zangano zangano, Turno turno) {
        this.zangano = zangano;
    }
    public int conProduccionDeGas() {
        return  this.zangano.getCantidad();
    }

    @Override
    public void avanzarTurno(int i) {

    }

    @Override
    public void empezarAConstruirSegun(Alcance alcance, Turno turno) {
        if(alcance.estaEnRangoDelRadio()) {
            if (turno.getCantidad() == 6) {
                this.ESTADO_CONSTRUCCION = true;
            }
        }
    }
}
