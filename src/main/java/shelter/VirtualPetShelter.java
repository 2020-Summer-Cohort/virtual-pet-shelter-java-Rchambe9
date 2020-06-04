package shelter;

import java.util.HashMap;
import java.util.*;

public class VirtualPetShelter {

    Map<String, VirtualPet> petShelter = new HashMap<>();


    public VirtualPetShelter() {
    }


    public void admitNewPet(VirtualPet thePet) {
        petShelter.put(thePet.getPetName(), thePet);
    }

    public Collection<VirtualPet> retrieveAllPets() {
        return petShelter.values();
    }

    public void tickAllPets() {
        for (VirtualPet petToTick : petShelter.values()) {
            petToTick.petTick();

        }
    }

//    public void petToAdopt(VirtualPet thePet) {
//        for (VirtualPet petToAdopt : petShelter.values()) ;
//        petShelter.adopt(thePet.getPetName(), thePet);



        public void feedAllPets() {
            for (VirtualPet petToFeed : petShelter.values()) {
                petToFeed.eat();
            }
        }

        public void giveAllPetsWater() {
            for (VirtualPet petToWater : petShelter.values()) {
                petToWater.drink();
            }
        }


        public void playWithAllPets() {
            for (VirtualPet petToPlay : petShelter.values()) {
                petToPlay.play();

        }
    }
}



