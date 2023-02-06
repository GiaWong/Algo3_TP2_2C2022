package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.*;
import edu.fiuba.algo3.modelo.Construccion.*;
import edu.fiuba.algo3.modelo.Exception.NoHayRecursosSuficientes;
import edu.fiuba.algo3.modelo.Jugador.BancoDeRecursos;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;

import java.util.ArrayList;
import java.util.List;

public abstract class Unidad {

    protected Vida vida;

    protected int tiempoConstruccion;

    protected int rango;

    protected Superficie superficie;

    protected Atacador atacador;

    protected Coordenada coordenada;

    protected Defensa defensa = new Detectable();

    protected int costoMineral;

    protected int costoGas;

    public void construir() {
        tiempoConstruccion--;
    }

    public void asignarPosicion(Coordenada coord) { coordenada = coord; }

    public int vida() {return vida.vidaActual();}

    public void avanzarTurno(){
        tiempoConstruccion--;
    }


    public boolean estaDisponible() {
        return (tiempoConstruccion<=0);
    }

    public boolean esPosibleSerAtacadoPor(Atacador ataque){
        return ataque.esPosibleAtacar(superficie);
    }

    public  void detectado(){

    }

    public boolean estaEnRango(Coordenada otraCoord){
        return coordenada.estaEnRango(otraCoord, rango);
    }

    public boolean estaVivo() {
        return vida.tieneVida();
    }



    public abstract void atacar(Unidad unaUnidad);

    public abstract void atacar(Construccion unaConstruccion);

    public abstract void recibirDanio(Danio danio);

    public abstract void esPosibleMoverseEn(AreaEspacial areaEspacial);

    public abstract void modificarSuministro(Suministro suministro);

    public abstract  void esPosibleConstruir(Construccion construccion);

    public abstract void permiteAgregarConstruccion(NexoMineral nexoMineral);


    public abstract boolean permiteCrear(Acceso acceso);

    public abstract boolean permiteCrear(PuertoEstelar puertoEstelar);

    public abstract boolean permiteCrear(ReservaProduccion reservaProduccion);

    public abstract boolean permiteCrear(Guarida guarida);

    public abstract boolean permiteCrear(Espiral espiral);

    public abstract boolean permiteCrear(Criadero criadero);

    public void verificarCompra(int cantidadMinerales, int cantidadGas) {
        int minerales = cantidadMinerales - costoMineral;
        int gas = cantidadGas - costoGas;
        if ((minerales < 0) || (gas < 0)){
            throw new NoHayRecursosSuficientes();
        }
    }

    public void comprar(BancoDeRecursos bancoDeRecursos) {
        int minerales = costoMineral;
        int gas = costoGas;
        bancoDeRecursos.realizarCompra(minerales, gas);
    }
}
