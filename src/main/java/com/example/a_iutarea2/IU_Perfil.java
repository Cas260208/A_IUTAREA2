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
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;

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
        String imagePerfil = getClass().getResource("/imagenes/7772.jpg").toExternalForm();
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

        // Botón escolaridad
        String imageSchool = getClass().getResource("/imagenes/escuela.jpg").toExternalForm();
        Image imgSchool = new Image(imageSchool);
        ImageView imgViewSchool = new ImageView(imgSchool);
        imgViewSchool.setFitWidth(30);
        imgViewSchool.setFitHeight(30);
        Button btnSchool = new Button("Estudia en 'UAM Cuajimalpa'.");
        btnSchool.setGraphic(imgViewSchool);
        btnSchool.setStyle("-fx-background-color: transparent;");
        btnSchool.setOnAction(e -> {
            System.out.println("¡Botón de escolaridad!");
        });

        // Botón relacion
        String imageRelationship = getClass().getResource("/imagenes/relacion.jpg").toExternalForm();
        Image imgRelationship = new Image(imageRelationship);
        ImageView imgViewRelationship = new ImageView(imgRelationship);
        imgViewRelationship.setFitWidth(30);
        imgViewRelationship.setFitHeight(30);
        Button btnRelationship = new Button("en una relación con 'CasZrd'.");
        btnRelationship.setGraphic(imgViewRelationship);
        btnRelationship.setStyle("-fx-background-color: transparent;");
        btnRelationship.setOnAction(e -> {
            System.out.println("¡Botón de situacion amorosa!");
        });

        // Botón ubicación
        String imageLocation = getClass().getResource("/imagenes/ubicacion.jpg").toExternalForm();
        Image imgLocation = new Image(imageLocation);
        ImageView imgViewLocation = new ImageView(imgLocation);
        imgViewLocation.setFitWidth(30);
        imgViewLocation.setFitHeight(30);
        Button btnLocation = new Button("en CDMX.");
        btnLocation.setGraphic(imgViewLocation);
        btnLocation.setStyle("-fx-background-color: transparent;");
        btnLocation.setOnAction(e -> {
            System.out.println("¡Botón de locación!");
        });

        // Botón musica
        String imageMusic = getClass().getResource("/imagenes/musica.jpg").toExternalForm();
        Image imgMusic = new Image(imageMusic);
        ImageView imgViewMusic = new ImageView(imgMusic);
        imgViewMusic.setFitWidth(30);
        imgViewMusic.setFitHeight(30);
        Button btnMusic = new Button("Escuchando a: 'Confieso - Kany García'.");
        btnMusic.setGraphic(imgViewMusic);
        btnMusic.setStyle("-fx-background-color: transparent;");
        btnMusic.setOnAction(e -> {
            System.out.println("¡Botón de música!");
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

        // Imagen de perfil (redonda)
        String imagePerV = getClass().getResource("/imagenes/777.jpg").toExternalForm();
        Image imgPer = new Image(imagePerV);
        ImageView imageViewPer = new ImageView(imgPer);
        imageViewPer.setFitWidth(120);
        imageViewPer.setFitHeight(120);
        imageViewPer.setStyle("-fx-background-color: black;");

        // Nombre y username
        Label name = new Label("Ivan Garrido Velazquez");
        name.setFont(Font.font("Arial", 24));
        name.setTextFill(Color.WHITE);

        Label username = new Label("@Zaganav29");
        username.setFont(Font.font("Arial", 16));
        username.setTextFill(Color.WHITE);

        // Estadísticas de seguidores
        Label seguidos = new Label("Seguidos: 777");
        seguidos.setFont(Font.font("Arial", 16));
        seguidos.setTextFill(Color.BLACK);

        Label seguidores = new Label("Seguidores: 1111");
        seguidores.setFont(Font.font("Arial", 16));
        seguidores.setTextFill(Color.BLACK);

        // Contenedor Informacion
        VBox informacion = new VBox(1, btnSchool, btnRelationship, btnLocation, btnMusic, seguidos, seguidores);
        informacion.setAlignment(Pos.CENTER);
        informacion.setStyle("-fx-background-color: white; -fx-border-color: black; -fx-border-radius: 10; -fx-padding: 5;");

        // Contenedor foto perfil
        VBox header = new VBox(20, imageViewPer, name, username);
        header.setPadding(new Insets(20));
        header.setAlignment(Pos.CENTER);
        header.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(10), Insets.EMPTY)));

        // Contenido del perfil
        Label postLabel = new Label("@Zaganav29");
        postLabel.setFont(Font.font("Arial", 18));
        postLabel.setTextFill(Color.BLACK);


        // Contenedor barra de arriba
        HBox barra = new HBox(0, btnPerfil, btnHome,  busq, btnSettings, btnExit, imgViewLogo);
        barra.setAlignment(Pos.CENTER);
        barra.setStyle("-fx-background-color: white;");

        HBox contenedorPerfil = new HBox(informacion, postLabel);
        contenedorPerfil.setStyle("-fx-background-color: white; -fx-padding: 5;");


        // Contenedor principal
        VBox principal = new VBox(5, barra, header, contenedorPerfil);
        principal.setStyle("-fx-background-color: white;");

        // Configuración de la escena
        Scene scene = new Scene(principal, 1280, 720);
        stage.setTitle("RSCUA");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
