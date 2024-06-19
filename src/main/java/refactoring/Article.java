package refactoring;

public class Article {

    private Bike bike;
    private int purchaseAmount;
    private String name;
    private double price;

    public Article(String name, Bike bike, double price, int purchaseAmount) {
        this.name = name;
        this.bike = bike;
        this.price = price;
        this.purchaseAmount = purchaseAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}
