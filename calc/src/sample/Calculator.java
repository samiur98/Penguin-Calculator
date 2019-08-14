package sample;

public interface Calculator {
    //An Interface to be implemented by any class in the API that is responsible for solving mathematical expressions.
    /*There may be multiple classes that solve mathematical expressions, using different algorithms/techniques. Any such
    class must implement this Interface.*/
    public String calculate(String expression); //Method takes a String representing the mathematical expression and returns a String representing the answer.
}
