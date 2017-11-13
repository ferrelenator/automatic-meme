package business;

import data.Animal;
import ui.UI;
import data.*;
import java.util.ArrayList;


public class PetStore {
        
        private static ArrayList<Animal> animals ;
        private static FilePet file;
        
    public static void main(String[] args) {
        file = new FilePet();
        animals=file.loadPet();
        program();
    }
    public static void program(){ 
        do{
            switch(UI.MainMenu()){
                case 0:
                    file.savePet();
                    System.exit(0); 
                break;
                 case 1:
                     animals.forEach((animal) -> {
                         System.out.println("ID:"+animals.indexOf(animal)+" "+animal.toString());
                    });                    
                break;
                case 2:
                    file.exportPet();
                break;
                case 3:
                    switch(UI.TypeOfAnimal()){
                        case 1:
                            animals.add(new Canary("...", "Red", "canary", 150));
                            break;
                        case 2:
                            animals.add(new Frog("flies","soft","Frogger",200));
                            break;
                        case 3:
                            animals.add(new GuineaPig("5 years",20,"Charlie",300));
                            break;
                        case 4:
                            animals.add(new Hamster("short",10,"Darius",100));
                            break;
                        case 5:
                            animals.add(new Parakeet("loud","Blue","Prince",250));
                            break;
                        case 6:
                            animals.add(new Snake(true,"Dry","Slinky",350));
                            break;
                    }   
            }
                
        }while(true);
    }
}
