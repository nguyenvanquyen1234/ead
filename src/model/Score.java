package model;
public class Score {
    private int studentId, subjectId;
    private double score1, score2;
    public double getGrade() {
        return 0.3 * score1 + 0.7 * score2;
    }
    public String getLetterGrade() {
        double g = getGrade();
        return g >= 8 ? "A" : g >= 6 ? "B" : g >= 4 ? "D" : "F";
    }
}