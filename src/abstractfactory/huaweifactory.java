package abstractfactory;

public class huaweifactory implements Iproductfactory{
    @Override
    public Iphoneproduct Iphoneproduct() {
        return new huaweiphone();
    }

    @Override
    public Irouteproduct Irouteproduct() {
        return new huaweiroute();
    }
}
