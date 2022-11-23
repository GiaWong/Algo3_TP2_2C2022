package edu.fiuba.algo3.modelo.Unidades;

public interface Danio {
     boolean esPosibleAtacar(Superficie sup);

     void hacerDanioZerg(Vida vida);

     void hacerDanioProtoss(Vida vida,Escudo escudo);

     int danioTierra();

}
