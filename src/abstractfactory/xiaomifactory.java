package abstractfactory;

public class xiaomifactory implements Iproductfactory{
    @Override
    public Iphoneproduct Iphoneproduct() {
        return new xiaomiphone();
    }

    @Override
    public Irouteproduct Irouteproduct() {
        return new xiaomiroute();
    }
}
