import java.util.*;
class Stack<E>{
    private E[] elements;
    private int size=0;
    private static final int DEFAULT_INITIAL_CAPACITY=16;
    public  Stack(){
        ArrayList<E> temp = new ArrayList<E>(DEFAULT_INITIAL_CAPACITY);
        elements = (E[])temp.toArray();
    }
    public void push(E entry){
        elements[size]= entry;
        size+=1;
    }
    public E pop(){
        E temp= elements[size];
        size-=1;
        return temp;
    }
    public void pushAll(Collection<E> col){
        for(E el : col){
            elements[size]= el;
            size+=1;
        }
    }
    public void popAll(Collection<E> col){
        for(int i=0; i<size; i++){
            col.add(elements[i]);
        }
        size = 0;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else return false;
    }
}
public class midsem3{
    public static void main(String... args){

    }
}