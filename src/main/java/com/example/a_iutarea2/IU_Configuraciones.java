package com.example.a_iutarea2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class IU_Configuraciones extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Imagenes para los botones

        // Botón nombre usuario
        String imageNameUser = getClass().getResource("/imagenes/perfil.jpg").toExternalForm();
        Image imageUser = new Image(imageNameUser);
        ImageView imgViewUser = new ImageView(imageUser);
        imgViewUser.setFitWidth(40);
        imgViewUser.setFitHeight(40);
        Button btnUser = new Button("Cambiar nombre de usuario.");
        btnUser.setGraphic(imgViewUser);
        btnUser.setStyle("-fx-background-color: transparent; -fx-font-family: Arial; -fx-font-size: 20;");
        btnUser.setOnAction(e -> {
            System.out.println("¡Botón con imagen clicado!");
        });

        // Botón cambiar contraseña
        String imagePasword = getClass().getResource("/imagenes/contrasenia.jpg").toExternalForm();
        Image imgPasword = new Image(imagePasword);
        ImageView imgViewPasword = new ImageView(imgPasword);
        imgViewPasword.setFitWidth(40);
        imgViewPasword.setFitHeight(40);
        Button btnPasword = new Button("Cambiar contraseña.");
        btnPasword.setGraphic(imgViewPasword);
        btnPasword.setStyle("-fx-background-color: transparent; -fx-font-family: Arial; -fx-font-size: 20;");
        btnPasword.setOnAction(e -> {
            System.out.println("¡Botón de cambiar contraseña clicado!");
        });

        // Botón cambiar foto de perfil
        String imagePhotoUser = getClass().getResource("/imagenes/foto.jpg").toExternalForm();
        Image imgPhUs = new Image(imagePhotoUser);
        ImageView imgViewPhoto = new ImageView(imgPhUs);
        imgViewPhoto.setFitWidth(40);
        imgViewPhoto.setFitHeight(40);
        Button btnPhoto = new Button("Cambiar foto de perfil");
        btnPhoto.setGraphic(imgViewPhoto);
        btnPhoto.setStyle("-fx-background-color: transparent; -fx-font-family: Arial; -fx-font-size: 20;");
        btnPhoto.setOnAction(e -> {
            System.out.println("¡Botón de cambiar foto clicado!");
        });

        // Botón cambiar idioma
        String imageChangeLenguaje = getClass().getResource("/imagenes/idioma.jpg").toExternalForm();
        Image imgChLen = new Image(imageChangeLenguaje);
        ImageView imgViewChangeLenguaje = new ImageView(imgChLen);
        imgViewChangeLenguaje.setFitWidth(40);
        imgViewChangeLenguaje.setFitHeight(40);
        Button btnChangeLenguaje = new Button("Cambiar idioma");
        btnChangeLenguaje.setGraphic(imgViewChangeLenguaje);
        btnChangeLenguaje.setStyle("-fx-background-color: transparent; -fx-font-family: Arial; -fx-font-size: 20;");
        btnChangeLenguaje.setOnAction(e -> {
            System.out.println("¡Botón de cambiar idioma clicado!");
        });

        // Botón cambiar información
        String imageChangeInformation = getClass().getResource("/imagenes/informacion.jpg").toExternalForm();
        Image imgChInf = new Image(imageChangeInformation);
        ImageView imgViewChangeInformation = new ImageView(imgChInf);
        imgViewChangeInformation.setFitWidth(40);
        imgViewChangeInformation.setFitHeight(40);
        Button btnChangeInformation = new Button("Cambiar información principal");
        btnChangeInformation.setGraphic(imgViewChangeInformation);
        btnChangeInformation.setStyle("-fx-background-color: transparent; -fx-font-family: Arial; -fx-font-size: 20;");
        btnChangeInformation.setOnAction(e -> {
            System.out.println("¡Botón de cambiar información clicado!");
        });

        // Botón cambiar privacidad
        String imageChangePriva = getClass().getResource("/imagenes/privacidad.jpg").toExternalForm();
        Image imgChPr = new Image(imageChangePriva);
        ImageView imgViewChangePriva = new ImageView(imgChPr);
        imgViewChangePriva.setFitWidth(40);
        imgViewChangePriva.setFitHeight(40);
        Button btnChangePriva = new Button("Cambiar privacidad de la cuenta.");
        btnChangePriva.setGraphic(imgViewChangePriva);
        btnChangePriva.setStyle("-fx-background-color: transparent; -fx-font-family: Arial; -fx-font-size: 20;");
        btnChangePriva.setOnAction(e -> {
            System.out.println("¡Botón de cambiar privacidad clicado!");
        });

        // Botón salida
        String imageExit = getClass().getResource("/imagenes/salida.jpg").toExternalForm();
        Image imgExit = new Image(imageExit);
        ImageView imgViewExit = new ImageView(imgExit);
        imgViewExit.setFitWidth(30);
        imgViewExit.setFitHeight(30);
        Button btnExit = new Button();
        btnExit.setGraphic(imgViewExit);
        btnExit.setStyle("-fx-background-color: transparent; -fx-border-color: white; -fx-border-radius: 10; -fx-padding: 30;");
        btnExit.setOnAction(e -> {
            System.out.println("¡Botón de salida clicado!");
        });

        // Botón configuraciones
        String imageSettings = getClass().getResource("/imagenes/configuracion.jpg").toExternalForm();
        Image imgSettings = new Image(imageSettings);
        ImageView imgViewSettings = new ImageView(imgSettings);
        imgViewSettings.setFitWidth(30);
        imgViewSettings.setFitHeight(30);
        Button btnSettings = new Button();
        btnSettings.setGraphic(imgViewSettings);
        btnSettings.setStyle("-fx-background-color: transparent; -fx-border-color: white; -fx-border-radius: 10; -fx-padding: 30;");
        btnSettings.setOnAction(e -> {
            System.out.println("¡Botón de configuración clicado!");
        });

        // Cuadro de texto
        TextField bus = new TextField();
        bus.setPromptText("Ingresa palabra clave");
        bus.setStyle("-fx-background-color: white;");
        bus.setPrefWidth(500);

        // Botón búsqueda
        String imageSearch = getClass().getResource("/imagenes/busqueda.jpg").toExternalForm();
        Image imgSear = new Image(imageSearch);
        ImageView imgViewSear = new ImageView(imgSear);
        imgViewSear.setFitWidth(30);
        imgViewSear.setFitHeight(30);
        Button btnSear = new Button();
        btnSear.setGraphic(imgViewSear);
        btnSear.setStyle("-fx-background-color: transparent;");
        btnSear.setOnAction(e -> {
            System.out.println("¡Botón de búsqueda clicado!");
        });

        // Boton perfil
        String imagePerfil = getClass().getResource("/imagenes/777.jpg").toExternalForm();
        Image imgPerfil = new Image(imagePerfil);
        ImageView imgViewPerfil = new ImageView(imgPerfil);
        imgViewPerfil.setFitWidth(30);
        imgViewPerfil.setFitHeight(30);
        Button btnPerfil = new Button();
        btnPerfil.setGraphic(imgViewPerfil);
        btnPerfil.setStyle("-fx-background-color: transparent; -fx-border-color: white; -fx-border-radius: 10; -fx-padding: 30;");
        btnPerfil.setOnAction(e -> {
            System.out.println("¡Botón de perfil!");
        });

        // Logo
        String imageLogo = getClass().getResource("/imagenes/pruebaL.jpg").toExternalForm();
        Image imgLogo = new Image(imageLogo);
        ImageView imgViewLogo = new ImageView(imgLogo);
        imgViewLogo.setFitWidth(80);
        imgViewLogo.setFitHeight(80);

        // Configuraciones
        Text conf = new Text("Configuración");
        conf.setFont(Font.font("Arial", 40));
        conf.setFill(Color.BLACK);

        // Contenedor busqueda
        HBox busq = new HBox(10, bus, btnSear);
        busq.setAlignment(Pos.CENTER);
        busq.setStyle("-fx-background-color: white; -fx-border-color: black; -fx-border-radius: 10; -fx-padding: 10;");

        // Contenedor barra de arriba
        HBox barra = new HBox(10, btnPerfil, busq, btnSettings, btnExit, imgViewLogo);
        barra.setPadding(new Insets(10));
        barra.setStyle("-fx-background-color: white;");

        // Contenedor opciones de configuración
        VBox configuracion = new VBox(10, conf, btnUser, btnPasword, btnPhoto, btnChangeLenguaje, btnChangeInformation, btnChangePriva);
        configuracion.setAlignment(Pos.CENTER_LEFT);
        configuracion.setPadding(new Insets(20));
        configuracion.setStyle("-fx-background-color: white; -fx-border-color: black; -fx-border-radius: 10; -fx-padding: 20;");

        // Contenedor principal
        VBox principal = new VBox(20, barra, configuracion);
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
