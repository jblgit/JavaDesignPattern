package car;
import framework.*;

public class Car extends Product{
    private String owner;
    Car(String owner){
        System.out.println(owner + " car generated.");
        this.owner = owner;
    }
    public void use(){
        System.out.println(owner + " car drived.");
    }
    public String getOwner(){
        return owner;
    }
}
