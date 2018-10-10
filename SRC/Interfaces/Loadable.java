package Interfaces;

import ui.User;

import java.io.IOException;

public interface Loadable {

    public User load(String filename) throws IOException;
}
