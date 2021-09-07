package simpleFactory;

public class train implements vehicle{
    @Override
    public void name() {
        System.out.println("This is a train");
    }
}
