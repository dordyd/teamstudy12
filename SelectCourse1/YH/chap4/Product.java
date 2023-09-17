package chap4;

public class Product {
    private int count;
    private String productName;

    public Product(String productName){
        this.productName = productName;
        count = 0;
    }

    public void downLoad(int downLoad){
        count += downLoad;
    }

    public void upLoad(int upLoad){
        count -= upLoad;
    }

    @Override
    public String toString() {
        return "productName = " + productName + ", count = " + count;
    }
    
    
}
