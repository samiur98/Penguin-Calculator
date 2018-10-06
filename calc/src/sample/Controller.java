package sample;

public class Controller {
    private Calculator cal;
    private boolean operator;
    private String temp;
    public Controller(){
        this.cal=new Calculator();
        operator=false;
    }
    protected String generic_action(String e){
        String result="";
        result=result+e;
        return result;
    }
    protected String clear_action(String e){
        int size=e.length();
        return e.substring(0,size-1);
    }
    protected String clear_everything_action(){
        return "0";
    }
}
