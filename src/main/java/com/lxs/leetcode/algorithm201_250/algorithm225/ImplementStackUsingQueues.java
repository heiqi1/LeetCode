package com.lxs.leetcode.algorithm201_250.algorithm225;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    int size;
    /** Initialize your data structure here. */
    public ImplementStackUsingQueues() {
        this.queue1= new LinkedList<Integer>();
        this.queue2= new LinkedList<Integer>();
        this.size=0;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(queue1.isEmpty()){
            queue2.offer(x);
        }else{
            queue1.offer(x);
        }
        size++;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(size==0){
            return -1;
        }
        int res=0;
        if(queue1.isEmpty()){
            for(int i=0;i<size-1;i++){
                queue1.offer(queue2.poll());
            }
            res=queue2.poll();
        }else{
            for(int i=0;i<size-1;i++){
                queue2.offer(queue1.poll());
            }
            res=queue1.poll();
        }
        size--;
        return res;
    }
    
    /** Get the top element. */
    public int top() {
        if(size==0){
            return -1;
        }
        int top=pop();
        if(queue1.isEmpty()){
            queue2.offer(top);
        }else{
            queue1.offer(top);
        }
        size++;
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return size==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
