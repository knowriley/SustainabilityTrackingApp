package ui;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import model.*;

public class Main {
    private Accomplishment food;
    private Accomplishment transportation;
    private Accomplishment clothes;
    private Accomplishment education;
    private Accomplishment waste;
    int pointValue = 0;
    private User user;
    private UserManager userManager = new UserManager();
    private List<User> savedUsers;
    Scanner scanner = new Scanner(System.in);


    public void execute() throws IOException {
        String userSays = "";
        user = new User();
        System.out.println("Are you an a) new user or b) old user?");
        userSays = scanner.nextLine();
        if (userSays.equals("a")){
            System.out.println("What is your name?");
            user.setName(scanner.nextLine());
            userManager.getSavedUsers().add(user);
            System.out.println("Congrats, " + user.getName() + " on starting your sustainable journey!");
        } else if (userSays.equals("b")){
            userManager.load("saved_users.txt");
            System.out.println("What is your name?");
            userSays = scanner.nextLine();
            userManager.findUser(userSays);
            System.out.println("Welcome back, " + user.getName() + " ");
            System.out.println("Would you like to...");
            System.out.println("a) Add an accomplishment");
            System.out.println("b) View profile");
            userSays = scanner.nextLine();
            if (userSays.equals("b")){
                System.out.println("Name: " + user.getName());
                System.out.println("Accomplishments: " + user.getAccomplishments());
                System.out.println("Total Points: " + user.getTotalPoints());
                System.out.println("Food Points: " + user.getFoodPoints());
                System.out.println("Transportation Points: " + user.getTransportationPoints());
                System.out.println("Clothes Points: " + user.getClothesPoints());
                System.out.println("Education Points: " + user.getEducationPoints());
            }
        }

        while (true) {
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
                    food = new Food();
                    food.setName("Ate a vegetarian meal");
                    food.setPointValue(2);
                    user.addFoodPoints(food.getPointValue());
                    user.addTotalPoints(food.getPointValue());
                    user.getAccomplishments().add(food); //TODO: What does this mean? How do I fix?
                    food.motivationStatement();
                    System.out.println("Congrats, " + user.getName() + "! You have earned " + food.getPointValue() + " points and now have a total of " + user.getTotalPoints() + " .");
                    System.out.println("Would you like to add another accomplishment?");
                    userSays = scanner.nextLine();
                    if (userSays.equals("yes")) {
                        continue;
                    }
                    else if (userSays.equals("no")) {
                        System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                        userManager = new UserManager();
                        //user.save("saved_users.txt");
                        break;
                    }
                }
                if (userSays.equals("b")) {
                    food = new Food();
                    food.setName("Ate a vegan meal");
                    food.setPointValue(5);
                    user.addFoodPoints(food.getPointValue());
                    user.addTotalPoints(food.getPointValue());
                    user.getAccomplishments().add(food);
                    food.motivationStatement();
                    System.out.println("Congrats, " + user.getName() + "! You have earned " + food.getPointValue() + " points and now have a total of " + user.getTotalPoints() + " points.");
                    System.out.println("Would you like to add another accomplishment?");
                    userSays = scanner.nextLine();
                    if (userSays.equals("yes")) {
                        continue;
                    }
                    else if (userSays.equals("no")) {
                        System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                        userManager = new UserManager(user);
                        //user.save("saved_users.txt");
                        break;
                    }
                }
                if (userSays.equals("c")) {
                    food = new Food();
                    food.setName("participated in MeatlessMonday");
                    food.setPointValue(10);
                    user.addFoodPoints(food.getPointValue());
                    user.addTotalPoints(food.getPointValue());
                    food.motivationStatement();
                    user.getAccomplishments().add(food);
                    System.out.println("Congrats, " + user.getName() + "! You have earned " + food.getPointValue() + " points and now have a total of " + user.getTotalPoints() + " points.");
                    System.out.println("Would you like to add another accomplishment?");
                    userSays = scanner.nextLine();
                    if (userSays.equals("yes")) {
                        continue;
                    }
                    else if (userSays.equals("no")) {
                        System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                        userManager = new UserManager(user);
                        //user.save("saved_users.txt");
                        break;
                    }
                }
            }
            else if (userSays.equals("b")){
                System.out.println("Great! Did you...");
                System.out.println("a) walk or bike.");
                System.out.println("b) take public transport.");
                userSays = scanner.nextLine();
                if (userSays.equals("a")){
                    transportation = new Transportation();
                    transportation.setName("Walked or biked");
                    transportation.setPointValue(3);
                    user.addTransportationPoints(transportation.getPointValue());
                    user.addTotalPoints(transportation.getPointValue());
                    transportation.motivationStatement();
                    user.getAccomplishments().add(transportation);
                    System.out.println("Congrats, " + user.getName() + "! You have earned " + transportation.getPointValue() + " points and now have a total of " + user.getTotalPoints() + " points.");
                    System.out.println("Would you like to add another accomplishment?");
                    userSays = scanner.nextLine();
                    if (userSays.equals("yes")) {
                        continue;
                    }
                    else if (userSays.equals("no")) {
                        System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                        userManager = new UserManager(user);
                        //user.save("saved_users.txt");
                        break;
                    }
                }
                else if (userSays.equals("b")){
                    transportation = new Transportation();
                    transportation.setName("Took public transport");
                    transportation.setPointValue(2);
                    user.addTransportationPoints(transportation.getPointValue());
                    user.addTotalPoints(transportation.getPointValue());
                    transportation.motivationStatement();
                    user.getAccomplishments().add(transportation);
                    System.out.println("Congrats, " + user.getName() + "! You have earned " + transportation.getPointValue() + " points and now have a total of " + user.getTotalPoints() + " points.");
                    System.out.println("Would you like to add another accomplishment?");
                    userSays = scanner.nextLine();
                    if (userSays.equals("yes")) {
                        continue;
                    }
                    else if (userSays.equals("no")) {
                        System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                        userManager = new UserManager(user);
                        //user.save("saved_users.txt");
                        break;
                    }
                }
            }
            else if (userSays.equals("c")){ }
            else if (userSays.equals("d")){ }
            else if (userSays.equals("e")){ }

                }
            }




    public static void main(String[] args) throws IOException {
        Main instance = new Main();
        instance.execute();
    }


}
