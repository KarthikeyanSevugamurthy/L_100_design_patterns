package com.example.command.command;

import com.example.command.receiver.TV;

public class VolumeDownCommand implements Command {
    private TV tv;

    public VolumeDownCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeDown();
    }
}
