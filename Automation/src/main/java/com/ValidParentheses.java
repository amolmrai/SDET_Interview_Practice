package com;

import sun.tools.jstat.Jstat;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValidParentheses(String str){
        // return false if string is empty
        if(str.isEmpty()){
            return false;
        }
        //create stack.
        Stack<Character> stack = new Stack<>();
        // push open parentheses into the stack
        for(char c : str.toCharArray()){
            if(c == '(' ){
                stack.push(c);
            // pop open parentheses if c = closing parentheses.
            }else if(c == ')' ){
                if(stack.isEmpty()){
                    stack.push(c);
                }else if(stack.peek() == '('){
                    stack.pop();
                }else if(stack.peek() == ')'){
                    stack.push(c);
                }
            }
        }
    return stack.isEmpty();
    }

    public static void main(String arg[]){
        String str = ")((()))";
        System.out.println("The Given String "+str + " is valid "+isValidParentheses(str));
    }

}
