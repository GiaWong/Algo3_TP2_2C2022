package edu.fiuba.algo3.modelo.Mapa.PaqueteCasilla;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.NexoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.Terreno;
import edu.fiuba.algo3.modelo.Recursos.NodoMineral;

public class ConNodoMineral extends Casilla{

    private NodoMineral nodo;

    public void recolectar(){

    }

    @Override
    public void agregarConstruccion(Construccion unaConstruccion) {
        //verifica que es de tipo Refineria (mineral)
        NexoMineral nexo = new NexoMineral();

        boolean esNexoMineral;
        esNexoMineral = (unaConstruccion.getClass().equals(nexo.getClass()));

        if(esNexoMineral) {
            construccion = unaConstruccion;
        }
    }

    @Override
    public void setTerreno(Terreno unTerreno) {
        terreno = unTerreno;
    }
}
