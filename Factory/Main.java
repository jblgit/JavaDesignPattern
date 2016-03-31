import framework.*;
import idcard.*;
import car.*;

public class Main{
    public static void main(String[] args){
       Factory factory = new IDCardFactory();
       Product card1 = factory.create("HGD");
       Product card2 = factory.create("LSS");
       Product card3 = factory.create("KKC");
       card1.use();
       card2.use();
       card3.use();

       Factory factory2 = new CarFactory();
       Product car1 = factory2.create("Sonata");
       Product car2 = factory2.create("K5");
       Product car3 = factory2.create("SM5");
       car1.use();
       car2.use();
       car3.use();
    }
}
