package com.basics.Strings;

import java.util.LinkedList;

public class StringQueue {
    LinkedList queue;
    public StringQueue(){
        queue = new LinkedList();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public int size(){
        return queue.size();
    }
    public void enqueue(String data){
        queue.addLast(data);
    }
    public String dequeue(){
        return (String) queue.removeFirst();
    }
    public String peek(){
        return (String) queue.get(0);
    }
    public static void main(String[] args) {
        StringQueue q = new StringQueue();
        q.enqueue("Hello");
        q.enqueue("Hi");
        q.enqueue("World");
        q.enqueue("Thanks");
        System.out.println("Check if queue is empty: "+q.isEmpty());
        System.out.println("Size of queue: "+q.size());
        System.out.println("First item out: "+q.dequeue());
        System.out.println("Peek at second item: "+q.peek());
        System.out.println("Second item out: "+q.dequeue());
        System.out.println("Third item out: "+q.dequeue());
        System.out.println("Fourth item out: "+q.dequeue());
    }
}
