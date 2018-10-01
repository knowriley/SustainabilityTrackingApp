package ui;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import model.Food;
import model.Clothes;
import model.Transportation;
import model.Education;

public class Main {
    private Food f;
    private Transportation transport;
    private Clothes clothing;
    private Education education;
    int pointValue = 0;
    Scanner scanner = new Scanner(System.in);

    public void execute() {
        User u = new User();
        while (true){
            String userSays = "";
            System.out.println("What did you do today to make a difference?");
            System.out.println("a) Ate Sustainably");
            System.out.println("b) Traveled Sustainably");
            System.out.println("c) Print your user fields");
            //System.out.println("c) Dressed Sustainably");
            //System.out.println("d) Educated Others");
            userSays = scanner.nextLine();
            if (userSays.equals("c")) {
                try {
                    u.save();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    break;
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    break;
                }
            }
            if (userSays.equals("a")) {
                Food f = new Food();
                System.out.println("Did you a) change your diet, or b) sort your waste appropriately?");
                userSays = scanner.nextLine();
                if (userSays.equals("a")) {
                    //f.setType(true);
                    System.out.println("Great! Did you...");
                    System.out.println("a) eat a vegetarian meal?");
                    System.out.println("b) eat a vegan meal?");
                    System.out.println("c) participate in MeatlessMonday?");}
                userSays = scanner.nextLine();
                if (userSays.equals("a")) {
                    int pointsEarned = 2;
                    f.addPoints(pointsEarned);
                    // add new accomplishment to this user's list
                    //System.out.println("Congrats! You earned " + pointsEarned + " points and now have " + newTotalPoints + " points.");
                    if (userSays.equals("yes")) {
                        new Main().execute();
                    }
                    if (userSays.equals("no")) {
                        System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                    }
                }
                if (userSays.equals("b")) {
                    int pointsEarned = 5;
//                    int newTotalPoints = f.addPoints(pointsEarned);
                    // add new accomplishment to this user's list
//                    System.out.println("Congrats! You earned " + pointsEarned + " points and now have " + newTotalPoints + " points.");
                    if (userSays.equals("yes")) {
                        //stub
                    }
                    if (userSays.equals("no")) {
                        System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                    }
                }
                if (userSays.equals("c")) {
                    int pointsEarned = 10;
                    //int newTotalPoints = f.addPoints(pointsEarned);
                    // add new accomplishment to this user's list
//                    System.out.println("Congrats! You earned " + pointsEarned + " points and now have " + newTotalPoints + " points.");
                    if (userSays.equals("yes")) {
                        //stub
                    }
                    if (userSays.equals("no")) {
                        System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                    }
                }
                if (userSays.equals("b")) {
                    //f.setOptionB(true);
                }
            }
            if (userSays.equals("b")){
                Transportation t = new Transportation();
                System.out.println("Did you a) walk or bike or b) use public transport?");
                userSays = scanner.nextLine();
                if (userSays.equals("a")) {
                    //t.setOptionB(true);
                    int pointsEarned = 5;
//                    int newTotalPoints = t.addPoints(pointsEarned);
                    // add new accomplishment to this user's list
//                    System.out.println("Congrats! You earned " + pointsEarned + " points and now have " + newTotalPoints + " points.");
//                    System.out.println("Would you like to add another accomplishment to your day?");
//                    userSays = scanner.nextLine();
                    if (userSays.equals("yes")) {
                        //stub
                    }
                    if (userSays.equals("no")) {
                        System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                    }

                }
                if (userSays.equals("b")) {
                    //t.setType(true);
                    int pointsEarned = 2;
                    //int newTotalPoints = t.addPoints(pointsEarned);
                    // add new accomplishment to this user's list
                    //System.out.println("Congrats! You earned " + pointsEarned + " points and now have " + newTotalPoints + " points.");
                    System.out.println("Would you like to add another accomplishment to your day?");
                    userSays = scanner.nextLine();
                    if (userSays.equals("yes")) {
                        // stub
                    }
                    if (userSays.equals("no")) {
                        // stub
                    }

                }
            }
        }
    }


    public static void main(String[] args) {
        Main instance = new Main();
        instance.execute();
    }


}
