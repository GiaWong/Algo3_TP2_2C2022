package edu.fiuba.algo3.modelo.Zerg;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Alcance;
import edu.fiuba.algo3.modelo.ConstruccionesConRadio.Moho;
import edu.fiuba.algo3.modelo.Turno.Turno;

public class Criadero extends Construccion {

    private Larva larva;
    private int tiempoEnConstruccion = 0, turnosExpansion = 2;
    private  Moho moho;

    public Criadero() {
        super();
    }

    public Criadero(Moho moho) {
        super();
        this.moho = moho;
    }

    public void iniciar(Larva larva) {
        this.larva = larva;
    }

    public void evolucionar(Zangano zangano) {
        this.larva.restarCantidadLarva(zangano.getCantidad());
    }

    public int obtenerCantidadLarvas() {
        return this.larva.getCantidad();
    }

    public void ampliarRadioMoho(){
        if(turnosExpansion == 0 && this.ESTADO_CONSTRUCCION){
            moho.ampliarRadio();
            turnosExpansion = 2;
        }
    }

    @Override
    public void avanzarTurno(int i){
        tiempoEnConstruccion += i;
        turnosExpansion -=i;
        this.ampliarRadioMoho();
        this.larva.agreegarMasLarvas(i);
        if(tiempoEnConstruccion == 4){
            this.ESTADO_CONSTRUCCION = true;
        }

    }
    public void empezarAConstruirSegun(Alcance alcance, Turno turno) {

        if(alcance.estaEnRangoDelRadio()){
            if(tiempoEnConstruccion == 4){
                this.ESTADO_CONSTRUCCION = true;
            }
        }

    }




    public void empezarAConstruirSegun(Turno turno) {
    }
}
