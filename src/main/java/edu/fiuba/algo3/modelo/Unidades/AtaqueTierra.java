package edu.fiuba.algo3.modelo.Unidades;

public class AtaqueTierra implements Danio{
    private int danioTierra;

    public AtaqueTierra(int tierra){
        danioTierra =tierra;
    }
    @Override
    public boolean esPosibleAtacar(Superficie sup) {
        Superficie tierra = new Tierra();
        return tierra.getClass().equals(sup.getClass());

    }

    @Override
    public int danioAInfligir() {
        return danioTierra;
    }

    @Override
    public int danioTierra() {
        return danioTierra;
    }
}
/*
UnidadAtacante.atacar(unidadAtacada){
    UnidadAtacada.recibirdanio(ataqueTierra)


////
NombrePendiente(ataqueTieerra)
    ataqueTierra.esPos(sup)
        unidadRecibirdanioo(ataqueTierra.danio)
    */
