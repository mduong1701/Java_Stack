import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args){
        CafeUtil cafe = new CafeUtil();
// ======================================================
        System.out.println("\n----- Streak Goal Test -----");
        System.out.println(cafe.getStreakGoal(10));
// ======================================================
        System.out.println("----- Order Total Test-----");
        double[] prices = {1.0,2.0,3.0,4.0,5.0,6.0};
        System.out.println(cafe.getOrderTotal(prices));
// ======================================================
        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("latte");
        menuItems.add("mocha");
        cafe.displayMenu(menuItems);
// ======================================================
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        cafe.addCustomer(customers);
// ======================================================
        cafe.printPriceChart("Columbian Coffee Grounds", 2.0, 4);
// ======================================================
        ArrayList<Double> pricesArr = new ArrayList<Double>();
        pricesArr.add(1.5);
        pricesArr.add(3.5);
        pricesArr.add(4.5);
        pricesArr.add(3.5);
        cafe.displayMenu(menuItems, pricesArr);
    }
}