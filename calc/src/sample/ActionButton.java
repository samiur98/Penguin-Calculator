package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public interface ActionButton {
    //An interface to be implemented by any Button class that has an ActionEvent.
    public EventHandler<ActionEvent> getEvent();
    public void setEvent(EventHandler<ActionEvent> event);
}
