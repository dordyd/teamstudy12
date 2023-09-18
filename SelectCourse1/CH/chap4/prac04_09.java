package SelectCourse1.CH.chap4;

public class prac04_09 {
    
        public static void main (String[] args) {
          Product lamp = new Product("Lamp 60 Watt");
          System.out.println("Before the loading: " + lamp);
          lamp.downLoad(1000);
          lamp.upLoad(100);
          System.out.println("After the loading: " + lamp);
        }

        public static class Product{
            private String productName;
            private int productNum;
            public Product(String a){
                this.productName = a;
                productNum = 0;
            }

            public void downLoad(int input){
                this.productNum += input;
            }

            public void upLoad(int input){
                this.productNum -= input;
            }

            public String toString(){
                return productName + ", " + productNum + " pieces";
            }
        }
      
}


