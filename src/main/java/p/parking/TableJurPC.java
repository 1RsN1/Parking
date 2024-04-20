package p.parking;
public class TableJurPC {
    private int numberPC;

    private String timePC;

    private String polzPC;

    private String typePC;

    private String ustr;
    private String chanel;
    private String notePC;


    public TableJurPC(int numberPC, String timePC, String polzPC, String typePC, String ustr, String chanel, String notePC) {
        this.numberPC = numberPC;
        this.timePC = timePC;
        this.polzPC = polzPC;
        this.typePC = typePC;
        this.ustr = ustr;
        this.chanel = chanel;
        this.notePC = notePC;
    }



    public TableJurPC() {}

    public int getNumberPC() {
        return numberPC;
    }

    public void setNumberPC(int numberPC) {
        this.numberPC = numberPC;
    }



    public String getTimePC() {
        return timePC;
    }

    public void setTimePC(String timePC) {
        this.timePC = timePC;
    }



    public String getPolzPC() {
        return polzPC;
    }

    public void setPolzPC(String polzPC) {
        this.polzPC = polzPC;
    }


    public String getTypePC() {
        return typePC;
    }

    public void setTypePC(String typePC) {
        this.typePC = typePC;
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


}

