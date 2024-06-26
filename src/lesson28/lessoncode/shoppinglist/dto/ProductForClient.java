package lesson28.lessoncode.shoppinglist.dto;

public class ProductForClient {

    private String productName;
    private String description;

    public ProductForClient(String productName, String description) {
        this.productName = productName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductForClient{" +
                "productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
