package ObserverPattern;

public class ObserverPattern {
    public static void main(String[] args) {
        Debit ZhangSan =new ZhangSan();
        ZhangSan.borrow(new Wangwu());
        ZhangSan.borrow(new Zhaosi());
        //state改变
        ZhangSan.notifyCredits();
    }
}
