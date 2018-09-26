package Tests;

import PathsToSustainability.Transportation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTransportation {
    private Transportation testTransportation;

    @BeforeEach
    public void before(){
        testTransportation = new Transportation();
    }

    @Test
    public void testSetGround(){
        testTransportation.getIsGround();
        assertFalse(testTransportation.getIsGround());
        testTransportation.setGround(true);
        assertTrue(testTransportation.getIsGround());
    }


    @Test
    public void testSetPublic(){
        testTransportation.getIsPublic();
        assertFalse(testTransportation.getIsPublic());
        testTransportation.setPublic(true);
        assertTrue(testTransportation.getIsPublic());
    }
}

