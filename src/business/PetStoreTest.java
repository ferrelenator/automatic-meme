package business;

import data.Animal;
import data.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PetStoreTest {
    
    
    public static void main(String[] args) {
        FileOutputStream fileStream =null;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> Animals = new ArrayList<>();
        try{
        fileStream = new FileOutputStream("mascotas.obj");
        ObjectOutputStream os = new ObjectOutputStream(fileStream);
        
        
        Animal animal1 = new Canary("the four seasons of Vivaldi","Green","Piolin",300000);
        Animals.add(animal1);
        Animal animal2 = new Frog("Flies","Soft","Leonardo",231000);
        Animals.add(animal2);
        Animal animal3 = new GuineaPig("5 to 7 years",10,"Charlie",400000);
        Animals.add(animal3);
        Animal animal4 = new Hamster("Long",5,"Hamtaro",100000);
        Animals.add(animal4);
        Animal animal5 = new Parakeet("Loud","Blue","Claus",250500);
        Animals.add(animal5);
        Animal animal6 = new Snake(true,"Soft","Stampy",342000);
        Animals.add(animal6);
        
        os.writeObject(animal1);
        os.writeObject(animal2);
        os.writeObject(animal3);
        os.writeObject(animal4);
        os.writeObject(animal5);
        os.writeObject(animal6);
        
            System.out.println(animal1);
        
        os.close();
        }catch(FileNotFoundException exception){} catch (IOException ex) {
            Logger.getLogger(PetStoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        do{
            ui.PetStoreUI.ListOfAnimals(Animals);
            int a = scanner.nextInt();
            if(a==0){
                System.exit(0);
            }
            ui.PetStoreUI.InformationOfAnimal(a, Animals);
        }while(true);
    }
}
