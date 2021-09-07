package MethodFactory;

public class trainfactory implements vehiclefactory{
    @Override
    public vehicle getvehicle() {
        return new train();
    }
}
