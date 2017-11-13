package business;

import data.Animal;
import ui.UI;
import data.*;
import java.util.ArrayList;


public class PetStoreTest {
        
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
                         UI.PrintPet(animal);
                    });                    
                break;
                case 2:
          
                break;
                case 3:
                    switch(UI.TypeOfAnimal()){
                        case 1:
                            animals.add(new Canary("...", "Red", "Canarius", 150));
                            break;
                        case 2:
                          //animals.add()
                            break;
                        case 3:
                          //animals.add()
                            break;
                        case 4:
                          //animals.add()
                            break;
                        case 5:
                          //animals.add()
                            break;
                        case 6:
                          //animals.add()
                            break;
                    }   
            }
                
        }while(true);
    }
}
