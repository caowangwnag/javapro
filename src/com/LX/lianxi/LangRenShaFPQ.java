package com.LX.lianxi;

import java.util.*;

public class LangRenShaFPQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player = scanner.nextInt();
        if (player>18||player<12){
            System.out.println("不符合游戏人数");
        }

        List<String> all = new ArrayList<>();
        List<String> paly = new ArrayList<>();
        List<String> di = new ArrayList<>();
        init(all);
        pai(all,player);
        all.remove("盗贼");
        dipai(all,di);
        paly.addAll(all);
        Collections.shuffle(paly);  //打乱顺序
        System.out.println("手牌"+paly);
        System.out.println("底牌"+di);

    }
    //游戏初始化12个人
    public static void init(List<String> list){
        for (int i = 0;i<4;i++){
            list.add("狼人");
        }
        for (int i = 0;i<4;i++){
            list.add("村民");
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("守护");
        list.add("猎人");
        list.add("村长");
        list.add("盗贼");
    }
    //根据不同人数初始化不同的牌
    public static void pai(List<String> list,int player){
        if (player>12)
            list.add("村民");
        if (player>13)
            list.add("替罪羊");
        if (player>14)
            list.add("狼人");
        if (player>15)
            list.add("村民");
        if (player>16)
            list.add("村民");
        if (player>17)
            list.add("吹笛者");
    }
    //底牌，从总牌中抽取三张作为底牌
    public static void dipai(List<String> list,List<String> di){
        while (di.size()<3){
            Random random = new Random();  //随机取牌
            int index = random.nextInt(list.size());  //随机取0到list.size()-1；
            if (di.contains("狼人")&&list.get(index).equals("狼人")){   //list.get()只是拿出来看一下，并没有拿走
                continue;//本次循环结束，重新开始循环                    //list.remove()拿出来取走
            }else {
                di.add(list.remove(index));
            }

        }
    }
}
