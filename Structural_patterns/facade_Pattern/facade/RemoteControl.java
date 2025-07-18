package facade;

public class RemoteControl {
    private TV tv;
    private SoundSystem sound;
    private PowerSupply power;

    public RemoteControl() {
        tv = new TV();
        sound = new SoundSystem();
        power = new PowerSupply();
    }

    public void pressPowerButton() {
        System.out.println(" Turning ON TV via Remote...");
        power.powerOn();
        tv.turnOnDisplay();
        sound.enableSound();
    }

    public void pressPowerOffButton() {
        System.out.println(" Turning OFF TV via Remote...");
        sound.disableSound();
        tv.turnOffDisplay();
        power.powerOff();
    }
}
