package ui;
import java.util.Scanner;
import PathsToSustainability.Food;
import PathsToSustainability.Clothes;
import PathsToSustainability.Transportation;
import PathsToSustainability.Education;

public class SustainableAF {
    //private Food food;
//    private Transportation transport;
//    private Clothes clothing;
//    private Education education;
    Scanner scanner = new Scanner(System.in);

    public void execute() {
        while (true){
            String userSays = "";
            System.out.println("What did you do today to make a difference?");
            System.out.println("a) Ate Sustainably");
            System.out.println("b) Traveled Sustainably");
            System.out.println("c) Dressed Sustainably");
            System.out.println("d) Educated Others");
            userSays = scanner.nextLine();
            if (userSays.equals("a")) {
                Food.createFood();
            }
        }
    }

    public static void main(String[] args) {
        SustainableAF instance = new SustainableAF();
        instance.execute();
    }


}
