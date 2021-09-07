package abstractfactory;

public class xiaomiphone implements Iphoneproduct{
    @Override
    public void start() {
        System.out.println("小米开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米关机");
    }

    @Override
    public void callup() {
        System.out.println("小米打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米发信息");
    }
}
