package com.example.command.command;

import com.example.command.receiver.TV;

public class VolumeUpCommand implements Command {
    private TV tv;

    public VolumeUpCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeUp();
    }
}
