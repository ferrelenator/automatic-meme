package ui;

import data.Animal;
import java.util.ArrayList;

public class PetStoreUI {
    
    
    
    public static void MainMenu (){
        System.out.println("Welcome to the Pet Store: These are your options: ");
        System.out.println("1. See the list of animals stored in the system. ");
        System.out.println("2. Export the list of animals to a contacts book.");
        System.out.println("3. Add an animal to the list.");
        System.out.println("0. Exit the program.");
    }
    public static void ListOfAnimals (ArrayList<Animal> Animals){
        System.out.println("Welcome to my Pet Store");
        System.out.println("Please select the animal you want to see the information about: ");
        System.out.println("If you want to exit, press 0.");
        for(int index = 0 ; index <Animals.size() ; index++ ){
            System.out.println((index+1) + ". " + Animals.get(index).getName());
        }
        
        
    }
    
    public static void InformationOfAnimal (int index,ArrayList<Animal> Animals){
        System.out.println(PrintPet(Animals.get(index-1)));
    }
    
    public static String PrintPet (Animal Pet){
        return Pet.toString();
    }
    
    public static void TypeOfAnimal(){
        System.out.println("What kind of animal would you like to add? ");
        System.out.println("1. Canary. ");
        System.out.println("2. Frog. ");
        System.out.println("3. Guinea Pig. ");
        System.out.println("4. Hamster. ");
        System.out.println("5. Parakeet. ");
        System.out.println("6. Snake. ");
    }
    
}
