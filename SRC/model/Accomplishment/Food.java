package model.Accomplishment;


import Interfaces.Local;
import Interfaces.HasResources;
import model.Type;

public class Food extends Accomplishment implements Local, HasResources {
    private String local;

    public Food(int pointValue, String description){
        super(pointValue, description);
        type = Type.FOOD;
        local = "";

    }

    //MODIFIES: this
    //EFFECTS: sets location of local purchase to location
    @Override
    public void fromLocal(String location){
       this.local = location;
    }

   @Override
   public String getSupported(){
        return this.local;
   }

    @Override
    public void learnMore(){
        System.out.println("https://www.independent.co.uk/life-style/health-and-families/veganism-environmental-impact-planet-reduced-plant-based-diet-humans-study-a8378631.html");
        System.out.println("https://www.mcgill.ca/foodservices/sustainability/green/local");
    }

    @Override
    public void tips(){
        System.out.println("https://blueandgreentomorrow.com/sustainability/sustainable-eating-going-vegan/");

    }

}

