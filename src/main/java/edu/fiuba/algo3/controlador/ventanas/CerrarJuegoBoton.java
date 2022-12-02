package edu.fiuba.algo3.controlador.ventanas;

import edu.fiuba.algo3.vista.ventanasAuxiliares.VentanaConfirmacion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class CerrarJuegoBoton implements EventHandler<ActionEvent> {
    private Stage stage;
    public CerrarJuegoBoton(Stage stage){
        this.stage=stage;
    }

    @Override
    public void handle(ActionEvent e){
        boolean resultado = VentanaConfirmacion.mostrar("Salir del Juego", "¿Estás seguro de salir del juego?");
        if( resultado){
            this.stage.close();
        }
    }
}
