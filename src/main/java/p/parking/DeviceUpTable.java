package p.parking;

public class DeviceUpTable {
    private String name;
    private String cloudID;
    private String IPport;

    private String protocol;
    private String group;

    public DeviceUpTable(String name, String cloudID, String IPport, String protocol, String group) {
        this.name = name;
        this.cloudID = cloudID;
        this.IPport = IPport;
        this.protocol = protocol;
        this.group = group;
    }

    public DeviceUpTable() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCloudID() {
        return cloudID;
    }

    public void setCloudID(String cloudID) {
        this.cloudID = cloudID;
    }

    public String getIPport() {
        return IPport;
    }

    public void setIPport(String IPport) {
        this.IPport = IPport;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;

    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
