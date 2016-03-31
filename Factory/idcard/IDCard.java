package idcard;
import framework.*;

public class IDCard extends Product{
    private String owner;
    IDCard(String owner){
        System.out.println(owner + " card generated.");
        this.owner = owner;
    }
    public void use(){
        System.out.println(owner + " card used.");
    }
    public String getOwner(){
        return owner;
    }
}
