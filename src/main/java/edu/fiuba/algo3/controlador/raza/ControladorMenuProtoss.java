package edu.fiuba.algo3.controlador.raza;

import edu.fiuba.algo3.controlador.mapa.ControladorMapa;
import edu.fiuba.algo3.modelo.Construccion.*;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class ControladorMenuProtoss {
    public Menu establecerMenus(Menu m2, int i, int j, ControladorMapa controlMapa) {

        MenuItem m3 = new MenuItem("Pilon");
        MenuItem m4 = new MenuItem("Nexo");
        MenuItem m5 = new MenuItem("Asimilador");
        MenuItem m6 = new MenuItem("Acceso");
        MenuItem m7 = new MenuItem("PuertoEstelar");
        m2.getItems().addAll(m3,m4,m5,m6,m7);

        int finalJ1 = j;
        int finalI1 = i;
        m3.setOnAction(e -> controlMapa.ejecutarCreacion(finalJ1, finalI1, new Pilon()));
        m4.setOnAction(e -> controlMapa.ejecutarCreacion(finalJ1, finalI1, new NexoMineral()));
        m5.setOnAction(e -> controlMapa.ejecutarCreacion(finalJ1, finalI1, new Asimilador()));
        m6.setOnAction(e -> controlMapa.ejecutarCreacion(finalJ1, finalI1, new Acceso()));
        m7.setOnAction(e -> controlMapa.ejecutarCreacion(finalJ1, finalI1, new PuertoEstelar()));

        return m2;
    }
}
