package lt.viko.eif.liwaaaudi.model;

public class Grade {
    private int finalGrade;
    private int maxGrade;

    @Override
    public String toString() {
        return String.format("\tFinal Grade: %s\n\t\tMax Grade: %s", finalGrade, maxGrade);
    }

    public int getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    public int getMaxGrade() {
        return maxGrade;
    }

    public void setMaxGrade(int maxGrade) {
        this.maxGrade = maxGrade;
    }
}
