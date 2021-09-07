package TemplateMethod;

public class CookingFood extends Cooking{
    @Override
    protected void step1() {
        System.out.println("放鸡蛋和西红柿");
    }

    @Override
    protected void step2() {
        System.out.println("放一点盐");
    }
}
