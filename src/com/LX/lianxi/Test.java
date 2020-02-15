package com.LX.lianxi;
//冒泡排序
public class Test {
    public static void main(String[] args) {
        int[] array = {3,8,6,90,72,38,40,69,99,2};
        for (int i = 0;i<array.length-1;i++){
            int flag = 0;
            for (int j = 0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
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
