package com.example.a_iutarea2;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class IU_InicioSesion extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Ruta del logo
        String imagePath = getClass().getResource("/imagenes/pruebaL.jpg").toExternalForm();
        Image img = new Image(imagePath);

        // Logo con tamaño ajustado
        ImageView imgView = new ImageView(img);
        imgView.setPreserveRatio(true);
        imgView.setFitWidth(600); // Ajustar ancho para que se vea proporcionado en HD

        // Contenedor para el logo
        VBox logo = new VBox(imgView);
        logo.setAlignment(Pos.CENTER);
        logo.setPadding(new Insets(0, 10, 0, 10));
        logo.setStyle("-fx-background-color: #FFF;"); // Fondo claro para separar visualmente

        // Título
        Text texto = new Text("Inicio de sesión");
        texto.setFont(Font.font("Italic", 36)); // Texto más grande para HD
        texto.setFill(Color.BLACK);

        // Campos de texto
        TextField correo = new TextField();
        Text textoC = new Text("Correo electrónico:");
        textoC.setFont(Font.font("Arial", 10));
        textoC.setFill(Color.BLACK);
        correo.setPromptText("Correo electrónico");
        correo.setStyle("-fx-background-radius: 10; -fx-background-color: #000; -fx-text-fill: white;");
        correo.setPrefWidth(400); // Ajuste ancho para H
        correo.setPrefHeight(40); // Ajustar el alto

        PasswordField passw = new PasswordField();
        Text textoPas = new Text("Contraseña:");
        textoPas.setFont(Font.font("Arial", 10));
        textoPas.setFill(Color.BLACK);
        passw.setPromptText("Contraseña");
        passw.setStyle("-fx-background-radius: 10; -fx-background-color: #000; -fx-text-fill: white;");
        passw.setPrefWidth(400); // Ajuste ancho para H
        passw.setPrefHeight(40); // Ajustar el alto

        // Botones
        Button iniciarSesion = new Button("Entrar");
        iniciarSesion.setStyle("-fx-background-radius: 20; -fx-background-color: black; -fx-text-fill: white;");
        iniciarSesion.setPrefWidth(100);

        Button registro = new Button("Registrarse");
        registro.setStyle("-fx-background-radius: 20; -fx-background-color: black; -fx-text-fill: white;");
        registro.setPrefHeight(10);
        registro.setPrefWidth(100);

        // Línea divisoria
        Line line = new Line(0, 0, 400, 0);
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(1);

        // Contenedor de formulario
        VBox formulario = new VBox(20, texto, textoC, correo, textoPas, passw, iniciarSesion, line, registro);
        formulario.setAlignment(Pos.CENTER);
        formulario.setPadding(new Insets(40));
        formulario.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-padding: 20;");

        // Contenedor principal (división horizontal)
        HBox principal = new HBox(20, logo, formulario);
        principal.setAlignment(Pos.CENTER);
        principal.setPadding(new Insets(20));
        principal.setStyle("-fx-background-color: white;"); // Fondo blanco para el contenedor principal

        // Configuración de la escena en tamaño HD
        Scene scene = new Scene(principal, 1280, 720); // Tamaño HD
        stage.setTitle("RSCUA");
        stage.setScene(scene);

        // Bloquear redimensionamiento
        stage.setResizable(false);

        stage.show();
    }
}
