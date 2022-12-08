package edu.fiuba.algo3.controlador.selectores;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CampoTextoBoton implements EventHandler<ActionEvent> {
    private final TextField campoTexto;
    private final Label labeel;
    String mensajeIncorrecto;
    public CampoTextoBoton(TextField campoTexto, Label label) {
        this.campoTexto = campoTexto;
        this.labeel = label;
        this.mensajeIncorrecto = ": Invalido. Ingrese un nombre no vacio y con longitud mayor a 6 caracteres";
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(campoTexto.getText().equals("") || campoTexto.getText().length() < 6 ){ //si no cumple con lo basico

            campoTexto.setText("");
            labeel.setText(this.mensajeIncorrecto);
            labeel.setStyle("-fx-text-inner-color: #EF3030");
            campoTexto.setStyle("-fx-background-color: rgba(255,0,0,0.6);");
            System.out.print("\nNombre ingresado NO VALIDO");
        }else{
            //aca deberia setearse el jugador.setNombre(campoTexto.getText())
            labeel.setText("ok");
            labeel.setStyle("-fx-text-inner-color: #7d9707;");
            campoTexto.setStyle("-fx-text-inner-color: #7d9707");
            System.out.print("\nNombre ingresado: " + campoTexto.getText());


        }

    }
    public void setMensajeIncorrecto(String msj){
        this.mensajeIncorrecto = msj;
    }
}
