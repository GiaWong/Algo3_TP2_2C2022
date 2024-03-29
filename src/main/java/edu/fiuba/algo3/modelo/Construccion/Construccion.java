package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Acciones.Danio;
import edu.fiuba.algo3.modelo.Acciones.Detectable;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Exception.ConstruccionDestruida;
import edu.fiuba.algo3.modelo.Exception.EdificioNoEstaOperativo;
import edu.fiuba.algo3.modelo.Exception.NoCumplePrerequisito;
import edu.fiuba.algo3.modelo.Exception.NoHayRecursosSuficientes;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.NodoMineral;
import edu.fiuba.algo3.modelo.Mapa.PaqueteRecursos.*;
import edu.fiuba.algo3.modelo.Mapa.PaqueteTerreno.*;
import edu.fiuba.algo3.modelo.Unidades.Unidad;
import edu.fiuba.algo3.modelo.Unidades.Zangano;

import java.util.ArrayList;
import java.util.List;

public abstract class Construccion {

    protected int tiempoConstruccion;
    protected Coordenada coordenada;
    protected Vida vida;
    protected Detectable defensa = new Detectable();
    protected int costoGas;
    protected  int costoMineral;

    public void construir() {
        tiempoConstruccion--;
    }

    public void estaVivo() throws ConstruccionDestruida {
        if(!(vida.estaVivo())){
            throw new   ConstruccionDestruida();
        }

    }


    public void verificarEdificioOperativo() throws EdificioNoEstaOperativo {
        if(!this.estaDisponible()){
            throw new EdificioNoEstaOperativo();
        }
    }

    public void asignarPosicion(Coordenada coord) { coordenada = coord; }



    public void verificarCompra(int cantidadMinerales, int cantidadGas) {
        int minerales = cantidadMinerales - costoMineral;
        int gas = cantidadGas - costoGas;
        if ((minerales < 0) || (gas < 0)){
            throw new NoHayRecursosSuficientes();
        }
    }

    public void comprar(BancoDeRecursos banco) {
        int minerales = costoMineral;
        int gas = costoGas;
        banco.realizarCompra(minerales, gas);
    }

    public boolean estaDisponible() {
        return tiempoConstruccion <= 0;
    }

    public abstract void esPosibleConstruirEn(Volcan volcan);

    public abstract void esPosibleConstruirEn(NodoMineral nodoMineral);

    public abstract void esPosibleConstruirEn(SinRecurso sinRecurso);


    public abstract void esPosibleConstruirEn(ConEnergia energia);

    public abstract void esPosibleConstruirEn(ConMoho moho);

    public abstract void esPosibleConstruirEn(SinTerreno nada);

    public abstract void recibirDanio(Danio danio);

    public abstract void aumentarSuministro(Suministro suministro);


    public abstract boolean esPrerequisito(Construccion construccion);

    public abstract boolean esPrerequisito(Unidad unidad);

    public abstract void verificarPrerequisito(Mapa mapa) throws NoCumplePrerequisito;

    public abstract void avanzarTurno(Mapa mapa);

    public abstract boolean permiteConstruir(Construccion construccion);

    public abstract boolean permiteConstruir(ReservaProduccion reservaProduccion);

    public abstract boolean permiteConstruir(Guarida guarida);

    public abstract boolean permiteConstruir(Acceso acceso);


    public abstract void permiteConstruirConUnidad(Unidad unidad);

    public abstract void permiteConstruirConUnidad(Zangano zangano);

    public abstract void destruir(Mapa mapa);

    public abstract void esPosibleAgregarUnidad(Unidad unaUnidad);

    public abstract boolean hayLarvaParaEvolucionar();

    public abstract int obtenerVida();


}
