package sample;

public class Subtraction extends Operator implements BinaryOperator{
    //Operator Class (defined in the API) that represents the subtraction Operator.
    public Subtraction(int precedence){
        super("-", precedence);
    }
    @Override
    public double operate(double x, double y){
        return x-y;
    }
}
