import java.util.Calendar;

public class Food extends Product {
    public double weight;

    public Food(String name, int price, int quantity, Calendar bestBefore, double weight) {
        super(name, price, quantity, bestBefore);
        this.weight = weight;
    }

    @Override
    public String toString() {

        return "Product [name=" + name + ", weight=" + weight + ", price=" + price + ", quantity=" + quantity
                + ", bestBefore="
                + bestBefore.get(Calendar.YEAR) + "/" + bestBefore.get(Calendar.MONTH) + "]";
    }

}