public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly. ";
        String readyMessage = ", your order is ready. ";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.49;
        double dripCoffee = 3.99;
        double latte = 4.99;
        double cappuccino = 4.49;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String sam = "Sam";
        String jimmy = "Jimmy";
        String noah = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean samOrder = false;
        boolean jimmyOrder = false;
        boolean noahOrder = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"

        System.out.println(isReadyOrder1 ? "Hi " + customer1 + readyMessage : "Hi " + customer1 + pendingMessage);

        if (noahOrder){
            System.out.println("Hi " + noah + readyMessage + displayTotalMessage + cappuccino);
        } else {
            System.out.println("Hi " + noah + pendingMessage);
        }

        if (samOrder){
            System.out.println("Hi " + sam + readyMessage + displayTotalMessage + (latte * 2));
        } else {
            System.out.println("Hi " + sam + pendingMessage);
        }

        System.out.println("Hi " + jimmy + ", " + displayTotalMessage + (latte));
    	
    }
}
