package simpleFactory;

public class vehiclefactory{
    public vehiclefactory(String bus) {

    }

    public static vehicle getVehicle(String vehicle) {
        if(vehicle.equals("bus"))
        {
            return new bus();
        }
        else if(vehicle.equals("car"))
        {
            return new car();
        }
        else if(vehicle.equals("train"))
        {
            return new train();
        }
        else
        {
            return null;
        }
    }

}
