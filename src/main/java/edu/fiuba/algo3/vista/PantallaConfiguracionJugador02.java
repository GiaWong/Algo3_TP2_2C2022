package edu.fiuba.algo3.vista;


import edu.fiuba.algo3.controlador.ventanas.VolverPantallaAnterior;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PantallaConfiguracionJugador02 extends StackPane {

    private Stage stage;
    Button botonJugar = new Button("Jugar");
    Button botonCancelar = new Button("Cancelar");

    public PantallaConfiguracionJugador02(Stage stage) {
        this.stage = stage;
        this.generarVista();
    }

    public void generarVista() {

        this.generarControladores();

        VBox vbox = new VBox();
        StackPane panel = new StackPane();
        VBox.setVgrow(vbox, Priority.ALWAYS );


        Label labelNombreJugador = new Label("Nombre jugador 2:");
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

        buttonBar.setButtonData(botonJugar, ButtonBar.ButtonData.OK_DONE);
        buttonBar.setButtonData(botonCancelar, ButtonBar.ButtonData.CANCEL_CLOSE);
        buttonBar.getButtons().addAll(botonJugar, botonCancelar);


        VBox cajaVertical01 = new VBox(horizontalJugador,horizontalRaza,horizontalColor);
        VBox.setVgrow(cajaVertical01, Priority.ALWAYS );
        cajaVertical01.setAlignment(Pos.CENTER);

        VBox cajaVertical02 = new VBox(cajaVertical01,sep);
        VBox.setVgrow(cajaVertical02, Priority.ALWAYS );
        cajaVertical02.setSpacing(30.0d);
        vbox.getChildren().addAll(cajaVertical02, buttonBar );

        //el codigo de color fue sacado de: https://paletadecolores.online/verde/oliva/
        vbox.setBackground(new Background(new BackgroundFill(Color.web("#716d71"), new CornerRadii(0), new Insets(0))));

        Scene secundario = new Scene(vbox,1920,1080);//ancho-largo
        this.stage.setScene(secundario);
        this.stage.show();
    }

    private void aplicarEstiloDeLetra(Label label) {

        label.setFont(Font.font("monserrat", 13));
        label.setTextFill(Color.BLACK);
        label.setStyle("-fx-font-weight: bold");
    }

    private void generarControladores() {

        VolverPantallaAnterior pantallaAnterior = new VolverPantallaAnterior(this.stage);
        botonCancelar.setOnAction(pantallaAnterior);
        PantallaMapa pantalla = new PantallaMapa(this.stage);
        botonJugar.setOnAction(pantalla);
    }
}
