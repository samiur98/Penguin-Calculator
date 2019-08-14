package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Paint;

import java.util.Objects;


public class StringButton extends GenericButton implements ActionButton{
    //A Button Class to be used in the GUI.
    //Class provides an EventHandler<Action>, to the button variable.
    //Class has a Button variable, that is functionally a screen for the GUI.
    private Button screen;
    private EventHandler<ActionEvent> event;

    public StringButton(String text, BackgroundFill backgroundFill, Paint textFill, Button screen){
        super(text, backgroundFill, textFill);
        this.screen = screen;
        Button button = super.getButton();
        this.event = new StringEvent(button,screen);
        button.setOnAction(event);
        super.setButton(button);
    }

    //Getter Functions/Accessor Methods.
    public Button getScreen(){
        return this.screen;
    }
    public EventHandler<ActionEvent> getEvent(){
        return this.event;
    }

    //Setter Functions/Mutator Methods.
    public void setScreen(Button screen){
        this.screen = screen;
    }
    public void setEvent(EventHandler<ActionEvent> event){
        Button button = super.getButton();
        this.event = event;
        button.setOnAction(event);
        super.setButton(button);
    }

    @Override
    public String toString(){
        return "StringButton :" + this.getText();
    }
    @Override
    public boolean equals(Object other){
        if(!super.equals(other)){
            return false;
        }
        if(this.getClass() != other.getClass()){
            return false;
        }
        StringButton stringButton = (StringButton) other;
        return this.screen.equals(stringButton.getScreen()) && this.event.equals(stringButton.getEvent());
    }
    @Override
    public int hashCode(){
        return super.hashCode() * Objects.hash(this.screen, this.event);
    }
}
