package sample;

public class Stack<T> {
    //An implementation of the Stack Abstract Data Type.
    private T[] stack; //Array representing the stack where the elements are stored.
    private int size; //Integer representing the size of the Stack
    private int capacity; //Integer representing the capacity of the Stack.

    //Constructor Methods.
    public Stack(int capacity){
        this.capacity = capacity;
        this.stack = (T[])new Object[capacity];
        this.size = 0;
    }
    public Stack(){
        this(25);
    }

    //Getter Functions/Accessor Methods.
    public int getSize(){
        return this.size;
    }
    public int getCapacity(){
        return this.capacity;
    }

    //Setter Functions/Mutator Methods.
    public void setCapacity(int capacity) {
        this.reSize(capacity);
    }

    public boolean isEmpty(){
        //Method that returns true if there are no elements in the Stack, false otherwise.
        if (this.size <= 0){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull(){
        //Method that returns true if the size of the Stack equals the capacity, false otherwise.
        if (this.size >= this.stack.length){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(T t){
        //Method that adds an element to the Stack. Increases the capacity of the Stack if the method isFull returns true.
        if (this.isFull()){
            this.reSize(this.capacity * 2);
        }
        this.stack[size] = t;
        this.size = this.size+1;
    }
    public T peek(){
        //Method that returns the element that is on top of the Stack/the last element added.
        return this.stack[this.size-1];
    }
    public T pop()throws NullPointerException{
        //Method that removes and returns the element that is on top of the Stack/the last element added.
        //Throws a NullPointerException if the method isEmpty returns true.
        if(this.isEmpty()){
            throw new NullPointerException();
        }
        else{
            this.size = this.size -1;
            T value = this.stack[this.size];
            this.stack[this.size] = null;
            return value;
        }
    }
    private void reSize(int newCapacity){
        //Helper method that helps to increase the capacity of the Stack.
        T[] newArray = (T[])new Object[newCapacity];
        if(!isEmpty()) {
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.stack[i];
            }
        }
        this.capacity = newCapacity;
        this.stack = newArray;
    }
    @Override
    public String toString(){
        return "Stack";
    }

}
