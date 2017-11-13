package data;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Frog extends Reptile{
    
    private String food;

    public Frog(String food, String skin, String name, int price) {
        super(skin, name, price);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        System.out.println("What's my favorite food? ");
        this.food = food;
    }

    @Override
    public String toString() {
        return super.toString().concat(" and my favorite food is " + food + ".");
    }

    @Override
    public void savecsv(FileWriter writer) {
        try {
            writer.write(getName() + "," + getPrice() + "," + getSkin() + "," + getFood()+System.lineSeparator());
        } catch (IOException ex) {
            Logger.getLogger(Frog.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
