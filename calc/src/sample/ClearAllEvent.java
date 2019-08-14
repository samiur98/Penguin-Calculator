package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.util.Objects;

public class ClearAllEvent implements EventHandler<ActionEvent> {
    //Class that implements the EventHandler interface and removes all entries/clears the screen of the application/program.
    private final Button screen;

    public ClearAllEvent(Button screen){
        this.screen = screen;
    }
    //Getter Function/Accessor Methods.
    public Button getScreen(){
        return this.screen;
    }

    @Override
    public void handle(ActionEvent event){
        this.screen.setText("");
    }
    @Override
    public String toString(){
        return "ClearAllEvent";
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
        ClearAllEvent clearAllEvent = (ClearAllEvent) other;
        return this.screen.equals(clearAllEvent.getScreen());
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.screen);
    }
}
