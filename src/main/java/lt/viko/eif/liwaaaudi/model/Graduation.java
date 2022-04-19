package lt.viko.eif.liwaaaudi.model;

public class Graduation {
    private int gradYear;
    private String courseDuration;

    @Override
    public String toString() {
        return String.format("\tGraduation Year: %s\tCourse Duration: %s\n", gradYear, courseDuration);
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }
}
