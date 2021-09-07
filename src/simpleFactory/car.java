package simpleFactory;

public class car implements vehicle{
    @Override
    public void name() {
        System.out.println("This is a car");
    }
}
