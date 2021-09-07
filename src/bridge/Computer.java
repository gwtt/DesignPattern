package bridge;

//抽象电脑类
public  abstract class Computer {
    //组合品牌
    protected Brand brand;

    public Computer(Brand brand)
    {
        this.brand =brand;
    }
    public void info(){
        brand.info();
    }
}
