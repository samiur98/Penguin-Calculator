package sample;

public class FourthRoot extends Operator implements UnaryOperator {
    //Operator Class (defined in the API) that represents the fourth-root, Unary Operator.
    public FourthRoot(int precedence){
        super("∜",precedence);
    }
    @Override
    public double operate(double a){
        return Math.sqrt(Math.sqrt(a));
    }
}
