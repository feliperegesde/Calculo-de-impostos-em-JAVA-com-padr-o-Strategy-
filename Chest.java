public class Chest {
    private String item;
    private double price; 
    public Chest(String item, double price){
        this.item=item;
        this.price=price;
    }

    public void setItem(String item) {
        this.item = item;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }
    public String toString() {
        return String.format("item= %s, preco= %.2f", item, price);
    }
}
