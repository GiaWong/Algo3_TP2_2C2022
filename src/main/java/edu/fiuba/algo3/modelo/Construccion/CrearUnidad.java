package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Unidades.*;

public class CrearUnidad implements Creador{
    @Override
    public Unidad crearZangano() {
        return new Zangano();
    }

    @Override
    public Unidad crearZerling() {
        return new Zerling();
    }

    @Override
    public Unidad crearHidralisco() {
        return new Hidralisco();

    }

    @Override
    public Unidad crearMutalisco() {
        return new Mutalisco();

    }

    @Override
    public Unidad crearZealot() {
        return new Zealot();

    }

    @Override
    public Unidad crearDragon() {
        return new Dragon();

    }

    @Override
    public Unidad crearScout() {
        return new Scout();

    }
}
