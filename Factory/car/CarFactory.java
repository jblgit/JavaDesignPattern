package car;
import framework.*;
import java.util.*;

public class CarFactory extends Factory{
    private List owners = new ArrayList();
    protected Product createProduct(String owner){
        return new Car(owner);
    }
    protected void registerProduct(Product product){
        owners.add(((Car)product).getOwner());
    }
    public List getOwners(){
        return owners;
    }
}
