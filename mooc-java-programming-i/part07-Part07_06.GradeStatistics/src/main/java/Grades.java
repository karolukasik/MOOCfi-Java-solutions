import java.lang.reflect.Array;
import java.util.ArrayList;

public class Grades {
    ArrayList<Integer> gradesAsPoints;
    private int passingGrade;

    public Grades(int passingGrade) {
        this.gradesAsPoints = new ArrayList<>();
        this.passingGrade = passingGrade;
    }

    public void add(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.gradesAsPoints.add(grade);
        }
    }

    public double averageOfGradesAboveMinPoint(int minPoint) {
        if (this.gradesAsPoints.size() > 0) {
            int sum = 0;
            int count = 0;
            for (Integer grade : gradesAsPoints) {
                if (grade >= minPoint) {
                    sum += grade;
                    count++;
                }
            }
            if (count == 0) {
                return -2;
            } else {
                return (double) sum / count;
            }
        }
        return -1;
    }

    public double averageAll() {
        return averageOfGradesAboveMinPoint(0);
    }

    public double averageOfPassed() {
        return averageOfGradesAboveMinPoint(this.passingGrade);
    }

    public double percentageOfPassed() {
        int gradesThatPassed = 0;
        for (Integer grade : gradesAsPoints) {
            if (grade >= this.passingGrade) {
                gradesThatPassed++;
            }
        }
        return (double) 100 * gradesThatPassed / this.gradesAsPoints.size();
    }

    public void gradeDistribution() {
        int[] grades = this.convertFromPointsToGrades();
        int i = grades.length - 1;
        while (i >= 0) {
            System.out.print(i + ": ");
            printStars(grades[i]);
            i--;
        }
    }

    public void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public int[] convertFromPointsToGrades() {
        int[] grades = { 0, 0, 0, 0, 0, 0 };
        for (Integer grade : gradesAsPoints) {
            if (grade < 50) {
                grades[0]++;
            } else if (grade >= 50 && grade < 60) {
                grades[1]++;
            } else if (grade >= 60 && grade < 70) {
                grades[2]++;
            } else if (grade >= 70 && grade < 80) {
                grades[3]++;
            } else if (grade >= 80 && grade < 90) {
                grades[4]++;
            } else {
                grades[5]++;
            }
        }
        return grades;
    }
}
