import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        VirtualPet pets = new OrganicDog("Spike","Old",5,5,5,5,5);
        VirtualPetShelter myShelter = new VirtualPetShelter();
        myShelter.addPets(pets);

        VirtualPet roboticDog = new RoboticDog(("Rusty"), "Robotic", 10, 10,10,10);
        myShelter.addPet(roboticDog);

        VirtualPet organicCat = new OrganicCat("Tyson","Furry",5,5,5,5,5);
        myShelter.addPet(organicCat);

        VirtualPet roboticCat = new RoboticCat("Murry","Steel",20,20,20,5);
        myShelter.addPet(roboticCat);

        Scanner input = new Scanner(System.in);
        System.out.println();

        String menu = "\n\t\t-Choose a menu option-\n" + "\n\t\t" + "1. See all organic pets\n\t\t" + "2. Water organic pets\n\t\t" + "3. Clean dog cage.\n\t\t" + "4. Empty litter box.\n\t\t" + "5. Walk dog.\n\t\t" + "6. Oil robotic pet. \n\t\t" + "7. Adopt pet\n\t\t" + "8. Admit a pet to shelter\n\t\t" + "9. Play with pet\n\t\t" + "10. Feed all pets\n\t\t"+ "11. Exit";

        String menuChoiceEntered;
        while (myShelter.hasPets()) {
            do { System.out.println(menu);
                menuChoiceEntered = input.nextLine();
                switch (menuChoiceEntered) {

                    case "1":
                        myShelter.tickAllPets(pets);
                        System.out.println("All pets in shelter: ");
                        myShelter.showPets(pets);
                        break;

                    case "2":
                        myShelter.tickAllPets(pets);
                        myShelter.waterAllPets();
                        System.out.println("You watered all organic pets in the shelter.");
                        break;

                    case "3":
                        myShelter.tickAllPets(pets);
                        myShelter.cleanAllCages();
                        System.out.println("The dog cages have all been cleaned.");
                        break;

                    case "4":
                        myShelter.tickAllPets(pets);
                        myShelter.emptyLitterBox();
                        System.out.println("The litter has been replaced in the cats' litter box.");
                        break;

                    case "5":
                        myShelter.tickAllPets(pets);
                        myShelter.walkDogs();
                        System.out.println("You took the dogs for a walk.");
                        break;

                    case "6":
                        myShelter.tickAllPets(pets);
                        myShelter.oilAllRobots();
                        System.out.println("All robo parts in robo pets have been oiled.");
                        break;

                    case "7":
                        myShelter.tickAllPets(pets);
                        myShelter.showPets(pets);
                        System.out.println("Who would you like to adopt?");
                        String upForAdoption = input.nextLine();
                        myShelter.removePet(upForAdoption);
                        System.out.println("You have adopted " + upForAdoption);
                        break;

                    case "8":
                        myShelter.tickAllPets(pets);
                        System.out.println(
                                "Do you have a: \n\t A. Organic Dog \n\t B. Organic Cat \n\t C. Robot Dog \n\t D. Robot Cat");
                        String petType = input.nextLine();
                        switch (petType.toUpperCase()) {
                            // Add organic dog.
                            case "A":
                                System.out.println("Please name the new dog: ");
                                String organicDogName = input.nextLine();
                                VirtualPet newOrganicDog = new OrganicDog(organicDogName, "", 10, 0, 0, 0,0);
                                myShelter.addPet(newOrganicDog);
                                break;

                            case "B":
                                System.out.println("Please name of new cat: ");
                                String organicCatName = input.nextLine();
                                VirtualPet newOrganicCatName = new OrganicCat(organicCatName, "", 5, 0, 0, 0,0);
                                myShelter.addPet(newOrganicCatName);

                                System.out.println("Please enter description of new cat: ");
                                String organicCatDescription = input.nextLine();
                                VirtualPet newOrganicCat2 = new OrganicCat(organicCatDescription, "", 5, 0, 0, 0,0);
                                myShelter.addPet(newOrganicCat2);

                                break;

                            case "C":
                                System.out.println("Please name the new robot dog: ");
                                String roboticDogName = input.nextLine();
                                VirtualPet newRoboticDog = new RoboticDog(roboticDogName, "", 5, 5,0,0);
                                myShelter.addPet(newRoboticDog);
                                break;

                            case "D":

                                System.out.println("Please name the new robot cat: ");
                                String roboticCatName = input.nextLine();
                                VirtualPet newRoboticCat = new RoboticCat(roboticCatName, "", 10, 10,0,0);
                                myShelter.addPet(newRoboticCat);
                                break;

                        }

                        System.out.println("Congratulations! You've got a new friend!");
                        break;

                    case "9": // play with a pet
                        myShelter.tickAllPets(pets);
                        System.out.println("Which pet would you like to play with?");
                        System.out.println();
                        myShelter.showPetName(pets);
                        String chosenPet = input.nextLine();
                        VirtualPet playPet = myShelter.getPetNamed(chosenPet);
                        playPet.play();
                        System.out.println(chosenPet + " had a great time!");

                        break;
                    case "10":
                        myShelter.tickAllPets(pets);
                        myShelter.feedPets();
                        System.out.println("The organic pets all seem happy and full.");
                        break;
                        
                    case "11":
                        System.out.println("Thank you please play again");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Error!, enter 1-11");
                }
            } while (!myShelter.hasPets());
        }

        input.close();

    }

  }

