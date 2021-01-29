import java.io.Serializable;

public class Equipments implements Serializable {
    private String Name;
    private String Manufacturer;
    private int ModNumber;
    private int SerNumber;
    private String MACAddress;
    private String IpAddress;
    private String Location;
    private String Category;

    public Equipments(){
        Name = null;
        Manufacturer = null;
        ModNumber = 0;
        SerNumber = 0;
        MACAddress = null;
        IpAddress = null;
        Location = null;
        Category = null;
    }
    public Equipments(String Name, String Manufacturer, int ModNumber, int SerNumber, String MACAddress, String IpAddress, String Location, String Category){
        this.Name= Name;
        this.Manufacturer= Manufacturer;
        this.ModNumber= ModNumber;
        this.SerNumber= SerNumber;
        this.MACAddress= MACAddress;
        this.IpAddress= IpAddress;
        this.Location= Location;
        this.Category= Category;
    }

    @Override
    public String toString() {
        return "Equipment Description:" +
                "\n Name='" + Name + '\'' +
                ", \n Manufacturer='" + Manufacturer + '\'' +
                ", \n ModNumber=" + ModNumber +
                ", \n SerNumber=" + SerNumber +
                ", \n MACAddress='" + MACAddress + '\'' +
                ", \n IpAddress=" + IpAddress +
                ", \n Location='" + Location + '\'' +
                 ", \n Category='" + Category + '\'';
    }
}
