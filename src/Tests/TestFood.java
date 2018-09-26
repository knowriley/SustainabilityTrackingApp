package Tests;

import PathsToSustainability.Food;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFood {
    private Food testFood;

    @BeforeEach
    public void before(){
        testFood = new Food();
    }

    @Test
    public void testSetMeal(){
        testFood.getIsMeal();
        assertFalse(testFood.getIsMeal());
        testFood.setMeal(true);
        assertTrue(testFood.getIsMeal());
    }

    @Test
    public void testSetWaste(){
        testFood.getIsWaste();
        assertFalse(testFood.getIsWaste());
        testFood.setWaste(true);
        assertTrue(testFood.getIsWaste());
    }
}
