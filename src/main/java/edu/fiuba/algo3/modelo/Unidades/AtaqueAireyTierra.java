package edu.fiuba.algo3.modelo.Unidades;

public class AtaqueAireyTierra implements Danio{
    private int danioTierra;
    private int danioAire;
    private int danioInfligir;

    public AtaqueAireyTierra(int tierra,int aire){
        danioAire = aire;
        danioTierra = tierra;
    }
    @Override
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

    @Override
    public int danioAInfligir() {
        return danioInfligir;
    }

    @Override
    public int danioTierra() {
        return danioTierra;
    }
}
