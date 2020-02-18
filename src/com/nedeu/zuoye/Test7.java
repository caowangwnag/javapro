package com.nedeu.zuoye;

import java.util.*;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入玩家人数：");
        int player = scanner.nextInt();
        if (player<12||player>18){
            System.out.println("不符合游戏人数");
        }
        List<String> all = new ArrayList<>();
        List<String> play = new ArrayList<>();
        List<String> dipai = new ArrayList<>();
        init(all,player);
        all.remove("盗贼");
        dipia(all,dipai);
        all.add("盗贼");
        play.addAll(all);
        Collections.shuffle(play);
        System.out.println(play);
        System.out.println(dipai);
    }
    //总牌随人数的变化而变化
    public static void init(List<String> list,int player){
        if (player>11){
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
    public static void dipia(List<String> zongpai,List<String> dipai){
        while (dipai.size()<3){
            Random random  = new Random();
            int index = random.nextInt(zongpai.size());    //随机取0到zongpai.size()-1
            if (dipai.contains("狼人")&&zongpai.get(index).equals("狼人")){
                continue;
            }else {
                dipai.add(zongpai.remove(index));
            }
        }

    }
}
