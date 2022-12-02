package edu.fiuba.algo3;

import edu.fiuba.algo3.controlador.musica.ReproductorMusica;
import edu.fiuba.algo3.vista.PantallaInicial;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("AlgoStar");

        ReproductorMusica musicaInicial = new ReproductorMusica();
        PantallaInicial pantalla = new PantallaInicial(primaryStage);
    }

    public static void main(String[] args) {
        launch();
    }

}