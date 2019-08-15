package car.agency;

import java.util.ArrayList;
import java.util.List;

public class Honda extends Vehicle {

    private List<Package> packageList = new ArrayList<Package>();

    @Override
    public void applyPackage(Package pkg) {
        packageList.add(pkg);
    }
}
