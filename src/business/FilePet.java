/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.Animal;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fenryr
 */
public class FilePet implements Serializable{
    
    private FileOutputStream fileStream;
    private FileInputStream fileStrem ;
    private ArrayList<Animal> animals;
    private boolean load,save;
    
    public FilePet(){
        
    }
    
    public ArrayList<Animal> loadPet()  {
        
        try {
            fileStrem = new FileInputStream("src/DataBase/mascotas.db");
            ObjectInputStream os;
            try {
                os = new ObjectInputStream(fileStrem);
                Object list=os.readObject();
            animals= (ArrayList<Animal>) list;   
            } catch (IOException ex) {
                Logger.getLogger(FilePet.class.getName()).log(Level.SEVERE, null, ex);
            } catch(ClassNotFoundException exe){}
               
            try {
                fileStrem.close();
            } catch (IOException ex) {
                Logger.getLogger(FilePet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            animals=new ArrayList<>();
        }
        return animals;
    }
        
    public void savePet(){
      try{
                fileStream = new FileOutputStream("src/DataBase/mascotas.db");
          try (ObjectOutputStream os = new ObjectOutputStream(fileStream)) {
              os.writeObject(animals);
          }
                fileStream.close();
                }catch(FileNotFoundException exception){} catch(IOException exception){}
    }

   
    
}
