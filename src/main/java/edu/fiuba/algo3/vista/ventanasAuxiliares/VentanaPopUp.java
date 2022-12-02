package edu.fiuba.algo3.vista.ventanasAuxiliares;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.*;

public class VentanaPopUp {
    public static void mostrar (String titulo, String mensaje){
        Stage nuevaVentana = new Stage();
        GridPane panel = new GridPane();
        //Bloquea actividad en otras ventanas.
        nuevaVentana.initModality( Modality.APPLICATION_MODAL );
        nuevaVentana.setTitle( titulo );
        nuevaVentana.setMinWidth(500);
        nuevaVentana.setMinHeight(500);
        Label label = new Label();
        label.setText( mensaje );
        label.setFont(new Font(14));
        label.setAlignment(Pos.TOP_CENTER);
        label.setBackground(new Background(new BackgroundFill(TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        label.setTextFill(WHITE);
        label.setPadding(new Insets(5));
        Button botonCerrar = new Button( "Cerrar");
        botonCerrar.setOnAction( e -> nuevaVentana.close() );
        VBox layout = new VBox();
        layout.getChildren().addAll(label, botonCerrar);
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(10.0d);
        panel.getChildren().add(layout);
        panel.setAlignment(Pos.CENTER);
        //codigo de color: https://paletadecolores.online/colors/5c5e36/
        panel.setBackground(new Background(new BackgroundFill(web("1d3d33"), new CornerRadii(0), new Insets(0))));
        Scene escena  = new Scene(panel);
        nuevaVentana.setScene( escena );
        //Para volver a la ventana anterior, pide cerrar la ventana.
        nuevaVentana.showAndWait();

    }
}
