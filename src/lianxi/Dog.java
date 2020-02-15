package lianxi;

public class Dog {
    private char sex;
    private int age;
    private int head;

    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        if (sex=='公'||sex=='母'){
            this.sex = sex;
        }else{
            System.out.println("输入有误");
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age>=0&&age<=20){
            this.age = age;
        }else{
            System.out.println("输入有误");
        }
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        if (head==1){
            this.head = head;
        }else{
            System.out.println("输入有误");
        }
    }

    public static int add(int a,int b) {
        int c = a + b;
        return c;
    }

}
