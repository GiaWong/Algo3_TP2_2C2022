package edu.fiuba.algo3.controlador.ventanas;

import edu.fiuba.algo3.modelo.Partida.Partida;
import edu.fiuba.algo3.vista.PantallaConfiguracionJugador02;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class SiguientePantalla implements EventHandler<ActionEvent> {
    private final Stage stage;
    private final Partida partida;
    public SiguientePantalla(Stage stage, Partida partida) {

        this.stage=stage;
        this.partida= partida;
    }

    @Override
    public void handle(ActionEvent e) {
        PantallaConfiguracionJugador02 inicial = new PantallaConfiguracionJugador02(this.stage, this.partida);
    }
}
