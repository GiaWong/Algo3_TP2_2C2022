package edu.fiuba.algo3.modelo.RefineriaGas;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class  Asimilador extends Construccion {

    private Turno turno;


    public Asimilador(GasVespeno gasVespeno) {

    }

    public Asimilador() {

    }


    public boolean contieneGas() {

        return false;
    }

    public void prepararCapsulaDeGas(Turno turno) {
        this.turno = turno;
    }

    public int conProduccionGas() {
        return this.turno.getCantidad();
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
