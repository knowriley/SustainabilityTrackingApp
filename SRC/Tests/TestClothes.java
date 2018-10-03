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
        Clothes testClothes = new Clothes();
        testString = "testString";

    }

    @Test
    public void testSupported(){
      //assertEquals(testString, testClothes.getsupported(testString));

    }
}
