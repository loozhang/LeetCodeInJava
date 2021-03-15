package com.namaste.problem;

import java.util.HashMap;
import java.util.Stack;

public class No20_Valid_Parenthesis {

    public static boolean isValid1(String s){

        HashMap<Character,Character> mappings=new HashMap<>();
        mappings.put(')','(');
        mappings.put(']','[');
        mappings.put('}','{');

        Stack<Character> stack=new Stack<Character>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(mappings.containsKey(c)){
                char topElement=stack.empty()?'#':stack.pop();
                if(topElement!=mappings.get(c)){
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }

        return stack.empty();
    }

    public static boolean isValid2(String s){
        Stack<Character> parentheses=new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            Character c=s.charAt(i);
            if (c == '(' || c == '[' || c == '{') parentheses.push(c);
            else {
                if (parentheses.empty()) return false;
                if (c == ')' && parentheses.peek() != '(') return false;
                if (c == ']' && parentheses.peek() != '[') return false;
                if (c == '}' && parentheses.peek() != '{') return false;
                parentheses.pop();
            }
        }
        return parentheses.empty();
    }

    public static void main(String[] args){
        System.out.println(isValid2("[{]}"));
    }
}
