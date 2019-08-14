package sample;

import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Paint;

public class LightButton extends GenericButton{
    //A Button class to be used in the GUI.
    //Class defines essential visual properties to the button.
    public LightButton(String text){
        super(text, new BackgroundFill(Paint.valueOf("lightsteelblue"),null,null), Paint.valueOf("dimgrey"));
    }
    @Override
    public String toString(){
        return "LightButton: " + this.getText();
    }
}
