package sample;
import java.util.ArrayList;
public class Calculator {
    private ArrayList<String> operator_list;
    private ArrayList<Double> number_list;
    public Calculator(){
        this.operator_list=new ArrayList<String>();
        this.number_list=new ArrayList<Double>();
    }
    protected ArrayList<String> getOperator_list(){
        return operator_list;
    }
    protected ArrayList<Double> getNumber_list(){
        return number_list;
    }
    protected void add(String data,boolean b){
        //Method that adds data of a certain type to an ArrayList of that type
        //Will be used to add Strings to operator_list and Integers to number_list in this application
        if(b==true){
            Double number=Double.parseDouble(data);
            number_list.add(number);
        }
        else{
            if(exp_checker_op(data)==true){
                operator_list.add(data);
            }
        }

    }
    protected void pop(boolean b){
        //Method removes last element of an ArrayList
        //Will be used to work on operator_list and number_list
        if(b==true){
            number_list.remove(-1);
        }
        else{
            operator_list.remove(-1);

        }


    }
    protected void remove(String data,boolean b){
        //Removes the first instance of a data in the provided list
        //Will likely not be used much
        if(b==true){
            Double number=Double.parseDouble(data);
            number_list.remove(number);
        }
        else{
            if(exp_checker_op(data)==true){
                operator_list.remove(data);
            }
        }

    }
    protected boolean exp_checker_num(String e){
        //Checks whether expression is a number or not returns True if it is False otherwise
        try{
            Double number=Double.parseDouble(e);
            return true;
        }
        catch (NumberFormatException f){
            return false;
        }
    }
    protected boolean exp_checker_op(String e){
        //Checks whether expression is an Operator or not returns True if it is False otherwise
        if(e.equals("+")){return true;}
        if(e.equals("-")){return true;}
        if(e.equals("*")){return true;}
        if(e.equals("/")){return true;}
        if(e.equals("(")){return true;}
        if(e.equals("^")){return true;}
        return false;
    }
    protected int rank(String e){
        //Returns "rank" of a specific operator
        //All rankings are in accordance with PEMDAS
        //Lower value indicates greater priority
        //Highest rank is one a value of 0 indicates unrecognized expression
        if(e.equals("(")){return 1;}
        else if(e.equals("^")){return 2;}
        else if(e.equals("*")){return 3;}
        else if(e.equals("/")){return 4;}
        else if(e.equals("+")){return 5;}
        else if(e.equals("-")){return 6;}
        else{return 0;}
    }
    protected double eval(String e,double n1,double n2){
        if(e.equals("+")){return n1+n2;}
        if(e.equals("-")){return n1-n2;}
        if(e.equals("*")){return n1*n2;}
        if(e.equals("/")){return n1/n2;}
        if(e.equals("^")){return Math.pow(n1,n2);}
        return 0;
    }
    /*protected String calculate(String e){
        String temp="";
        for(int i=0;i<e.length();i++){
            char c=e.charAt(i);
            String s=String.valueOf(c);
            if(exp_checker_op(s)){
                if(!exp_checker_num(temp)){return "Error";}
                Double prev=Double.parseDouble(temp);
                number_list.add(prev);
                temp="";
                if(!operator_list.isEmpty()){
                    if(rank(s)>rank(operator_list.get(-1))){
                        Double end=number_list.remove(-1);
                        Double start=number_list.remove(-1);
                        String op=operator_list.remove(-1);
                        number_list.add(eval(op,start,end));
                        operator_list.add(s);
                    }
                    else{
                        operator_list.add(s);
                    }
                }
                else{
                    operator_list.add(s);
                }
            }
            else{
                temp=temp+s;
            }
        }
        while(!operator_list.isEmpty()){
            Double end=number_list.remove(-1);
            Double start=number_list.remove(-1);
            String op=operator_list.remove(-1);
            number_list.add(eval(op,start,end));
        }
        if(number_list.size()==1){
            Double value=
        }
    }*/

}


