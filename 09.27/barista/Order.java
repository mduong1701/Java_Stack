import java.util.ArrayList;

public class Order {
    private String name;
    // private double total;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        // this.total = 0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public Order(String name){
        this.name = name;
        // this.total = 0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean isReady(){
        return this.ready;
    }

    public void setReady(){
        this.ready = true;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    public void setItems(Item item){
        this.addItem(item);
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        return this.ready
        ? "Your order is ready."
        : "Thank you for waiting. Your order will be ready soon.";
    }

    public double getOrderTotal(){
        double total = 0;
        for (Item item : this.items){
            total += item.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.println("Customer Name: " + this.getName());
        for (Item item : this.items){
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

}