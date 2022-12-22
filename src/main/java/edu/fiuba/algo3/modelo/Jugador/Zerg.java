package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Comandos.Accion;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionZerg;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Unidades.UnidadZerg;

import java.util.Dictionary;

public class Zerg extends Raza {

    public Zerg() {
        //Accion crearCriadero = new CreacionCriadero(this, new Coordenada(1,1), new Mapa(20,20)); //Como hago para tener todos los comandos??
        //comandos.put("crear criadero",crearCriadero);                                                                                      //Hace falta que le pase toodo por parametro?
    }

    public Zerg(BancoDeRecursos bancoDeRecurso){
        this.banco  = bancoDeRecurso;
    }

    public void agregar(ConstruccionZerg construccion, Coordenada coordenada, Mapa mapa) { //Teniendo ahora comandos, nose si va a hacer falta usar este metodo
        this.comprar(construccion);
        mapa.agregar(construccion, coordenada);
        mapa.aumentarEdificioZerg();
    }

    public void agregar(UnidadZerg unidad, Coordenada coordenada, Mapa mapa) {
        this.comprar(unidad);
        mapa.agregar(unidad, coordenada);
    }

    public void criaderoDestruido (){
        suministro.disminuirCapacidad(5);
    }

    public void amoDestruido() {
        suministro.disminuirCapacidad(5);
    }

    @Override
    public String nombre() {
        return "Zergs";
    }

    @Override
    public boolean tieneConstrucciones(Mapa mapa) {
        return mapa.tieneConstruccionesZerg();
    } //Capaz que se tiene que encargar el suministro
    // Si no se encarga suministro, cuando el jugador alcanze su maximo de suministro
    // y si se mueren construcciones, no va a poder seguir construyendo.
}
