package edu.fiuba.algo3.modelo.Construccion;


import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.*;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.SinRecurso;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.Volcan;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConEnergia;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.ConMoho;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.SinTerreno;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

import java.util.ArrayList;
import java.util.List;

public class Extractor extends ConstruccionZerg implements RefineriaGas{

    private List<Zangano> zanganos = new ArrayList<>();

    public Extractor(){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(750);
        tiempoConstruccion = 6;
    }

    public Extractor(int tiempoDeConstruccion){
        costos.add(100); //esto es para Mineral
        costos.add(0); //esto es para Gas
        vida = new Vida(750);
        tiempoConstruccion = tiempoDeConstruccion;
    }

    public void agregarZangano(Zangano unZangano) {
        /*
        try {
            //verificarEdificioOperativo();
        } catch (Exception EdificioNoEstaOperativo){
            System.out.println("Este edificio no está operativo aún.");
        }
        try {
            zanganos.add(unZangano);
        } catch (Exception NoSePuedeAgregarOtroZangano){
            System.out.println("Extractor completo. No se puede agregar otro zángano.");
        }

         */
        if (this.estaDisponible() && zanganos.size() < 3){
            zanganos.add(unZangano);
        }
    }

    public int obtenerVida() {return 0; }

    public void regenerarVida(){
        vida.regenerarSalud(5);
    }

    @Override
    public int recolectar(Volcan volcan) {
        if (!zanganos.isEmpty()) {
            return volcan.recolectar(zanganos.size() * 10);
        }
        return 0;
    }

    @Override
    public void avanzarTurno() {
        this.regenerarVida();

    }

    @Override
    public void esPosibleConstruirEn(Volcan volcan) {

    }

    @Override
    public void esPosibleConstruirEn(NodoMineral nodoMineral) {
        throw new ErrorEsteEdificioSoloSeConstruyeEnUnRecurso();
    }

    @Override
    public void esPosibleConstruirEn(SinRecurso sinRecurso) {
        throw new ErrorEsteEdificioSoloSeConstruyeEnUnRecurso();
    }

    @Override
    public void esPosibleConstruirEn(ConEnergia energia) {
        throw new NoHayMoho();
    }

    @Override
    public void esPosibleConstruirEn(ConMoho moho) {

    }

    @Override
    public void esPosibleConstruirEn(SinTerreno nada) {
        throw new NoHayMoho();
    }

    @Override
    public void aumentarSuministro(Suministro suministro) {

    }

}
