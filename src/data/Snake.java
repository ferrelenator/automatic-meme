package data;

import java.io.Serializable;

public class Snake extends Reptile implements Serializable{
    
    private boolean venomous;

    public Snake(boolean venomous, String skin, String name, int price) {
        super(skin, name, price);
        this.venomous = venomous;
    }

    public boolean isVenomous() {
        return venomous;
    }

    public void setVenomous(boolean venomous) {
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
    
    
    
}
