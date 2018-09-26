package PathsToSustainability;

import java.util.Scanner;


public class Transportation {
    private boolean isPublic;
    private boolean isGround;
    private int pointValue;
    Scanner scanner = new Scanner(System.in);

    public Transportation() {
        isPublic = false;
        isGround = false;
        pointValue = 0;
    }


    public void createTransportation() {
        String userSays = "";
        System.out.println("Did you a) walk or bike or b) use public transport?");
        userSays = scanner.nextLine();
        if (userSays.equals("a")) {
            this.setGround(true);
            int pointsEarned = 5;
            int newTotalPoints = this.addPoints(pointsEarned);
            // add new accomplishment to this user's list
            System.out.println("Congrats! You earned " + pointsEarned + " points and now have " + newTotalPoints + " points.");
            System.out.println("Would you like to add another accomplishment to your day?");
            userSays = scanner.nextLine();
            if (userSays.equals("yes")) {
                //stub
            }
            if (userSays.equals("no")) {
                System.out.println("No worries! Congrats on moving one step closer to sustainability!");
            }

        }
        if (userSays.equals("b")) {
            this.setPublic(true);
            int pointsEarned = 2;
            int newTotalPoints = this.addPoints(pointsEarned);
            // add new accomplishment to this user's list
            System.out.println("Congrats! You earned " + pointsEarned + " points and now have " + newTotalPoints + " points.");
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

    // MODIFIES: this
    // EFFECTS: categorizes Transport as Public
    public void setPublic(boolean b) {
        this.isPublic = b;
    }

    // MODIFIES: this
    // EFFECTS: categorizes Transport as Ground
    public void setGround(boolean b) {
        this.isGround = b;
    }

    // EFFECTS: returns isGround of Transportation
    public boolean getIsGround(){
        return this.isGround;
    }

    //EFFECTS: returns isPublic of Transportation
    public boolean getIsPublic(){
        return this.isPublic;
    }

    public int addPoints(int points){
        this.pointValue = pointValue + points;
        return this.pointValue;
    }

}
