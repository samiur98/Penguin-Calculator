package sample;

public class Exponent extends Operator implements BinaryOperator{
    //Operator Class (defined in the API) that represents the exponent Operator.
    public Exponent(int precedence){
        super("^", precedence);
    }
    @Override
    public double operate(double x, double y){
        return Math.pow(x, y);
    }
}
