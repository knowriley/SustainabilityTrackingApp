package ui;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import ui.User;

import model.*;

public class Main {
    private Food f;
    private Transportation t;
    private Clothes c;
    private Education e;
    private Waste w;
    int pointValue = 0;
    User user;
    Scanner scanner = new Scanner(System.in);

    public void execute() throws IOException {
        String userSays = "";
        System.out.println("Are you an a) new user or b) old user?");
        userSays = scanner.nextLine();
        user = new User();
        if (userSays.equals("a")){
            System.out.println("What is your name?");
            user.name = scanner.nextLine();
            System.out.println("Congrats, " + user.name + " on starting your sustainable journey!");}
            if (userSays.equals("b")){
            user.load("SavedUsers");
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
                    f = new Food();
                    f.setPointValue(2);
                    //add to users list of accomplishments
                    System.out.println("Congrats! Would you like to add another accomplishment?");
                    userSays = scanner.nextLine();
                    if (userSays.equals("yes")) {
                        new Main().execute(); //TODO: How do I make this go back to the top of the loop instead?
                    }
                    if (userSays.equals("no")) {
                        System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                        user.save("SavedUsers");
                        break;
                    }
                }
                if (userSays.equals("b")) {
                    f = new Food();
                    f.setPointValue(5);
                    //add to users list of accomplishments
                    System.out.println("Congrats! Would you like to add another accomplishment?");
                    userSays = scanner.nextLine();
                    if (userSays.equals("yes")) {
                        new Main().execute(); //TODO: How do I make this go back to the top of the loop instead?
                    }
                    if (userSays.equals("no")) {
                        System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                        break;
                    }
                }
                if (userSays.equals("c")) {
                    f = new Food();
                    f.setPointValue(10);
                    //add to users list of accomplishments
                    System.out.println("Congrats! Would you like to add another accomplishment?");
                    userSays = scanner.nextLine();
                    if (userSays.equals("yes")) {
                        new Main().execute(); //TODO: How do I make this go back to the top of the loop instead?
                    }
                    if (userSays.equals("no")) {
                        System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                        break;
                    }
                }
            }
            if (userSays.equals("b")){ }
            if (userSays.equals("c")){ }
            if (userSays.equals("d")){ }
            if (userSays.equals("e")){ }

                }
            }




    public static void main(String[] args) throws IOException {
        Main instance = new Main();
        instance.execute();
    }


}
