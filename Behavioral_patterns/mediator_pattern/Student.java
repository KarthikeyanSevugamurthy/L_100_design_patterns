public class Student {
    private String name;
    private PlacementMediator mediator;

    public Student(String name, PlacementMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String message) {
        System.out.println(name + " says: " + message);
        mediator.sendToOfficer(message, this);
    }

    public void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}
