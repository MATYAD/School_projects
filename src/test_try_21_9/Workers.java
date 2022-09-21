package test_try_21_9;

public class Workers implements Comparable<Workers>{
    private String fName;
    private String lName;
    private int earning;

    public Workers(String fName, String lName, int earning) {
        this.fName = fName;
        this.lName = lName;
        this.earning = earning;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getEarning() {
        return earning;
    }

    public void setEarning(int earning) {
        this.earning = earning;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", earning=" + earning +
                '}';
    }

    @Override
    public int compareTo(Workers o) {
        return Integer.compare(this.getEarning(),o.getEarning());
    }
}
