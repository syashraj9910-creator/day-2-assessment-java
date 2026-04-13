public class Product {
    private String productName;
    private double price;

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Setter for productName
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        if (price > 0) { // Simple validation
            this.price = price;
        } else {
            System.out.println("Price must be a positive value.");
        }
    }
}