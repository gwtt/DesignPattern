package bulider;
//抽象方法
public abstract class Builder {
    abstract void first();
    abstract void second();
    abstract void third();
    abstract void fourth();
    //完工
    abstract Product getProduct();
}
