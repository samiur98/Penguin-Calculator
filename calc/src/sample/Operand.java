package sample;

import java.util.Objects;

public class Operand extends Token {
    //Class that stores an Operand which is part of a Mathematical Expression.
    //Meant to be used by various methods that implement the Calculator Interface, defined in the API.
    private final double value; //Double representing the value of the operand.

    public Operand(String string, double value){
        super(string);
        this.value = value;
    }
    //Getter Functions/Accessor Methods
    public double getValue(){
        return this.value;
    }

    @Override
    public String toString(){
        return "Operand :" + super.getString();
    }
    @Override
    public boolean equals(Object other){
        if(!super.equals(other)){
            return false;
        }
        Operand operand = (Operand) other;
        return this.value == operand.getValue();
    }
    @Override
    public int hashCode(){
        return Objects.hash(super.getString(), this.value);
    }
}
