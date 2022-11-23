package edu.fiuba.algo3.modelo.Unidades;

public class AtaqueAireyTierra implements Defendible {
    private int danioTierra;
    private int danioAire;
    private int danioInfligir;

    public AtaqueAireyTierra(int tierra,int aire){
        danioAire = aire;
        danioTierra = tierra;
    }

    public boolean esPosibleAtacar(Superficie sup) {
        Superficie air = new Aire();
        if(air.getClass().equals(sup.getClass())){
            danioInfligir = danioAire;
        }
        else {
            danioInfligir = danioTierra;
        }
        return true;
    }


    public void recibirDanioZerg(Vida vida) {
        vida.inflijirDanio(danioInfligir);
    }

    @Override
    public void recibirDanioProtoss(Vida vida, Escudo escudo) {
        escudo.inflijirDanio(danioInfligir);
        if(escudo.estaVivo()) {
            vida.inflijirDanio(danioInfligir);
        }
    }

    @Override
    public int danioTierra() {
        return danioTierra;
    }
}
