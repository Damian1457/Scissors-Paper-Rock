package com.example.tutoring.classes.view;

import com.example.tutoring.classes.Airport;
import com.example.tutoring.classes.MilitaryPlane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class UserInterface extends Frame {
    private TextField userNameField;
    private TextField passwordField;
    private Button login;
    private Button exit;

    public UserInterface() {

        setTitle("AIRPORT MS");
        setSize(800, 400);

        Label title = new Label("AIRPORT MS");
        title.setBounds(350, 30, 100, 10);
        add(title);

        Label userName = new Label("Username");
        userName.setBounds(250, 50, 100, 10);
        add(userName);

        Label password = new Label("Password");
        password.setBounds(250, 100, 100, 10);
        add(password);

        Label information = new Label("Either the username or password is wrong");
        information.setBounds(300, 150, 300, 15);
        add(information);

        userNameField = new TextField();
        userNameField.setBounds(350, 50, 150, 20);
        add(userNameField);

        passwordField = new TextField();
        passwordField.setBounds(350, 100, 150, 20);
        passwordField.setEchoChar('*');
        add(passwordField);

        login = new Button("Login");
        login.setBounds(300, 200, 100, 20);
        add(login);
        setLogin();

        exit = new Button("Exit");
        exit.setBounds(410, 200, 100, 20);
        add(exit);
        exitMethod();

        setLayout(null);
        setVisible(true);
    }

    private void exitMethod() {
        exit.addActionListener(e -> System.exit(0));
    }

    private void setLogin() {

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = userNameField.getText();
                String password = passwordField.getText();

                if (userName.equals("Damian") && password.equals("Damian")) {
                    Airport airport = new Airport("Warsaw");
                    airport.addPlane(new MilitaryPlane("F30", 100, 1400.00, true));
                    List<String> list = airport.playnsDisplay();
                    for (String plane : list) {
                        System.out.println(plane);
                    }
                } else {
                    System.out.println("Wrong password");
                }
            }
        });
    }
}
