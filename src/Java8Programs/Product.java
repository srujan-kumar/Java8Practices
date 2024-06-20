package Java8Programs;

public class Product {
    int productID;
    String productName;
    double productPrize;
    boolean productAvailability;
    double productRating;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
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

    public double getProductRating() {
        return productRating;
    }

    public void setProductRating(double productRating) {
        this.productRating = productRating;
    }

    public Product(int productID, String productName, double productPrize, boolean productAvailability, double productRating) {
        this.productID = productID;
        this.productName = productName;
        this.productPrize = productPrize;
        this.productAvailability = productAvailability;
        this.productRating = productRating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productPrize=" + productPrize +
                ", productAvailability=" + productAvailability +
                ", productRating=" + productRating +
                '}';
    }
}
