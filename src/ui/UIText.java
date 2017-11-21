package ui;

import data.Animal;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UIText implements UI {
    
    private FileWriter writer;
    
    private static Scanner scanner = new Scanner(System.in);    
    
    public int MainMenu (ArrayList<Animal> animals){
        System.out.println("Welcome to the Pet Store: These are your animals: ");
         for(Animal animal:animals){
                         System.out.println("ID:"+animals.indexOf(animal)+" "+animal.toString());
                    }
         System.out.println(" These are your options: ");
        System.out.println("1. Export the list of animals to a contacts book.");
        System.out.println("2. Add an animal to the list.");
        System.out.println("0. Exit the program.");
       return scanner.nextInt();
    }
    public int TypeOfAnimal(){
        System.out.println("What kind of animal would you like to add? ");
        System.out.println("1. Canary. ");
        System.out.println("2. Frog. ");
        System.out.println("3. Guinea Pig. ");
        System.out.println("4. Hamster. ");
        System.out.println("5. Parakeet. ");
        System.out.println("6. Snake. ");
        return scanner.nextInt();
    }

    @Override
    public void exportPet(ArrayList<Animal> animals) {
        try {
            writer = new FileWriter("src/DataBase/PlainTextFile.csv");
            writer.write("Name" + "," + "Price" + "," + "Main Characteristic" + "," + "Secondary Characteristic" + System.lineSeparator());
            animals.forEach((animal) -> {
            animal.savecsv(writer);
            });
            writer.close();
             } catch (IOException ex) {
            Logger.getLogger(UIText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
