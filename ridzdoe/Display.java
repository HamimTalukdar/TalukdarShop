package ridzdoe;

public class Display {
    private String displayType;
    private String displayQuality;
    private String displaySize;
    private String dispalyBrightness;

    public Display(String displayType, String displayQuality, String displaySize, String displayBrightness){
        this.displayType = displayType;
        this.displayQuality = displayQuality;
        this.displaySize = displaySize;
        this.dispalyBrightness = displayBrightness;
    }

    public String getDisplayType(){
        return displayType;
    }

    public String getDisplayQuality(){
        return displayQuality;
    }

    public String getDisplaySize(){
        return displaySize;
    }

    public String getDisplayBrightness(){
        return dispalyBrightness;
    }

}