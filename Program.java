import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product food1 = new Food("Twix", 80, 10, new GregorianCalendar(2023, 11, 12), 58.6);
        Product food2 = new Food("Mars", 75, 12, new GregorianCalendar(2023, 8, 18), 57.2);
        Product food3 = new Food("Snickers", 83, 11, new GregorianCalendar(2023, 10, 19), 65.0);
        Product hotBeverage1 = new HotBeverage("Coffe", 50, 500, new GregorianCalendar(2026, 5, 16), 250, 85);
        Automat list = new Automat();
        HotBeverageAutomat list2 = new Automat();
        List<Product> myList = new ArrayList<>();
        myList.add(food1);
        myList.add(food2);
        myList.add(food3);
        myList.add(hotBeverage1);
        list.initProduct(myList);

        String beverageName = "Twix";
        System.out.println(list.getProduct(name).toString());

        String hotBeverageName = "Coffee";
        System.out.println(HotBeverageAutomat.getProduct(name).toString());
    }
}