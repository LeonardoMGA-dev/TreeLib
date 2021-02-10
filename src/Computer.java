
public class Computer {

    private String macAddress;
    private String userName;
    private String ipAddress;
    private String operativeSystem;
    private int id;

    private static final String DEFAULT_MAC_ADDRESS = "default";
    private static final String DEFAULT_USER_NAME = "root";
    private static final String DEFAULT_IP_ADDRESS = "172.0.0.0";
    private static final String DEFAULT_OPERATIVE_SYSTEM = "UBUNTU";

    public Computer(String macAddress, String userName, String ipAddress, String operativeSystem) {
        this.macAddress = macAddress;
        this.userName = userName;
        this.ipAddress = ipAddress;
        this.operativeSystem = operativeSystem;
    }

    public Computer(String userName, int id){
        this(DEFAULT_MAC_ADDRESS, userName, DEFAULT_IP_ADDRESS, DEFAULT_OPERATIVE_SYSTEM);
        this.id = id;
    }

    public Computer(){
        this(DEFAULT_MAC_ADDRESS, DEFAULT_USER_NAME, DEFAULT_IP_ADDRESS, DEFAULT_OPERATIVE_SYSTEM);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getOperativeSystem() {
        return operativeSystem;
    }

    public void setOperativeSystem(String operativeSystem) {
        this.operativeSystem = operativeSystem;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
