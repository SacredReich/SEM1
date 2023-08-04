import java.util.Calendar;

public class Beverage extends Product {
    public double volume;

    public Beverage(String name, int price, int quantity, Calendar bestBefore, double volume) {
        super(name, price, quantity, bestBefore);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", volume=" + volume + ", price=" + price + ", quantity=" + quantity
                + ", bestBefore="
                + bestBefore.get(Calendar.YEAR) + "/" + bestBefore.get(Calendar.MONTH) + "]";
    }
}