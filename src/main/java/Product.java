public class Product {
    private int quantity;
    private double buyPrice;
    private double sellPrice;
    private String name;

    public Product(int quantity, double buyPrice, double sellPrice, String name) {
        this.quantity = quantity;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "quantity=" + quantity +
                ", buyPrice=" + buyPrice +
                ", sellPrice=" + sellPrice +
                ", name='" + name + '\'' +
                '}';
    }
    public int getQuantity() {
        return quantity;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public void setName(String name) {
        this.name = name;
    }
}
