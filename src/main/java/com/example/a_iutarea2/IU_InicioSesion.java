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
        String imagePath = "file:C:/Users/Admin/IdeaProjects/A_IUTAREA2/src/main/java/com/example/a_iutarea2/pruebaL.jpg";
        Image img = new Image(imagePath);

        // Logo con tamaño ajustado
        ImageView imgView = new ImageView(img);
        imgView.setPreserveRatio(true);
        imgView.setFitWidth(500); // Ajustar ancho para que sea proporcionado

        // Contenedor para el logo
        VBox logo = new VBox(imgView);
        logo.setAlignment(Pos.CENTER);
        logo.setPadding(new Insets(10));
        logo.setStyle("-fx-background-color: #FFF;");

        // Título
        Text texto = new Text("Crea cuenta:");
        texto.setFont(Font.font("Arial", 24));
        texto.setFill(Color.BLACK);

        // Campos de texto
        TextField nombre = new TextField();
        Label textoNom = new Label("Nombre completo:");
        nombre.setPromptText("Nombre completo");
        nombre.setStyle("-fx-background-radius: 10; -fx-background-color: #000; -fx-text-fill: white;");
        nombre.setPrefWidth(300);

        TextField nombreUsuario = new TextField();
        Label textoNomUser = new Label("Nombre de usuario:");
        nombreUsuario.setPromptText("Nombre de usuario");
        nombreUsuario.setStyle("-fx-background-radius: 10; -fx-background-color: #000; -fx-text-fill: white;");
        nombreUsuario.setPrefWidth(300);

        TextField correo = new TextField();
        Label textoC = new Label("Correo electrónico:");
        correo.setPromptText("Correo electrónico");
        correo.setStyle("-fx-background-radius: 10; -fx-background-color: #000; -fx-text-fill: white;");
        correo.setPrefWidth(300);

        PasswordField passw = new PasswordField();
        Label textoPas = new Label("Contraseña:");
        passw.setPromptText("Contraseña");
        passw.setStyle("-fx-background-radius: 10; -fx-background-color: #000; -fx-text-fill: white;");
        passw.setPrefWidth(300);

        PasswordField passwCon = new PasswordField();
        Label textoPasCon = new Label("Confirmar contraseña:");
        passwCon.setPromptText("Confirmar contraseña");
        passwCon.setStyle("-fx-background-radius: 10; -fx-background-color: #000; -fx-text-fill: white;");
        passwCon.setPrefWidth(300);

        // ComboBox para Día
        ComboBox<String> dia = new ComboBox<>();
        for (int i = 1; i <= 31; i++) {
            dia.getItems().add(String.valueOf(i));
        }
        dia.setValue("Día");
        dia.setStyle("-fx-background-radius: 10; -fx-background-color: black; -fx-text-fill: white;");
        dia.setCellFactory(lv -> {
            ListCell<String> cell = new ListCell<>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    setText(item);
                    setStyle(empty ? "" : "-fx-background-color: black; -fx-text-fill: white;");
                }
            };
            return cell;
        });
        dia.setButtonCell(new ListCell<>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                setText(item);
                setStyle(" -fx-background-radius: 10; -fx-background-color: black; -fx-text-fill: white;");
            }
        });

        // ComboBox para Mes
        ComboBox<String> mes = new ComboBox<>();
        mes.getItems().addAll(
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        );
        mes.setValue("Mes");
        mes.setStyle("-fx-background-radius: 10; -fx-background-color: black; -fx-text-fill: white;");
        mes.setCellFactory(lv -> {
            ListCell<String> cell = new ListCell<>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    setText(item);
                    setStyle(empty ? "" : "-fx-background-color: black; -fx-text-fill: white;");
                }
            };
            return cell;
        });
        mes.setButtonCell(new ListCell<>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                setText(item);
                setStyle("-fx-background-radius: 10; -fx-background-color: black; -fx-text-fill: white;");
            }
        });

        // ComboBox para Año
        ComboBox<String> anio = new ComboBox<>();
        for (int i = 1944; i <= 2024; i++) {
            anio.getItems().add(String.valueOf(i));
        }
        anio.setValue("Año");
        anio.setStyle("-fx-background-radius: 10; -fx-background-color: black; -fx-text-fill: white;");
        anio.setCellFactory(lv -> {
            ListCell<String> cell = new ListCell<>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    setText(item);
                    setStyle(empty ? "" : " -fx-background-color: black; -fx-text-fill: white;");
                }
            };
            return cell;
        });

        anio.setButtonCell(new ListCell<>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                setText(item);
                setStyle("-fx-background-radius: 10; -fx-background-color: black; -fx-text-fill: white;");
            }
        });

        // ComboBox para Año
        ComboBox<String> sexo = new ComboBox<>();
        sexo.getItems().addAll(
                "Femenino", "Masculino", "Neutro"
        );
        sexo.setValue("Sexo");
        sexo.setStyle("-fx-background-radius: 10; -fx-background-color: black; -fx-text-fill: white;");
        sexo.setCellFactory(lv -> {
            ListCell<String> cell = new ListCell<>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    setText(item);
                    setStyle(empty ? "" : "-fx-background-color: black; -fx-text-fill: white;");
                    setPrefWidth(300);
                }
            };
            return cell;
        });

        sexo.setButtonCell(new ListCell<>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                setText(item);
                setStyle(" -fx-background-radius: 10; -fx-background-color: black; -fx-text-fill: white;");
            }
        });

        // Contenedor para Fecha de Nacimiento
        HBox fechaNacimiento = new HBox(10, dia, mes, anio);
        fechaNacimiento.setAlignment(Pos.CENTER);

        // Botón de registro
        Button registro = new Button("Registrarse");
        registro.setStyle("-fx-background-radius: 20; -fx-background-color: black; -fx-text-fill: white;");
        registro.setPrefWidth(200);

        // Línea divisoria
        Line line = new Line(0, 0, 300, 0);
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(1);

        // Contenedor de formulario
        VBox formulario = new VBox(5, texto, textoNom, nombre, textoNomUser, nombreUsuario,
                textoC, correo, textoPas, passw, textoPasCon, passwCon, fechaNacimiento, sexo, line, registro);
        formulario.setAlignment(Pos.CENTER);
        formulario.setPadding(new Insets(20));
        formulario.setStyle("-fx-border-color: black; -fx-border-radius: 10; -fx-padding: 20;");

        // Contenedor principal
        HBox principal = new HBox(20, logo, formulario);
        principal.setAlignment(Pos.CENTER);
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

