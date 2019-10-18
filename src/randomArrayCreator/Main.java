package randomArrayCreator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    Button btn;
    Button btn1;
    Button btn2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Random number set generator");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMaximized(true);
        HBox top = new HBox();
        HBox bottom = new HBox();
        GridPane right = new GridPane();
        GridPane array = new GridPane();
        GridPane inArray = new GridPane();
        Alert diag = new Alert(Alert.AlertType.INFORMATION);
        Label inArrLbl = new Label();
        RenderArray rnd = new RenderArray(100, array, inArray);
        GeneralUti genutl = new GeneralUti(diag);
        Button btn = new Button("Generate array");
        Button btn1 = new Button("Export");
        Button btn2 = new Button("Info");
        inArrLbl.setText("Picked > 1:");
        inArrLbl.setLabelFor(inArray);
        top.getChildren().addAll(btn1, btn2);
        bottom.getChildren().addAll(btn);
        top.setPadding(new Insets(10,10,10,10));
        bottom.setPadding(new Insets(10,10,10,10));
        array.setPadding(new Insets(10,10,10,10));
        inArray.setPadding(new Insets(10,10,10,10));
        inArrLbl.setPadding(new Insets(10,10,10,10));
        inArray.setHgap(10);
        inArray.setVgap(10);
        array.setVgap(10);
        array.setHgap(10);
        btn.setOnAction( e -> rnd.PrintArray());
        btn1.setOnAction( e -> genutl.dialogInfo());
        BorderPane bp = new BorderPane();
        bp.setTop(top);
        bp.setCenter(array);
        bp.setBottom(bottom);
        right.add(inArrLbl, 0, 0);
        right.add(inArray, 0,1);
        bp.setRight(right);
        bp.getStyleClass().add("background");
        top.getStyleClass().add("navbar");
        bottom.getStyleClass().add("footer");
        right.getStyleClass().add("inarr");
        array.getStyleClass().add("content");
        inArrLbl.getStyleClass().add("lbl");
        btn.getStyleClass().add("btn");
        btn1.getStyleClass().add("btn-menu");
        btn2.getStyleClass().add("btn-menu");
        Scene scene = new Scene(bp);
        scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}
