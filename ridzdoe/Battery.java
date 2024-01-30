package ridzdoe;

public class Battery {
    private String batteryType;
    private String batteryCapacity;
    private String chargingTime;
    private String dischargingTime;
    private String batteryLife;

    public Battery(String batteryType, String batteryCapacity, String chargingTime, String dischargingTime, String batteryLife){
        this.batteryType = batteryType;
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
        this.dischargingTime = dischargingTime;
        this.batteryLife = batteryLife;
    }

    public String getBattaryType(){
        return batteryType;
    }

    public String getBattaryCapacity(){
        return batteryCapacity;
    }

    public String getChargingTime(){
        return chargingTime;
    }

    public String getDischargingTime(){
        return dischargingTime;
    }

    public String getBatteryLife(){
        return batteryLife;
    }
}
