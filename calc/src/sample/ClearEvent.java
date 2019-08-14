package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.util.Objects;

public class ClearEvent implements EventHandler<ActionEvent> {
    //Class that implements the EventHandler interface and provides an ActionEvent that removes the last entry from the screen.
    //Functionally does noting if there isn't any entry left in the screen.
    private final Button screen;

    public ClearEvent(Button screen){
        this.screen = screen;
    }
    //Getter Functions/Accessor Methods.
    public Button getScreen(){
        return this.screen;
    }
    @Override
    public void handle(ActionEvent event){
        String text=this.screen.getText();
        if (text.length() <= 1){
            screen.setText("");
        }
        else{
            screen.setText(text.substring(0,text.length()-1));
        }
    }
    @Override
    public String toString(){
        return "ClearEvent";
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
        ClearEvent clearEvent = (ClearEvent) other;
        return this.screen.equals(clearEvent.getScreen());
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.screen);
    }
}
