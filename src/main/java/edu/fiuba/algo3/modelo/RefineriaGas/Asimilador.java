package edu.fiuba.algo3.modelo.RefineriaGas;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class  Asimilador extends Construccion {

    private boolean contieneGas = false;
    private Turno turno;
    private final int tamanio;
    public Asimilador(int tamanio) {
        super();
        this.tamanio = tamanio;
    }

    public void conGasVespeno(GasVespeno gasVespeno) {
        this.contieneGas = true;
    }

    public boolean contieneGas() {

        return this.contieneGas;
    }

    public void prepararCapsulaDeGas(Turno turno) {
        this.turno = turno;
    }

    public int conProduccionGas() {
        return this.turno.getCantidad();
    }

    @Override
    public void empezarAConstruirSegun(Alcance alcance, Turno turno) {
        if(alcance.estaEnRangoDelRadio(this.tamanio)) {
            if (turno.getCantidad() == 6) {
                this.ESTADO_CONSTRUCCION = true;
            }
        }
    }
}
