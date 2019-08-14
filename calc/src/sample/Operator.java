package sample;

public class Operator extends Token {
    //Class that stores an Operator which is part of a Mathematical Expression.
    //Meant to be used by various methods that implement the Calculator Interface, defined in the API.
    private int precedence; //Variable that represents the precedence/priority of the Operator.
    //The precedence must be defined explicitly as it could vary across implementations.

    public Operator(String string, int precedence){
        super(string);
        this.precedence = precedence;
    }
    //Getter Functions/Accessor Methods.
    public int getPrecedence(){
        return this.precedence;
    }

    //Setter Functions/Mutator Methods.
    public void setPrecedence(int precedence){
        this.precedence = precedence;
    }

    @Override
    public String toString(){
        return "Operator: " + super.getString();
    }
}
