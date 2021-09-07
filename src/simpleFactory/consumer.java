package simpleFactory;

    public class consumer {
        public static void main(String[] args) {
            vehicle bus = vehiclefactory.getVehicle("bus");
            vehicle train = vehiclefactory.getVehicle("train");
            vehicle car = vehiclefactory.getVehicle("car");
            bus.name();
            train.name();
            car.name();
        }
    }
