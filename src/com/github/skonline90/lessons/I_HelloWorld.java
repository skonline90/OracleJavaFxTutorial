package com.github.skonline90.lessons;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class I_HelloWorld extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane(); // scheint ein Layoutmanager zu sein
        root.getChildren()
            .add(btn);
        primaryStage.setScene(new Scene(root, 300, 250)); // wofuer die Scene?
        // Warum nicht Layoutmanger auf die primaryStage?
        primaryStage.show();
    }
}