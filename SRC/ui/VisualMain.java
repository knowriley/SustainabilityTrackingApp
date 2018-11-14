package ui;

import model.Accomplishment.Accomplishment;
import model.User.User;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VisualMain extends JFrame{
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 700;
    private User user;

    public VisualMain(){
        initializeGraphics();
    }

    public static void main(String[] args) {

    }

    private void initializeGraphics(){
        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(WIDTH, HEIGHT));
        createOptions();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    private void createOptions(){
        JPanel options = new JPanel();
        options.setLayout(new GridLayout(3, 1));
        options.setSize(new Dimension(0, 0));
        add(options, BorderLayout.CENTER);

    }

}
