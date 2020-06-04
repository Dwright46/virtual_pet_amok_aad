public class OrganicCat extends Organic {
    public OrganicCat(String name, String description, int health, int happiness, int boredom, int hunger, int thirst) {
        super(name, description, health, happiness, boredom, hunger, thirst);
    }

    public void waterPet() {
        thirst = thirst - 5;
    }

    public int boredom() {
        return boredom;
    }



    public int getPetHealth() {
        return health; }

    @Override
    public void tick() {

    }
}


