package edu.fiuba.algo3.controlador.raza;

import edu.fiuba.algo3.controlador.mapa.ControladorMapa;
import edu.fiuba.algo3.modelo.Construccion.*;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class ControladorMenuZerg {

    private Menu m2;
    public ControladorMenuZerg() {

    }

    public Menu establecerMenus(Menu m2, int i, int j, ControladorMapa controlMapa) {

        MenuItem m3 = new MenuItem("Criadero");
        MenuItem m4 = new MenuItem("Espiral");
        MenuItem m5 = new MenuItem("Extractor");
        MenuItem m6 = new MenuItem("Guarida");
        MenuItem m7 = new MenuItem("ReservaProduccion");
        m2.getItems().addAll(m3,m4,m5,m6,m7);

        m3.setOnAction(e -> controlMapa.ejecutarCreacion(j, i, new Criadero()));
        m4.setOnAction(e -> controlMapa.ejecutarCreacion(j, i, new Espiral()));
        m5.setOnAction(e -> controlMapa.ejecutarCreacion(j, i, new Extractor()));
        m6.setOnAction(e -> controlMapa.ejecutarCreacion(j, i, new Guarida()));
        m7.setOnAction(e -> controlMapa.ejecutarCreacion(j, i, new ReservaProduccion()));

        return m2;
    }
}
