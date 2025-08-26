package com.example.command;

import com.example.command.command.*;
import com.example.command.invoker.RemoteControl;
import com.example.command.receiver.TV;

public class Client {
    public static void main(String[] args) {
        TV tv = new TV();

        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command volumeUp = new VolumeUpCommand(tv);
        Command volumeDown = new VolumeDownCommand(tv);

        RemoteControl remote = new RemoteControl();

        // Test TV Remote
        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(volumeUp);
        remote.pressButton();

        remote.setCommand(volumeUp);
        remote.pressButton();

        remote.setCommand(volumeDown);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
