import java.util.*;

public class G {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(2));
        MyArrayList<String> MAL_list = new MyArrayList<String>();
        MAL_list.add("I");
        MAL_list.add(" am");
        MAL_list.add(" Spider");
        MAL_list.add("man");
        System.out.println(MAL_list.get(0));


    }
}

interface MyList<T>{
    void add(T element);
    T get(int index);
    int size();
    boolean isEmpty();
}

class MyArrayList<T> implements MyList<T>{
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void add(T element){
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0,size);
            elements[size++] = element;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }
        return (T) elements[index];
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }
}


class MyLinkedList<T> implements MyList<T>{
    private class Node{
        T data;
        Node next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }

    @Override
    public void add(T element){
        Node newNode = new Node(element);
        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    @Override
    public T get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }

        Node current = head;

        for(int i = 0 ; i < index; i++){
            current = current.next;
        }
        return current.data;
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }
}