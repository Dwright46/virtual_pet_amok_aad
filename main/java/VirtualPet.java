abstract public class VirtualPet {
    String name;
    String description;
    int health;
    int happiness;
    int boredom;
    int hunger;
   int thirst;

    public VirtualPet(String name, String description, int health, int happiness, int boredom) {
        this.name = name;
        this.description = description;
        this.health = health;
        this.happiness = happiness;
        this.boredom = boredom;

    }
    public String getPetName() { return name; }

    public String getDescription() { return description; }

    public int getPetHappiness() { return happiness; }

    public int getHunger() { return hunger; }

    public boolean getReal() { return true; }

    public int getHappiness(){ return happiness; }

    public int getThirst() { return thirst;}

    public int getHealth() { return health; }



    public abstract void tick();

    public void play() { }


}