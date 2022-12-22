package edu.fiuba.algo3.modelo.Jugador;


import edu.fiuba.algo3.modelo.Comandos.Accion;
import edu.fiuba.algo3.modelo.Construccion.ConstruccionProtoss;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Unidades.UnidadProtoss;


public class Protoss extends Raza {

    public Protoss(){

        /*acciones.put("CrearPilon",new CreacionPilon());
        acciones.put("CrearPuerto",new CreacionPuertoEstelar());
        acciones.put("CrearNexo",new CreacionNexoMineral());
        acciones.put("Ataque", new Ataque());*/

    }
    public Protoss(Suministro suministro){
        this.suministro = suministro;
    }

    public Protoss(BancoDeRecursos bancoDeRecursos){
        this.banco = bancoDeRecursos;
    }

    public void agregar(ConstruccionProtoss construccion, Coordenada coordenada, Mapa mapa) {
        this.comprar(construccion);
        mapa.agregar(construccion, coordenada);
        mapa.aumentarEdificioProtoss();
    }


    public void agregar(UnidadProtoss unidad, Coordenada coordenada, Mapa mapa) {
        this.comprar(unidad);
        mapa.agregar(unidad, coordenada);
    }


    public void pilonDestruido() { suministro.disminuirCapacidad(5);
    }

    @Override
    public String nombre() {
        return "Protoss";
    }

    @Override
    public boolean tieneConstrucciones(Mapa mapa){
        return mapa.tieneConstruccionesProtoss();
    } //Capaz que se tiene que encargar el suministro
    // Si no se encarga suministro, cuando el jugador alcanze su maximo de suministro
    // y si se mueren construcciones, no va a poder seguir construyendo.
}
