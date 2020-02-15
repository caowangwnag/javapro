package lianxi1;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,100);
        List list1 = new ArrayList();
        list1.add("咻咻咻");
        list1.add("啾啾啾");
        list.addAll(list1);
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
