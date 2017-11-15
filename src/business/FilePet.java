/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.Animal;
import data.Canary;
import data.Frog;
import data.GuineaPig;
import data.Hamster;
import data.Parakeet;
import data.Snake;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import ui.NewJFrame;

/**
 *
 * @author Fenryr
 */
public class FilePet implements Serializable {

    public JFrame JFrame;
    private FileOutputStream fileStream;
    private FileInputStream fileStrem;
    private ArrayList<Animal> animals;
    private boolean load, save;
    private FileWriter writer;

    public FilePet() {

    }

    public ArrayList<Animal> loadPet() {

        try {
            fileStrem = new FileInputStream("src/DataBase/mascotas.db");
            ObjectInputStream os;
            try {
                os = new ObjectInputStream(fileStrem);
                Object list = os.readObject();
                animals = (ArrayList<Animal>) list;
            } catch (IOException ex) {
                Logger.getLogger(FilePet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException exe) {
            }

            try {
                fileStrem.close();
            } catch (IOException ex) {
                Logger.getLogger(FilePet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            animals = new ArrayList<>();
        }
        return animals;
    }

    public void savePet() {
        try {
            fileStream = new FileOutputStream("src/DataBase/mascotas.db");
            try (ObjectOutputStream os = new ObjectOutputStream(fileStream)) {
                os.writeObject(animals);
            }
            fileStream.close();
        } catch (FileNotFoundException exception) {
        } catch (IOException exception) {
        }
    }

    public void exportPet() {
        try {
            JFrame = new NewJFrame();

            JFileChooser Chooser= new JFileChooser();
            Chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            JFrame.add(Chooser);

            
            int rt = Chooser.showOpenDialog(JFrame); //someframe is  JFrame
            
            if (rt == JFileChooser.APPROVE_OPTION) {
                
                File file = Chooser.getSelectedFile(); //Do anything u want with this file
                writer = new FileWriter(file+"PlainTextFile.csv");
                writer.write("Name" + "," + "Price" + "," + "Main Characteristic" + "," + "Secondary Characteristic" + System.lineSeparator());
                animals.forEach((animal) -> {
                animal.savecsv(writer);
            });
            writer.close();
            }
            
        } catch (IOException ex) {
        }
    }

}
