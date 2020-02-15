package com.LX.lianxi;
/****************二分查找**************/
public class Test2 {
    public static void main(String[] args) {
        int array[] = new int[100000];
        for (int i = 0;i<array.length-1;i++){
            array[i]=i+1;
        }
        int a = 3000;

        System.out.println(search(array,a));
    }
    public static int search(int[] array, int value){
        int min = 0;
        int max = array.length-1;
        int mid;
        int count = 0;
        while (min<=max){
            count++;
            mid = (min+max)/2;
            if (value==array[mid]){
                System.out.println("查找了"+count+"次");
                return mid;
            }else if (value>array[mid]){
                min=mid+1;
            }else {
                max = mid-1;
            }
        }
        return -1;
    }
}
