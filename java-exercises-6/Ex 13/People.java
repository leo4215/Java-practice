package entities;

public class People {
    
    private double height;
    private char gender;

    public People(double height, char gender){
        this.height = height;
        this.gender = gender;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public char getGender(){
        return gender;
    }
}
