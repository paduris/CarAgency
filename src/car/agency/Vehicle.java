package car.agency;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    private Long vinNumber;
    private String make;
    private String color;
    private boolean isAvailable;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String model;
    private List<Package> pkg = new ArrayList<>();

    public abstract void applyPackage(Package pkg);

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public Long getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(Long vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Package> getPkg() {
        return pkg;
    }

    public void setPkg(List<Package> pkg) {
        this.pkg = pkg;
    }
}
