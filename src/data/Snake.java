package data;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Snake extends Reptile{
    
    private boolean venomous;

    public Snake(boolean venomous, String skin, String name, int price) {
        super(skin, name, price);
        this.venomous = venomous;
    }
    
    public Snake(){};
    
    public boolean isVenomous() {
        return venomous;
    }

    public void setVenomous( boolean venomous) {
        
        this.venomous = venomous;
    }

    @Override
    public String toString() {
        if(venomous == true){
            return super.toString().concat(" and I'm very venomous");
        }else{
            return super.toString().concat(" and I'm not venomous");
        }
    }

    @Override
    public void savecsv(FileWriter writer) {
        try {
            writer.write(getName() + "," + getPrice() + "," + getSkin() + "," + isVenomous()+System.lineSeparator());
        } catch (IOException ex) {
            Logger.getLogger(Snake.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    
    
}
