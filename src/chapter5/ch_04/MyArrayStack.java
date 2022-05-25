package chapter5.ch_04;

import chapter5.ch_02.MyArray;

public class MyArrayStack {

    MyArray arrayStack;
    int top;

    public MyArrayStack(){
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size){
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data){
        if(isFUll()){
            System.out.println("stack is full");
            return ;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop() {

       if(isEMpty()){
           System.out.println("stack is empty");
           return MyArray.ERROR_NUM;
       }
       return arrayStack.removeElement(--top);
    }

    public int peek() {

        if(isEMpty()){
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(--top);
    }

    public boolean isFUll(){
        if( top == arrayStack.ARRAY_SIZE){
            return true;
        }
        else return false;
    }

    public boolean isEMpty(){

        if( top == 0){
            System.out.println("stack is empty");
            return true;
        }
        else
            return false;
    }
    public void printAll(){
        arrayStack.printAll();
    }
}
