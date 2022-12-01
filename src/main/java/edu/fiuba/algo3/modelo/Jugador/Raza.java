package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.Turno.Turno;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

public abstract class Raza {

    protected Suministro suministro = new Suministro(200);
    protected BancoDeRecursos banco = new BancoDeRecursos();


    public void comprar(Construccion construccion) {
        banco.comprar(construccion);
        suministro.agregar(construccion);
    }


    public  int capacidadActual(){
        return suministro.capacidadActual();
    }

    public  int capacidadTotal(){
        return suministro.capacidadTotal();
    }
    public void comprar(Unidad unidad) {
        banco.comprar(unidad);
        suministro.agregar(unidad);

    }

    public void avanzar(Turno turno, Mapa mapa){
        //turno.avanzar(mapa);
        //mapa.avanzar(turno);
    }

    public abstract void recolectar();





}
