package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.ventanas.CerrarJuegoBoton;
import edu.fiuba.algo3.controlador.ventanas.CerrarJuegoVentana;
import edu.fiuba.algo3.controlador.ventanas.VolverPantallaAnterior;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.File;


public class PantallaMapa implements EventHandler<ActionEvent> {
    private Stage stage;
    private int base ;
    private int altura;
    private GridPane panel;

    public PantallaMapa(Stage stage) {
        this.stage=stage;
        this.panel = new GridPane();
        //this.mapa = new Mapa(30, 20);
        this.base = 30;
        this.altura = 20;
        mostrarMapa();



    }

    @Override
    public void handle(ActionEvent actionEvent) {
        mostrarMapa();
    }

    private void mostrarMapa() {



        for(int i=0; i< base; i++){
            for(int j=0; j< altura; j++){


                /*
                ****BORRADOR****
                Casilla con una figurita
                Rectangle manzana = new Rectangle(30,30, Color.GREY);
                manzana.setStroke(Color.DARKGRAY);
                manzana.setStrokeWidth(5);
                * */

                //casillas con botones
                Button boton = new Button();
                boton.setPrefSize(30, 35);
                boton.alignmentProperty();
                boton.setOnAction(e -> realizarAccion(boton)); //para cuando se haga click en los botones
                this.panel.add(boton, i, j);
            }
        }

        //configurando panel
        this.panel.setPadding(new Insets(15, 15, 15, 15));
        this.panel.setAlignment(Pos.CENTER);
        this.panel.setGridLinesVisible(true);
        //fondo pantalla
        File fileFondo = new File("imagenes/imagenMapa.png");
        BackgroundImage primerBackGro = new BackgroundImage(new Image(fileFondo.toURI().toString(), 1920, 1080,true,true), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);


        HBox cajaH = new HBox();
        Button botonSalir = new Button("Salir del juego");
        Button botonVolverAlMenu = new Button("Volver al menu");
        cajaH.setAlignment(Pos.TOP_CENTER);
        cajaH.getChildren().addAll(botonVolverAlMenu, botonSalir);
        cajaH.setSpacing(40);
        cajaH.setPadding(new Insets(5));

        configurarBotonesSuperiores(botonSalir,botonVolverAlMenu);


        VBox cajaVertical01 = new VBox(cajaH, panel);
        cajaVertical01.setBackground( new Background(primerBackGro) );
        cajaVertical01.setAlignment(Pos.CENTER);
        VBox.setVgrow(cajaVertical01, Priority.ALWAYS );
        cajaVertical01.setSpacing(30.0d);


        Scene inicial = new Scene(cajaVertical01, 1920, 1080);//ancho-largo
        this.stage.setScene(inicial);
        this.stage.show();

    }

    private void configurarBotonesSuperiores(Button botonSalir, Button botonVolverMenu) {

        CerrarJuegoVentana cerrarVentana = new CerrarJuegoVentana(botonSalir);
        CerrarJuegoBoton cerrarBoton = new CerrarJuegoBoton(this.stage);
        stage.setOnCloseRequest(cerrarVentana);
        botonSalir.setOnAction(cerrarBoton);

        VolverPantallaAnterior pantallaAnterior = new VolverPantallaAnterior(this.stage);
        botonVolverMenu.setOnAction(pantallaAnterior);
    }

    private void realizarAccion(Button boton) {
        //mensaje en la consola
        System.out.print("\nclikeando a la casilla columna: " + GridPane.getColumnIndex(boton) + "  y fila: " + GridPane.getRowIndex(boton));
        //Al hacer click cambiar color del boton
        boton.setStyle("-fx-background-color: MediumSeaGreen");

    }


    /*
    * De forma aleatoria va a cambiar la apariencia del boton del terreno con las imagenes de los recursos
    * */
    private void establecerRecursosAlTerreno() {

        //File ->Image -> ImageView -> button.setGraphic
       /* File fileFondo = new File("imagenes/tierra.png");
        Image imagen = new Image(fileFondo.toURI().toString(),50,50, false,false);
        ImageView imageView = new ImageView(imagen);

        Button boton1 = new Button();
        boton1.setGraphic(imageView);

        this.panel.add(boton1, 5, 5);*/



    }


}
