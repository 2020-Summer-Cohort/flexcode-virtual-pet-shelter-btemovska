package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        VirtualPetShelter shelter = new VirtualPetShelter();

        VirtualPet pet1 = new VirtualPet("Lola", "cat", 40, 35, 70);
        VirtualPet pet2 = new VirtualPet("Max", "dog", 35, 30, 60);
        VirtualPet pet3 = new VirtualPet("Teddy", "bear", 40, 35, 80);
        VirtualPet pet4 = new VirtualPet("Cuddle", "tiger", 45, 40, 10);

        String newPetName;
        String newPetType;
        int newPetHunger;
        int newPetThirst;
        int newPetBored;

        System.out.println("HI! Thank you for volunteering at the shelter today!");
        System.out.println();
        System.out.println("Here are our pets and their current status: ");
        System.out.println("Name\t\tType\tHunger\tThirst\tBored ");
        System.out.println(pet1.toString());
        System.out.println(pet2.toString());
        System.out.println(pet3.toString());
        System.out.println(pet4.toString());

        System.out.println();

        System.out.println("How would you like to volunteer?");
        System.out.println("press 1 to feed all pets");
        System.out.println("press 2 to water all pets");
        System.out.println("press 3 to play with a pet");
        System.out.println("press 4 to adopt a pet");
        System.out.println("press 5 to admit a pet");
        System.out.println("press 6 to quit");
        String response = input.nextLine();

        while (!response.equals("6")) {

            if (response.equals("1")) {
                System.out.println("Enter the amount you want to feed");
                int amountToFeed = input.nextInt();
                pet1.feed(amountToFeed);
                pet2.feed(amountToFeed);
                pet3.feed(amountToFeed);
                pet4.feed(amountToFeed);
                System.out.println("Here is the new status: ");
                System.out.println("Name\t\tType\tHunger\tThirst\tBored ");
                System.out.println(pet1.toString());
                System.out.println(pet2.toString());
                System.out.println(pet3.toString());
                System.out.println(pet4.toString());
                input.nextLine();
            } else if (response.equals("2")) {
                System.out.println("Enter the amount you want to water");
                int amountToWater = input.nextInt();
                pet1.water(amountToWater);
                pet2.water(amountToWater);
                pet3.water(amountToWater);
                pet4.water(amountToWater);
                System.out.println("Here is the new status: ");
                System.out.println("Name\t\tType\tHunger\tThirst\tBored ");
                System.out.println(pet1.toString());
                System.out.println(pet2.toString());
                System.out.println(pet3.toString());
                System.out.println(pet4.toString());
                input.nextLine();
            } else if (response.equals("3")) {
                System.out.println("What pet would you like to play with?");
                System.out.println("In the shelter we have Lola, Max, Teddy, Cuddle");
                String petNameToPlay = input.next();
                if (petNameToPlay.toLowerCase().equals("lola")) {
                    System.out.println("You have selected " + petNameToPlay);
                    System.out.println("Enter the minutes you want to play");
                    int amountToPlay = input.nextInt();
                    pet1.play(amountToPlay);
                    shelter.tick();
                    System.out.println("Here is Lola's new status");
                    System.out.println("Name\t\tType\tHunger\tThirst\tBored ");
                    System.out.println(pet1.toString());
                } else if (petNameToPlay.toLowerCase().equals("max")) {
                    System.out.println("You have selected " + petNameToPlay);
                    System.out.println("Enter the minutes you want to play");
                    int amountToPlay = input.nextInt();
                    pet2.play(amountToPlay);
                    shelter.tick();
                    System.out.println("Here is Max's new status");
                    System.out.println("Name\t\tType\tHunger\tThirst\tBored ");
                    System.out.println(pet2.toString());
                } else if (petNameToPlay.toLowerCase().equals("teddy")) {
                    System.out.println("You have selected " + petNameToPlay);
                    System.out.println("Enter the minutes you want to play");
                    int amountToPlay = input.nextInt();
                    pet3.play(amountToPlay);
                    shelter.tick();
                    System.out.println("Here is Teddy's new status");
                    System.out.println("Name\t\tType\tHunger\tThirst\tBored ");
                    System.out.println(pet3.toString());
                } else if (petNameToPlay.toLowerCase().equals("cuddle")) {
                    System.out.println("You have selected " + petNameToPlay);
                    System.out.println("Enter the minutes you want to play");
                    int amountToPlay = input.nextInt();
                    pet4.play(amountToPlay);
                    shelter.tick();
                    System.out.println("Here is Cuddle's new status");
                    System.out.println("Name\t\tType\tHunger\tThirst\tBored ");
                    System.out.println(pet4.toString());
                } else {
                    System.out.println("Back to the menu");
                }
                input.nextLine();
            } else if (response.equals("4")) {
                System.out.println("What pet would you like to adopt?");
                String petToAdopt = input.nextLine();
                if (petToAdopt.toLowerCase().equals("lola")) {
                    System.out.println("You have chosen Lola");
                    shelter.closeAPet(pet1);
                    System.out.println("Here are remaining pets: ");
                    System.out.println("Name\t\tType\tHunger\tThirst\tBored ");
                    System.out.println(pet2.toString());
                    System.out.println(pet3.toString());
                    System.out.println(pet4.toString());
                    System.out.println();
                } else if (petToAdopt.toLowerCase().equals("max")) {
                    System.out.println("You have chosen Max");
                    shelter.closeAPet(pet2);
                    System.out.println("Here are remaining pets: ");
                    System.out.println("Name\t\tType\tHunger\tThirst\tBored ");
                    System.out.println(pet1.toString());
                    System.out.println(pet3.toString());
                    System.out.println(pet4.toString());
                    System.out.println();
                } else if (petToAdopt.toLowerCase().equals("teddy")) {
                    System.out.println("You have chosen Teddy");
                    shelter.closeAPet(pet3);
                    System.out.println("Here are remaining pets: ");
                    System.out.println("Name\t\tType\tHunger\tThirst\tBored ");
                    System.out.println(pet1.toString());
                    System.out.println(pet2.toString());
                    System.out.println(pet4.toString());
                    System.out.println();
                    System.out.println();
                } else if (petToAdopt.toLowerCase().equals("cuddle")) {
                    System.out.println("You have chosen Cuddle");
                    shelter.closeAPet(pet4);
                    System.out.println("Here are remaining pets: ");
                    System.out.println("Name\t\tType\tHunger\tThirst\tBored ");
                    System.out.println(pet1.toString());
                    System.out.println(pet2.toString());
                    System.out.println(pet3.toString());
                    System.out.println();
                    System.out.println();
                } else {
                    System.out.println("Back to Menu");
                }
            } else if (response.equals("5")) {
                System.out.println("Please enter the name of the new pet joining the shelter");
                newPetName = input.next();
                input.nextLine();
                System.out.println("Enter the type of the new pet");
                newPetType = input.next();
                input.nextLine();
                System.out.println("Enter the hunger in numbers");
                newPetHunger = input.nextInt();
                input.nextLine();
                System.out.println("Enter the thirst in numbers");
                newPetThirst = input.nextInt();
                input.nextLine();
                System.out.println("Enter the bored in numbers");
                newPetBored = input.nextInt();
                input.nextLine();
                shelter.addNewPet(new VirtualPet(newPetName, newPetType, newPetHunger, newPetThirst, newPetBored));
                System.out.println("Here are all of the pets in our shelter");
                System.out.println("Name\t\tType\tHunger\tThirst\tBored ");
                System.out.println(pet1.toString());
                System.out.println(pet2.toString());
                System.out.println(pet3.toString());
                System.out.println(pet4.toString());
                System.out.println(newPetName.toString() + " \t\t" + newPetType.toString() + " \t\t" + newPetHunger
                        + " \t\t" + newPetThirst + " \t\t" + newPetBored);
            }
            System.out.println();
            System.out.println("What would you like to do next?");
            System.out.println("press 1 to feed all pets");
            System.out.println("press 2 to water all pets");
            System.out.println("press 3 to play with a pet");
            System.out.println("press 4 to adopt a pet");
            System.out.println("press 5 to admit a pet");
            System.out.println("press 6 to quit");

            response = input.nextLine();
        }
        System.out.println("Ciao, thank you for volunteering today!");
    }
}
//I know I'm not using the shelter properly in the App class, but followed the Bank
//which had the bank accounts in the App instead in the BankAccount class