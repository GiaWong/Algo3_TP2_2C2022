package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Exception.UnidadNoTargeteable;
import edu.fiuba.algo3.modelo.Mapa.Coordenada;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Unidades.AmoSupremo;
import edu.fiuba.algo3.modelo.Unidades.Zealot;
import edu.fiuba.algo3.modelo.Unidades.Zerling;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class CasoDeUso28Test {

    @Mock
    private Zealot zealot1;
    @Test
    public void  NoSepuedeAtacarAlZelotCuandoEstaInvisible(){
        Zealot zealot = new Zealot();
        Mapa mapa = new Mapa(20,20);
        Zerling zerling = new Zerling();
        Zerling zerling1 = new Zerling();
        Zerling zerling2 = new Zerling();
        Zerling zerling3 = new Zerling();

        Coordenada cord0 =new Coordenada(2,3);
        Coordenada cord1 =new Coordenada(2,4);
        Coordenada cord2 =new Coordenada(3,3);
        Coordenada cord3 =new Coordenada(3,4);


        mapa.agregar(zealot,cord0);
        mapa.agregar(zerling,cord2);
        mapa.agregar(zerling1,cord3); //
        mapa.agregar(zerling2,cord1);
        for(int i=0 ; i<=4;i++) {
            zealot.atacar(zerling);
            zealot.atacar(zerling1);
            zealot.atacar(zerling2);
        }
        assertThrows(UnidadNoTargeteable.class,()->zerling3.atacar(zealot));

    }
    @Test

    public void  SepuedeAtacarAlZelotCuandoEstaInvisiblePeroHayUnAmoSupremoEnRango(){
        Zealot zealot = new Zealot();
        Mapa mapa = new Mapa(20,20);
        Zerling zerling = new Zerling();
        Zerling zerling1 = new Zerling();
        Zerling zerling2 = new Zerling();
        Zerling zerling3 = new Zerling();
        AmoSupremo amo = new AmoSupremo();
        Coordenada cord0 =new Coordenada(2,3);
        Coordenada cord1 =new Coordenada(2,4);
        Coordenada cord2 =new Coordenada(3,3);
        Coordenada cord3 =new Coordenada(3,4);
        Coordenada cord4 =new Coordenada(3,2);

        mapa.agregar(zealot,cord0);
        mapa.agregar(amo,cord1);
        mapa.agregar(zerling,cord2);
        mapa.agregar(zerling1,cord3); //
        mapa.agregar(zerling2,cord4);
        for(int i=0 ; i<=4;i++) {
            zealot.atacar(zerling);
            zealot.atacar(zerling1);
            zealot.atacar(zerling2);
        }
        assertThrows(UnidadNoTargeteable.class,()->zerling3.atacar(zealot));

    }



}
