package Unit4_Exercise;

public class Product {

    private final String productName;
    private int numberOfProduct;

    public Product(String productName) {
        this.productName = productName;
    }

    public void downLoad(int numberOfProduct) {
        this.numberOfProduct += numberOfProduct;
    }

    public void upLoad(int numberOfProduct) {
        this.numberOfProduct -= numberOfProduct;
    }


    public String toString() {
        return "Product Name => " + this.productName + " / " +
                "Number of Product => " + this.numberOfProduct;
    }


}
