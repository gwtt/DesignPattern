package State;

public class StatePattern {
    public static void main(String[] args) {
        Context ZhangSan = new Context();
        ZhangSan.changeState(new Happy());
        ZhangSan.doSomething();
        ZhangSan.changeState(new Angry());
        ZhangSan.doSomething();
        ZhangSan.changeState(new Sad());
        ZhangSan.doSomething();

    }
}
