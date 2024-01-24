package entities;

public class Student {
    
    public String name;
    public double grade1, grade2, grade3;

    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }

    public String toString(){
        if (finalGrade() < 60.00){
            double missingPoints = 60.0 - finalGrade();
            return "FINAL GRADE: " + String.format("%.2f%n", finalGrade()) + "FAILED\n" + "MISSING " + String.format("%.2f", missingPoints) + " POINTS"; 
        } else {
            return "FINAL GRADE: " + String.format("%.2f%n", finalGrade()) + "PASS";
        }
    }
}
