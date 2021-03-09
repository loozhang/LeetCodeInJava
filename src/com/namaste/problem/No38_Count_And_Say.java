package com.namaste.problem;

public class No38_Count_And_Say {

    /*
    非递归解法
     */
    public static String countAndSay1(int n){
        String num = "1";
        int count = 1;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < num.length(); j++) {
                while (j!=num.length()-1 && num.charAt(j)== num.charAt(j+1)) {
                    count++;
                    j++;
                }
                temp.append(count);
                temp.append(num.charAt(j));
                count = 1;
            }
            num = temp.toString();
            temp = new StringBuilder();//清空字符串
        }
        return num;
    }

    /*
    递归解法
     */
    public static String countAndSay2(int n) {
        if(n==1)
            return "1";
        String str=countAndSay2(n-1)+"*";          //这里一定要有*，作为数组的结束，方便下面循环判断结束。
        char c[]=str.toCharArray();
        int count=1;
        String s="";
        for(int i=0;i<c.length-1;i++){
            if(c[i]==c[i+1])                      //*在这里发挥作用，便于判断最后一个字符是否与*相等，如果没有*结尾，会发生错误。
                count++;
            else{
                s=s+count+c[i];
                count=1;
            }
        }
        return s;
    }

    public static void main(String[] args){
        System.out.println(countAndSay1(10));
        System.out.println(countAndSay2(10));
    }
}
