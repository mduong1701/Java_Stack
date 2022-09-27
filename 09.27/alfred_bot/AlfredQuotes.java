import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String result = String.format("Helllo, %s. Lovely to see you.", name);
        return result;
    }

    public String yell(String name) {
        String result = String.format("Hey, %s. Shut up!!!", name);
        return result;
    }

    public String guestGreeting(String name, String dayPeriod) {
        String result = String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
        return result;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        String result;
        if (conversation.indexOf("Alexis") != -1){
            result = "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") != -1){
            result = "At your service. As you wish, naturally.";
        }
        else {
            result = "Right. And with that I shall retire." ;
        }
        return result;
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

