package model;


import Interfaces.HasResources;

public class Transportation extends Accomplishment implements HasResources {

    public Transportation(String type, int pointValue, String description) {
        super(type, pointValue, description);
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
