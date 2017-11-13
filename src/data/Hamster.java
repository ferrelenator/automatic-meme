package data;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hamster extends SmallPet{
    
    private String hair;

    public Hamster(String hair, int size, String name, int price) {
        super(size, name, price);
        this.hair = hair;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        System.out.println("Is my hair short, medium or long?");
        this.hair = hair;
    }

    @Override
    public String toString() {
        
        return super.toString().concat(" and my hair is " + hair + "." );
        
    }

    @Override
    public void savecsv(FileWriter writer) {
        try {
            writer.write(getName() + "," + getPrice() + "," + getSize() + "," + getHair()+System.lineSeparator());
        } catch (IOException ex) {
            Logger.getLogger(Hamster.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    
}
