package edu.fiuba.algo3.modelo.Construccion;

import edu.fiuba.algo3.modelo.Unidades.*;

public class Larva implements Mutador{
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
}
