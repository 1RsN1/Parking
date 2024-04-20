package p.parking;

public class DeviceDownTable {
    private String name;
    private String cloudID;
    private String IPport;

    private String version;
    private String group;
    private String status;
    private String security;
    private String recording;
    private String connection;
    private String operation;

    public DeviceDownTable(String name, String cloudID, String IPport, String version, String group, String status,
                           String security, String recording, String connection, String operation) {
        this.name = name;
        this.cloudID = cloudID;
        this.IPport = IPport;
        this.version = version;
        this.group = group;
        this.status = status;
        this.security = security;
        this.recording = recording;
        this.connection = connection;
        this.operation = operation;
    }
    public DeviceDownTable() {

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
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;

    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }
    public String getRecording() {
        return recording;
    }
    public void setRecording(String recording) {
        this.recording = recording;
    }
    public String getConnection() {
        return connection;
    }
    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
}
