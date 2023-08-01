import java.util.Calendar;

public class Food extends Product {
    private double weight;

    public Food(String name, int price, int quantity, Calendar bestBeforeDate, double weight) {
        super(name, price, quantity, bestBeforeDate);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Food [name=" + getName() + ", price=" + getPrice() + ", quantity=" + getQuantity() + ", bestBefore="
                + getBestBefore().get(Calendar.YEAR) + "/" + getBestBefore().get(Calendar.MONTH) + "/"
                + getBestBefore().get(Calendar.DAY_OF_MONTH) + ", weight=" + weight + "]";
    }
}