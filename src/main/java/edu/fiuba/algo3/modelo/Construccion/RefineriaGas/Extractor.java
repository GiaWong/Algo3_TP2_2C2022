package edu.fiuba.algo3.modelo.Construccion.RefineriaGas;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.Recursos.GasVespeno;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

public class Extractor implements RefineriaGas{

    private final boolean contieneGas;
    private  int cantidadGas=0;

    public Extractor(GasVespeno gasVespeno) {
        super();
        this.contieneGas = true;
        costeMineral = 100 ;
        costeGasVespeno = 0;

    }


    public boolean contieneGas() {
        return this.contieneGas;
    }

    public void producirGas(Zangano zangano, Turno turno) {

        int GAS_FIJO = 10;
        if(zangano.getCantidad() < 4){
            this.cantidadGas = zangano.getCantidad() * GAS_FIJO;
        }
        if(zangano.getCantidad() > 3){
            this.cantidadGas = GAS_FIJO * 3;
        }
        if(zangano.getCantidad()==0){
            this.cantidadGas = zangano.getCantidad();
        }
    }
    public int conProduccionDeGas() {
        return  this.cantidadGas;
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