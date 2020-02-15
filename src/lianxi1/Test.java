package lianxi1;

public class Test {
    public static void main(String[] args) {
        ZhuBan zhuBan = new ZhuBan();
        I3 i3 = new I3();
        I5 i5 = new I5();
        I7 i7 = new I7();
        zhuBan.setCpu(i5);
        zhuBan.method();
    }
}
