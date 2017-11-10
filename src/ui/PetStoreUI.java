package ui;

import data.Animal;
import java.util.ArrayList;

public class PetStoreUI {
    
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
}
