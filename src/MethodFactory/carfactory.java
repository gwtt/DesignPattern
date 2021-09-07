package MethodFactory;

public class carfactory implements  vehiclefactory{
    @Override
    public vehicle getvehicle() {
        return new car();
    }
}
