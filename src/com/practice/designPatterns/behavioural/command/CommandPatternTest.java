package com.practice.designPatterns.behavioural.command;

public class CommandPatternTest {
    public static void main(String args[]) {
        // Create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();

        // Create command objects
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        Command changeChannelTVCommand = new ChangeChannelCommand(tv);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnTVCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffTVCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(adjustVolumeStereoCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(changeChannelTVCommand);
        remoteControl.pressButton();


    }
}

