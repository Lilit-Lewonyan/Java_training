package Homework0705;

public class MyStack <V> {
    private int maxSize;
    private int top;
    private V array[];

    public MyStack(int max_size) {
        this.maxSize = max_size;
        this.top = -1; //initially when stack is empty
        array = (V[]) new Object[max_size];//type casting Object[] to V[]
    }

    //returns the maximum size capacity
    public int getMaxSize() {
        return maxSize;
    }

    //returns true if Stack is empty
    public boolean isEmpty(){
        return top == -1;
    }

    //returns true if Stack is full
    public boolean isFull(){
        return top == maxSize -1;
    }

    //returns the value at top of Stack
    public V top(){
        if(isEmpty())
            return null;
        return array[top];
    }

    public V pop(){
        if(isEmpty())
            return null;
        return array[top--]; //returns value and top and decrements the top
    }

}
