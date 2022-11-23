package edu.fiuba.algo3.modelo.Unidades;

public interface Defendible {
     boolean esPosibleAtacar(Superficie sup);

     void recibirDanioZerg(Vida vida);

     void recibirDanioProtoss(Vida vida, Escudo escudo);

     int danioTierra();

}
