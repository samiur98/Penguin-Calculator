package sample;

import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

import java.util.Objects;

public class GenericButton {
    //A class that is meant to function as a template for all subsequent buttons to be used in the GUI.
    private BackgroundFill backgroundFill;
    private Background background;
    private Button button;
    private String text;
    private Paint textFill;
    private Font font;

    public GenericButton(String text, BackgroundFill backgroundFill, Paint textFill){
        this.backgroundFill = backgroundFill;
        this.background = new Background(this.backgroundFill);
        this.text = text;
        this.textFill = textFill;
        this.button = new Button();
        this.button.setText(text);
        this.button.setTextFill(textFill);
        this.button.setBackground(this.background);
        this.button.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        this.font = this.button.getFont();
    }

    //Getter Functions/Accessor Methods for field variables.
    public BackgroundFill getBackgroundFill(){
        return this.backgroundFill;
    }
    public Background getBackground(){
        return this.background;
    }
    public Button getButton(){
        return this.button;
    }
    public String getText(){
        return this.text;
    }
    public Paint getTextFill(){
        return this.textFill;
    }
    public Font getFont(){
        return this.font;
    }

    //Setter Functions/Mutator Methods for field variables.
    public void setBackground(Background background){
        this.background = background;
        this.button.setBackground(this.background);
    }
    public void setBackground(BackgroundFill backgroundFill){
        this.backgroundFill = backgroundFill;
        this.background = new Background(this.backgroundFill);
        this.button.setBackground(this.background);
    }
    public void setText(String text){
        this.text = text;
        this.button.setText(text);
    }
    public void setTextFill(Paint textFill){
        this.textFill = textFill;
        this.button.setTextFill(textFill);
    }
    public void setFont(Font font){
        this.font = font;
        this.button.setFont(this.font);
    }
    public void setButton(Button button) {
        this.button = button;
    }

    @Override
    public String toString(){
        return "Button: " + this.text;
    }
    @Override
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if(other == null){
            return false;
        }
        if(this.getClass() != other.getClass()){
            return false;
        }
        GenericButton otherButton = (GenericButton) other;
        return this.backgroundFill.equals(otherButton.getBackgroundFill()) && this.background.equals(otherButton.getBackground())
                && this.button.equals(otherButton.getButton()) && this.text.equals(otherButton.getText()) &&
                this.textFill.equals(otherButton.getTextFill()) && this.font.equals(otherButton.getFont());
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.backgroundFill, this.background, this.button, this.text, this.textFill, this.font);
    }
}
