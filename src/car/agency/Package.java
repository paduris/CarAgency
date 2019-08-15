package car.agency;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Package {

    private BigDecimal pkgCost= BigDecimal.ZERO;
    private List<Feature> features = new ArrayList<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
    public  void addFeatureToPackage(Feature feature)
    {
        features.add(feature);
        this.updatePackagePrice(feature);
    }

    private void updatePackagePrice(Feature feature) {
        pkgCost.add(feature.getPrice());
    }

    private String packageName;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public BigDecimal getPkgCost() {
        return pkgCost;
    }

    public void setPkgCost(BigDecimal pkgCost) {
        this.pkgCost = pkgCost;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

}
