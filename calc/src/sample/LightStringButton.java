package sample;

import javafx.scene.control.Button;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Paint;


public class LightStringButton extends StringButton {
    //A Button Class to be used in the GUI.
    //Class extends the StringButton class defined in the API and provides visual properties to the button.
    public LightStringButton(String text, Button screen){
        super(text, new BackgroundFill(Paint.valueOf("lightsteelblue"),null,null),Paint.valueOf("dimgrey"), screen);
    }
    @Override
    public String toString(){
        return "LightStringButton: " + this.getText();
    }
}
