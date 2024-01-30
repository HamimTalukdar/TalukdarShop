package ridzdoe;

public class Connectivity {
    private String connectivityType;
    private String bluetoothVersion;
    private String frequencyRange;
    private String impedance;

    public Connectivity(String connectivityType, String bluetoothVersion){  // For AirPods
        this.connectivityType = connectivityType;
        this.bluetoothVersion = bluetoothVersion;
    }

    // Constractor Overloading
    public Connectivity(String connectivity, String frequencyRange, String impedance){  // For Earphone
        this.connectivityType = connectivity;
        this.frequencyRange = frequencyRange;
        this.impedance = impedance;
    }

    public String getConnectivityType(){
        return connectivityType;
    }

    public String getBluetoothVersion(){
        return bluetoothVersion;
    }

    public String getFrequencyRange(){
        return frequencyRange;
    }

    public String getImpedence(){
        return impedance;
    }

}