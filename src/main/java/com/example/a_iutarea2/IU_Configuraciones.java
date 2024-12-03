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

        // Botón nombre user
        String imageNameUser = "file:C:/Users/Admin/IdeaProjects/A_IUTAREA2/src/main/java/com/example/a_iutarea2/imagenes/perfil.jpg";
        Image imageUser = new Image(imageNameUser);
        ImageView imgViewUser = new ImageView(imageUser);
        imgViewUser.setFitWidth(40);
        imgViewUser.setFitHeight(40);
        Button btnUser = new Button("Cambiar nombre de usuario.");
        btnUser.setGraphic(imgViewUser);
        btnUser.setStyle("-fx-background-color: transparent; -fx-font: Arial; -fx-font-size: 20;");
        btnUser.setOnAction(e -> {
            System.out.println("¡Botón con imagen clicado!");
        });

        // Botón cambiar contraseña
        String imagePasword = "file:C:/Users/Admin/IdeaProjects/A_IUTAREA2/src/main/java/com/example/a_iutarea2/imagenes/contrasenia.jpg";
        Image imgPasword = new Image(imagePasword);
        ImageView imgViewPasword = new ImageView(imgPasword);
        imgViewPasword.setFitWidth(40);
        imgViewPasword.setFitHeight(40);
        Button btnPasword = new Button("Cambiar contraseña.");
        btnPasword.setGraphic(imgViewPasword);
        btnPasword.setStyle("-fx-background-color: transparent; -fx-font: Arial; -fx-font-size: 20;");
        btnPasword.setOnAction(e -> {
            System.out.println("Botóm click");
        });

        // Boton cambiar imagen
        String imagePhotoUser = "file:C:/Users/Admin/IdeaProjects/A_IUTAREA2/src/main/java/com/example/a_iutarea2/imagenes/foto.jpg";
        Image imgPhUs = new Image(imagePhotoUser);
        ImageView imgViewPhoto = new ImageView(imgPhUs);
        imgViewPhoto.setFitWidth(40);
        imgViewPhoto.setFitHeight(40);
        Button btnPhoto = new Button("Cambiar foto de perfil");
        btnPhoto.setGraphic(imgViewPhoto);
        btnPhoto.setStyle("-fx-background-color: transparent; -fx-font: Arial; -fx-font-size: 20;");
        btnPhoto.setOnAction(e -> {
            System.out.println("Photo");
        });

        // Boton cambiar idioma
        String imageChangeLenguaje = "file:C:/Users/Admin/IdeaProjects/A_IUTAREA2/src/main/java/com/example/a_iutarea2/imagenes/idioma.jpg";
        Image imgChLen = new Image(imageChangeLenguaje);
        ImageView imgViewChangeLenguaje = new ImageView(imgChLen);
        imgViewChangeLenguaje.setFitWidth(40);
        imgViewChangeLenguaje.setFitHeight(40);
        Button btnChangeLenguaje = new Button("Cambiar idioma");
        btnChangeLenguaje.setGraphic(imgViewChangeLenguaje);
        btnChangeLenguaje.setStyle("-fx-background-color: transparent; -fx-font: Arial; -fx-font-size: 20;");
        btnChangeLenguaje.setOnAction(e -> {
            System.out.println("Idioma");
        });

        // Botón cambiar información
        String imageChangeInformation = "file:C:/Users/Admin/IdeaProjects/A_IUTAREA2/src/main/java/com/example/a_iutarea2/imagenes/informacion.jpg";
        Image imgChInf = new Image(imageChangeInformation);
        ImageView imgViewChangeInformation = new ImageView(imgChInf);
        imgViewChangeInformation.setFitWidth(40);
        imgViewChangeInformation.setFitHeight(40);
        Button btnChangeInformation = new Button("Cambiar información principal");
        btnChangeInformation.setGraphic(imgViewChangeInformation);
        btnChangeInformation.setStyle("-fx-background-color: transparent; -fx-font: Arial; -fx-font-size: 20;");
        btnChangeInformation.setOnAction(e -> {
            System.out.println("Informacion");
        });

        // Botón cambiar privacidad
        String imageChangePriva = "file:C:/Users/Admin/IdeaProjects/A_IUTAREA2/src/main/java/com/example/a_iutarea2/imagenes/privacidad.jpg";
        Image imgChPr = new Image(imageChangePriva);
        ImageView imgViewChangePriva = new ImageView(imgChPr);
        imgViewChangePriva.setFitWidth(40);
        imgViewChangePriva.setFitHeight(40);
        Button btnChangePriva = new Button(" Cambiar privacidad de la cuenta.");
        btnChangePriva.setGraphic(imgViewChangePriva);
        btnChangePriva.setStyle("-fx-background-color: transparent; -fx-font: Arial; -fx-font-size: 20;");
        btnChangePriva.setOnAction(e -> {
            System.out.println("Privacidad");
        });

        // Botón salida
        String imageExit = "file:C:/Users/Admin/IdeaProjects/A_IUTAREA2/src/main/java/com/example/a_iutarea2/imagenes/salida.jpg";
        Image imgExit = new Image(imageExit);
        ImageView imgViewExit = new ImageView(imgExit);
        imgViewExit.setFitWidth(30);
        imgViewExit.setFitHeight(30);
        Button btnExit = new Button();
        btnExit.setGraphic(imgViewExit);
        btnExit.setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-border-radius: 10; -fx-padding: 20; ");
        btnExit.setOnAction(e -> {
            System.out.println("Salida");
        });

        // Botón configuraciones
        String imageSettings = "file:C:/Users/Admin/IdeaProjects/A_IUTAREA2/src/main/java/com/example/a_iutarea2/imagenes/configuracion.jpg";
        Image imgSettings = new Image(imageSettings);
        ImageView imgViewSettings = new ImageView(imgSettings);
        imgViewSettings.setFitWidth(30);
        imgViewSettings.setFitHeight(30);
        Button btnSettings = new Button();
        btnSettings.setGraphic(imgViewSettings);
        btnSettings.setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-border-radius: 10; -fx-padding: 20; ");
        btnSettings.setOnAction(e -> {
            System.out.println("Configuracion");
        });

        // Botón busqueda
        String imageSearch = "file:C:/Users/Admin/IdeaProjects/A_IUTAREA2/src/main/java/com/example/a_iutarea2/imagenes/busqueda.jpg";
        Image imgSear = new Image(imageSearch);
        ImageView imgViewSear = new ImageView(imgSear);
        imgViewSear.setFitWidth(30);
        imgViewSear.setFitHeight(30);
        Button btnSear = new Button();
        btnSear.setGraphic(imgViewSear);
        btnSear.setStyle("-fx-background-color: transparent; -fx-border-color: black; -fx-border-radius: 10; -fx-padding: 20; ");
        btnSear.setOnAction(e -> {
            System.out.println("Sear");
        });

        // Espacio para ingresar palabra
        TextField busqueda = new TextField();


        // Logo
        String imageLogo = "file:C:/Users/Admin/IdeaProjects/A_IUTAREA2/src/main/java/com/example/a_iutarea2/pruebaL.jpg";
        Image imgLogo = new Image(imageLogo);
        ImageView imgViewLogo = new ImageView(imgLogo);
        imgViewLogo.setFitWidth(80);
        imgViewLogo.setFitHeight(80);

        // Configuraciones
        Text conf = new Text("Configuración");
        conf.setFont(Font.font("Arial", 40));
        conf.setFill(Color.BLACK);

        // Contenedor barra de arriba
        HBox barra = new HBox(10, btnSear, btnSettings, btnExit, imgViewLogo);
        barra.setPadding(new Insets(10));
        barra.setStyle("-fx-background-color: white;");

        // Contenedor opciones de configuracion
        VBox configuracion = new VBox(10, conf, btnUser, btnPasword, btnPhoto, btnChangeLenguaje, btnChangeInformation, btnChangePriva);
        configuracion.setAlignment(Pos.CENTER_LEFT);
        configuracion.setPadding(new Insets(20));
        configuracion.setStyle("-fx-background-color: white; -fx-border-color: black; -fx-border-radius: 10; -fx-padding: 40");

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
