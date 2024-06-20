package Java8Programs;

public class ProductBasicDetails {
    String productName;
    double productPrize;

    boolean productAvailability;

    public ProductBasicDetails(String productName, double productPrize, boolean productAvailability) {
        this.productName = productName;
        this.productPrize = productPrize;
        this.productAvailability = productAvailability;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrize() {
        return productPrize;
    }

    public void setProductPrize(double productPrize) {
        this.productPrize = productPrize;
    }

    public boolean isProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(boolean productAvailability) {
        this.productAvailability = productAvailability;
    }

    @Override
    public String toString() {
        return "ProductBasicDetails{" +
                "productName='" + productName + '\'' +
                ", productPrize=" + productPrize +
                ", productAvailability=" + productAvailability +
                '}';
    }
}
