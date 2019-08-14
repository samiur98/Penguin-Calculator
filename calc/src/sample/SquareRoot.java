package sample;

public class SquareRoot extends Operator implements UnaryOperator {
    //Operator Class (defined in the API) that represents the square-root, Unary Operator.
    public SquareRoot(int precedence){
        super("√",precedence);
    }
    @Override
    public double operate(double a){
        return Math.sqrt(a);
    }
}
