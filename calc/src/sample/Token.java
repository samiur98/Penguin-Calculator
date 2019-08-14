package sample;

import java.util.Objects;

public class Token {
    //Class that stores a component of a Mathematical Expression.
    //Meant to be used by various methods that implement the Calculator interface, defined in the API.
    private final String string; //String representing the mathematical expression.
    public Token(String string){
        this.string = string;
    }
    //Getter Function/Accessor Method.
    public String getString(){
        return this.string;
    }
    @Override
    public String toString(){
        return "Token :" + this.string;
    }
    @Override
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if(other == null){
            return false;
        }
        if(this.getClass() != other.getClass()){
            return false;
        }
        Token token = (Token) other;
        return this.string.equals(token.getString());
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.string);
    }
}
