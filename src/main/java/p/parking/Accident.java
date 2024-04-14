package p.parking;

public class Accident {
    private int num;
    private String status;
    private  String type;
    private String  date;
    private String ustr;
    private String result;

    public Accident(int num, String status, String type, String date, String ustr, String result) {
        this.num = num;
        this.status = status;
        this.type = type;
        this.date = date;
        this.ustr = ustr;
        this.result = result;
    }
    public Accident() {

    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getUstr() {
        return ustr;
    }
    public void setUstr(String ustr) {
        this.ustr = ustr;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
}
