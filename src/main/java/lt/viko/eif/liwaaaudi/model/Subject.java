package lt.viko.eif.liwaaaudi.model;

public class Subject {

    private String subjectName;
    private int credits;

    private int fullMark;

    private int mark;

    @Override
    public String toString() {
        return String.format("\tSubject name: %s\n\t\tCredits: %d\n\t\tFullMark: %d\n\t\tMark: %d", subjectName, credits, fullMark, mark);
    }

    public String getSubjectName() {

        return subjectName;
    }

    public void setSubjectName(String subjectName) {

        this.subjectName = subjectName;
    }

    public int getCredits() {

        return credits;
    }

    public void setCredits(int credits) {

        this.credits = credits;
    }

    public int getFullMark() {

        return fullMark;
    }

    public void setFullMark(int fullMark) {

        this.fullMark = fullMark;
    }

    public int getMark() {

        return mark;
    }

    public void setMark(int mark) {

        this.mark = mark;
    }
}