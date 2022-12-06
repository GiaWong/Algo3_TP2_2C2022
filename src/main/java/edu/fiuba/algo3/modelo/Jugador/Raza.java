package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Comandos.Accion;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Turno.Turno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

import java.util.Hashtable;

public abstract class Raza {

    protected Suministro suministro = new Suministro(200);

    protected BancoDeRecursos banco = new BancoDeRecursos();
    protected Accion comando;

    protected Hashtable<String, Accion> acciones = new Hashtable<String, Accion>();

    public void comprar(Construccion construccion) {
        banco.comprar(construccion);
        suministro.agregar(construccion);
    }

    public void comprar(Unidad unidad) {
        banco.comprar(unidad);
        suministro.agregar(unidad);
    }

    public  int capacidadActual(){
        return suministro.capacidadActual();
    }

    public  int capacidadTotal(){
        return suministro.capacidadTotal();
    }

    public void ejecutarAccion() {
        comando.ejecutar();
    }
    
    public void asignarAccion(Accion unaAccion) {
        comando = unaAccion;
    }
    
    public abstract void elegirAccion(Turno turno, Mapa mapa);

}
