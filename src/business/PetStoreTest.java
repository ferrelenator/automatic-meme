package business;

import data.Animal;
import ui.UI;
import data.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PetStoreTest implements Serializable{
        private static FileOutputStream fileStream;
        private static FileInputStream fileStrem ;
        private static ArrayList<Animal> animals ;
        
    public static void main(String[] args) {
        
        
        animals= new ArrayList<>();
        do{
            
            switch(UI.MainMenu()){
                case 0:
                    System.exit(0); 
                break;
                 case 1:
                     animals.forEach((animal) -> {
                         System.out.println("ID:"+animals.indexOf(animal)+" "+animal.toString());
                         UI.PrintPet(animal);
                    });                    
                break;
                case 2:
                    try{
                        fileStrem = new FileInputStream("src/DataBase/mascotas.db");
                        ObjectInputStream is = new ObjectInputStream(fileStrem);
                        for(int j = 0 ; j<=6;j++){
                                Animal animal;
                                animal = (Animal) is.readObject();
                                System.out.println(animal);
                        }
                        is.close();
                        fileStrem.close();
                    }catch (FileNotFoundException exception) {
                    }catch (IOException ex) {
                    Logger.getLogger(PetStoreTest.class.getName()).log(Level.SEVERE, null, ex);
                    }catch (ClassNotFoundException c) {
                        System.out.println("Class not found."); 
                        c.printStackTrace();
                        return;
                    }
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
                try{
                fileStream = new FileOutputStream("src/DataBase/mascotas.db");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                for (Animal animal : animals) {
                    os.writeObject(animal);  
                }
                os.close();
                fileStream.close();
                }catch(FileNotFoundException exception){} catch(IOException exception){};
        }while(true);
    }
}
