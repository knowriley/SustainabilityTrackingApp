package ui;

import Interfaces.Loadable;
import Interfaces.Saveable;
import model.Accomplishment;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserManager  implements Loadable, Saveable {
    private List<User> savedUsers;

    public UserManager(){
        savedUsers = new ArrayList<User>();
    }

    public List<User> getSavedUsers(){
        return this.savedUsers;
    }

    public User findUser(String userName){
        User selected = new User();
        for (User u : savedUsers){
            if (u.getName().equals(userName)){
                selected = u; }
                else continue; // TODO: Do I need this?
            }
            return selected;
        }



    @Override
    public void save(String filename) throws IOException {
        PrintWriter printWriter = new PrintWriter(filename, "UTF-8");
        for (User u : savedUsers){
            printWriter.println("[" +
                    u.getName() + ";" +
                    accomplishmentToString(u.getAccomplishments()) + ";" +
                    String.valueOf(u.getTotalPoints()) + ";" +
                    String.valueOf(u.getFoodPoints()) + ";" +
                    String.valueOf(u.getTransportationPoints()) + ";" +
                    String.valueOf(u.getClothesPoints()) + ";" +
                    String.valueOf(u.getEducationPoints()) + "]");
            printWriter.close();
        }
    }

    @Override
    public User load(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename));
        for (String line : lines) {
            User u = new User();
            ArrayList<String> partsOfLine = split(line);
            u.setName(partsOfLine.get(0));
            u.setAccomplishments(partsOfLine.get(1)) ;
            u.setTotalPoints(Integer.parseInt(partsOfLine.get(2)));
            u.setFoodPoints(Integer.parseInt(partsOfLine.get(3)));
            u.setTransportationPoints(Integer.parseInt(partsOfLine.get(4)));
            u.setClothesPoints(Integer.parseInt(partsOfLine.get(5)));
            u.setEducationPoints(Integer.parseInt(partsOfLine.get(6)));
            savedUsers.add(u);
        }
        return null;
    }

    private static ArrayList<String> splitSemiColon(String line){
        String[] splits = line.split(";");
        return new ArrayList<>(Arrays.asList(splits));
    }


    private String accomplishmentToString(List<Accomplishment> accomplishments){
        String s = "{";
        for (Accomplishment a : accomplishments){
            s += "{";
            s += a.getName() + ",";
            s += a.getType() + ",";
            s += String.valueOf(a.getPointValue());
            s += "}";
        }
        s += "}";
        return s;
    }

   private List<Accomplishment> fromString(String accomplishments){
        for (String line : lines) {

        }
    }
}
