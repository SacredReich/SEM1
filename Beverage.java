import java.util.Calendar;

public class Beverage extends Product {
    private int volume;

    public Beverage(String name, int price, int quantity, Calendar bestBeforeDate, int volume) {
        super(name, price, quantity, bestBeforeDate);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Beverage [name=" + getName() + ", price=" + getPrice() + ", quantity=" + getQuantity() + ", bestBefore="
                + getBestBefore().get(Calendar.YEAR) + "/" + getBestBefore().get(Calendar.MONTH) + "/"
                + getBestBefore().get(Calendar.DAY_OF_MONTH) + ", volume=" + volume + "]";
    }
}