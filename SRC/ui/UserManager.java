package ui;

import model.Accomplishment;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;


public class UserManager {
    private static UserManager instance;
    private List<User> users;

    private UserManager() {
        users = new ArrayList<User>();
    }

    public static UserManager getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new UserManager();
        return instance;
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

    
    public User load(String filename, String userName) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename));
        String text = "";
        for(String line : lines) {
            text += lines;
        }
        JSONArray object = new JSONArray(text);
        for(int i = 0; i < object.length(); i++) {
            JSONObject jobUser = object.getJSONObject(i);
            if (jobUser.getString("name").equals(userName)) {
                User user = new User();
                user.setName(jobUser.getString("name"));
                user.setAccomplishments(jobUser.getJSONArray("accomplishments"));
                user.setTotalPoints(jobUser.getInt("TotalPoints"));
                user.setFoodPoints(jobUser.getInt("FoodPoints"));
                user.setTransportationPoints(jobUser.getInt("TransportationPoints"));
                user.setClothesPoints(jobUser.getInt("ClothesPoints"));
                user.setEducationPoints(jobUser.getInt("EducationPoints"));
                return user;
            }
        }

        //check if user is null???
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
            for(Accomplishment a : u.getAccomplishments().keySet()) {
                for (Accomplishment a1 : u.getAccomplishments().get(a)) {
                    JSONObject aobj = new JSONObject();
                    aobj.put("Name", a1.getDescription());
                    aobj.put("PointValue", a1.getPointValue());
                    aobj.put("Type", a1.getType());
                    accomplishments.put(aobj);
                }
            }
            obj.put("accomplishments", accomplishments);
            obj.put("TotalPoints", u.getTotalPoints());
            obj.put("FoodPoints", u.getFoodPoints());
            obj.put("TransportationPoints", u.getTransportationPoints());
            obj.put("ClothesPoints", u.getClothesPoints());
            obj.put("EducationPoints", u.getEducationPoints());

            savedUsers.put(obj);
        }
        try (FileWriter file = new FileWriter("saved_users.txt", true)) {

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
