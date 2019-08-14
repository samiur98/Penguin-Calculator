package sample;

public class Multiplication extends Operator implements BinaryOperator {
    //Operator Class (defined in the API) that represents the multiplication Operator.
    public Multiplication(int precedence){
        super("*", precedence);
    }
    public double operate(double x, double y){
        return x * y;
    }
}
