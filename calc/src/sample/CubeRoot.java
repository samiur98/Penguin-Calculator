package sample;

public class CubeRoot extends Operator implements UnaryOperator {
    //Operator Class (defined in the API) that represents the cube-root, Unary Operator.
    public CubeRoot(int precedence){
        super("∛",precedence);
    }
    @Override
    public double operate(double a){
        return Math.cbrt(a);
    }
}
