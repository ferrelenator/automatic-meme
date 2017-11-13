package ui;

import data.Animal;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    
    private static Scanner scanner = new Scanner(System.in);    
    
    public static int MainMenu (){
        System.out.println("Welcome to the Pet Store: These are your options: ");
        System.out.println("1. See the list of animals stored in the system. ");
        System.out.println("2. Export the list of animals to a contacts book.");
        System.out.println("3. Add an animal to the list.");
        System.out.println("0. Exit the program.");
       return scanner.nextInt();
    }
    public static int ListOfAnimals (){
        
        System.out.println("Please select the animal you want to see the information about: ");
        System.out.println("If you want to exit, press 0.");
        return scanner.nextInt();  }
    public static void PrintPet (Animal Pet){
        System.out.println(Pet.toString());
    }
    
    public static int TypeOfAnimal(){
        System.out.println("What kind of animal would you like to add? ");
        System.out.println("1. Canary. ");
        System.out.println("2. Frog. ");
        System.out.println("3. Guinea Pig. ");
        System.out.println("4. Hamster. ");
        System.out.println("5. Parakeet. ");
        System.out.println("6. Snake. ");
        return scanner.nextInt();
    }
    
}
