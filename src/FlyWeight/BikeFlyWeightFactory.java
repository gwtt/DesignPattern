package FlyWeight;

import java.util.HashSet;
import java.util.Set;

public class BikeFlyWeightFactory {
    private static  BikeFlyWeightFactory instance = new BikeFlyWeightFactory();
    private Set<BikeFlyWeight> pool = new HashSet<>();

    public  static  BikeFlyWeightFactory getInstance(){
        return instance;
    }
    private BikeFlyWeightFactory(){
        for(int i = 0;i<2;i++)
        {
            pool.add(new MoBikeFlyWeight(i));
        }
    }
    public BikeFlyWeight getBike(){
        for(BikeFlyWeight bike :pool)
        {
            if(bike.getState()==0)
                return bike;
        }
        return null;
    }
}
