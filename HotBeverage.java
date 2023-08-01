import java.util.Calendar;

public class HotBeverage extends Beverage {
    private int temperature;

    public HotBeverage(String name, int price, int quantity, Calendar bestBeforeDate, int volume, int temperature) {
        super(name, price, quantity, bestBeforeDate, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotBeverage [name=" + getName() + ", price=" + getPrice() + ", quantity=" + getQuantity()
                + ", bestBefore="
                + getBestBefore().get(Calendar.YEAR) + "/" + getBestBefore().get(Calendar.MONTH) + "/"
                + getBestBefore().get(Calendar.DAY_OF_MONTH) + ", volume=" + getVolume() + ", temperature="
                + temperature + "]";
    }
}