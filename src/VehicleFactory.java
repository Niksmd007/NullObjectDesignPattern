public class VehicleFactory {
    public static Vehicle getVehicleObj(String typeOfVehicle){
        if("Car".equals(typeOfVehicle)){
            return new Car();
        }
        return new NullObject();
    }
}
