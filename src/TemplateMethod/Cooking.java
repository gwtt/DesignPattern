package TemplateMethod;

public abstract class Cooking {
    protected abstract void step1();
    protected abstract void step2();
    public void cook(){
        System.out.println("做饭开始");
        step1();
        step2();
        System.out.println("做饭结束");
    }
}
