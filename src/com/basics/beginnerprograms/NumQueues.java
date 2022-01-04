// Number queue

package com.basics.beginnerprograms;

import java.util.LinkedList;

public class NumQueues{
    LinkedList queue;
    public NumQueues(){
        queue = new LinkedList();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public int size(){
        return queue.size();
    }
    public void enqueue(int data){
        queue.addLast(data);
    }
    public int dequeue(){
        return (int) queue.removeFirst();
    }
    public int peek(){
        return (int) queue.get(0);
    }
    public static void main(String[] args) {
        NumQueues q = new NumQueues();
        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(7);
        System.out.println("Check if queue is empty: "+q.isEmpty());
        System.out.println("Size of queue: "+q.size());
        System.out.println("First item out: "+q.dequeue());
        System.out.println("Peek at second item: "+q.peek());
        System.out.println("Second item out: "+q.dequeue());
        System.out.println("Third item out: "+q.dequeue());
    }
}