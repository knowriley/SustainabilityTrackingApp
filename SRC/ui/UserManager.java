package ui;

import model.Accomplishment;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;


public class UserManager {
    private List<User> users;

    public UserManager() {
        users = new ArrayList<User>();
    }

    public List<User> getUsers() {
        return this.users;
    }

    public User findUser(String userName) {
        User selected = new User();
        for (User u : users) {
            if (u.getName().equals(userName)) {
                selected = u;
            }
        }
        return selected;
    }


//    @Override
//    public void save(String filename) throws IOException {
//        PrintWriter printWriter = new PrintWriter(filename, "UTF-8");
//        for (User u : users) {
//            printWriter.println("[" +
//                    u.getDescription() + ";" +
//                    accomplishmentToString(u.getAccomplishments()) + ";" +
//                    String.valueOf(u.getTotalPoints()) + ";" +
//                    String.valueOf(u.getFoodPoints()) + ";" +
//                    String.valueOf(u.getTransportationPoints()) + ";" +
//                    String.valueOf(u.getClothesPoints()) + ";" +
//                    String.valueOf(u.getEducationPoints()) + "]");
//            printWriter.close();
//        }
//    }


    public User load(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename));
        String text = "";
        for(String line : lines) {
            text += lines;
        }
        JSONArray object = new JSONArray(text);
        for(int i = 0; i < object.length(); i++) {
            JSONObject user = object.getJSONObject(i);
            user.getString("name");
            user.getJSONArray("accomplishments");
            user.getInt("TotalPoints");
            user.getInt("FoodPoints");
            user.getInt("TransportationPoints");
            user.getInt("ClothesPoints");
            user.getInt("EducationPoints");
        }

        /*List<String> lines = Files.readAllLines(Paths.get(filename));
        for (String line : lines) {
            User u = new User();
            ArrayList<String> partsOfLine = split(line);
            u.setDescription(partsOfLine.get(0));
            u.setAccomplishments(partsOfLine.get(1));
            u.setTotalPoints(Integer.parseInt(partsOfLine.get(2)));
            u.setFoodPoints(Integer.parseInt(partsOfLine.get(3)));
            u.setTransportationPoints(Integer.parseInt(partsOfLine.get(4)));
            u.setClothesPoints(Integer.parseInt(partsOfLine.get(5)));
            u.setEducationPoints(Integer.parseInt(partsOfLine.get(6)));
            users.add(u);
        }*/
        return null;
    }

    private static ArrayList<String> splitSemiColon(String line) {
        String[] splits = line.split(";");
        return new ArrayList<>(Arrays.asList(splits));
    }


    private String accomplishmentToString(List<Accomplishment> accomplishments) {
        String s = "{";
        for (Accomplishment a : accomplishments) {
            s += "{";
            s += a.getDescription() + ",";
            s += a.getType() + ",";
            s += String.valueOf(a.getPointValue());
            s += "}";
        }
        s += "}";
        return s;
    }



    public void saveJSONObject() {
        JSONArray savedUsers = new JSONArray();
        for (User u : users) {
            JSONObject obj = new JSONObject();
            obj.put("name", u.getName());
            JSONArray accomplishments = new JSONArray();
            for(Accomplishment a : u.getAccomplishments()) {
                JSONObject aobj = new JSONObject();
                aobj.put("Name", a.getDescription());
                aobj.put("PointValue", a.getPointValue());
                aobj.put("Type", a.getType());
                accomplishments.put(aobj);
            }
            obj.put("accomplishments", accomplishments);
            obj.put("TotalPoints", u.getTotalPoints());
            obj.put("FoodPoints", u.getFoodPoints());
            obj.put("TransportationPoints", u.getTransportationPoints());
            obj.put("ClothesPoints", u.getClothesPoints());
            obj.put("EducationPoints", u.getEducationPoints());

            savedUsers.put(obj);
        }
        try (FileWriter file = new FileWriter("saved_users.txt")) {

            for (int i = 0 ; i < savedUsers.length() ; i++) {
                JSONObject jo = savedUsers.getJSONObject(i);
                file.write(jo.toString() + "\n");
            }
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
