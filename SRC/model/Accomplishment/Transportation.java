package model.Accomplishment;


import Interfaces.HasResources;
import model.Accomplishment.Accomplishment;
import model.Type;

public class Transportation extends Accomplishment implements HasResources {

    public Transportation(int pointValue, String description) {
        super(pointValue, description);
        type = Type.TRANSPORTATION;
    }

    @Override
    public void learnMore(){ //TODO: How do I make this print out. What would the signature be?
        System.out.println("http://www.sustainable-environment.org.uk/Doing_Our_Bit/Cars.php");
        System.out.println("https://www.transit.dot.gov/regulations-and-guidance/environmental-programs/transit-environmental-sustainability/transit-role");
    }

    @Override
    public void tips(){
        // get the bus schedule for user based on zip code

    }

}
