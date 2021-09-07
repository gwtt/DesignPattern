package MethodFactory;

public class busfactory implements  vehiclefactory{
    @Override
    public vehicle getvehicle() {
        return new bus();
    }
}
