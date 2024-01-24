package entities;

public class People {
    
    private String name;
    private int age;
    private double heigth;

    public People(String name, int age, double heigth){
        this.name = name;
        this.age = age;
        this.heigth = heigth;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getHeight(){
        return heigth;
    }

    public void setHeight(double height){
        this.heigth = height;
    }
}
