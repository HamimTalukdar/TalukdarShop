package ridzdoe;

public class Sound {
    private String soundSystem;
    private String soundQuality;
    private String soundControl;

    private String inputPower;
    private String speaker;
    private String speakerPower;

    public Sound(String soundSystem, String soundQuality){  // For mobile
        this.soundSystem = soundSystem;
        this.soundQuality = soundQuality;
    }

    // Constructor Overloading
    public Sound(String soundSystem, String soundQuality, String soundControl){  // For AirPods
        this.soundSystem = soundSystem;
        this.soundQuality = soundQuality;
        this.soundControl = soundControl;
    }

    // Constructor Overloading
    public Sound(String soundSystem, String soundQuality, String soundControl, String inputPower, String speaker, String speakerPower){  // For Earphone
        this(soundSystem, soundQuality, soundControl);
        this.inputPower = inputPower;
        this.speaker = speaker;
        this.speakerPower = speakerPower;
    }

    public String getSoundSystem(){
        return soundSystem;
    }

    public String getSoundQuality(){
        return soundQuality;
    }

    public String getSoundControl(){
        return soundControl;
    }

    public String getInputPower(){
        return inputPower;
    }

    public String getSpeaker(){
        return speaker;
    }

    public String getSpeakerPower(){
        return speakerPower;
    }
}
