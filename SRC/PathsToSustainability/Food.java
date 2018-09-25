package PathsToSustainability;

import java.util.Scanner;

public class Food {
    private boolean isMeal;
    private boolean isWaste;
    private int pointValue;
    Scanner scanner = new Scanner(System.in);

    public Food(){
        isMeal = false;
        isWaste = false;
        pointValue = 0;
    }

    public void createFood() {
        String userSays = "";
        Food food = new Food();
        System.out.println("Did you a) change your diet, or b) sort your waste appropriately?");
        userSays = scanner.nextLine();
        if (userSays.equals("a")) {
            food.setMeal(true);
            System.out.println("Great! Did you...");
            System.out.println("a) eat a vegetarian meal?");
            System.out.println("b) eat a vegan meal?");
            System.out.println("c) participate in MeatlessMonday?");}
            else if (userSays.equals("a")) {
                userSays = scanner.nextLine();
                if (userSays.equals("a")) {
                    int pointsEarned = 2;
                    int newTotalPoints = food.addPoints(2);
                    // add new accomplishment to this user's list
                    System.out.println("Congrats! You earned " + pointsEarned + " points and now have " + newTotalPoints + " points.");
                }
                if (userSays.equals("b")) {
                    int pointsEarned = 5;
                    int newTotalPoints = food.addPoints(2);
                    // add new accomplishment to this user's list
                    System.out.println("Congrats! You earned" + pointsEarned + "and now have" + newTotalPoints);
                }
                if (userSays.equals("c")) {
                    int pointsEarned = 10;
                    int newTotalPoints = food.addPoints(2);
                    // add new accomplishment to this user's list
                    System.out.println("Congrats! You earned" + pointsEarned + "and now have" + newTotalPoints);
                }
            }
            if (userSays.equals("b")) {
                food.setWaste(true);
            }
        }


    // MODIFIES: this
    // EFFECTS: categorizes Food as Meal
    public void setMeal(boolean b){
        this.isMeal = b;
    }

    // MODIFIES: this
    // EFFECTS: categorizes Food as Waste
    public void setWaste(boolean b){
        this.isWaste = b;
    }

    public int addPoints(int points){
        this.pointValue = pointValue + points;
        return this.pointValue;
    }

}
