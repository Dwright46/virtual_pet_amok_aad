import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {
    public Object addPet;
    Map<String, VirtualPet> myShelter = new HashMap<>();
    public Collection<VirtualPet> availablePets() {
        return myShelter.values(); }

    public void addPet(VirtualPet adoptablePet) {
        String petsAvailable = adoptablePet.getPetName();
        myShelter.put(petsAvailable, adoptablePet); }

    public void removePet(String upForAdoption) {
        myShelter.remove(upForAdoption); }

    public void showPets(VirtualPet forShelter) {
        for (Entry<String, VirtualPet> entry : myShelter.entrySet()) {
            entry.getValue();
            System.out.println("Name : " + entry.getKey() + "\t| Description " + entry.getValue().getDescription() + "\t| Health: " + entry.getValue().getHealth() + "\t| Hunger: " + entry.getValue().getHunger() +  "\t| Hunger: " + entry.getValue().getThirst());
        }
    }

    public void getPetStats(VirtualPet adoptablePet) {

        for (Entry<String, VirtualPet> entry : myShelter.entrySet()) {
            entry.getValue();
            System.out.println("Name : " + entry.getKey() + "\t| Health " + entry.getValue().getHealth()
                    + "\t| Happiness: " + entry.getValue().getPetHappiness());
        }
    }

    public VirtualPet getPetNamed(String name) {
        return myShelter.get(name);
    }

    public void feedPets() {
        for (VirtualPet pet : availablePets()) {
            if (pet instanceof Organic) {
                Organic organicPet = (Organic) pet;
                organicPet.feed();
            }
        }
    }



    public void tickAllPets(VirtualPet adoptablePet) {
        for (VirtualPet pet : availablePets()) {
            if (pet instanceof Organic) {
                Organic organicPet = (Organic) pet;
                organicPet.tick();
            } else if (pet instanceof Robotic) {
                Robotic robotPet = (Robotic) pet;
                robotPet.tick();
            }
        }
    }

    public void waterAllPets() {
        for (VirtualPet pet : availablePets()) {
            if (pet instanceof Organic) {
                Organic organicPet = (Organic) pet;
                organicPet.water();
            }
        }
    }



    public void oilAllRobots() {

        for (VirtualPet pet : availablePets()) {

            if (pet instanceof Robotic) {

                Robotic robotPet = (Robotic) pet;

                robotPet.oilPet();

            }

        }

    }



    public boolean hasPets() {
        return !myShelter.isEmpty();
    }



    public void cleanAllCages() {

        for (VirtualPet pet : availablePets()) {

            if (pet instanceof OrganicDog) {

                OrganicDog organicDog = (OrganicDog) pet;

                organicDog.cleanCages();

            }

        }

    }



    public void emptyLitterBox() {

        for (VirtualPet pet : availablePets()) {

            if (pet instanceof OrganicCat) {

                OrganicCat organicCat = (OrganicCat) pet;

                organicCat.emptyLitterBox();

            }

        }

    }



    public void walkDogs() {

        for (VirtualPet pet : availablePets()) {

            if (pet instanceof OrganicDog) {

                OrganicDog myDog = (OrganicDog) pet;

                myDog.walk();

            }

        }

    }



    public void showPetName(VirtualPet pets) {

        for (Entry<String, VirtualPet> entry : myShelter.entrySet()) {

            System.out.println(entry.getKey() + "\n");

        }

    }

    public void addPets(VirtualPet pets) {

    }
}
