package lianxi;

public class lianxi {
    public static void main(String[] args){
//        int a = 10;
//        int b = 15;
//        int d = a;
//        System.out.println("helloWorld");
//        System.out.println(a+b);
//        System.out.println(d);
//         int b = 10;
//         byte a = (byte) b;
//        System.out.println(a);

        /*Dog dog = new Dog();
        dog.setSex('公');
        dog.setAge(15);
        dog.setHead(1);
        char sex = dog.getSex();
        int age = dog.getAge();
        int head = dog.getHead();
        System.out.println(sex);
        System.out.println(age);
        System.out.println(head);*/

        /*int year = 1996;
        if (year%400==0||(year%100!=0&&year%4==0)){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");

        }*/

        /*int  sum = 0 ;
        for (int i = 1;i<=100;i++){
           sum = sum+i;
        }
        System.out.println(sum);*/

        /*int sum = 0;
        for (int i = 2;i<=100;i++){
            boolean flag = true;
            for (int j = 2;j<=i-1;j++){
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag==true){
                sum = sum + i;
            }
        }
        System.out.println(sum);



//        Dog dog = new Dog();
        int c = Dog.add(5 ,6);
        System.out.println(c);*/

/*1111111111111
*
*  1 - 4 之间 拿出任意3个数  最多能组成多少个数字  并打印
*
*
*
* */
        /*int[] array = {1,2,3,4};
        for (int i:array){
            for (int j:array){
                for (int k:array){
                    if (i!=j&&j!=k&&i!=k){
                        System.out.println(i*100+j*10+k);
                    }
                }
            }
        }*/

/*2222222222222
*
*  1-100之间的偶数和
*
* */
        /*int[] array = new int[100];
        int sum = 0;
        for (int i = 0;i<array.length;i++){
            array[i]=i+1;
            if (array[i]%2==0){
                sum = sum + array[i];
            }
        }
        System.out.println(sum);*/


/*33333333333
*
*  定义两个int变量 m和n  计算m的n次方
*
* */
        /*int m = 2;
        int n = 3;
        int sq = 1;
        for (int i = 0;i<n;i++){
            sq = sq*m;
        }
        System.out.println(sq);*/

/*444444444444
*
* 100~999之间的水仙花数  例如 153  1^3+5^3+3^3=153
*
* */
        /*for (int i=100;i<1000;i++){
            int a = i/100;
            int b = (i%100)/10;
            int c = i%10;
            if (i==a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }*/


/*555555555555
*
*
* 两个正整数 计算最大公约数和最小公倍数
*
* */
        int m = 6;
        int n = 8;
        int max = 1;
        int min = max(m,n);
        for (int i = 1;i<=m&&i<=n;i++){
            if (m%i==0&&n%i==0){
                max = i;
            }
        }
        for (int i = min;i<=m*n;i++){
            if (i%m==0&&i%n==0){
                min = i;
                break;
            }
        }
        System.out.println("最大公约数："+max);
        System.out.println("最小公倍数："+min);
    }
    public static int max(int a,int b){
        return (a>b)?a:b;
    }
}
