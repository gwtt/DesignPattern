package abstractfactory;

public class xiaomiroute implements  Irouteproduct{
    @Override
    public void start() {
        System.out.println("小米路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由器关机");
    }


}
