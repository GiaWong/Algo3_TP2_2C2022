package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.ventanas.CerrarJuegoBoton;
import edu.fiuba.algo3.controlador.ventanas.CerrarJuegoVentana;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PantallaInicial {
    private Stage stage;
    Button botonEmpezar = new Button("Empezar a jugar");
    Button botonInstrucciones = new Button("Instrucciones");
    Button botonSalir = new Button("Salir");

    public PantallaInicial(Stage stage) {
        this.stage = stage;
        this.generarVista();

    }

    public void generarVista() {
        //para cuando se haga click en los botones
        botonEmpezar.setOnAction(e -> {
            new PantallaConfiguracionJugador01(this.stage);
        });
        botonInstrucciones.setOnAction(e -> PantallaInstrucciones.mostrar());

        //Creo los Controladores
        CerrarJuegoVentana cerrarVentana = new CerrarJuegoVentana(botonSalir);
        CerrarJuegoBoton cerrarBoton = new CerrarJuegoBoton(this.stage);

        //Accion al cerrar la ventana con la x
        stage.setOnCloseRequest(cerrarVentana);
        botonSalir.setOnAction(cerrarBoton);

        //armado de los contendores visuales
        VBox vbox = new VBox();
        Separator sep = new Separator();
        VBox cajaVertical = new VBox(botonEmpezar, botonInstrucciones, botonSalir);


        cajaVertical.setSpacing(10.0d);
        cajaVertical.setAlignment(Pos.CENTER);
        cajaVertical.setPadding(new Insets(40));
        VBox.setVgrow(cajaVertical, Priority.ALWAYS);

        vbox.getChildren().addAll(cajaVertical, sep);
        //el codigo de color fue sacado de: https://paletadecolores.online/verde/oliva/
        vbox.setBackground(new Background(new BackgroundFill(Color.web("#272b00"), new CornerRadii(0), new Insets(0))));


        Scene inicial = new Scene(vbox, 1920, 1080);//ancho-largo
        this.stage.setScene(inicial);
        this.stage.show();

    }
}
