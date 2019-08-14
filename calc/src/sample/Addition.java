package sample;

public class Addition extends Operator implements BinaryOperator{
    //Operator Class (defined in the API) that represents the addition Operator.
    public Addition(int precedence){
        super("+", precedence);
    }
    @Override
    public double operate(double x, double y){
        return x+y;
    }
}
