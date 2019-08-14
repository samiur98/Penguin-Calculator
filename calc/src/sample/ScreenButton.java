package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

public class ScreenButton extends GenericButton {
    //A Button class to be used in the GUI.
    //This button is meant to function as the screen/display of the GUI.
    public ScreenButton(){
        super("",new BackgroundFill(Paint.valueOf("lightsteelblue"),null,null),Paint.valueOf("dimgrey"));
        super.setFont(new Font("Bookman",24));
        Button button=super.getButton();
        button.setAlignment(Pos.BOTTOM_RIGHT);
        super.setButton(button);
    }
    @Override
    public String toString(){
        return "ScreenButton";
    }
}
