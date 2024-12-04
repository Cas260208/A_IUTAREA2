package com.example.a_iutarea2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class IU_Publicacion extends Application {

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

        // Botón Opciones de publuicación
        Button btnOption = new Button("...");
        btnOption.setFont(Font.font("Arial", 36));
        btnPerfil.setAlignment(Pos.CENTER);
        btnOption.setStyle("-fx-background-color: transparent;");
        btnOption.setOnAction(e -> {
            System.out.println("¡Botón de opciones!");
        });

        VBox op = new VBox(btnOption);

        // Logo
        String imageLogo = getClass().getResource("/imagenes/pruebaL.jpg").toExternalForm();
        Image imgLogo = new Image(imageLogo);
        ImageView imgViewLogo = new ImageView(imgLogo);
        imgViewLogo.setFitWidth(80);
        imgViewLogo.setFitHeight(80);

        // TextField
        TextField pubi = new TextField();
        pubi.setPromptText("¿Qué estas pensando el día de hoy?");
        pubi.setStyle("-fx-background-radius: 10; -fx-border-width: 10;-fx-background-color: #000; -fx-text-fill: white;");
        pubi.setPrefWidth(500); // Ajuste ancho para H
        pubi.setPrefHeight(60); // Ajustar el alto

        String imagePubp = getClass().getResource("/imagenes/777.jpg").toExternalForm();
        Image imgPubbP = new Image(imagePubp);
        ImageView imgViewPubp = new ImageView(imgPubbP);
        imgViewPubp.setFitWidth(50);
        imgViewPubp.setFitHeight(50);

        // Línea divisoria
        Line line = new Line(0, 0, 1000, 0);
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(1);

        // Contenedor Crear publicación
        HBox conteCrear = new HBox(10, imgViewPubp, pubi);
        conteCrear.setPrefWidth(500);
        conteCrear.setStyle("-fx-background-color: black; -fx-border-color: black; -fx-border-radius: 10; -fx-padding: 5;");


        // Contenedor barra de búsqueda
        HBox busq = new HBox(2, bus, btnSear);
        busq.setAlignment(Pos.CENTER);
        busq.setStyle("-fx-background-color: white; -fx-border-color: black;-fx-max-height: 10; -fx-border-width: 1; -fx-border-radius: 10; -fx-padding: 5;");
        busq.setPrefHeight(10);

        // Imagen de perfil
        String imagePubPer = getClass().getResource("/imagenes/cas.jpg").toExternalForm();
        Image imgPubPer = new Image(imagePubPer);
        ImageView imageViewPubPer = new ImageView(imgPubPer);
        imageViewPubPer.setFitWidth(50);
        imageViewPubPer.setFitHeight(50);
        imageViewPubPer.setStyle("-fx-background-color: black;");

        // Definimos el nombre y username
        Label name2 = new Label("CasZrd");
        name2.setFont(Font.font("Arial", 20));
        name2.setTextFill(Color.BLACK);

        Label username2 = new Label("@CasZrd29");
        username2.setFont(Font.font("Arial", 16));
        username2.setTextFill(Color.GRAY);

        // Barra nombres (contenedor vertical para el nombre y username)
        VBox nombres = new VBox(0, name2, username2);
        nombres.setAlignment(Pos.CENTER_LEFT);

        // Barra de publicación (contenedor horizontal con imagen y nombres)
        HBox barraPublicacion = new HBox(10, imageViewPubPer, nombres, op);
        barraPublicacion.setAlignment(Pos.CENTER_LEFT);
        barraPublicacion.setPadding(new Insets(10));

        // Texto de la publicación
        Text piePublicacion = new Text("Un look diferente para el día de hoy");
        piePublicacion.setFont(Font.font("Arial", 16));
        piePublicacion.setFill(Color.BLACK);

        // Imagen de la publicación
        String imagePublica = getClass().getResource("/imagenes/p3.jpg").toExternalForm();
        Image imgPub = new Image(imagePublica);
        ImageView imageViewPub = new ImageView(imgPub);
        imageViewPub.setFitWidth(500);
        imageViewPub.setFitHeight(200);
        imageViewPub.setStyle("-fx-background-color: black;");

        // Contenedor completo de la publicación
        VBox publicacion = new VBox(10, barraPublicacion, piePublicacion, imageViewPub);
        publicacion.setAlignment(Pos.CENTER);
        publicacion.setPadding(new Insets(10));
        publicacion.setStyle("-fx-background-color: white; -fx-border-color: black; -fx-border-radius: 10; -fx-padding: 10;");


        // Contenedor barra de arriba
        HBox barra = new HBox(0, btnPerfil, btnHome,  busq, btnSettings, btnExit, imgViewLogo);
        barra.setAlignment(Pos.CENTER);
        barra.setStyle("-fx-background-color: white;");

        HBox contenedorPerfil = new HBox(180, publicacion);
        contenedorPerfil.setStyle("-fx-background-color: white; -fx-padding: 5;");
        contenedorPerfil.setAlignment(Pos.CENTER);


        // Contenedor principal
        VBox principal = new VBox(5, barra, conteCrear, line, contenedorPerfil);
        principal.setStyle("-fx-background-color: white; -fx-padding: 20;");

        // Configuración de la escena
        Scene scene = new Scene(principal, 1280, 720);
        stage.setTitle("RSCUA");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
