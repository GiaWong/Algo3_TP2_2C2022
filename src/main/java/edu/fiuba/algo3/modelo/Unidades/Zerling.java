package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.Atacador;
import edu.fiuba.algo3.modelo.Acciones.AtaqueTierra;
import edu.fiuba.algo3.modelo.Acciones.Vida;
import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Construccion.ReservaProduccion;
import edu.fiuba.algo3.modelo.Exception.EstaUnidadNoSeMuevePorAreaEspacial;
import edu.fiuba.algo3.modelo.Jugador.Suministro;
import edu.fiuba.algo3.modelo.Mapa.PaqueteAreas.AreaEspacial;

import java.util.List;

public class Zerling extends UnidadZerg{


    private Construccion preRequisito = new ReservaProduccion();
    public Zerling(){

        vida = new Vida(35);
        tiempoConstruccion = 2;
        rango = 1;
        costos.add(25); //Esto es para Minerales
        costos.add(0); // Esto es para Gas
        superficie = new Tierra();
        atacador =new AtaqueTierra(4);

    }

    public void atacar(Unidad unaUnidad){
        if (unaUnidad.esPosibleSerAtacadoPor(atacador)){
            atacador.atacar(unaUnidad);
        }
    }

    public void atacar(Construccion unaConstruccion){
        atacador.atacar(unaConstruccion);
    }

    @Override
    public void esPosibleMoverseEn(AreaEspacial areaEspacial) {
        throw new EstaUnidadNoSeMuevePorAreaEspacial();
    }

    public boolean preRequisito(List<Construccion> lista) {
        if (lista != null) {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getClass().equals(preRequisito.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void modificarSuministro(Suministro suministro) {
        suministro.aumentarCapacidad(1);
    }
}

