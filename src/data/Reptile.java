package data;

import java.io.Serializable;

public abstract class Reptile extends Animal implements Serializable {
    
    private String skin;

    public Reptile(String skin, String name, int price) {
        super(name, price);
        this.skin = skin;
    }

    public Reptile(){};
    
    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        
        this.skin = skin;
    }

    @Override
    public String toString() {
        return super.toString().concat(", my skin is " + skin);
    }
    
    
    
}
