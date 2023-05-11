package Lab7;

import java.util.LinkedList;
import java.util.Collections;
public class MyQueue <E> {
    private LinkedList<E> list;

    public MyQueue(E[] e){
        this();
        Collections.addAll(list,e);

    }

    public MyQueue(){
        list = new LinkedList<>();
    }

    public void enqueue(E e){
        list.add(e);
    }

    public E dequeue(){
       return list.removeFirst();
    }

    public E getElement(int i){
        return list.get(i);
    }

    public E peek(){
        return list.getFirst();
    }

    public int getSize(){
        return list.size();
    }

    public boolean contains(E e){
        return list.contains(e);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString(){
        return list.toString();
    }
}
