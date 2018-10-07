package Tests;

import model.Clothes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.User;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUser {
    User testUser;

    @BeforeEach
    public void testSetUp(){
        testUser = new User();
    }

    @Test
    public void testSave() throws IOException {
        testUser.save("test_users.txt");
        testUser.load("test_users.txt");
    }

    @Test
    public void testLoad() throws IOException {
        testUser.load("test_users.txt");
    }
}
