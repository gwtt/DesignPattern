package proxy;

public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host1 host1 = new Host1();
        //代理,中介带房东租房子,但是呢?代理一般有附加操作
        Proxy proxy = new Proxy(host1);
        proxy.rent();
    }
}
