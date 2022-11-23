package edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno;

import edu.fiuba.algo3.modelo.Construccion.*;

public class ConMoho implements Terreno {

    @Override
    public boolean esPosibleConstruir(Construccion unaConstruccion) {
        unaConstruccion.esPosibleConstruirEn(this);
        /*
        Criadero criadero = new Criadero();
        ReservaProduccion reserva = new ReservaProduccion();
        Extractor extractor = new Extractor();
        Guarida guarida = new Guarida();
        Espiral espiral = new Espiral();
        boolean esCriadero = (unaConstruccion.getClass().equals(criadero.getClass()));
        boolean esReservaProd = (unaConstruccion.getClass().equals(reserva.getClass()));
        boolean esExtractor = (unaConstruccion.getClass().equals(extractor.getClass()));
        boolean esGuarida = (unaConstruccion.getClass().equals(guarida.getClass()));
        boolean esEspiral = (unaConstruccion.getClass().equals(espiral.getClass()));

        if (esCriadero || esReservaProd || esExtractor || esGuarida || esEspiral){
            return true;
        }
        return false;

         */
    }
}
