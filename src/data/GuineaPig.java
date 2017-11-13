package data;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GuineaPig extends SmallPet{
    
    private String lifeSpan;

    public GuineaPig(String lifeSpan, int size, String name, int price) {
        super(size, name, price);
        this.lifeSpan = lifeSpan;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        System.out.println("How much is my lifespan? ");
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        
        return super.toString().concat(", and my lifespan is about " + lifeSpan );
                
    }

    @Override
    public void savecsv(FileWriter writer) {
        try {
            writer.write(getName() + "," + getPrice() + "," + getSize() + "," + getLifeSpan()+System.lineSeparator());
        } catch (IOException ex) {
            Logger.getLogger(GuineaPig.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
