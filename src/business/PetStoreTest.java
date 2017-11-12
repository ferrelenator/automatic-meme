package business;

import data.Animal;
import data.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PetStoreTest {
    
    
    public static void main(String[] args) {
        
        
        FileOutputStream fileStream =null;
        FileInputStream fileStrem = null;
        Scanner scanner = new Scanner(System.in);    
        ArrayList<Animal> Animals = new ArrayList<>();
        
        do{
            ui.PetStoreUI.MainMenu();
            int a = scanner.nextInt();
            if(a==0){
                System.exit(0);
            }else if(a==1){
                ui.PetStoreUI.ListOfAnimals(Animals);
                try{
                    fileStrem = new FileInputStream("C:\\Users\\ferre\\Documents\\NetBeansProjects\\TiendaDeAnimales\\mascotas.db");
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
                };
                
                
                
            }else if(a==2){
                
            }else if(a==3){
                ui.PetStoreUI.TypeOfAnimal();
                Snake snake = new Snake();
                int b = scanner.nextInt();
                if(b==1){
                    System.out.println("Creating canary: ");
                }else if(b==2){
                    System.out.println("Creating Frog: ");
                }else if(b==3){
                    System.out.println("Creating Guinea Pig: ");
                }else if(b==4){
                    System.out.println("Creating Hamster: ");
                }else if(b==5){
                    System.out.println("Creating Parakeet: ");
                }else if(b==6){
                    System.out.println("Creating Snake: ");
                    System.out.println("What will be my name: ");
                    String c=scanner.next();
                    snake.setName(c);
                    System.out.println("What kind of skin do I have? ");
                    c=scanner.next();
                    snake.setSkin(c);
                    System.out.println("Am I venomous? true or false");
                    snake.setVenomous(scanner.nextBoolean());
                }
                try{
                fileStream = new FileOutputStream("C:\\Users\\ferre\\Documents\\NetBeansProjects\\TiendaDeAnimales\\mascotas.db");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(snake);
                os.close();
                fileStream.close();
                }catch(FileNotFoundException exception){} catch(IOException exception){};
            }
            
        }while(true);
    }
}
