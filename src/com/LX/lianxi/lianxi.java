package com.LX.lianxi;

public class lianxi {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2;i<=100;i++){
            boolean flag = true;
            for (int j = 2;j<=i-1;j++){
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
