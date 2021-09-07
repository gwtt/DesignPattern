package MethodFactory;

public class consumer {
        public static void main(String[] args) {
            vehicle bus = new busfactory().getvehicle();
            vehicle car = new carfactory().getvehicle();
            vehicle train = new trainfactory().getvehicle();
            bus.name();
            train.name();
            car.name();
        }
    }
