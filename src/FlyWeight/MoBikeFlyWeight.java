package FlyWeight;

public class MoBikeFlyWeight extends BikeFlyWeight{
    //定义新的内部状态,车架号
    private int bikeId;
    public MoBikeFlyWeight(int bikeId)
    {
        this.bikeId = bikeId;
    }
    @Override
    void ride(String userName) {
        state = 1;
        System.out.println(userName+"骑"+bikeId+"号 自行车出行!");
    }

    @Override
    void back() {
        state = 0;
        System.out.println(bikeId+"号 自行车归还!");
    }
}
