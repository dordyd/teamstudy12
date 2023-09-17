package Unit4_Exercise;

public class Product {

    private String productName;
    private int numberOfProduct = 0;

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
