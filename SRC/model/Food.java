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
        System.out.println("Did you a) change your diet, or b) sort your waste appropriately?");
        userSays = scanner.nextLine();
        if (userSays.equals("a")) {
            this.setMeal(true);
            System.out.println("Great! Did you...");
            System.out.println("a) eat a vegetarian meal?");
            System.out.println("b) eat a vegan meal?");
            System.out.println("c) participate in MeatlessMonday?");}
            userSays = scanner.nextLine();
            if (userSays.equals("a")) {
                int pointsEarned = 2;
                int newTotalPoints = this.addPoints(pointsEarned);
                // add new accomplishment to this user's list
                System.out.println("Congrats! You earned " + pointsEarned + " points and now have " + newTotalPoints + " points.");
                if (userSays.equals("yes")) {
                    //stub
                }
                if (userSays.equals("no")) {
                    System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                }
            }
            if (userSays.equals("b")) {
                int pointsEarned = 5;
                int newTotalPoints = this.addPoints(pointsEarned);
                // add new accomplishment to this user's list
                System.out.println("Congrats! You earned " + pointsEarned + " points and now have " + newTotalPoints + " points.");
                if (userSays.equals("yes")) {
                    //stub
                }
                if (userSays.equals("no")) {
                    System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                }
                }
                if (userSays.equals("c")) {
                    int pointsEarned = 10;
                    int newTotalPoints = this.addPoints(pointsEarned);
                    // add new accomplishment to this user's list
                    System.out.println("Congrats! You earned " + pointsEarned + " points and now have " + newTotalPoints + " points.");
                    if (userSays.equals("yes")) {
                        //stub
                    }
                    if (userSays.equals("no")) {
                        System.out.println("No worries! Congrats on moving one step closer to sustainability!");
                    }
                }
         if (userSays.equals("b")) {
                this.setWaste(true);
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

    //EFFECTS: returns isWaste of Food
    public boolean getIsWaste(){
        return this.isWaste;
    }

    //EFFECTS: returns isMeal of Food
    public boolean getIsMeal(){
        return this.isMeal;
    }

    public int addPoints(int points){
        this.pointValue = pointValue + points;
        return this.pointValue;
    }

}
