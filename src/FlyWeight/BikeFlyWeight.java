package FlyWeight;

public abstract class BikeFlyWeight {
    //内部状态
    protected Integer state = 0;//0是未使用,1是使用中

    //userName外部状态
    abstract void ride(String userName);
    abstract void back();
    public Integer getState(){
        return state;
    }
}
