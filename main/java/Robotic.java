 abstract public class Robotic extends VirtualPet{
     protected int oilLevel;

     public Robotic(String name, String description, int health, int happiness, int boredom, int oilLevel) {
        super(name, description, health, happiness, boredom);
        this.oilLevel = oilLevel;
    }

     public  int getOilLevel(){
         return oilLevel;
     }

     public abstract void oilPet();
 }
