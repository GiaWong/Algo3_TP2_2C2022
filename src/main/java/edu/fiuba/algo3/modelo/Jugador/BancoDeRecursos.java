package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.Construccion.Construccion;
import edu.fiuba.algo3.modelo.Exception.NoHayRecursosSuficientes;
import edu.fiuba.algo3.modelo.Exception.NoTienesLosMaterialesNecesariosParaCrearEsaUnidad;
import edu.fiuba.algo3.modelo.Unidades.Unidad;

import java.util.List;

public class BancoDeRecursos {
    private int bancoMineral = 200;
    private int bancoGasVespeno = 0;

    public void comprar(Construccion construccion) {
        construccion.verificarCompra(bancoMineral, bancoGasVespeno);
        construccion.comprar(this);
    }
    public void comprar(Unidad unidad) {
        unidad.verificarCompra(bancoMineral, bancoGasVespeno);
        unidad.comprar(this);
    }

    public void realizarCompra(int cantidadMinerales, int cantidadGas) {
        bancoMineral -= cantidadMinerales;
        bancoGasVespeno -= cantidadGas;
    }


}
