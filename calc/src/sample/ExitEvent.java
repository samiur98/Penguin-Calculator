package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ExitEvent implements EventHandler<ActionEvent> {
    //Class that implements the EventHandler interface and provides an Action/Event that allows a clean exit for the program/application.
    public ExitEvent(){
    }
    @Override
    public void handle(ActionEvent event){
        System.exit(0);
    }
}
