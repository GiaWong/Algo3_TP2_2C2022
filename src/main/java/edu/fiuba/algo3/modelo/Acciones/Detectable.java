package edu.fiuba.algo3.modelo.Acciones;

public class Detectable implements Defensa {


    @Override
    public void recibirDanio(Danio danio, Vida vida, Escudo escudo) {
        danio.hacerDanio(vida, escudo);
    }

    @Override
    public void recibirDanio(Danio danio, Vida vida) {
        danio.hacerDanio(vida);
    }
}
