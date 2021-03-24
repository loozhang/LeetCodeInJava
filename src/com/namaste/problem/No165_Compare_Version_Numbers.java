package com.namaste.problem;

public class No165_Compare_Version_Numbers {
    public static int compare(String v1,String v2){
        int n1=v1.length(),n2=v2.length();
        int i=0,j=0,d1=0,d2=0;
        while (i<n1 || j<n2){
            while (i<n1 && v1.charAt(i)!='.'){
                d1=d1*10+v1.charAt(i++)-'0';
            }
            while (j<n2 && v2.charAt(j)!='.'){
                d2=d2*10+v2.charAt(j++)-'0';
            }
            if(d1>d2){
                return 1;
            }else if(d1<d2){
                return -1;
            }
            d1=d2=0;
            i++;
            j++;
        }
        return 0;
    }

    public static void main(String[] args){
        String version1 = "7.5.2.4", version2 = "7.5.3";
        System.out.println(compare(version1,version2));
    }
}
