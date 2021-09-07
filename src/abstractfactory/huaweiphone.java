package abstractfactory;

public class huaweiphone implements Iphoneproduct{
    @Override
    public void start() {
        System.out.println("华为开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为关机");
    }

    @Override
    public void callup() {
        System.out.println("华为打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为发信息");
    }
}
