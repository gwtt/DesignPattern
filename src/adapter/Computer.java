package adapter;

//客户端类: 去上网,没有网线
public class Computer {


    public static void main(String[] args) {
        NetToUsb netToUsb = new Adapter();
        netToUsb.HandleRequest();
    }
}
