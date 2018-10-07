package Tests;

import model.Clothes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClothes {
    Clothes testClothes;
    String testString;

    @BeforeEach
    public void testSetUp(){
        testClothes = new Clothes();
        testString = "clothes test";
    }

    @Test
    public void testFromLocal(){
        assertEquals("", testClothes.getSupported());
        testClothes.fromLocal(testString);
        assertEquals(testString, testClothes.getSupported());
    }
}
