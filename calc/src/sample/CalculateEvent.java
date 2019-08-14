package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.util.Objects;


public class CalculateEvent implements EventHandler<ActionEvent> {
    /*Class that implements the EventHandler interface and provides an ActionEvent that calculates the expression in
      screen and provides an answer based on the expression. Class uses another class that implements the Calculator
      interface to do so.*/
    private final Button screen;
    private Calculator calculator;

    public CalculateEvent(Button screen, Calculator calculator){
        this.screen = screen;
        this.calculator = calculator;
    }

    //Getter Functions/Accessor Methods.
    public Button getScreen(){
        return this.screen;
    }
    public Calculator getCalculator(){
        return this.calculator;
    }

    //Setter Functions/Mutator Method.
    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void handle(ActionEvent event){
        this.screen.setText(this.calculator.calculate(this.screen.getText()));
    }
    @Override
    public String toString(){
        return "CalculateEvent";
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
        CalculateEvent calculateEvent = (CalculateEvent) other;
        return this.screen.equals(calculateEvent.getScreen()) && this.calculator.equals(calculateEvent.getCalculator());
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.screen, this.calculator);
    }
}
