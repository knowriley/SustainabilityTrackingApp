package ui;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import Exceptions.NoEasyGoalException;
import Exceptions.NotAnOptionException;
import Exceptions.TooManyGoalsException;
import model.*;
import model.Accomplishment.Accomplishment;
import model.Accomplishment.Food;
import model.Accomplishment.Transportation;
import model.User.User;

public class Main {
    private Accomplishment food;
    private Accomplishment transportation;
    private Accomplishment clothes;
    private Accomplishment education;
    private Accomplishment waste;
    int pointValue = 0;
    private User user;
    private UserManager userManager = UserManager.getInstance();
    private List<User> savedUsers;
    Scanner scanner = new Scanner(System.in);


    public void execute() throws IOException, NotAnOptionException {
        String userSays = "";
        user = new User();
        System.out.println("Are you an a) new user or b) old user?");
        userSays = scanner.nextLine();
        if (userSays.equals("a")){
            System.out.println("What is your name?");
            user.setName(scanner.nextLine());
            userManager.getUsers().add(user);
            System.out.println("Congrats, " + user.getName() + " on starting your sustainable journey!");
        } else if (userSays.equals("b")){
            System.out.println("What is your name?");
            userSays = scanner.nextLine();
            userManager.load("saved_users.txt", userSays);
            System.out.println("Welcome back, " + user.getName() + " ");
        }
        else throw new NotAnOptionException();

        while (true) {
            System.out.println("Would you like to...");
            System.out.println("a) View profile");
            System.out.println("b) Set a goal");
            System.out.println("c) Add an accomplishment");
            System.out.println("d) Save and quit");
            userSays = scanner.nextLine();
            if (userSays.equals("a")) {
                showUser();
            } else if (userSays.equals("b")) {
                System.out.println("What type of goal would you like to set?");
                System.out.println("a) Food");
                System.out.println("b) Transportation");
                System.out.println("c) Clothing");
                System.out.println("d) Waste");
                System.out.println("e) Education");
                userSays = scanner.nextLine();
                if (userSays.equals("a")){
                    System.out.println("Please enter the number of points you would like to reach.");
                    userSays = scanner.nextLine();
                    int pointGoal = Integer.parseInt(userSays);
                    Goal g = new Goal(Type.FOOD, pointGoal);
                    attemptAddGoal(g);
                    System.out.println("Congratulations on setting a goal!");
                }
                else if (userSays.equals("b")){
                    System.out.println("Please enter the number of points you would like to reach.");
                    userSays = scanner.nextLine();
                    int pointGoal = Integer.parseInt(userSays);
                    Goal g = new Goal(Type.TRANSPORTATION, pointGoal);
                    attemptAddGoal(g);
                    System.out.println("Congratulations on setting a goal!");
                }
                else if (userSays.equals("c")){
                    System.out.println("Please enter the number of points you would like to reach.");
                    userSays = scanner.nextLine();
                    int pointGoal = Integer.parseInt(userSays);
                    Goal g = new Goal(Type.CLOTHES, pointGoal);
                    attemptAddGoal(g);
                    System.out.println("Congratulations on setting a goal!");
                }
                else if (userSays.equals("d")){
                    System.out.println("Please enter the number of points you would like to reach.");
                    userSays = scanner.nextLine();
                    int pointGoal = Integer.parseInt(userSays);
                    Goal g = new Goal(Type.WASTE, pointGoal);
                    attemptAddGoal(g);
                    System.out.println("Congratulations on setting a goal!");
                }
                else if (userSays.equals("e")){
                    System.out.println("Please enter the number of points you would like to reach.");
                    userSays = scanner.nextLine();
                    int pointGoal = Integer.parseInt(userSays);
                    Goal g = new Goal(Type.EDUCATION, pointGoal);
                    attemptAddGoal(g);
                    System.out.println("Congratulations on setting a goal!");
                }
            } else if (userSays.equals("c")) {
                System.out.println("What did you do today to make a difference?");
                System.out.println("a) Ate Sustainably");
                System.out.println("b) Traveled Sustainably");
                System.out.println("c) Dressed Sustainably");
                System.out.println("d) Sorted my waste properly");
                System.out.println("e) Educated Others");
                userSays = scanner.nextLine();
                if (userSays.equals("a")) {
                    System.out.println("Great! Did you...");
                    System.out.println("a) eat a vegetarian meal?");
                    System.out.println("b) eat a vegan meal?");
                    System.out.println("c) participate in MeatlessMonday?");
                    userSays = scanner.nextLine();
                    if (userSays.equals("a")) {
                        food = new Food(2, "Ate a vegetarian meal");
                        user.getAccomplishments().updateAccomplishments(food);
                        user.updateFoodPoints(food);
                        System.out.println("Congrats, " + user.getName() + "! You have earned " + food.getPointValue() + " points and now have a total of " + user.getTotalPoints() + " .");
                        continue;
                    }
                    if (userSays.equals("b")) {
                        food = new Food(5, "Ate a vegan meal");
                        user.getAccomplishments().updateAccomplishments(food);
                        user.updateFoodPoints(food);
                        System.out.println("Congrats, " + user.getName() + "! You have earned " + food.getPointValue() + " points and now have a total of " + user.getTotalPoints() + " points.");
                        continue;
                    }
                    if (userSays.equals("c")) {
                        food = new Food(10, "participated in MeatlessMonday");
                        user.getAccomplishments().updateAccomplishments(food);
                        user.updateFoodPoints(food);
                        System.out.println("Congrats, " + user.getName() + "! You have earned " + food.getPointValue() + " points and now have a total of " + user.getTotalPoints() + " points.");
                        continue;
                    } else throw new NotAnOptionException();
                } else if (userSays.equals("b")) {
                    System.out.println("Great! Did you...");
                    System.out.println("a) walk or bike.");
                    System.out.println("b) take public transport.");
                    userSays = scanner.nextLine();
                    if (userSays.equals("a")) {
                        transportation = new Transportation(3, "Walked or biked");
                        user.getAccomplishments().updateAccomplishments(transportation);
                        user.updateFoodPoints(transportation);
                        System.out.println("Congrats, " + user.getName() + "! You have earned " + transportation.getPointValue() + " points and now have a total of " + user.getTotalPoints() + " points.");
                        continue;
                    } else if (userSays.equals("b")) {
                        transportation = new Transportation(2, "Took public transport");
                        user.getAccomplishments().updateAccomplishments(transportation);
                        user.updateFoodPoints(transportation);
                        System.out.println("Congrats, " + user.getName() + "! You have earned " + transportation.getPointValue() + " points and now have a total of " + user.getTotalPoints() + " points.");
                        continue;
                    } else throw new NotAnOptionException();
                } else if (userSays.equals("c")) {
                } else if (userSays.equals("d")) {
                } else if (userSays.equals("e")) {
                } else throw new NotAnOptionException();

            } else if (userSays.equals("d")){
                userManager.getUsers().add(user);
                //userManager.saveJSONObject();
                break;
            }
        }
    }

    private void attemptAddGoal(Goal g) {
        try {
            user.getGoals().addGoal(g);
        } catch (NoEasyGoalException e) {
            System.out.println("You cannot make a goal of zero points.");
        }catch (TooManyGoalsException e) {
            System.out.println("You cannot have more than three goals at a time.");
        }
    }


    private void showUser() {
        System.out.println("Name: " + user.getName());
        System.out.println("Goals: " + user.getGoals());
        System.out.println("Accomplishments: " + user.getAccomplishments());
        System.out.println("Total Points: " + user.getTotalPoints());
        System.out.println("Food Points: " + user.getFoodPoints());
        System.out.println("Transportation Points: " + user.getTransportationPoints());
        System.out.println("Clothes Points: " + user.getClothesPoints());
        System.out.println("Waste Points: " + user.getWastePoints());
        System.out.println("Education Points: " + user.getEducationPoints());
    }


    public static void main(String[] args) throws IOException, NotAnOptionException {
        Main instance = new Main();
        try { instance.execute();
        }
        catch (NotAnOptionException e) {
            System.out.println("You must choose one of the options listed.");
        } finally {
            System.out.println("Don't forget to input your next sustainable activity!");
        }

    }


}
