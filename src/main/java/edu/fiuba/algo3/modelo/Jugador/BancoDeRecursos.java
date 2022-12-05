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
        try{
            construccion.verificarCompra(bancoMineral, bancoGasVespeno);

        } catch (NoHayRecursosSuficientes e) {
            System.out.println("No hay recursos suficientes para comprar esta construcción.");
        }
        construccion.comprar(this);
    }
    public void comprar(Unidad unidad) { // Tiene que ser parecido al metodo de arriba
        List<Integer>costos = unidad.costo(); //Creo que esto se soluciona delegando a Unidad la compra
        int minerales = bancoMineral - costos.get(0);
        int gas = bancoGasVespeno - costos.get(1);
        if ((minerales >= 0) && (gas >= 0)){
            bancoMineral -= costos.get(0);
            bancoGasVespeno -= costos.get(1);
        } else {
            throw new NoHayRecursosSuficientes();
        }
    }

    public void realizarCompra(int cantidadMinerales, int cantidadGas) {
        bancoMineral -= cantidadMinerales;
        bancoGasVespeno -= cantidadGas;
    }


}
