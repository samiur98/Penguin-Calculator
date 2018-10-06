package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.beans.EventHandler;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Controller controller=new Controller();
        Calculator cal=new Calculator();
        //GridPane
        GridPane pane=new GridPane();
        pane.setHgap(2);
        pane.setVgap(2);
        //Backgrounds
        BackgroundFill stage_fill=new BackgroundFill(Paint.valueOf("aliceblue"),null,null);
        Background stage_background=new Background(stage_fill);
        BackgroundFill screen_fill=new BackgroundFill(Paint.valueOf("lightsteelblue"),null,null);
        Background screen_background=new Background(screen_fill);
        BackgroundFill button_light_fill=new BackgroundFill(Paint.valueOf("lightslategrey"),null,null);
        Background button_light_background=new Background(button_light_fill);
        BackgroundFill button_dark_fill=new BackgroundFill(Paint.valueOf("lightsteelblue"),null,null);
        Background button_dark_background=new Background(button_dark_fill);
        pane.setBackground(stage_background);
        //Buttons
        Button button_light=new Button();
        button_light.setTextFill(Paint.valueOf("aliceblue"));
        button_light.setBackground(button_light_background);
        button_light.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        Button button_dark=new Button();
        button_dark.setTextFill(Paint.valueOf("aliceblue"));
        button_dark.setBackground(button_dark_background);
        button_dark.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        Button exp=new Button("^");
        exp.setTextFill(Paint.valueOf("silver"));
        exp.setBackground(button_light_background);
        Button Ans=new Button("Ans");
        Ans.setTextFill(Paint.valueOf("silver"));
        Ans.setBackground(button_light_background);
        Button sin_i=new Button("sin-1");
        sin_i.setTextFill(Paint.valueOf("silver"));
        sin_i.setBackground(button_light_background);
        Button cos_i=new Button("cos-1");
        cos_i.setTextFill(Paint.valueOf("silver"));
        cos_i.setBackground(button_light_background);
        Button tan_i=new Button("tan-1");
        tan_i.setTextFill(Paint.valueOf("silver"));
        tan_i.setBackground(button_light_background);
        Button e=new Button("e");
        e.setTextFill(Paint.valueOf("silver"));
        e.setBackground(button_light_background);
        Button pi=new Button("π");
        pi.setTextFill(Paint.valueOf("silver"));
        pi.setBackground(button_light_background);
        Button sin=new Button("sin");
        sin.setTextFill(Paint.valueOf("silver"));
        sin.setBackground(button_light_background);
        Button cos=new Button("cos");
        cos.setTextFill(Paint.valueOf("silver"));
        cos.setBackground(button_light_background);
        Button tan=new Button("tan");
        tan.setTextFill(Paint.valueOf("silver"));
        tan.setBackground(button_light_background);
        Button seven=new Button("7");
        seven.setTextFill(Paint.valueOf("dimgrey"));
        seven.setBackground(button_dark_background);
        Button eight=new Button("8");
        eight.setTextFill(Paint.valueOf("dimgrey"));
        eight.setBackground(button_dark_background);
        Button nine=new Button("9");
        nine.setTextFill(Paint.valueOf("dimgrey"));
        nine.setBackground(button_dark_background);
        Button ln=new Button("ln");
        ln.setTextFill(Paint.valueOf("silver"));
        ln.setBackground(button_light_background);
        Button lg=new Button("lg");
        lg.setTextFill(Paint.valueOf("silver"));
        lg.setBackground(button_light_background);
        Button four=new Button("4");
        four.setTextFill(Paint.valueOf("dimgrey"));
        four.setBackground(button_dark_background);
        Button five=new Button("5");
        five.setTextFill(Paint.valueOf("dimgrey"));
        five.setBackground(button_dark_background);
        Button six=new Button("6");
        six.setTextFill(Paint.valueOf("dimgrey"));
        six.setBackground(button_dark_background);
        Button mult=new Button("x");
        mult.setTextFill(Paint.valueOf("silver"));
        mult.setBackground(button_light_background);
        Button div=new Button("/");
        div.setTextFill(Paint.valueOf("silver"));
        div.setBackground(button_light_background);
        Button one=new Button("1");
        one.setTextFill(Paint.valueOf("dimgrey"));
        one.setBackground(button_dark_background);
        Button two=new Button("2");
        two.setTextFill(Paint.valueOf("dimgrey"));
        two.setBackground(button_dark_background);
        Button three=new Button("3");
        three.setTextFill(Paint.valueOf("dimgrey"));
        three.setBackground(button_dark_background);
        Button add=new Button("+");
        add.setTextFill(Paint.valueOf("silver"));
        add.setBackground(button_light_background);
        Button sub=new Button("-");
        sub.setTextFill(Paint.valueOf("silver"));
        sub.setBackground(button_light_background);
        Button dp=new Button(".");
        dp.setTextFill(Paint.valueOf("silver"));
        dp.setBackground(button_light_background);
        Button zero=new Button("0");
        zero.setTextFill(Paint.valueOf("dimgrey"));
        zero.setBackground(button_dark_background);
        Button C=new Button("C");
        C.setTextFill(Paint.valueOf("silver"));
        C.setBackground(button_light_background);
        Button CE=new Button("CE");
        CE.setTextFill(Paint.valueOf("silver"));
        CE.setBackground(button_light_background);
        Button equal=new Button("=");
        equal.setTextFill(Paint.valueOf("silver"));
        equal.setBackground(button_light_background);
        exp.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        Ans.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        sin_i.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        cos_i.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        tan_i.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        e.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        pi.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        sin.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        cos.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        tan.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        seven.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        eight.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        nine.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        ln.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        lg.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        four.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        five.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        six.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        mult.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        div.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        one.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        two.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        three.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        add.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        sub.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        dp.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        zero.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        C.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        CE.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        equal.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        //Screen
        Label screen=new Label("2+5-sin(59)-527");
        screen.setBackground(screen_background);
        screen.setTextFill(Paint.valueOf("dimgray"));
        screen.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        screen.setAlignment(Pos.BOTTOM_RIGHT);
        screen.setFont(new Font("Bookman",40));
        //Constraints
        GridPane.setConstraints(screen,0,0,150,50);
        GridPane.setConstraints(exp,0,50,30,30);
        GridPane.setConstraints(Ans,30,50,30,30);
        GridPane.setConstraints(sin_i,60,50,30,30);
        GridPane.setConstraints(cos_i,90,50,30,30);
        GridPane.setConstraints(tan_i,120,50,30,30);
        GridPane.setConstraints(e,0,80,30,30);
        GridPane.setConstraints(pi,30,80,30,30);
        GridPane.setConstraints(sin,60,80,30,30);
        GridPane.setConstraints(cos,90,80,30,30);
        GridPane.setConstraints(tan,120,80,30,30);
        GridPane.setConstraints(seven,0,110,30,30);
        GridPane.setConstraints(eight,30,110,30,30);
        GridPane.setConstraints(nine,60,110,30,30);
        GridPane.setConstraints(ln,90,110,30,30);
        GridPane.setConstraints(lg,120,110,30,30);
        GridPane.setConstraints(four,0,140,30,30);
        GridPane.setConstraints(five,30,140,30,30);
        GridPane.setConstraints(six,60,140,30,30);
        GridPane.setConstraints(mult,90,140,30,30);
        GridPane.setConstraints(div,120,140,30,30);
        GridPane.setConstraints(one,0,170,30,30);
        GridPane.setConstraints(two,30,170,30,30);
        GridPane.setConstraints(three,60,170,30,30);
        GridPane.setConstraints(add,90,170,30,30);
        GridPane.setConstraints(sub,120,170,30,30);
        GridPane.setConstraints(dp,0,200,30,30);
        GridPane.setConstraints(zero,30,200,30,30);
        GridPane.setConstraints(C,60,200,30,30);
        GridPane.setConstraints(CE,90,200,30,30);
        GridPane.setConstraints(equal,120,200,30,30);

        //Actions
        //exp.setOnMouseClicked(a->controller.action_exp());
        //Finishing
        pane.getChildren().addAll(screen,exp,Ans,sin_i,cos_i,tan_i,e,pi,sin,cos,tan,seven,eight,nine,ln,lg,four,
                five,six,mult,div,one,two,three,add,sub,dp,zero,C,CE,equal);
        primaryStage.setTitle("PENGUIN CALCULATOR");
        primaryStage.setScene(new Scene(pane, 300, 460));
        primaryStage.show();
    }
    private void action(){

    }


    public static void main(String[] args) {
        launch(args);
    }
}

