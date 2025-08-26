public class ObserverPatternDemo {
    public static void main(String[] args) {
        Channel ytChannel = new Channel();

        User u1 = new User("Alice");
        User u2 = new User("Bob");
        User u3 = new User("Charlie");

        ytChannel.subscribe(u1);
        ytChannel.subscribe(u2);

        ytChannel.uploadVideo("Observer Pattern Explained!");  
        
        ytChannel.unsubscribe(u1);
        ytChannel.uploadVideo("Next Design Pattern - State!");
    }
}