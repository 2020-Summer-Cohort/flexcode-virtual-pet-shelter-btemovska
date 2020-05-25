package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> pets = new HashMap<>();

    public VirtualPet findPet(String petName) {
        return pets.get(petName);
    }

    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }

    public Collection<VirtualPet> feedAllPets() {
        return pets.values();
    }

    public Collection<VirtualPet> waterAllPets() {
        return pets.values();
    }

    public void addNewPet(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    public void closeAPet(VirtualPet pet) {
        pets.remove(pet.getName(), pet);
    }

    public void feed(String petName, int amount) {
        VirtualPet feedPet = findPet(petName);
        feedPet.feed(amount);
    }

    public void water(String petName, int amount) {
        VirtualPet waterPet = findPet(petName);
        waterPet.water(amount);
    }

    public void play(String petName, int amount) {
        VirtualPet playPet = findPet(petName);
        playPet.play(amount);
    }

    public void showAllPets() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
    //created the showAllPets method, but it is only printing the keys, and tried adding the values too, but
    //gave me that @ weird and also tried adding the toString too it still did not work

    public void tick() {
        for (VirtualPet pets : pets.values()) {
            pets.tick();
        }
    }// it is not updating hunger and thirst when the tick is used in play
}
