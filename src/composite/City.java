package composite;

//城市计数
public class City implements Counter{
    private int sum = 0;
    public City(int sum){
        this.sum = sum;
    }
    @Override
    public int count() {
        return sum;
    }
}
