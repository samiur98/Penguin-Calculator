package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Main extends Application {
    //Class where the application/program is started from.
    //Class is responsible for generating the GUI, used in this program/application.
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Method overrides the start method from javafx Application class and hence creates the GUI of the program/application.

        //GridPane
        GridPane pane = new GridPane();
        pane.setHgap(2);
        pane.setVgap(2);

        //Backgrounds
        BackgroundFill stageFill = new BackgroundFill(Paint.valueOf("aliceblue"),null,null);
        Background stageBackground = new Background(stageFill);
        pane.setBackground(stageBackground);

        //Screen
        Button screen = new ScreenButton().getButton(); //The screen to be used in the program is a button.

        //Buttons
        Button exponent = new DarkStringButton("^", screen).getButton();
        Button off = new DarkButton("OFF").getButton();
        Button squareRoot = new DarkStringButton("√", screen).getButton();
        Button cubeRoot = new DarkStringButton("∛", screen).getButton();
        Button fourthRoot = new DarkStringButton("∜", screen).getButton();
        Button e = new DarkStringButton("e", screen).getButton();
        Button pi = new DarkStringButton("π", screen).getButton();
        Button sin = new DarkStringButton("sin", screen).getButton();
        Button cos = new DarkStringButton("cos", screen).getButton();
        Button tan = new DarkStringButton("tan", screen).getButton();
        Button seven = new LightStringButton("7", screen).getButton();
        Button eight = new LightStringButton("8", screen).getButton();
        Button nine = new LightStringButton("9", screen).getButton();
        Button leftParenthesis = new DarkStringButton("(", screen).getButton();
        Button rightParenthesis = new DarkStringButton(")", screen).getButton();
        Button four = new LightStringButton("4", screen).getButton();
        Button five = new LightStringButton("5", screen).getButton();
        Button six = new LightStringButton("6", screen).getButton();
        Button multiplication = new DarkStringButton("*", screen).getButton();
        Button division = new DarkStringButton("/", screen).getButton();
        Button one = new LightStringButton("1", screen).getButton();
        Button two = new LightStringButton("2", screen).getButton();
        Button three = new LightStringButton("3", screen).getButton();
        Button addition = new DarkStringButton("+", screen).getButton();
        Button subtraction = new DarkStringButton("-", screen).getButton();
        Button decimal = new DarkStringButton(".", screen).getButton();
        Button zero = new LightStringButton("0", screen).getButton();
        Button C = new DarkButton("C").getButton();
        Button CE = new DarkButton("CE").getButton();
        Button equal = new DarkButton("=").getButton();

        //Constraints (For the elements in the GridPane.)
        GridPane.setConstraints(screen,0,0,150,50);
        GridPane.setConstraints(exponent,0,50,30,30);
        GridPane.setConstraints(off,30,50,30,30);
        GridPane.setConstraints(squareRoot,60,50,30,30);
        GridPane.setConstraints(cubeRoot,90,50,30,30);
        GridPane.setConstraints(fourthRoot,120,50,30,30);
        GridPane.setConstraints(e,0,80,30,30);
        GridPane.setConstraints(pi,30,80,30,30);
        GridPane.setConstraints(sin,60,80,30,30);
        GridPane.setConstraints(cos,90,80,30,30);
        GridPane.setConstraints(tan,120,80,30,30);
        GridPane.setConstraints(seven,0,110,30,30);
        GridPane.setConstraints(eight,30,110,30,30);
        GridPane.setConstraints(nine,60,110,30,30);
        GridPane.setConstraints(leftParenthesis,90,110,30,30);
        GridPane.setConstraints(rightParenthesis,120,110,30,30);
        GridPane.setConstraints(four,0,140,30,30);
        GridPane.setConstraints(five,30,140,30,30);
        GridPane.setConstraints(six,60,140,30,30);
        GridPane.setConstraints(multiplication,90,140,30,30);
        GridPane.setConstraints(division,120,140,30,30);
        GridPane.setConstraints(one,0,170,30,30);
        GridPane.setConstraints(two,30,170,30,30);
        GridPane.setConstraints(three,60,170,30,30);
        GridPane.setConstraints(addition,90,170,30,30);
        GridPane.setConstraints(subtraction,120,170,30,30);
        GridPane.setConstraints(decimal,0,200,30,30);
        GridPane.setConstraints(zero,30,200,30,30);
        GridPane.setConstraints(C,60,200,30,30);
        GridPane.setConstraints(CE,90,200,30,30);
        GridPane.setConstraints(equal,120,200,30,30);

        //Actions(Actions for any buttons that do not have a predefined action are defined/provided here.)
        off.setOnAction(new ExitEvent());
        C.setOnAction(new ClearEvent(screen));
        CE.setOnAction(new ClearAllEvent(screen));
        equal.setOnAction(new CalculateEvent(screen,new PostFixCalculator()));

        //Finishing
        pane.getChildren().addAll(screen, exponent, off, squareRoot, cubeRoot, fourthRoot, e, pi, sin, cos, tan, seven,
                eight, nine, leftParenthesis, rightParenthesis, four, five, six, multiplication, division, one, two,
                three, addition, subtraction, decimal, zero, C, CE, equal);
        primaryStage.setTitle("PENGUIN CALCULATOR");
        primaryStage.setScene(new Scene(pane, 300, 460));
        primaryStage.show();
    }
    public static void main(String args[]){
        launch(args);
    }

}

