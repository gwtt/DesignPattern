package abstractfactory;

//抽象产品工厂
public interface Iproductfactory {

    //生产手机
    Iphoneproduct  Iphoneproduct();

    //生产路由器
    Irouteproduct Irouteproduct();

}
