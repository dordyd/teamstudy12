public class Exercise_09 {
        private final String productName;
        private int numberOfPieces;
    
        public Exercise_09(String productName) {
            this.productName = productName;
            this.numberOfPieces = 0;
        }
    
       
        public void downLoad(int quantity) {
            if (quantity > 0) {
                numberOfPieces += quantity;
            }
        }
    
       
        public void upLoad(int quantity) {
            if (quantity > 0 && numberOfPieces >= quantity) {
                numberOfPieces -= quantity;
            }
        }
    
        
    }
    
