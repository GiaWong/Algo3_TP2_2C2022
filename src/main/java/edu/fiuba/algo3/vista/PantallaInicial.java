package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.ventanas.CerrarJuegoBoton;
import edu.fiuba.algo3.controlador.ventanas.CerrarJuegoVentana;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;

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




        //genero fondo pantalla
        File fileFondo = new File("imagenes/imagenInicio.png");

        BackgroundImage primerBackGro = new BackgroundImage(new Image(fileFondo.toURI().toString(),
                1920, 1080,true,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);


        cajaVertical.setBackground( new Background(primerBackGro) );
        cajaVertical.setAlignment(Pos.CENTER);
        VBox.setVgrow(cajaVertical, Priority.ALWAYS);
        vbox.getChildren().addAll(cajaVertical, sep);


        Scene inicial = new Scene(vbox, 1920, 1080);//ancho-largo
        this.stage.setScene(inicial);
        this.stage.show();

    }
}
