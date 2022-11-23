package edu.fiuba.algo3.modelo.Unidades;

public class AtaqueTierra implements Danio{
    private int danioTierra;

    public AtaqueTierra(int tierra){
        danioTierra =tierra;
    }

    public boolean esPosibleAtacar(Superficie sup) {
        Superficie tierra = new Tierra();
        return tierra.getClass().equals(sup.getClass());

    }



    public void hacerDanioZerg(Vida vida) {
        vida.inflijirDanio(danioTierra);
    }

    public void hacerDanioProtoss(Vida vida,Escudo escudo) {
        escudo.inflijirDanio(danioTierra);
        if(escudo.estaVivo()) {
            vida.inflijirDanio(danioTierra);
        }
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
