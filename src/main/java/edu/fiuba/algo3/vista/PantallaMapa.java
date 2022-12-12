package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.ventanas.CerrarJuegoBoton;
import edu.fiuba.algo3.controlador.ventanas.CerrarJuegoVentana;
import edu.fiuba.algo3.controlador.ventanas.VolverPantallaAnterior;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.File;


public class PantallaMapa {
    private Stage stage;
    private int base ;
    private int altura;
    private GridPane panelDelMapaVisual;

    public PantallaMapa(Stage stage) {
        this.stage=stage;
        this.panelDelMapaVisual = new GridPane();
        this.base = 20;
        this.altura = 10;
        //mostrarMapa();

    }

    public void mostrarMapa() {


        for(int i=0; i< base; i++){
            for(int j=0; j< altura; j++){

                //cada casilla será un menú
                MenuButton boton = new MenuButton();
                boton.setPrefSize(90, 95);//dimensiones de la casilla
                boton.alignmentProperty();

                MenuItem m1 = new MenuItem("atacar");
                MenuItem m2 = new MenuItem("crear");
                boton.getItems().add(m1);
                boton.getItems().add(m2);


                establecerRecursosAlTerreno(boton, i, j, m1,m2);

                boton.setOnAction(e -> realizarAccion(boton)); //para cuando se haga click
                this.panelDelMapaVisual.add(boton, i, j);
            }
        }

        //configurando panel del mapa
        this.panelDelMapaVisual.setPadding(new Insets(15, 15, 15, 15));
        this.panelDelMapaVisual.setAlignment(Pos.CENTER);
        this.panelDelMapaVisual.setGridLinesVisible(true);
        //fondo pantalla
        File fileFondo = new File("imagenes/imagenMapa.png");
        BackgroundImage primerBackGro = new BackgroundImage(new Image(fileFondo.toURI().toString(), 1920, 1080,true,true), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);

        //configurando panel superior para los botones
        HBox contenedorHorizontal = new HBox();
        Button botonSalir = new Button("Salir del juego");
        Button botonVolverAlMenu = new Button("Volver al menu");
        contenedorHorizontal.setAlignment(Pos.TOP_CENTER);
        contenedorHorizontal.getChildren().addAll(botonVolverAlMenu, botonSalir);
        contenedorHorizontal.setSpacing(40);
        contenedorHorizontal.setPadding(new Insets(5));

        configurarBotonesSuperiores(botonSalir,botonVolverAlMenu);

        //juntando tode en una sola caja vertical
        VBox contenedorVertical = new VBox(contenedorHorizontal, panelDelMapaVisual);
        contenedorVertical.setBackground( new Background(primerBackGro) );
        contenedorVertical.setAlignment(Pos.CENTER);
        VBox.setVgrow(contenedorVertical, Priority.ALWAYS );
        contenedorVertical.setSpacing(30.0d);

        //nueva escena
        Scene inicial = new Scene(contenedorVertical, 1920, 1080);//ancho-largo
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

    //ver why no aparece por consola!!??
    private void realizarAccion(MenuButton boton) {
        //mensaje en la consola
        System.out.print("\nclikeando a la casilla columna: " + GridPane.getColumnIndex(boton) + "  y fila: " + GridPane.getRowIndex(boton));
        //Al hacer click cambiar color del boton
        //boton.setStyle("-fx-background-color: MediumSeaGreen");

    }


    /*
    * La idea era poner los iconos de recursos de forma aleatoria
    * pero sería un quilombo saber su posicion, mejor opté por
    * ubicaciones fijas .
    * */
    private void establecerRecursosAlTerreno(MenuButton boton, int base, int altura, MenuItem m1, MenuItem m2) {

        // Caso Volcan
        if((base == 0 && altura==0) || (base==7 && altura==7) || (base==7 && altura==6) || (base==8 && altura==0) || (base==10 && altura==0) || (base==0 && altura==1)){

            File fileFondo = new File("imagenes/volcan.png");
            colocarIconoALaCasilla(fileFondo.toURI().toString(),boton);
            configurarOpcionesCasillaConRecurso(boton, m1, m2);
        }



        //Caso Mineral
        if((base == 10 && altura==3) || (base==8 && altura==1) || (base==9 && altura==0)|| (base==14 && altura==9) || (base==15 && altura==9) ||(base==16 && altura==9) ){

            File fileFondo2 = new File("imagenes/mineral.png");
            colocarIconoALaCasilla(fileFondo2.toURI().toString(),boton);
            configurarOpcionesCasillaConRecurso(boton, m1, m2);
        }
    }

    private void colocarIconoALaCasilla(String unString, MenuButton boton) {

        BackgroundImage primerBackGro = new BackgroundImage(new Image(unString,
                30, 35,true,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        boton.setBackground( new Background(primerBackGro) );

    }

    private void configurarOpcionesCasillaConRecurso(MenuButton boton, MenuItem m1, MenuItem m2) {

        MenuItem m3 = new MenuItem("extraer");
        MenuItem m4 = new MenuItem("construir");
        boton.getItems().remove(m1);
        boton.getItems().remove(m2);


        boton.getItems().add(m3);
        boton.getItems().add(m4);

    }


}
