public class PlacementOfficer {
    private PlacementMediator mediator;

    public PlacementOfficer(PlacementMediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        System.out.println("[Officer]: " + message);
        mediator.sendToStudent(message, this);
    }

    public void receive(String message) {
        System.out.println("[Officer received]: " + message);
    }
}
