package car.agency;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    private List<Vehicle> vehicleList = new ArrayList<>();

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void registerNewVehicle(Vehicle vehicle) {
        Package pkg = new Package();
        pkg.setFeatures(new ArrayList<>()); // some default features
        pkg.setType("DEFAULT");
        vehicle.applyPackage(pkg);
        vehicleList.add(vehicle);
    }

    private void removeVehicle(Vehicle vehicle)
    {
        vehicleList.remove(vehicle);
    }

    public void searchVehicle(Vehicle vehicle) {

        if (vehicle.isAvailable()) {
            performSearch(vehicle);
        }
    }

    private List<Vehicle> performSearch(Vehicle vehicle) {


        List<Vehicle> searchResults = new ArrayList<>();
        for (Vehicle cveh : this.getVehicleList()) {

            // based on some search criteria
            if (vehicle.getVinNumber().equals(cveh.getVinNumber())) {
                searchResults.add(vehicle);
            }
        }
        return searchResults;
    }
}
