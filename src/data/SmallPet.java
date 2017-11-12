package data;

import java.io.Serializable;

public abstract class SmallPet extends Animal implements Serializable{
    
    private int size;

    public SmallPet(int size, String name, int price) {
        super(name, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        System.out.println("What's my size(in centimeters)?");
        this.size = size;
    }
    
    @Override
    public String toString (){
        return super.toString().concat(", I have a size of " + size + "cm of height");
    }
        
}
