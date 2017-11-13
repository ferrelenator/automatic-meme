package data;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Canary extends Bird{
    
    private String favoriteTune;

    public Canary(String favoriteTune, String color, String name, int price) {
        super(color, name, price);
        this.favoriteTune = favoriteTune;
    }

    public String getFavoriteTune() {
        return favoriteTune;
    }

    public void setFavoriteTune(String favoriteTune) {
        System.out.println("What's my favorite tune? ");
        this.favoriteTune = favoriteTune;
    }

    @Override
    public String toString() {
        return super.toString().concat(" and my favorite tune is " + favoriteTune + ".");
    }        

    @Override
    public void savecsv(FileWriter writer) {
        try {
            writer.write(getName() + "," + getPrice() + "," + getColor() + "," + getFavoriteTune()+System.lineSeparator());
        } catch (IOException ex) {
            Logger.getLogger(Canary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
