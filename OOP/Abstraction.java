package OOP;

public abstract class Abstraction {
    private String name;
    private int number;

    public Abstraction (String name , int number){
        System.out.println("Constructor Abstraction");
        this.name = name;
        this.number = number;
    }
    public void mailCheck(){
        System.out.println("Mailing Check to"+this.name+" "+this.number);
    }
    public String toString(){
        return name+""+number;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
    public void setAddress(String newAddress){
        name = newAddress;
    }
    
}
