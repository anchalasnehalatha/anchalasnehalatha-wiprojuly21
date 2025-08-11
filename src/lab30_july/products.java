package lab30_july;
public class products {
         String productName;
	    double price;

	    public products(String productName, double price) {
	        this.productName = productName;
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return  productName +  ":  "+ price ;
	    }
	}

	 