package sample;

public class Division extends Operator implements BinaryOperator {
    //Operator Class (defined in the API) that represents the division Operator.
    public Division(int precedence){
        super("/", precedence);
    }
    @Override
    public double operate(double x, double y)throws ArithmeticException{
        if(y == 0.0){
            throw new ArithmeticException();
        }
        return x/y;
    }
}
