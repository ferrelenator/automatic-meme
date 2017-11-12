package data;

import java.io.Serializable;

public class GuineaPig extends SmallPet implements Serializable{
    
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
    
    
}
