package data;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    private String name;
    private int price;
    
    public Animal(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString (){
        return "Hi, my name is " + name  + " " + "and my price is $" + price + " COP";
    }
}
