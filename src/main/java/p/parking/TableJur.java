package p.parking;
public class TableJur {
    private int numberPC;
    private int numberUstr;
    private String timePC;
    private String timeUstr;
    private String polzPC;
    private String polzUstr;
    private String typePC;
    private String typeUstr;
    private String ustr;
    private String chanel;
    private String notePC;
    private String noteUstr;

    public TableJur(int numberPC, String timePC, String polzPC, String typePC, String ustr, String chanel, String notePC) {
        this.numberPC = numberPC;
        this.timePC = timePC;
        this.polzPC = polzPC;
        this.typePC = typePC;
        this.ustr = ustr;
        this.chanel = chanel;
        this.notePC = notePC;
    }

    public TableJur(int numberUstr, String timeUstr, String polzUstr, String typeUstr, String noteUstr) {
        this.numberUstr = numberUstr;
        this.timeUstr = timeUstr;
        this.polzUstr = polzUstr;
        this.typeUstr = typeUstr;
        this.noteUstr = noteUstr;
    }

    public TableJur() {}

    public int getNumberPC() {
        return numberPC;
    }

    public void setNumberPC(int numberPC) {
        this.numberPC = numberPC;
    }

    public int getNumberUstr() {
        return numberUstr;
    }

    public void setNumberUstr(int numberUstr) {
        this.numberUstr = numberUstr;
    }

    public String getTimePC() {
        return timePC;
    }

    public void setTimePC(String timePC) {
        this.timePC = timePC;
    }

    public String getTimeUstr() {
        return timeUstr;
    }

    public void setTimeUstr(String timeUstr) {
        this.timeUstr = timeUstr;
    }

    public String getPolzPC() {
        return polzPC;
    }

    public void setPolzPC(String polzPC) {
        this.polzPC = polzPC;
    }

    public String getPolzUstr() {
        return polzUstr;
    }

    public void setPolzUstr(String polzUstr) {
        this.polzUstr = polzUstr;
    }

    public String getTypePC() {
        return typePC;
    }

    public void setTypePC(String typePC) {
        this.typePC = typePC;
    }

    public String getTypeUstr() {
        return typeUstr;
    }

    public void setTypeUstr(String typeUstr) {
        this.typeUstr = typeUstr;
    }

    public String getUstr() {
        return ustr;
    }

    public void setUstr(String ustr) {
        this.ustr = ustr;
    }

    public String getChanel() {
        return chanel;
    }

    public void setChanel(String chanel) {
        this.chanel = chanel;
    }

    public String getNotePC() {
        return notePC;
    }

    public void setNotePC(String notePC) {
        this.notePC = notePC;
    }

    public String getNoteUstr() {
        return noteUstr;
    }

    public void setNoteUstr(String noteUstr) {
        this.noteUstr = noteUstr;
    }
}

