package shelter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {
    public static VirtualPetShelter petShelter = new VirtualPetShelter();


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        petShelter.admitNewPet(new VirtualPet("Harry", "Golden Hamster"));
        petShelter.admitNewPet(new VirtualPet("Scruffy", "German Shepard"));
        petShelter.admitNewPet(new VirtualPet("Felix", "Swiss Feline "));
        petShelter.admitNewPet(new VirtualPet("Patty", "American Guinea pig"));


        System.out.println("Welcome to The Robyn's Nest");

        printPetStatus(petShelter);

        System.out.println("Where do you want to start? Please select an activity:");
        System.out.println("");
        String source = "0) View an inventory of pets available for adoption,1) Feed the pets,2) Give the pets water,3) Play with the pets,4) Admit a pet into the shelter,5) Adopt one of our pets,6) Quit the program.";
        String[] elements = source.split(",");

        System.out.println(elements[0]);
        System.out.println(elements[1]);
        System.out.println(elements[2]);
        System.out.println(elements[3]);
        System.out.println(elements[4]);
        System.out.println(elements[5]);
        System.out.println(elements[6]);
        System.out.println("");

        while (true) {

            System.out.println("Select an activity:");

            int userInput = input.nextInt();
            input.nextLine();
            if (userInput == 0) {
                System.out.println("Here is the status of our pets:");
                printPetStatus(petShelter);
                System.out.println();


            } else if (userInput == 1) {
                petShelter.feedAllPets();
                System.out.println("Thank you for feeding the pets.");
                printPetStatus(petShelter);
                System.out.println();

            } else if (userInput == 2) {

                petShelter.giveAllPetsWater();
                System.out.println("Thanks for giving the pets water!");
                System.out.println("Pet levels are listed below:");
                System.out.println();

            } else if (userInput == 3) {
                petShelter.playWithAllPets();
                System.out.println("The pets love to play!");
                System.out.println("Pet levels are now:");
                System.out.println();

            } else if (userInput == 4) {

                System.out.println("You have chosen to donate a pet");
                System.out.println("Enter pet's name?");
                String addNewPetName = input.nextLine();

                System.out.println("What kind of animal is it?");
                String addNewPetType = input.nextLine();
                VirtualPet newPet = new VirtualPet(addNewPetName, addNewPetType);
                petShelter.admitNewPet(newPet);
                System.out.println("Thank you for donating " + newPet.getPetName());
                printPetStatus(petShelter);

            } else if (userInput == 5) {

                System.out.println("You have chosen to adopt a pet!");
                System.out.println("What is the pet's name you would like to take home?");
//                VirtualPet petToAdopt = new VirtualPet(removePetName, removePetType);
//                String petNameToAdopt = input.nextLine();
//                petShelter.adopt(petNameToAdopt);
                System.out.println("Great choice!  You will be very happy with your new pet!");
//
                printPetStatus(petShelter);

            } else {
                System.out.println("I'm sorry, there is no pet by that name available.");
                System.out.println("These are the pets we have available to be adopted:");
                printPetStatus(petShelter);

                System.out.println("Which pet would you like to adopt?");
                System.out.println();


                if (userInput == 6) {
                    System.out.println("You have exited the program.");
                    System.out.println("Thank you for visiting The Robyn's Nest");

                }

            }
            petShelter.tickAllPets();

            printPetStatus(petShelter);
        }

    }

    private static void printPetStatus(VirtualPetShelter petShelter) {
        System.out.println(" Name | HungerLevel | ThirstLevel | BoredomLevel ");
        System.out.println("______|_____________|_____________|______________");
        for (VirtualPet petToDisplay : petShelter.retrieveAllPets()) {
            System.out.println(petToDisplay.getPetName() + "\t\t\t" + petToDisplay.getHunger() + "\t\t" + "\t" + petToDisplay.getThirst() + "\t\t" +"\t" + petToDisplay.getBoredom());
        }
        System.out.println();
    }
}


