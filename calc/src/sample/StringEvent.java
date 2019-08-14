package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.util.Objects;

public class StringEvent implements EventHandler<ActionEvent> {
    /*Class that implements the EventHandler interface and provides an ActionEvent that adds the text of a button to
      the screen of the application/program.*/
    private final Button button;
    private final Button screen;

    public StringEvent(Button button, Button screen){
        this.button = button;
        this.screen = screen;
    }

    //Getter Functions/Accessor Methods.
    public Button getButton(){
        return this.button;
    }
    public Button getScreen(){
        return this.screen;
    }

    @Override
    public void handle(ActionEvent event){
        this.screen.setText(this.screen.getText()+this.button.getText());
    }
    @Override
    public String toString(){
        return "StringEvent";
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
        StringEvent stringEvent = (StringEvent) other;
        return this.button.equals(stringEvent.getButton()) && this.screen.equals(stringEvent.getScreen());
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.button, this.screen);
    }
}
