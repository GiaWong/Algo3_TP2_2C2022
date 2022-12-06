package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.ventanas.SiguientePantalla;
import edu.fiuba.algo3.controlador.ventanas.VolverPantallaAnterior;
import edu.fiuba.algo3.modelo.Partida.Partida;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.File;

public class PantallaConfiguracionJugador01 {

    private Stage stage;
    Button botonContinuar = new Button("Continuar");
    Button botonCancelar = new Button("Cancelar");
    private Partida partida;

    public PantallaConfiguracionJugador01(Stage stage, Partida unaPartida) {
        this.stage = stage;
        this.partida=unaPartida;
        this.generarVista();

    }

    public void generarVista() {

        this.genrarControladores();

        VBox vbox = new VBox();
        VBox.setVgrow(vbox, Priority.ALWAYS );


        Label labelNombreJugador = new Label("Nombre jugador 1:");
        this.aplicarEstiloDeLetra(labelNombreJugador);
        TextField nombrePrimerJugador = new TextField();


        Label labelRaza = new Label("Elegir Raza:");
        this.aplicarEstiloDeLetra(labelRaza);
        ObservableList<String> listaRaza = FXCollections.observableArrayList("Zergs", "Protoss");
        ComboBox<String> comboRaza = new ComboBox<>(listaRaza);


        Label labelColor = new Label("Elegir Color:");
        this.aplicarEstiloDeLetra(labelColor);
        ObservableList<String> listaColores = FXCollections.observableArrayList("Rojo", "Azul", "Amarillo", "Verde");
        ComboBox<String> comboColores = new ComboBox<>(listaColores);



        HBox horizontalRaza = new HBox(labelRaza, comboRaza);
        horizontalRaza.setSpacing(10.0d);
        horizontalRaza.setAlignment(Pos.CENTER);
        horizontalRaza.setPadding(new Insets(40));

        HBox horizontalColor = new HBox(labelColor, comboColores);
        horizontalColor.setSpacing(10.0d);
        horizontalColor.setAlignment(Pos.CENTER);
        horizontalColor.setPadding(new Insets(20));

        HBox horizontalJugador = new HBox(labelNombreJugador, nombrePrimerJugador);
        horizontalJugador.setSpacing(10.0d);
        horizontalJugador.setAlignment(Pos.CENTER);
        horizontalJugador.setPadding(new Insets(20));

        Separator sep = new Separator();

        ButtonBar buttonBar = new ButtonBar();
        buttonBar.setPadding( new Insets(10) );

        buttonBar.setButtonData(botonContinuar, ButtonBar.ButtonData.OK_DONE);
        buttonBar.setButtonData(botonCancelar, ButtonBar.ButtonData.CANCEL_CLOSE);
        buttonBar.getButtons().addAll(botonContinuar, botonCancelar);


        VBox cajaVertical01 = new VBox(horizontalJugador,horizontalRaza,horizontalColor);
        VBox.setVgrow(cajaVertical01, Priority.ALWAYS );
        cajaVertical01.setAlignment(Pos.CENTER);



        //genero fondo pantalla
        File fileFondo = new File("imagenes/imagenRegistro1.png");

        BackgroundImage primerBackGro = new BackgroundImage(new Image(fileFondo.toURI().toString(),
                1920, 1080,true,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);


        VBox cajaVertical02 = new VBox(cajaVertical01,sep);
        cajaVertical02.setBackground( new Background(primerBackGro) );
        cajaVertical02.setAlignment(Pos.CENTER);


        VBox.setVgrow(cajaVertical02, Priority.ALWAYS );
        cajaVertical02.setSpacing(30.0d);
        vbox.setBackground(new Background(primerBackGro));
        vbox.getChildren().addAll(cajaVertical02, buttonBar );

        Scene secundario = new Scene(vbox,1920,1080);//ancho-largo
        this.stage.setScene(secundario);
        this.stage.show();
    }

    private void aplicarEstiloDeLetra(Label label) {

        label.setFont(Font.font("monserrat", 13));
        label.setTextFill(Color.WHITE);
        label.setStyle("-fx-font-weight: bold");
    }

    private void genrarControladores() {

        VolverPantallaAnterior pantallaAnterior = new VolverPantallaAnterior(this.stage);
        botonCancelar.setOnAction(pantallaAnterior);
        SiguientePantalla pantallaSiguiente = new SiguientePantalla(this.stage);
        botonContinuar.setOnAction(pantallaSiguiente);
    }
}
