package p.parking;
public class TableJurUstr {

    private int numberUstr;

    private String timeUstr;

    private String polzUstr;

    private String typeUstr;



    private String noteUstr;



    public TableJurUstr(int numberUstr, String timeUstr, String polzUstr, String typeUstr, String noteUstr) {
        this.numberUstr = numberUstr;
        this.timeUstr = timeUstr;
        this.polzUstr = polzUstr;
        this.typeUstr = typeUstr;
        this.noteUstr = noteUstr;
    }

    public TableJurUstr() {}



    public int getNumberUstr() {
        return numberUstr;
    }

    public void setNumberUstr(int numberUstr) {
        this.numberUstr = numberUstr;
    }



    public String getTimeUstr() {
        return timeUstr;
    }

    public void setTimeUstr(String timeUstr) {
        this.timeUstr = timeUstr;
    }



    public String getPolzUstr() {
        return polzUstr;
    }

    public void setPolzUstr(String polzUstr) {
        this.polzUstr = polzUstr;
    }



    public String getTypeUstr() {
        return typeUstr;
    }

    public void setTypeUstr(String typeUstr) {
        this.typeUstr = typeUstr;
    }




    public String getNoteUstr() {
        return noteUstr;
    }

    public void setNoteUstr(String noteUstr) {
        this.noteUstr = noteUstr;
    }
}

