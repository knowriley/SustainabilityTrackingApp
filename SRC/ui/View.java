package ui;

import Exceptions.NoEasyGoalException;
import Exceptions.TooManyGoalsException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Accomplishment.Accomplishment;
import model.Accomplishment.Food;
import model.Accomplishment.Transportation;
import model.Goal;
import model.Type;
import model.User.User;
import model.User.UserGoals;

public class View extends Application{
    User activeUser;
    Goal activeGoal;
    Accomplishment activeAccomplishment;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
       welcomeState(primaryStage);
    }

    public void decideViewState(Stage primaryStage, State state){
        if (state.equals(State.WELCOME)) {
            welcomeState(primaryStage);}
            else if (state.equals(State.NEWUSER)) {
            newUserState(primaryStage);}
            else if (state.equals(State.OLDUSER))  {
            oldUserState(primaryStage);}
            else if (state.equals(State.MAINOPTIONS)) {
            mainOptionsState(primaryStage);}
            else if (state.equals(State.PROFILEVIEW)){
            profileViewState(primaryStage); }
            else if (state.equals(State.ADDGOAL)){
            addGoalState(primaryStage); }
            else if (state.equals(State.ADDACCOMPLISHMENT)){
            addAccomplishmentState(primaryStage); }
            else if (state.equals(State.HOWMANYPOINTS)){
            howManyPointsState(primaryStage); }
            else if (state.equals(State.FOODACCOMPLISHMENT)){
            foodAccomplishmentState(primaryStage); }
            else if (state.equals(State.TRANSPORTATIONACCOMPLISHMENT)){
            transportationAccomplishmentState(primaryStage); }
//            else if (state.equals(State.CLOTHESACCOMPLISHMENT)){
//            clothesAccomplishmentState(primaryStage); }
//            else if (state.equals(State.WASTEACCOMPLISHMENT)){
//            wasteAccomplishmentState(primaryStage); }
//            else if (state.equals(State.EDUCATIONACCOMPLISHMENT)){
//            educationAccomplishmentState(primaryStage); }
            else if (state.equals(State.RETURNHOME)) {
            returnToHomeState(primaryStage);
        }
    }

    private void returnToHomeState(Stage primaryStage) {
        GridPane grid = setStage(primaryStage);

        Text congrats = new Text("Congrats on your new goal or accomplishment!");
        congrats.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(congrats, 0, 0, 2, 1);

        Text pressToReturn = new Text("Press the enter key to return to the home page.");
        pressToReturn.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(pressToReturn, 0, 1, 2, 1);

        Button btnHome = new Button("Home");
        HBox hbBtnHome = new HBox(10);
        hbBtnHome.setAlignment(Pos.CENTER);
        hbBtnHome.getChildren().add(btnHome);
        grid.add(hbBtnHome, 0, 2);
        btnHome.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                decideViewState(primaryStage, State.MAINOPTIONS);
            }
        });

    }

    private void transportationAccomplishmentState(Stage primaryStage) {
        GridPane grid = setStage(primaryStage);

        Text greatDidYou = new Text("Great! Did you...");
        greatDidYou.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(greatDidYou, 0, 0, 2, 1);

        Button btnVegetarian = new Button("take public transport?");
        HBox hbBtnVegetarian = new HBox(10);
        hbBtnVegetarian.setAlignment(Pos.CENTER);
        hbBtnVegetarian.getChildren().add(btnVegetarian);
        grid.add(hbBtnVegetarian, 0, 1);
        btnVegetarian.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                activeAccomplishment = new Transportation(2, "Took public transport");
                activeUser.getAccomplishments().updateAccomplishments(activeAccomplishment);
                activeUser.updateTransportationPoints(activeAccomplishment);
                decideViewState(primaryStage, State.RETURNHOME);
            }
        });

        Button btnVegan = new Button("walk or bike?");
        HBox hbBtnVegan = new HBox(10);
        hbBtnVegan.setAlignment(Pos.CENTER);
        hbBtnVegan.getChildren().add(btnVegan);
        grid.add(hbBtnVegan, 0, 2);
        btnVegan.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                activeAccomplishment = new Transportation(3, "Walked or Biked");
                activeUser.getAccomplishments().updateAccomplishments(activeAccomplishment);
                activeUser.updateTransportationPoints(activeAccomplishment);
                decideViewState(primaryStage, State.RETURNHOME);
            }
        });
    }

    private void foodAccomplishmentState(Stage primaryStage) {
        GridPane grid = setStage(primaryStage);

        Text greatDidYou = new Text("Great! Did you...");
        greatDidYou.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(greatDidYou, 0, 0, 2, 1);

        Button btnVegetarian = new Button("eat a vegetarian meal?");
        HBox hbBtnVegetarian = new HBox(10);
        hbBtnVegetarian.setAlignment(Pos.CENTER);
        hbBtnVegetarian.getChildren().add(btnVegetarian);
        grid.add(hbBtnVegetarian, 0, 1);
        btnVegetarian.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                activeAccomplishment = new Food(2, "Ate a vegetarian meal");
                activeUser.getAccomplishments().updateAccomplishments(activeAccomplishment);
                activeUser.updateFoodPoints(activeAccomplishment);
                decideViewState(primaryStage, State.RETURNHOME);
            }
        });

        Button btnVegan = new Button("eat a vegan meal?");
        HBox hbBtnVegan = new HBox(10);
        hbBtnVegan.setAlignment(Pos.CENTER);
        hbBtnVegan.getChildren().add(btnVegan);
        grid.add(hbBtnVegan, 0, 2);
        btnVegan.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                activeAccomplishment = new Food(5, "Ate a vegan meal");
                activeUser.getAccomplishments().updateAccomplishments(activeAccomplishment);
                activeUser.updateFoodPoints(activeAccomplishment);
                decideViewState(primaryStage, State.RETURNHOME);
            }
        });

        Button btnMM = new Button("participate in Meatless Monday?");
        HBox hbBtnMM = new HBox(10);
        hbBtnMM.setAlignment(Pos.CENTER);
        hbBtnMM.getChildren().add(btnMM);
        grid.add(hbBtnMM, 0, 3);
        btnMM.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                activeAccomplishment = new Food(10, "participated in MeatlessMonday");
                activeUser.getAccomplishments().updateAccomplishments(activeAccomplishment);
                activeUser.updateFoodPoints(activeAccomplishment);
                decideViewState(primaryStage, State.RETURNHOME);
            }
        });




    }

    private void howManyPointsState(Stage primaryStage) {
        GridPane grid = setStage(primaryStage);

        Text howManyPoints = new Text("How many points would you like your goal to be?");
        howManyPoints.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(howManyPoints, 0, 0, 2, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Button btn = new Button("Enter");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                activeGoal.setPointGoal(Integer.parseInt(userTextField.getText()));
                decideViewState(primaryStage, State.RETURNHOME);
            }
        });

        HBox hBtn = new HBox(userTextField, btn);
        grid.add(hBtn, 1, 1);
    }


    private void addAccomplishmentState(Stage primaryStage){
        GridPane grid = setStage(primaryStage);

        Text accomplishmentType = new Text("What did you do today to make a differnece??");
        accomplishmentType.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(accomplishmentType, 0, 0, 2, 1);

        Button btnFood = new Button("Ate sustainably");
        HBox hbBtnFood = new HBox(10);
        hbBtnFood.setAlignment(Pos.CENTER);
        hbBtnFood.getChildren().add(btnFood);
        grid.add(hbBtnFood, 0, 1);
        btnFood.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                decideViewState(primaryStage, State.FOODACCOMPLISHMENT);
            }
        });

        Button btnTransportation = new Button("Traveled sustainably");
        HBox hbBtnTransportation = new HBox(10);
        hbBtnTransportation.setAlignment(Pos.CENTER);
        hbBtnTransportation.getChildren().add(btnTransportation);
        grid.add(hbBtnTransportation, 0, 2);
        btnTransportation.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                decideViewState(primaryStage, State.TRANSPORTATIONACCOMPLISHMENT);
            }
        });

