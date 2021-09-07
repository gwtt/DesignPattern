package adapter;

//真正的适配器
public class Adapter extends Adaptee implements NetToUsb{

    @Override
    public void HandleRequest() {
        super.request();
    }
}
