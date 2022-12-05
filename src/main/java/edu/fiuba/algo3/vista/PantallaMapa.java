package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Mapa.Mapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.File;


public class PantallaMapa extends StackPane implements EventHandler<ActionEvent> {
    private Stage stage;
    private int base ;
    private int altura;
    private BorderPane panelGlobal = new BorderPane();
    private GridPane vista;
    private Canvas figuras;

    public PantallaMapa(Stage stage) {
        this.stage=stage;
        this.vista = new GridPane();
        //this.mapa = new Mapa(30, 40);
        this.base = 30;
        this.altura = 40;



    }

    @Override
    public void handle(ActionEvent actionEvent) {
        mostrarMapa();
    }

    private void mostrarMapa() {

        for(int i=0; i< base; i++){
            for(int j=0; j< altura; j++){

                Rectangle manzana = new Rectangle(30,30, Color.GREY);
                manzana.setStroke(Color.DARKGRAY);
                manzana.setStrokeWidth(5);

                this.vista.add(manzana, i, j);
            }
        }
        this.vista.setPadding(new Insets(10, 10, 10, 10));
        this.vista.setAlignment(Pos.CENTER);
        figuras = new Canvas(45*base + 5, 45*altura+5);
        this.getChildren().addAll(vista,figuras);
        this.setAlignment(Pos.CENTER);

        //genero fondo pantalla
        File fileFondo = new File("imagenes/imagenMapa.png");

        BackgroundImage primerBackGro = new BackgroundImage(new Image(fileFondo.toURI().toString(),
                1920, 1080,true,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);


        VBox cajaVertical01 = new VBox(this);
        cajaVertical01.setBackground( new Background(primerBackGro) );
        cajaVertical01.setAlignment(Pos.CENTER);


        VBox.setVgrow(cajaVertical01, Priority.ALWAYS );
        cajaVertical01.setSpacing(30.0d);


        Scene inicial = new Scene(cajaVertical01, 1920, 1080);//ancho-largo
        this.stage.setScene(inicial);
        this.stage.show();

    }



}
