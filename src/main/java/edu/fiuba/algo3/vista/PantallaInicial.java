package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.ventanas.CerrarJuegoBoton;
import edu.fiuba.algo3.controlador.ventanas.CerrarJuegoVentana;
import edu.fiuba.algo3.modelo.Mapa.Mapa;
import edu.fiuba.algo3.modelo.Partida.Partida;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.File;

public class PantallaInicial {
    private final Stage stage;
    private final Partida partida;
    Button botonEmpezar ;
    Button botonInstrucciones ;
    Button botonSalir ;


    public PantallaInicial(Stage stage) {
        this.stage = stage;
        this.botonEmpezar= new Button("Empezar a jugar");
        this.botonInstrucciones = new Button("Instrucciones");
        this.botonSalir = new Button("Salir");
        this.partida = new Partida(new Mapa(20,20));
        this.generarVista();
    }

    public void generarVista() {

        //para cuando se haga click en los botones
        botonEmpezar.setOnAction(e -> new PantallaConfiguracionJugador01(stage, partida));
        botonInstrucciones.setOnAction(e -> PantallaInstrucciones.mostrar());

        //Creo los Controladores
        CerrarJuegoVentana cerrarVentana = new CerrarJuegoVentana(botonSalir);
        CerrarJuegoBoton cerrarBoton = new CerrarJuegoBoton(stage);

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
