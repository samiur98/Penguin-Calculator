package sample;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Paint;

public class DarkButton extends GenericButton {
    //A Button Class to be used in the GUI.
    //Class defines essential visual properties to the button.
    public DarkButton(String text){
        super(text, new BackgroundFill(Paint.valueOf("lightslategrey"),null,null), Paint.valueOf("silver"));
    }
    @Override
    public String toString(){
        return "DarkButton :" + this.getText();
    }

}
