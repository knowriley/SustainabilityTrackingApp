package Tests;

import model.Clothes;
import model.Food;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFood{
    Food testFood;
    String testString;

    @BeforeEach
    public void testSetUp(){
        testFood = new Food();
        testString = "food test";

    }

    @Test
    public void testFromLocal(){
        assertEquals("", testFood.getSupported());
        testFood.fromLocal(testString);
        assertEquals(testString, testFood.getSupported());
    }

}