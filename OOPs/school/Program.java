package school;

class Subject {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subID, String name, int maxMarks) {
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMaxMarks(int num) {
        maxMarks = num;
    }

    public void setMarksObtain(int m) {
        marksObtain = m;
    }

    boolean isQualified(int m) {
        return m >= maxMarks;
    }

    public String toString() {
        return "\nSubject ID : " + subID + "\nName : " + name + "Marks Obtained : " + marksObtain;
    }

}

public class Program {
    public static void main(String[] args) {
        
    }
}
