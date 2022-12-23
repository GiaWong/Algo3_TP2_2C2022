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

        m3.setOnAction(e -> controlMapa.ejecutarCreacion(j, i, new Pilon()));
        m4.setOnAction(e -> controlMapa.ejecutarCreacion(j, i, new NexoMineral()));
        m5.setOnAction(e -> controlMapa.ejecutarCreacion(j, i, new Asimilador()));
        m6.setOnAction(e -> controlMapa.ejecutarCreacion(j, i, new Acceso()));
        m7.setOnAction(e -> controlMapa.ejecutarCreacion(j, i, new PuertoEstelar()));

        /*
        Asigno la accion? o la ejecuto de una?

        m3.setOnAction(e -> controlPartida.asignarAccion(new CreacionPilon(raza, new Coordenada(i,j), mapa));
        m4.setOnAction(e -> controlPartida.asignarAccion(new CreacionNexoMineral(raza, new Coordenada(i,j), mapa));
        m5.setOnAction(e -> controlPartida.asignarAccion(new CreacionAsimilador(raza, new Coordenada(i,j), mapa));
        m6.setOnAction(e -> controlPartida.asignarAccion(new CreacionAcceso(raza, new Coordenada(i,j), mapa));
        m7.setOnAction(e -> controlPartida.asignarAccion(new CreacionPuertoEstelar(raza, new Coordenada(i,j), mapa));
         */

        return m2;
    }
}
