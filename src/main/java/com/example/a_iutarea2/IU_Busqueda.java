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

public class IU_Busqueda extends Application {

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
        HBox barra = new HBox(30, btnPerfil, btnHome, busq, btnSettings, btnExit, imgViewLogo);
        barra.setPadding(new Insets(10));
        barra.setAlignment(Pos.CENTER);
        barra.setStyle("-fx-background-color: white;");

        // Resultados de búsqueda
        Text busquedaTitulo = new Text("Búsquedas relacionadas con: CasZer29");
        busquedaTitulo.setFont(Font.font("Arial", 24));
        busquedaTitulo.setFill(Color.BLACK);

        // Información del perfil
        String imagePerfilBusqueda = getClass().getResource("/imagenes/cas.jpg").toExternalForm();
        Image imgPerfilBusqueda = new Image(imagePerfilBusqueda);
        ImageView imgViewPerfilBusqueda = new ImageView(imgPerfilBusqueda);
        imgViewPerfilBusqueda.setFitWidth(60);
        imgViewPerfilBusqueda.setFitHeight(60);

        Label lblNombrePerfil = new Label("Casandra Zetina");
        lblNombrePerfil.setFont(Font.font("Arial", 20));

        Label lblUsuarioPerfil = new Label("@CasZer29");
        lblUsuarioPerfil.setFont(Font.font("Arial", 16));
        lblUsuarioPerfil.setTextFill(Color.GRAY);

        VBox perfilInformacion = new VBox(5, lblNombrePerfil, lblUsuarioPerfil);


        // ComboBox "Siguiendo"
        ComboBox<String> comboSiguiendo = new ComboBox<>();
        comboSiguiendo.getItems().addAll(
                "Dejar de seguir",
                "Bloquear"
        );
        comboSiguiendo.setValue("Siguiendo");
        comboSiguiendo.setStyle("-fx-background-radius: 10; -fx-background-color: black; -fx-text-fill: white; -fx-font-size: 16;");
        comboSiguiendo.setPrefWidth(200);

        comboSiguiendo.setCellFactory(lv -> {
            ListCell<String> cell = new ListCell<>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    setText(item);
                    setStyle(empty ? "" : "-fx-background-color: black; -fx-text-fill: white; -fx-font-size: 16;");
                }
            };
            return cell;
        });

        comboSiguiendo.setButtonCell(new ListCell<>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                setText(item);
                setStyle("-fx-background-radius: 10; -fx-background-color: black; -fx-text-fill: white; -fx-font-size: 16;");
            }
        });

        HBox perfilBusqueda = new HBox(10, imgViewPerfilBusqueda, perfilInformacion, comboSiguiendo);
        perfilBusqueda.setAlignment(Pos.CENTER_LEFT);
        perfilBusqueda.setPadding(new Insets(10));
        perfilBusqueda.setStyle("-fx-border-color: black; -fx-border-width: 1; -fx-border-radius: 10; -fx-padding: 10;");

        // Publicación asociada
        Label lblDescripcionPost = new Label("Un día fantástico.");
        lblDescripcionPost.setFont(Font.font("Arial", 18));

        String imagePost1 = getClass().getResource("/imagenes/p1.jpg").toExternalForm();
        Image imgPost1 = new Image(imagePost1);
        ImageView imgViewPost1 = new ImageView(imgPost1);
        imgViewPost1.setFitWidth(300);
        imgViewPost1.setFitHeight(200);

        String imagePost2 = getClass().getResource("/imagenes/p2.jpg").toExternalForm();
        Image imgPost2 = new Image(imagePost2);
        ImageView imgViewPost2 = new ImageView(imgPost2);
        imgViewPost2.setFitWidth(300);
        imgViewPost2.setFitHeight(200);

        HBox publicaciones = new HBox(10, imgViewPost1, imgViewPost2);
        publicaciones.setAlignment(Pos.CENTER);

        VBox contenidoBusqueda = new VBox(20, lblDescripcionPost, publicaciones);
        contenidoBusqueda.setAlignment(Pos.CENTER_LEFT);

        VBox resultadosBusqueda = new VBox(20, busquedaTitulo, perfilBusqueda, contenidoBusqueda);
        resultadosBusqueda.setAlignment(Pos.TOP_LEFT);
        resultadosBusqueda.setPadding(new Insets(20));
        resultadosBusqueda.setStyle("-fx-background-color: white; -fx-border-color: black; -fx-border-width: 1; -fx-border-radius: 10; -fx-padding: 20;");

        // Contenedor principal
        VBox principal = new VBox(20, barra, resultadosBusqueda);
        principal.setPadding(new Insets(20));
        principal.setStyle("-fx-background-color: white;");

        // Configuración de la escena
        Scene scene = new Scene(principal, 1280, 720);
        stage.setTitle("RSCUA - Búsqueda");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
