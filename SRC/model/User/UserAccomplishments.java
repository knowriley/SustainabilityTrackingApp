package model.User;

import model.Accomplishment.Accomplishment;
import model.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAccomplishments {
    private User user;
    private Map<Type, List<Accomplishment>> accomplishments = new HashMap<>();

    public UserAccomplishments(User u){
        this.user = u;
        accomplishments.put(Type.FOOD, new ArrayList<>());
        accomplishments.put(Type.TRANSPORTATION, new ArrayList<>());
        accomplishments.put(Type.CLOTHES, new ArrayList<>());
        accomplishments.put(Type.WASTE, new ArrayList<>());
        accomplishments.put(Type.EDUCATION, new ArrayList<>());
    }

    public void updateAccomplishments(Accomplishment a) {
        if (a.getType().equals(Type.FOOD)){
            updateFoodAccomplishments(a);
        }
        if (a.getType().equals(Type.TRANSPORTATION)) {
            updateTransportationAccomplishments(a);
        }
        if (a.getType().equals(Type.CLOTHES)) {
            updateClothesAccomplishments(a);
        }
        if (a.getType().equals(Type.WASTE)) {
            updateWasteAccomplishments(a);
        }
        if (a.getType().equals(Type.EDUCATION)) {
            updateEducationAccomplishments(a);
        }
    }

    private void updateEducationAccomplishments(Accomplishment a) {
        List<Accomplishment> educationAccomplishments = accomplishments.get(Type.EDUCATION);
        educationAccomplishments.add(a);
    }

    private void updateWasteAccomplishments(Accomplishment a) {
        List<Accomplishment> wasteAccomplishments = accomplishments.get(Type.WASTE);
        wasteAccomplishments.add(a);
    }


    private void updateClothesAccomplishments(Accomplishment a) {
        List<Accomplishment> clothesAccomplishments = accomplishments.get(Type.CLOTHES);
        clothesAccomplishments.add(a);
    }


    private void updateTransportationAccomplishments(Accomplishment a) {
        List<Accomplishment> transportationAccomplishments = accomplishments.get(Type.TRANSPORTATION);
        transportationAccomplishments.add(a);
    }


    private void updateFoodAccomplishments(Accomplishment a) {
        List<Accomplishment> foodAccomplishments = accomplishments.get(Type.FOOD);
        foodAccomplishments.add(a);
    }

}
