package com.rohanchallenges.calc;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Implementing stacks with arrays
 */
public class ArrayStackDemo {
    public static void main(String[] args) {
        String express = "5+3/3-2+3*8+4/2";
        int index = 0;//Define an index value for traversing expressions
        int num1 = 0;
        int num2 = 0;
        int res = 0;//Calculation results
        char ch = ' ';
        int oper = 0;
        ArrayStack numStack = new ArrayStack(10);//Create a stack of numbers
        ArrayStack operStack = new ArrayStack(10);//Create a symbol stack
        while (true){
            ch = express.substring(index,index+1).charAt(0);//Continuous traversal operator
            //Determine whether or not it is an operator
            if (operStack.isOper(ch)){
                //Determine whether the current symbol stack has a symbol
                if(!operStack.isEmpty()){
                    //Judging priority if not empty
                    if(operStack.priority(ch)<=operStack.priority(operStack.peek())){
                        //When the priority is less than the value at the top of the stack, two stack values pop up for calculation.
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = operStack.cal(num1,num2,oper);
                        //After calculation, the calculated value is put on the stack of numbers.
                        numStack.push(res);
                        //At the same time, put the operators in the symbol stack.
                        operStack.push(ch);
                    }else{
                        //priority
                        operStack.push(ch);
                    }
                }else{
                    //To stack symbols directly for emptiness
                    operStack.push(ch);
                }
            }else {
                numStack.push(ch-48);
            }
            index++;
            if(index >= express.length()){
                break;
            }
        }
        //After scanning, the value of the stack is calculated with the value in the operator.
        while (true){
            if(operStack.isEmpty()){
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = operStack.cal(num1,num2,oper);
            numStack.push(res);
        }
        System.out.println("Expression:"+express+"="+numStack.pop());
    }
}

class ArrayStack {
    private int MaxSize;// Define the maximum length of an array
    private int[] arr;// Define an array, where the data is placed
    private int top = -1;// Define the top of the stack and initialize the data to -1

    public ArrayStack(int maxSize) {
        this.MaxSize = maxSize;
        arr = new int[MaxSize];
    }

    // Determine whether an array is empty
    public boolean isEmpty() {

        return top == -1;
    }

    // Determine whether the array is full
    public boolean isFull() {
        //System.out.println("stack top:"+top+maximum length:"+MaxSize);
        return top == MaxSize - 1;
    }
    //Remove the top element of the stack
    public int peek(){
        return arr[top];
    }
    // Enter stack
    public void push(int val) {
        // First judge whether the stack is full or not. If it is full, it cannot be added.
        if (isFull()) {
            System.out.println("The stack is full.");
            return;
        }
        top++;
        arr[top] = val;
    }

    // Stack out
    public int pop() {
        // First determine whether the stack is empty
        if (isEmpty()) {
            throw new RuntimeException("The stack is empty and can't get out of the stack!");
        }
        int val = arr[top];
        top--;
        return val;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("no data");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    /**
     * Determine whether it is an operator
     * @param oper  Incoming characters
     * @return  If the operator returns true, otherwise it returns false
     */
    public boolean isOper(char oper){
        return oper == '+' || oper == '-' || oper =='*' || oper == '/';
    }

    /**
     * Judging the priority of operators
     * @param oper Priority of incoming
     * @return  The return priority is 1, -1, 0, respectively.
     */
    public int priority(int oper ){
        if(oper == '*' || oper == '/'){
            return 1;
        } else if(oper == '+' || oper == '-'){
            return 0;
        }else {
            return -1;
        }
    }

    //computing method
    public int cal(int num1,int num2,int oper){
        int res = 0;
        switch (oper){
            case '+': res = num1 + num2;
                break;
            case '-': res = num2 - num1;
                break;
            case '*': res = num1 * num2;
                break;
            case '/': res = num2 /num1;
        }
        return res;
    }
}
