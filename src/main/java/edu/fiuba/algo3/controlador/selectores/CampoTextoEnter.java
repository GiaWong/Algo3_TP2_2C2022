package edu.fiuba.algo3.controlador.selectores;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class CampoTextoEnter implements EventHandler<KeyEvent> {
    private final TextField campoTexto;
    private final Label label;
    String mensajeIncorrecto;
    public CampoTextoEnter(TextField nombreObtenido, Label validacionNombre) {
        this.campoTexto = nombreObtenido;
        this.label = validacionNombre;
        this.mensajeIncorrecto = ": Invalido. Ingrese un nombre no vacio y con longitud mayor o igual a 6 caracteres";
    }

    @Override
    public void handle(KeyEvent keyEvent) {
        if(keyEvent.getCode() == KeyCode.ENTER){
            new CampoTextoBoton(this.campoTexto, this.label).handle(new ActionEvent());
        }
    }
    public void setMensajeIncorrecto(String msj){
        this.mensajeIncorrecto=msj;
    }
}
