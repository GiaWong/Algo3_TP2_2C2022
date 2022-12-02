package edu.fiuba.algo3.controlador.ventanas;

import edu.fiuba.algo3.vista.PantallaInicial;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class VolverPantallaAnterior implements EventHandler<ActionEvent> {
    private Stage stage;
    public VolverPantallaAnterior(Stage stage) {
        this.stage=stage;
    }

    @Override
    public void handle(ActionEvent e) {
        PantallaInicial inicial = new PantallaInicial(this.stage);
    }
}
