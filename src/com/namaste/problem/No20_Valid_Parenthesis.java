package com.namaste.problem;

import java.util.HashMap;
import java.util.Stack;

public class No20_Valid_Parenthesis {

    public static boolean isValid(String s){

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

    public static void main(String[] args){
        isValid("[]");
    }
}
