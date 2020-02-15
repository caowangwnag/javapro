package com.LX.lianxi;
//  选择排序
public class Test1 {
    public static void main(String[] args) {
        int[] array = {3,8,6,90,72,38,40,69,99,2};
        for (int i = 0;i<array.length-1;i++){
            for (int j = i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int a:array){
            System.out.println(a);
        }
    }
}
