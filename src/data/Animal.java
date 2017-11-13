package data;

import java.io.Serializable;
import business.CsvPet;
public abstract class Animal implements Serializable,CsvPet {
    private String name;
    private int price;
    
    public Animal(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Animal(){};
    
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString (){
        return "Hi, my name is " + name  + " " + "and my price is $" + price + " COP";
    }

    
}
