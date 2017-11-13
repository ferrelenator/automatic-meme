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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
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
public class FilePet implements Serializable {

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
            writer = new FileWriter("src/DataBase/MyPlainText.csv");
            writer.write("Name" + ", " + "Price" + ", " + "Main Characteristic" + ", " + "Secondary Characteristic");

            animals.forEach((animal) -> {
                try {
                    if (animal instanceof Canary) {
                        Canary canary = (Canary) animal;
                        writer.write(canary.getName() + ", " + canary.getPrice() + ", " + canary.getColor() + ", " + canary.getFavoriteTune());
                    } else if (animal instanceof Frog) {
                        Frog frog = (Frog) animal;
                        writer.write(frog.getName() + ", " + frog.getPrice() + ", " + frog.getSkin() + ", " + frog.getFood());
                    } else if (animal instanceof GuineaPig) {
                        GuineaPig guineapig = (GuineaPig) animal;
                        writer.write(guineapig.getName() + ", " + guineapig.getPrice() + ", " + guineapig.getSize() + ", " + guineapig.getLifeSpan());
                    } else if (animal instanceof Hamster) {
                        Hamster hamster = (Hamster) animal;
                        writer.write(hamster.getName() + ", " + hamster.getPrice() + ", " + hamster.getSize() + ", " + hamster.getHair());
                    } else if (animal instanceof Parakeet) {
                        Parakeet parakeet = (Parakeet) animal;
                        writer.write(parakeet.getName() + "," + parakeet.getPrice() + "," + parakeet.getColor() + ", " + parakeet.getChirping());
                    } else if (animal instanceof Snake) {
                        Snake snake = (Snake) animal;
                        writer.write(snake.getName() + ", " + snake.getPrice() + ", " + snake.getSkin() + ", " + snake.isVenomous());
                    }
                } catch (IOException exception) {
                };
            });

        } catch (IOException ex) {
        }
    }

}
