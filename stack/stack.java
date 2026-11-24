 package stack;

public class stack {
     int size;
     int top;
     int arr[];
     
     public stack(int capacity){
        size = capacity;
        top = -1;
       arr= new int[size];
        
     }

    void push(int data){
   
    }
    int pop(){
return 0;
    }
    int peek(){
    return 0;
    }
    boolean isFull(){
 return top == size-1;
    }
    boolean isEmpty(){
      return top == -1;
    }
}