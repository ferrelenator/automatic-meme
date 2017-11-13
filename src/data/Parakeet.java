package data;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Parakeet extends Bird{
    
    private String chirping;

    public Parakeet(String chirping, String color, String name, int price) {
        super(color, name, price);
        this.chirping = chirping;
    }

    public String getChirping() {
        return chirping;
    }

    public void setChirping(String chirping) {
        System.out.println("Chirp loud, medium or soft?");
        this.chirping = chirping;
    }

    @Override
    public String toString() {
        return super.toString().concat(" and I chirp really " + chirping + ".");
    }

    @Override
    public void savecsv(FileWriter writer) {
        try {
            writer.write(getName() + "," + getPrice() + "," +getColor() + "," + getChirping()+System.lineSeparator());
        } catch (IOException ex) {
            Logger.getLogger(Parakeet.class.getName()).log(Level.SEVERE, null, ex);
        }
                      }
    
    
    
}
