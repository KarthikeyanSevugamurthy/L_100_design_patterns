import facade.RemoteControl;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        remote.pressPowerButton();
        System.out.println();
        remote.pressPowerOffButton();
    }
}
