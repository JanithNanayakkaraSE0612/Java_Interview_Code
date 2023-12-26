package OOP;

/**
 * Encapsulate
 */
public class Encapsulate {

    private String name;
    private int age;
    private double salary;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setSalary(double newSalary){
        salary = newSalary;
    }


}