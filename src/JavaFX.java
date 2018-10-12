package org.sla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
// import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.io.FileInputStream;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.control.CheckBox;



public class JavaFX extends Application {
    Image image;
    Image Sasuke;
    Image Naruto;
    Image Sakura;
    Image Neji;
    Image Kakashi;
    ImageView imageView;


    void changeImage() {
        imageView.setImage(Sasuke);
        System.out.println("Sasuke");
    }
    void changeImage1() {
        imageView.setImage(Naruto);
        System.out.println("Naruto");

    }
    void changeImage2() {
        imageView.setImage(Sakura);
        System.out.println("Sakura");

    }
    void changeImage3() {
        imageView.setImage(Neji);
        System.out.println("Neji");

    }
    void changeImage4() {
        imageView.setImage(Kakashi);
        System.out.println("Kakashi");

    }

    @Override
    public void start(Stage primaryStage) throws Exception {



        primaryStage.setTitle("What Character do you Like?");

        MenuItem menuItem1 = new MenuItem("Sasuke");
        MenuItem menuItem2 = new MenuItem("Naurto");
        MenuItem menuItem3 = new MenuItem("Sakura");
        MenuItem menuItem4 = new MenuItem("Neji");
        MenuItem menuItem5 = new MenuItem("kakashi");

        menuItem1.setOnAction(e->changeImage());

        menuItem2.setOnAction(e->changeImage1());

        menuItem3.setOnAction(e->changeImage2());

        menuItem4.setOnAction(e->changeImage3());

        menuItem5.setOnAction(e->changeImage4());

        FileInputStream input = new FileInputStream("/Users/antonioderock/Desktop/FirstJavaGUIProgram/src/blue1.png");
        image = new Image(input);

        FileInputStream input1 = new FileInputStream("/Users/antonioderock/Desktop/FirstJavaGUIProgram/src/Sasuke_Part_1.png");
        Sasuke = new Image(input1);

        FileInputStream input2 = new FileInputStream("/Users/antonioderock/Desktop/FirstJavaGUIProgram/src/Naruto.png");
        Naruto = new Image(input2);

        FileInputStream input3 = new FileInputStream("/Users/antonioderock/Desktop/FirstJavaGUIProgram/src/Sakura.jpg");
        Sakura = new Image(input3);

        FileInputStream input4 = new FileInputStream("/Users/antonioderock/Desktop/FirstJavaGUIProgram/src/Neji.png");
        Neji = new Image(input4);

        FileInputStream input5 = new FileInputStream("/Users/antonioderock/Desktop/FirstJavaGUIProgram/src/Kakashi.jpg");
        Kakashi = new Image(input5);


        imageView = new ImageView(Sasuke);
        imageView = new ImageView(Naruto);
        imageView = new ImageView(Neji);
        imageView = new ImageView(Sakura);
        imageView = new ImageView(Kakashi);

        imageView.setImage(image);

        MenuButton menuButton = new MenuButton("Options", null, menuItem1, menuItem2, menuItem3, menuItem4, menuItem5);
        CheckBox checkBox1 = new CheckBox("Restart Here");
        checkBox1.setOnAction(e-> {
            imageView.setImage(image);
            checkBox1.setSelected(false);
        });

        VBox vbox = new VBox();
        vbox.getChildren().add(checkBox1);
        vbox.getChildren().add(menuButton);
        vbox.getChildren().add(imageView);

        Scene scene1 = new Scene(vbox, 1300, 1000);
        primaryStage.setScene(scene1);
        primaryStage.show();

    }
        public static void main(String[] args) {
            Application.launch(args);
        }
}


