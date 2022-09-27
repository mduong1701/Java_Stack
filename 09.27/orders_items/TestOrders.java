import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args){

        Item item1 = new Item("mocha", 4.99);
        Item item2 = new Item("latte", 4.49);
        Item item3 = new Item("drip coffee", 2.99);
        Item item4 = new Item("capuccino", 3.99);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        order2.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);

        order1.setReady();

        order4.addItem(item2);
        order4.addItem(item2);

        order2.setReady();

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}