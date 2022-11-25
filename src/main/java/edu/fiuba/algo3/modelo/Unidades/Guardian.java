package edu.fiuba.algo3.modelo.Unidades;

import edu.fiuba.algo3.modelo.Acciones.Atacador;
import edu.fiuba.algo3.modelo.Acciones.AtaqueTierra;
import edu.fiuba.algo3.modelo.Acciones.Detectable;
import edu.fiuba.algo3.modelo.Acciones.Vida;

import java.util.ArrayList;
import java.util.List;

public class Guardian extends UnidadZerg{
    private int rango;
    private Atacador ataqueTierra;

    public Guardian(){
        vida = new Vida(100);
        tiempoConstruccion = 4;
        rango = 10;
        costos.add(50);
        costos.add(100);
        superficie = new Aire();
        ataqueTierra = new AtaqueTierra(25);

    }

    @Override
    public void modificarEstadisticas(int danio) {
        //vida -= danio;

    }
}
