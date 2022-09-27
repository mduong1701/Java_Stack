import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args){

        Item item1 = new Item("mocha", 4.99);
        Item item2 = new Item("latte", 4.49);
        Item item3 = new Item("drip coffee", 2.99);
        Item item4 = new Item("capuccino", 3.99);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("AAA");
        Order order4 = new Order("BBB");
        Order order5 = new Order("CCC");
        
        order1.addItem(item1);
        order1.addItem(item2);
        order1.addItem(item3);

        order2.addItem(item2);
        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item1);
        order3.addItem(item3);
        order3.addItem(item4);

        order4.addItem(item1);
        order4.addItem(item1);
        order4.addItem(item1);

        order5.addItem(item2);
        order5.addItem(item2);
        order5.addItem(item2);

        order1.setReady();
        order3.setReady();
        order5.setReady();

        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}