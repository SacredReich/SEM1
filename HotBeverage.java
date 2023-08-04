import java.util.Calendar;

public class HotBeverage extends Beverage {
    public int temp;

    public HotBeverage(String name, int price, int quantity, Calendar bestBefore, double volume, int temp) {
        super(name, price, quantity, bestBefore, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", volume=" + volume + ", temperature=" + temp + ", price=" + price
                + ", quantity="
                + quantity
                + ", bestBefore="
                + bestBefore.get(Calendar.YEAR) + "/" + bestBefore.get(Calendar.MONTH) + "]";
    }

}