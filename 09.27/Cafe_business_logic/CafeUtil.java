import java.util.ArrayList;

public class CafeUtil {
// ======================================================
    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }
// ======================================================
    public double getOrderTotal(double[] prices){
        double total = 0;
        for (double price : prices){
            total += price;
        }
        return total;
    }
// ======================================================
    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }
// ======================================================
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();

        while (!(userName.equals("q"))){
            System.out.println("Hello, " + userName);
            System.out.println("There are " + customers.size() + " people in front of you.");
            customers.add(userName);
            System.out.println("Please enter other name (or q to quit): ");
            userName = System.console().readLine();
        }
        
        for (String customer : customers){
            System.out.println(customer);
        }
    }
// ======================================================
    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++){
            System.out.format("%d - $%.2f\n", i, (price * i - (0.5 * (i - 1))));
        }
    }
// ======================================================
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if (menuItems.size() != prices.size()){
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++){
            System.out.format("%d %s -- $%.2f\n", i, menuItems.get(i), prices.get(i));
        }
        return true;
    }


}