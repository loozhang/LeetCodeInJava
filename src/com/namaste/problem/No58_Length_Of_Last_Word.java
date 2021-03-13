package com.namaste.problem;

public class No58_Length_Of_Last_Word {
    public static int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int res=0;
        while(i>=0){
            if(s.charAt(i)!=' '){
                res++;
            }
            if(s.charAt(i)==' '&&res!=0){
                break;
            }
            i--;
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(lengthOfLastWord("hello world"));
    }
}
