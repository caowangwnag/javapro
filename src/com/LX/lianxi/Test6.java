package com.LX.lianxi;

public class Test6 {
    public static void main(String[] args) {
        int[] array = {10,6,9,8,2,3,62,32,22,7};
        for (int i = 0;i<array.length-1;i++){
            int flag = 0;
            for (int j = 0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag++;
                }
            }
            if (flag==0){
                break;
            }
        }
        for (int a:array){
            System.out.println(a);
        }
    }
}
