package ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.User.Observable;

import java.util.List;

public class View extends Application implements Observer{
    private List<Observable> observables;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sustainability Tracker");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        //welcomeState(grid);
        //newUserState(grid);
        //oldUserState(grid);
        mainOptionsState(grid);

        primaryStage.show();
    }

    private void welcomeState(GridPane grid) {
        Text areYouA = new Text("Welcome! Are you a...");
        areYouA.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(areYouA, 0, 0, 2, 1);
        Button btnNew = new Button("New User?");
        HBox hbBtnNew = new HBox(10);
        hbBtnNew.setAlignment(Pos.CENTER);
        hbBtnNew.getChildren().add(btnNew);
        grid.add(hbBtnNew, 1, 1);

        Button btnOld = new Button("Old User?");
        HBox hbBtnOld = new HBox(10);
        hbBtnOld.setAlignment(Pos.CENTER);
        hbBtnOld.getChildren().add(btnOld);
        grid.add(hbBtnOld, 1, 2);
    }

    private void mainOptionsState(GridPane grid) {
        Text title = new Text("What would you like to do?");
        title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(title, 1, 1);

        Button btn1 = new Button("View Profile");
        HBox hbBtn1 = new HBox(10);
        hbBtn1.setAlignment(Pos.CENTER);
        hbBtn1.getChildren().add(btn1);
        grid.add(hbBtn1, 1, 2);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //produce the next state
            }
        });

        Button btn2 = new Button("Add Goal");
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.CENTER);
        hbBtn2.getChildren().add(btn2);
        grid.add(hbBtn2, 1, 3);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //produce the next state
            }
        });

        Button btn3 = new Button("Add Accomplishment");
        HBox hbBtn3 = new HBox(10);
        hbBtn3.setAlignment(Pos.CENTER);
        hbBtn3.getChildren().add(btn3);
        grid.add(hbBtn3, 1, 4);
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //produce the next state
            }
        });

        Button btn4 = new Button("Save and Quit");
        HBox hbBtn4 = new HBox(10);
        hbBtn4.setAlignment(Pos.CENTER);
        hbBtn4.getChildren().add(btn4);
        grid.add(hbBtn4, 1, 5);
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //produce the next state
            }
        });
    }

    private void newUserState(GridPane grid) {
        Text scenetitle = new Text("Welcome, new user! Tell us your name so you can get started!");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(scenetitle, 0, 0, 2, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
    }

    private void oldUserState(GridPane grid) {
        Text scenetitle = new Text("Welcome back! Tell us your name so we can find you!");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(scenetitle, 0, 0, 2, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
    }

    public void update(){
        //stub
    }
}
