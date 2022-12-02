package edu.fiuba.algo3.controlador.ventanas;

import edu.fiuba.algo3.vista.PantallaConfiguracionJugador02;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class SiguientePantalla implements EventHandler<ActionEvent> {
    private Stage stage;
    public SiguientePantalla(Stage stage) {
        this.stage=stage;
    }

    @Override
    public void handle(ActionEvent e) {
        PantallaConfiguracionJugador02 inicial = new PantallaConfiguracionJugador02(this.stage);
    }
}
