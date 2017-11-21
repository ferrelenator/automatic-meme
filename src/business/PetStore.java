package business;

import data.Animal;
import ui.UI;
import data.*;
import java.util.ArrayList;
import ui.UISwing;
import ui.UIText;


public class PetStore {
        
        private static ArrayList<Animal> animals ;
        private static FilePet file;
        private static UI ui;
        
   private static void selectUI(String[] args) {
        if (args.length == 0) {
            ui = new UISwing();
        } else if (args[0].equals("text")) {
            ui = new UIText();
        } else {
            ui = new UISwing();
        }
    }

    public static void main(String[] args) {
        selectUI(args);
        
        file = new FilePet();
        animals=file.loadPet();
        
        program();
    }
    public static void program(){ 
        do{
            switch(ui.MainMenu(animals)){
                case 0:
                    file.savePet();
                    System.exit(0); 
                break;
                case 1:
                    ui.exportPet(animals);
                break;
                case 2:
                    switch(ui.TypeOfAnimal()){
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
                        case 0:
                            break;
                    }   
            }
                
        }while(true);
    }
}
