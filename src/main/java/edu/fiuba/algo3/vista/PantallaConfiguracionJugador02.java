package edu.fiuba.algo3.vista;


import edu.fiuba.algo3.controlador.selectores.CampoTextoEnter;
import edu.fiuba.algo3.controlador.ventanas.VolverPantallaAnterior;
import edu.fiuba.algo3.modelo.Jugador.Jugador;
import edu.fiuba.algo3.modelo.Jugador.Protoss;
import edu.fiuba.algo3.modelo.Jugador.Raza;
import edu.fiuba.algo3.modelo.Jugador.Zerg;
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
import java.util.Objects;

public class PantallaConfiguracionJugador02 {

    private Stage stage;
    Button botonJugar ;
    Button botonCancelar;
    TextField nombreObtenido;
    private Partida partida;
    private Label validacionNombre;
    private Boolean estadoValido;
    String razaSeleccionada;
    Raza raza;
    String colorSeleccionado;
    String mensaje;

    public PantallaConfiguracionJugador02(Stage stage , Partida unaPartida) {
        this.stage = stage;
        this.partida = unaPartida;
        this.botonJugar = new Button("Jugar");
        this.botonCancelar = new Button("Cancelar");
        this.nombreObtenido = new TextField();
        this.colorSeleccionado = null;
        this.razaSeleccionada = null;
        this.raza = null;
        this.mensaje = null;
        this.estadoValido = false;
        this.validacionNombre = new Label("Debe ser solo 6 caracteres");
        this.generarVista();
    }

    public void generarVista() {

        generarControladores();

        VBox vbox = new VBox();
        VBox.setVgrow(vbox, Priority.ALWAYS );
        Label labelNombreJugador = new Label("Nombre jugador 2:");

        aplicarEstiloDeLetra(labelNombreJugador);

        //TODO: CampoTextoEnter detecta el ENTER y "valida" si es valido el nombre
        CampoTextoEnter enterNombre = new CampoTextoEnter(this.nombreObtenido, validacionNombre);
        this.nombreObtenido.setOnKeyPressed( enterNombre );
        this.nombreObtenido.setMinWidth(200);
        this.nombreObtenido.setPromptText("Ingrese un nombre");



        Label labelRaza = new Label("Elegir Raza:");
        aplicarEstiloDeLetra(labelRaza);
        ObservableList<String> listaRaza = FXCollections.observableArrayList("Zergs", "Protoss");
        ComboBox<String> comboRaza = new ComboBox<>(listaRaza);

        //TODO: capturar la opcion elejida y guardarlo en un atributo
        capturarSeleccionRaza(comboRaza);

        Label labelColor = new Label("Elegir Color:");
        aplicarEstiloDeLetra(labelColor);
        ObservableList<String> listaColores = FXCollections.observableArrayList("Rojo", "Azul", "Amarillo", "Verde");
        ComboBox<String> comboColores = new ComboBox<>(listaColores);

        //TODO: capturar la opcion elejida y guardarlo en un atributo
        capturarSeleccionColores(comboColores);


        if(nombreObtenido.getText().length() > 6){ //para que  no le tome como longitud cero
            this.partida.agregarJugador(nombreObtenido.getText(), this.colorSeleccionado, this.raza);

        }



        HBox horizontalRaza = new HBox(labelRaza, comboRaza);
        horizontalRaza.setSpacing(10.0d);
        horizontalRaza.setAlignment(Pos.CENTER);
        horizontalRaza.setPadding(new Insets(40));

        HBox horizontalColor = new HBox(labelColor, comboColores);
        horizontalColor.setSpacing(10.0d);
        horizontalColor.setAlignment(Pos.CENTER);
        horizontalColor.setPadding(new Insets(20));

        HBox horizontalJugador = new HBox(labelNombreJugador, nombreObtenido);
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


        //genero fondo pantalla
        File fileFondo = new File("imagenes/imagenRegistro2.png");

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

    private void capturarSeleccionColores(ComboBox<String> comboColores) {

        comboColores.setOnAction(e -> {
            this.colorSeleccionado = comboColores.getValue();
            System.out.print("\nSe seleccionó el color: " + this.colorSeleccionado);
        });
    }
    private void capturarSeleccionRaza(ComboBox<String> comboRaza) {

        comboRaza.setOnAction(e -> {
            this.razaSeleccionada = comboRaza.getValue();
            System.out.print("\nSe seleccionó la raza: " + this.razaSeleccionada);
        });

        //ver el tema para que no se repita la raza con el jugador 1
        if(Objects.equals(this.razaSeleccionada, "Zergs")){
            this.raza = new Zerg();

        }else{
            this.raza = new Protoss();
        }

    }

    private void aplicarEstiloDeLetra(Label label) {

        label.setFont(Font.font("monserrat", 13));
        label.setTextFill(Color.WHITE);
        label.setStyle("-fx-font-weight: bold");
    }

    private void generarControladores() {

        VolverPantallaAnterior pantallaAnterior = new VolverPantallaAnterior(this.stage);
        botonCancelar.setOnAction(pantallaAnterior);

        botonJugar.setOnAction(e -> {
            confirmacionDeDatos();
            if(estadoValido){
                new PantallaMapa(this.stage).mostrarMapa();
            }
        });
    }

    private void confirmacionDeDatos() {

        if(nombreObtenido.getText().length() == 0){
            mensaje = "Falta escribir el nombre del Jugador";
        }
        if(nombreObtenido.getText().length() < 6){
            mensaje = "El nombre debe ser mayor de 6 caracteres";
        }

        if(colorSeleccionado == null){
            mensaje = "Falta escoger el color";
        }

        if(razaSeleccionada == null){
            mensaje = "Falta escoger la raza";
        }

        //que salga una ventana de emergencia
        if((nombreObtenido.getText().length() == 0) || (nombreObtenido.getText().length() < 6) || (colorSeleccionado == null) || (razaSeleccionada == null)){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setTitle("UPSS");
            alert.setContentText(mensaje);
            alert.showAndWait();
        }




        //debe estar en estado valido
        if((nombreObtenido.getText().length() > 6)  & (colorSeleccionado != null) & (razaSeleccionada != null)){

            //validarDatosRepetidos();
            this.estadoValido = true;
        }

    }

    /**
     * Falta ver el tema de qu no se rpitan los datos con el jugador1
     */

    private void validarDatosRepetidos() {

        Jugador primerJugador = this.partida.primerJugador();

        if (primerJugador.tieneMismoNombre(nombreObtenido.getText())) {
            mensaje = "Ya existe el mismo nombre, elije otro nombre para el jugador";
        }
        if (primerJugador.tieneMismaRaza(this.raza)) {
            mensaje = "Ya existe esa Raza, elije otra";
        }
        if (primerJugador.tieneMismoColor(colorSeleccionado)) {
            mensaje = "Ya existe el mismo color, elije otro color distinto a lo actual";
        }

        //que salga una ventana de emergencia
        if ((primerJugador.tieneMismoNombre(nombreObtenido.getText()))  || (primerJugador.tieneMismaRaza(this.raza)) || (primerJugador.tieneMismoColor(colorSeleccionado))) {
           confirmacionDeDatos();
        }

        if ((!primerJugador.tieneMismoNombre(nombreObtenido.getText())) & (!primerJugador.tieneMismaRaza(this.raza)) & (!primerJugador.tieneMismoColor(colorSeleccionado))) {
            this.estadoValido = true;
        }
    }
}
