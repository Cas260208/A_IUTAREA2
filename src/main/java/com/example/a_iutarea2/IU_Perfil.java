package com.example.a_iutarea2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class IU_Perfil extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Botón salida
        String imageExit = getClass().getResource("/imagenes/salida.jpg").toExternalForm();
        Image imgExit = new Image(imageExit);
        ImageView imgViewExit = new ImageView(imgExit);
        imgViewExit.setFitWidth(50);
        imgViewExit.setFitHeight(50);
        Button btnExit = new Button();
        btnExit.setGraphic(imgViewExit);
        btnExit.setStyle("-fx-background-color: transparent;");
        btnExit.setOnAction(e -> {
            System.out.println("¡Botón de salida clicado!");
        });

        // Botón configuraciones
        String imageSettings = getClass().getResource("/imagenes/configuracion.jpg").toExternalForm();
        Image imgSettings = new Image(imageSettings);
        ImageView imgViewSettings = new ImageView(imgSettings);
        imgViewSettings.setFitWidth(50);
        imgViewSettings.setFitHeight(50);
        Button btnSettings = new Button();
        btnSettings.setGraphic(imgViewSettings);
        btnSettings.setStyle("-fx-background-color: transparent;");
        btnSettings.setOnAction(e -> {
            System.out.println("¡Botón de configuración clicado!");
        });

        // Cuadro de texto
        TextField bus = new TextField();
        bus.setPromptText("Ingresa palabra clave");
        bus.setStyle("-fx-background-color: white; -fx-border-color: transparent; -fx-padding: 0;");
        bus.setPrefWidth(500);

        // Botón búsqueda
        String imageSearch = getClass().getResource("/imagenes/busqueda.jpg").toExternalForm();
        Image imgSear = new Image(imageSearch);
        ImageView imgViewSear = new ImageView(imgSear);
        imgViewSear.setFitWidth(50);
        imgViewSear.setFitHeight(50);
        Button btnSear = new Button();
        btnSear.setGraphic(imgViewSear);
        btnSear.setStyle("-fx-background-color: transparent; -fx-padding: 0;"); // Sin relleno interno
        btnSear.setOnAction(e -> {
            System.out.println("¡Botón de búsqueda clicado!");
        });

        // Botón inicio
        String imageHome = getClass().getResource("/imagenes/inicio.jpg").toExternalForm();
        Image imgHome = new Image(imageHome);
        ImageView imgViewHome = new ImageView(imgHome);
        imgViewHome.setFitWidth(50);
        imgViewHome.setFitHeight(50);
        Button btnHome = new Button();
        btnHome.setGraphic(imgViewHome);
        btnHome.setStyle("-fx-background-color: transparent;");
        btnHome.setOnAction(e -> {
            System.out.println("¡Botón de regresar feed!");
        });

        // Boton perfil
        String imagePerfil = getClass().getResource("/imagenes/777.jpg").toExternalForm();
        Image imgPerfil = new Image(imagePerfil);
        ImageView imgViewPerfil = new ImageView(imgPerfil);
        imgViewPerfil.setFitWidth(50);
        imgViewPerfil.setFitHeight(50);
        Button btnPerfil = new Button();
        btnPerfil.setGraphic(imgViewPerfil);
        btnPerfil.setStyle("-fx-background-color: transparent;");
        btnPerfil.setOnAction(e -> {
            System.out.println("¡Botón de perfil!");
        });

        // Logo
        String imageLogo = getClass().getResource("/imagenes/pruebaL.jpg").toExternalForm();
        Image imgLogo = new Image(imageLogo);
        ImageView imgViewLogo = new ImageView(imgLogo);
        imgViewLogo.setFitWidth(80);
        imgViewLogo.setFitHeight(80);


        // Contenedor barra de búsqueda
        HBox busq = new HBox(2, bus, btnSear);
        busq.setAlignment(Pos.CENTER);
        busq.setStyle("-fx-background-color: white; -fx-border-color: black;-fx-max-height: 10; -fx-border-width: 1; -fx-border-radius: 10; -fx-padding: 5;");
        busq.setPrefHeight(10);

        // Contenedor barra de arriba
        HBox barra = new HBox(30, btnPerfil, btnHome,  busq, btnSettings, btnExit, imgViewLogo);
        barra.setPadding(new Insets(10));
        barra.setAlignment(Pos.CENTER);
        barra.setStyle("-fx-background-color: white;");

        // Contenedor principal
        VBox principal = new VBox(20, barra);
        principal.setPadding(new Insets(20));
        principal.setStyle("-fx-background-color: white;");

        // Configuración de la escena
        Scene scene = new Scene(principal, 1280, 720);
        stage.setTitle("RSCUA");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
