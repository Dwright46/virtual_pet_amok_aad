public class OrganicDog extends Organic {
    public OrganicDog(String name, String description, int health, int happiness, int boredom, int hunger, int thirst) {
        super(name, description, health, happiness, boredom, hunger, thirst);
    }


    public void waterPet() {
        thirst = thirst - 5;
    }

    public int getBoredom() {
        return boredom;
    }

    public void walkDogs() {
        boredom = boredom - 10;
    }

    public void cleanCages() {
    }


    @Override
    public void tick() { }

    public void walk() { }
}
