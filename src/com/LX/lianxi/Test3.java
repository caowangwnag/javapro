package com.LX.lianxi;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        Date startarray = new Date();
        for (int i = 0;i<100000;i++){
            arrayList.add(0,i);
        }
        Date endarray = new Date();
        System.out.println("ArrayList添加用时:"+(endarray.getTime()-startarray.getTime()));

        Date startlinked = new Date();
        for (int i = 0;i<100000;i++){
            linkedList.add(0,i);
        }
        Date endlinked = new Date();
        System.out.println("LinkedList添加用时："+(endlinked.getTime()-startlinked.getTime()));

        Date startreadarray = new Date();
        for (int i = 0;i<100000;i++){
           Object obj = arrayList.get(i);
        }
        Date endreadarray = new Date();
        System.out.println("ArrayList读取用时:"+(endreadarray.getTime()-startreadarray.getTime()));

        Date startreadlinked = new Date();
        for (int i = 0;i<100000;i++){
            Object obj = linkedList.get(i);
        }
        Date endreadlinked = new Date();
        System.out.println("linkedList读取用时:"+(endreadlinked.getTime()-startreadlinked.getTime()));

    }
}
