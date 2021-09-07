package proxy;

//中介
public class Proxy implements Rent  {
    private Host1 host1;
    public Proxy() {
    }

    public Proxy(Host1 host1) {
        this.host1 = host1;
    }

    @Override
    public void rent() {
        host1.rent();
    }
    //看房
    public void seeHouse(){

        System.out.println("中介带你看房");
    }
}
