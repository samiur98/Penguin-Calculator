package sample;

import java.util.HashMap;
import java.util.LinkedList;

public class PostFixCalculator implements Calculator{
    /* Class that implements the Calculator interface. Takes a String representing a mathematical expression and
       attempts to solve it using a post-fix algorithm. Returns a String representing the answer if calculation was
       successful. An empty string is returned otherwise. */
    //Class uses other classes in the API such as Token, Operand, Operator etc.
    private final HashMap<Character,Token>  map;
    private final Stack<Character> cStack;
    private final Stack<Double> dStack;

    public PostFixCalculator(){
        this.cStack = new Stack<Character>();//Stack to be used in the parser method.
        this.dStack = new Stack<Double>();//Stack to be used in the evaluating method.
        this.map = new HashMap<>();//HashMap to contain character/token entries that are acceptable.
        init();
    }

    private void init(){
        //Method adds character/token entries that are acceptable.
        this.map.put('0', new Operand("0",0));
        this.map.put('1', new Operand("1",1));
        this.map.put('2', new Operand("2",2));
        this.map.put('3', new Operand("3",3));
        this.map.put('4', new Operand("4", 4));
        this.map.put('5', new Operand("5", 5));
        this.map.put('6', new Operand("6", 6));
        this.map.put('7', new Operand("7", 7));
        this.map.put('8', new Operand("8", 8));
        this.map.put('9', new Operand("9", 9));
        this.map.put('.', new Token("."));
        this.map.put('(', new Token("("));
        this.map.put(')', new Token(")"));
        this.map.put('e', new Operand("e", Math.E));
        this.map.put('π', new Operand("π", Math.PI));
        this.map.put('+', new Addition(4));
        this.map.put('-', new Subtraction(5));
        this.map.put('*', new Multiplication(2));
        this.map.put('/', new Division(3));
        this.map.put('^', new Exponent(1));
        this.map.put('√', new SquareRoot(1));
        this.map.put('∛', new CubeRoot(1));
        this.map.put('∜', new FourthRoot(1));

    }

    public LinkedList<Token> parser(String string) throws IllegalArgumentException{
        /*Method that takes a String which represents a mathematical expression and attempts to convert it into a
          post-fix expression. A linked-list of Token objects is returned if successful.*/
        LinkedList<Token> list = new LinkedList<>();
        int i = 0;
        while(i <= string.length()-1){
            char c = string.charAt(i);
            if (!map.containsKey(c)){
                throw new IllegalArgumentException(); //Character that is unrecognized/unacceptable is found.
            }
            if (map.get(c) instanceof Operand){
                //Case where a character representing an Operand is found.
                int j = i+1;
                String s = map.get(c).getString();
                while((j <= string.length()-1)) {
                    char ch = string.charAt(j);
                    if (!map.containsKey(ch)) {
                        throw new IllegalArgumentException();
                    }
                    if (((int) ch >= (int) '0' && (int) ch <= (int) '9') || ch == '.') {
                        s = s + map.get(ch).getString();
                    }
                    else {
                        break;
                    }
                    j = j + 1;
                    i = j - 1;
                }
                Double doubleValue;
                if (s.length() > 1) {
                    doubleValue = Double.parseDouble(s);
                }
                else{
                    doubleValue = ((Operand) map.get(c)).getValue();
                }
                list.add(new Operand(s,doubleValue));
            }

            if(c =='('){
                //Case where a leftParenthesis is found.
                this.cStack.push(c);
            }

            if(c == ')'){
                //Case where a rightParenthesis is found.
                while(!(this.cStack.isEmpty()) && !(this.cStack.peek().equals('('))){
                    char ch = this.cStack.pop();
                    list.add(this.map.get(ch));
                }
                if(!this.cStack.isEmpty()){
                    this.cStack.pop();
                }
            }

            if(map.get(c) instanceof Operator){
                //Case where a character representing an Operator is found.
                if (this.cStack.isEmpty() || this.cStack.peek() == '('){
                    this.cStack.push(c);
                }
                else{
                    Operator op = (Operator) map.get(c);
                    while (!this.cStack.isEmpty() && this.cStack.peek() != '('){
                        Operator top = (Operator) map.get(this.cStack.peek());
                        if(op.getPrecedence() >= top.getPrecedence()){
                            Character add = this.cStack.pop();
                            list.add(this.map.get(add));
                        }
                        else{
                            break;
                        }
                    }
                this.cStack.push(c);
                }
            }
            i = i+1;
        }
        while(!this.cStack.isEmpty()){
            //Tokens left over in the stack are added to the linked-list.
            char add = this.cStack.pop();
            list.add(this.map.get(add));
        }
        return list;
    }

    public String evaluate(LinkedList<Token> list) throws IllegalArgumentException{
        /*Method that takes a linked-list of Tokens, that represent a post-fix mathematical expression and attempts, to
        evaluate it. A string representing the answer is returned if successful */
        try {
            for (Token token : list) {
                if (token instanceof Operand) {
                    Operand operand = (Operand) token;
                    this.dStack.push(operand.getValue());
                }
                else if (token instanceof BinaryOperator) {
                    BinaryOperator operator = (BinaryOperator) token;
                    double a = this.dStack.pop();
                    double b = this.dStack.pop();
                    double c = operator.operate(b, a);
                    this.dStack.push(c);
                }
                else{
                    UnaryOperator operator = (UnaryOperator) token;
                    double a = this.dStack.pop();
                    double b = operator.operate(a);
                    this.dStack.push(b);
                }
            }
            Double d = this.dStack.pop();
            return d.toString();
        }
        catch (ClassCastException c){
            //A ClassCastException may be provoked by an Illegal Entry/Expression.
            throw new IllegalArgumentException();
        }
    }

    public String calculate(String string){
        //Method that uses the private methods of the class and attempts to fulfill the goal/functionality of the class.
        try {
            if(string.isEmpty()){
                return "";
            }
            LinkedList<Token> list = this.parser(string);
            String value = this.evaluate(list);
            return value;
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid Input Entered");
            return "";
        }
        catch (NullPointerException e){
            System.out.println("Input Format Issue");
            return "";
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Error");
            return "";
        }
    }

    @Override
    public String toString(){
        return "PostFixCalculator";
    }

}



