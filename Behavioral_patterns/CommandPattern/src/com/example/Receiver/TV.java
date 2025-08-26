package com.example.command.receiver;

public class TV {
    private int volume = 10;

    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }

    public void volumeUp() {
        volume++;
        System.out.println("TV Volume Increased to " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("TV Volume Decreased to " + volume);
    }
}
