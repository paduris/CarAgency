package car.agency;

import java.math.BigDecimal;

public class Feature {

    private String featureName;
    private BigDecimal price;

    public Feature(String featureName, BigDecimal price) {
        this.featureName = featureName;
        this.price = price;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
