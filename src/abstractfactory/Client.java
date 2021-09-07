package abstractfactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("====================小米产品====================");
        //小米工厂
        xiaomifactory xiaomifactory = new xiaomifactory();
        Iphoneproduct iphoneproduct = xiaomifactory.Iphoneproduct();
        iphoneproduct.start();
        iphoneproduct.callup();
        iphoneproduct.sendSMS();
        iphoneproduct.shutdown();
        System.out.println("====================华为产品====================");
        //华为工厂
        huaweifactory huaweifactory = new huaweifactory();
        Irouteproduct irouteproduct = huaweifactory.Irouteproduct();
        irouteproduct.start();
        irouteproduct.shutdown();
    }
}
