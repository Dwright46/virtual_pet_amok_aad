abstract class Organic extends VirtualPet {
    protected int hunger;
    protected int thirst;
    protected int waste;

    public Organic(String name, String description, int health, int happiness, int boredom, int hunger, int thirst) {
        super(name, description, health, happiness, boredom);
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
    }


    public int getHunger() {
        return hunger;
    }

    public void feedPet() {
        hunger = hunger - 5;
    }

    public int getThirst() {
        return thirst;
    }

    public void setWaste(int waste ){ this.waste = waste; }

    public void emptyLitterBox(){ setWaste(getWaste()-5); }

    private int getWaste() { return waste ;}

    public void feed() {
    }

    public void water() {
    }
}