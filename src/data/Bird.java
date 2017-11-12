package data;

import java.io.Serializable;

public abstract class Bird extends Animal implements Serializable{
    
    private String color;

    public Bird(String color, String name, int price) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        System.out.println("What's my color? ");
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString().concat(", my color is " + color);
    }
    
    
    
}
