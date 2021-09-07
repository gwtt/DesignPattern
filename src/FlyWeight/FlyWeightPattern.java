package FlyWeight;

public class FlyWeightPattern {
    public static void main(String[] args) {
        BikeFlyWeight bike1 = BikeFlyWeightFactory.getInstance().getBike();
        bike1.ride("张三");
        bike1.back();

        BikeFlyWeight bike2 = BikeFlyWeightFactory.getInstance().getBike();
        bike2.ride("赵四");

        BikeFlyWeight bike3 = BikeFlyWeightFactory.getInstance().getBike();
        bike3.ride("王五");
        bike3.back();

        System.out.println(bike1==bike2);
        System.out.println(bike2==bike3);
    }
}