//        Button btnClothes = new Button("Shopped sustainably");
//        HBox hbBtnClothes = new HBox(10);
//        hbBtnClothes.setAlignment(Pos.CENTER);
//        hbBtnClothes.getChildren().add(btnClothes);
//        grid.add(hbBtnClothes, 0, 3);
//        btnClothes.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                decideViewState(primaryStage, State.CLOTHESACCOMPLISHMENT);
//            }
//        });
//
//        Button btnWaste = new Button("Sorted waste sustainably");
//        HBox hbBtnWaste = new HBox(10);
//        hbBtnWaste.setAlignment(Pos.CENTER);
//        hbBtnWaste.getChildren().add(btnWaste);
//        grid.add(hbBtnWaste, 0, 4);
//        btnWaste.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                decideViewState(primaryStage, State.WASTEACCOMPLISHMENT);
//            }
//        });
//
//        Button btnEducation = new Button("Educated others");
//        HBox hbBtnEducation = new HBox(10);
//        hbBtnEducation.setAlignment(Pos.CENTER);
//        hbBtnEducation.getChildren().add(btnEducation);
//        grid.add(hbBtnEducation, 0, 5);
//        btnEducation.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                decideViewState(primaryStage, State.EDUCATIONACCOMPLISHMENT);
//            }
//        });
    }

    private GridPane setStage(Stage primaryStage) {
        ToolBar toolBar = new ToolBar();
        GridPane grid = makeGrid(primaryStage);

        Button back = new Button("Back");
        toolBar.getItems().add(back);
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // produce the previous state
            }
        });

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(toolBar);
        borderPane.setCenter(grid);
        Scene scene = new Scene(borderPane, 500, 400);
        primaryStage.setScene(scene);
        return grid;
    }

    private GridPane makeGrid(Stage primaryStage) {
        primaryStage.setTitle("Sustainability Tracker");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        return grid;
    }

    private void addGoalState(Stage primaryStage) {
        GridPane grid = setStage(primaryStage);

        Text accomplishmentType = new Text("What type of goal would you like to add?");
        accomplishmentType.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(accomplishmentType, 0, 0, 2, 1);

        Button btnFood = new Button("Food");
        HBox hbBtnFood = new HBox(10);
        hbBtnFood.setAlignment(Pos.CENTER);
        hbBtnFood.getChildren().add(btnFood);
        grid.add(hbBtnFood, 0, 1);
        btnFood.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                activeGoal = new Goal(Type.FOOD, 1);
                try {
                    activeUser.getGoals().addGoal(activeGoal);
                } catch (TooManyGoalsException e) {
                    e.printStackTrace();
                } catch (NoEasyGoalException e) {
                    e.printStackTrace();
                }

                decideViewState(primaryStage, State.HOWMANYPOINTS);
            }
        });

        Button btnTransportation = new Button("Transportation");
        HBox hbBtnTransportation = new HBox(10);
        hbBtnTransportation.setAlignment(Pos.CENTER);
        hbBtnTransportation.getChildren().add(btnTransportation);
        grid.add(hbBtnTransportation, 0, 2);
        btnTransportation.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                activeGoal = new Goal(Type.TRANSPORTATION, 1);
                try {
                    activeUser.getGoals().addGoal(activeGoal);
                } catch (TooManyGoalsException e) {
                    e.printStackTrace();
                } catch (NoEasyGoalException e) {
                    e.printStackTrace();
                }

                decideViewState(primaryStage, State.HOWMANYPOINTS);
            }
        });

        Button btnClothes = new Button("Clothes");
        HBox hbBtnClothes = new HBox(10);
        hbBtnClothes.setAlignment(Pos.CENTER);
        hbBtnClothes.getChildren().add(btnClothes);
        grid.add(hbBtnClothes, 0, 3);
        btnClothes.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                activeGoal = new Goal(Type.CLOTHES, 1);
                try {
                    activeUser.getGoals().addGoal(activeGoal);
                } catch (TooManyGoalsException e) {
                    e.printStackTrace();
                } catch (NoEasyGoalException e) {
                    e.printStackTrace();
                }

                decideViewState(primaryStage, State.HOWMANYPOINTS);
            }
        });

        Button btnWaste = new Button("Waste");
        HBox hbBtnWaste = new HBox(10);
        hbBtnWaste.setAlignment(Pos.CENTER);
        hbBtnWaste.getChildren().add(btnWaste);
        grid.add(hbBtnWaste, 0, 4);
        btnWaste.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                activeGoal = new Goal(Type.WASTE, 1);
                try {
                    activeUser.getGoals().addGoal(activeGoal);
                } catch (TooManyGoalsException e) {
                    e.printStackTrace();
                } catch (NoEasyGoalException e) {
                    e.printStackTrace();
                }

                decideViewState(primaryStage, State.HOWMANYPOINTS);
            }
        });

        Button btnEducation = new Button("Education");
        HBox hbBtnEducation = new HBox(10);
        hbBtnEducation.setAlignment(Pos.CENTER);
        hbBtnEducation.getChildren().add(btnEducation);
        grid.add(hbBtnEducation, 0, 5);
        btnEducation.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                activeGoal = new Goal(Type.EDUCATION, 1);
                try {
                    activeUser.getGoals().addGoal(activeGoal);
                } catch (TooManyGoalsException e) {
                    e.printStackTrace();
                } catch (NoEasyGoalException e) {
                    e.printStackTrace();
                }

                decideViewState(primaryStage, State.HOWMANYPOINTS);
            }
        });
    }


    private void profileViewState(Stage primaryStage) {
        GridPane grid = setStage(primaryStage);

        Text name = new Text("Name: " + activeUser.getName());
        name.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(name, 0, 0, 2, 1);

        Text goals = new Text("Goals: " + activeUser.getGoals());
        goals.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(goals, 0, 1, 2, 1);

        Text accomplishments = new Text("Accomplishments: " + activeUser.getAccomplishments());
        accomplishments.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(accomplishments, 0, 2, 2, 1);

        Text totalPoints = new Text("Total Points: " + activeUser.getTotalPoints());
        totalPoints.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(totalPoints, 0, 3, 2, 1);

        Text foodPoints = new Text("Food Points: " + activeUser.getFoodPoints());
        foodPoints.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(foodPoints, 0, 4, 2, 1);

        Text transportationPoints = new Text("Transportation Points: " + activeUser.getTransportationPoints());
        transportationPoints.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(transportationPoints, 0, 5, 2, 1);

        Text clothesPoints = new Text("Clothes Points: " + activeUser.getClothesPoints());
        clothesPoints.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(clothesPoints, 0, 6, 2, 1);

        Text wastePoints = new Text("Waste Points: " + activeUser.getWastePoints());
        wastePoints.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(wastePoints, 0, 7, 2, 1);

        Text educationPoints = new Text("Education Points: " + activeUser.getEducationPoints());
        educationPoints.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(educationPoints, 0, 8, 2, 1);



    }

    private void welcomeState(Stage primaryStage) {
        GridPane grid = setStage(primaryStage);

        Text areYouA = new Text("Welcome! Are you a...");
        areYouA.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(areYouA, 0, 0, 2, 1);
        Button btnNew = new Button("New User?");
        HBox hbBtnNew = new HBox(10);
        hbBtnNew.setAlignment(Pos.CENTER);
        hbBtnNew.getChildren().add(btnNew);
        grid.add(hbBtnNew, 1, 1);
        btnNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                decideViewState(primaryStage, State.NEWUSER);
            }
        });


        Button btnOld = new Button("Old User?");
        HBox hbBtnOld = new HBox(10);
        hbBtnOld.setAlignment(Pos.CENTER);
        hbBtnOld.getChildren().add(btnOld);
        grid.add(hbBtnOld, 1, 2);
        btnOld.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                decideViewState(primaryStage, State.OLDUSER);
            }
        });

        primaryStage.show();

    }

    private void mainOptionsState(Stage primaryStage) {
        GridPane grid = setStage(primaryStage);

        String activeUserName = activeUser.getName();
        Text title1 = new Text("Hello, " + activeUserName + "!");
        title1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(title1, 1, 1);

        Text title2 = new Text("What would you like to do?");
        title2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(title2, 1, 2);

        Button btn1 = new Button("View Profile");
        HBox hbBtn1 = new HBox(10);
        hbBtn1.setAlignment(Pos.CENTER);
        hbBtn1.getChildren().add(btn1);
        grid.add(hbBtn1, 1, 3);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                decideViewState(primaryStage, State.PROFILEVIEW);
            }
        });

        Button btn2 = new Button("Add Goal");
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.CENTER);
        hbBtn2.getChildren().add(btn2);
        grid.add(hbBtn2, 1, 4);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               decideViewState(primaryStage, State.ADDGOAL);
            }
        });

        Button btn3 = new Button("Add Accomplishment");
        HBox hbBtn3 = new HBox(10);
        hbBtn3.setAlignment(Pos.CENTER);
        hbBtn3.getChildren().add(btn3);
        grid.add(hbBtn3, 1, 5);
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                decideViewState(primaryStage, State.ADDACCOMPLISHMENT);
            }
        });

        Button btn4 = new Button("Save and Quit");
        HBox hbBtn4 = new HBox(10);
        hbBtn4.setAlignment(Pos.CENTER);
        hbBtn4.getChildren().add(btn4);
        grid.add(hbBtn4, 1, 6);
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });

        primaryStage.show();

    }

    private void newUserState(Stage primaryStage) {
        GridPane grid = setStage(primaryStage);

        Text scenetitle = new Text("Welcome, new user! Tell us your name so you can get started!");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(scenetitle, 0, 0, 2, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Button btn = new Button("Enter");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                activeUser = new User();
                activeUser.setName(userTextField.getText());
                decideViewState(primaryStage, State.MAINOPTIONS);
            }
        });

        HBox hBtn = new HBox(userTextField, btn);
        grid.add(hBtn, 0, 1);
        hBtn.setAlignment(Pos.BOTTOM_RIGHT);
    }

    private void oldUserState(Stage primaryStage) {
        GridPane grid = setStage(primaryStage);

        Text scenetitle = new Text("Welcome back! Tell us your name so we can find you!");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(scenetitle, 0, 0, 2, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Button btn = new Button("Enter");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                activeUser = new User();
                activeUser.setName(userTextField.getText());
                decideViewState(primaryStage, State.MAINOPTIONS);
            }
        });

        HBox hBtn = new HBox(userTextField, btn);
        grid.add(hBtn, 1, 1);

        primaryStage.show();
    }


}
