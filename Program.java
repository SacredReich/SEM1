import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Food("Twix", 80, 10, new GregorianCalendar(2023, 10, 10, 0, 0), 0.2);
        Product product2 = new Food("Mars", 90, 50, new GregorianCalendar(2023, 10, 10, 0, 0), 0.15);
        Product product3 = new Food("Snickers", 60, 15, new GregorianCalendar(2023, 10, 0, 0, 0), 0.2);
        Product product4 = new Beverage("Vodka", 1300, 10, new GregorianCalendar(2025, 10, 14, 0, 0), 0.5);

        Automat list = new Automat();
        List<Product> myList = new ArrayList<>();
        myList.add(product1);
        myList.add(product2);
        myList.add(product3);
        myList.add(product4);
        list.initProduct(myList);

        String name = "Twix";
        System.out.println(list.getProduct(name).toString());
        name = "Mars";
        System.out.println(list.getProduct(name).toString());
        name = "Snickers";
        System.out.println(list.getProduct(name).toString());
        name = "Vodka";
        System.out.println(list.getProduct(name).toString());

        Product product5 = new HotBeverage("Black Tea", 100, 20, new GregorianCalendar(2023, 9, 14, 0, 0), 0.3, 95);
        Product product6 = new HotBeverage("Green Tea", 120, 20, new GregorianCalendar(2023, 9, 14, 0, 0), 0.3, 80);
        Product product7 = new HotBeverage("White Tea", 200, 20, new GregorianCalendar(2023, 9, 14, 0, 0), 0.3, 75);
        Product product8 = new HotBeverage("Espresso", 100, 20, new GregorianCalendar(2023, 9, 14, 0, 0), 0.05, 95);
        Product product9 = new HotBeverage("Latte", 100, 20, new GregorianCalendar(2023, 9, 14, 0, 0), 0.5, 85);

        HotBeverageAutomat list2 = new HotBeverageAutomat();
        List<HotBeverage> myList2 = new ArrayList<>();

        myList2.add((HotBeverage) product5);
        myList2.add((HotBeverage) product6);
        myList2.add((HotBeverage) product7);
        myList2.add((HotBeverage) product8);
        myList2.add((HotBeverage) product9);
        list2.initHotBeverage(myList2);
        name = "Latte";
        System.out.println(list2.getProduct("Latte", 0.5, 85).toString());

    }
}
