package data;

import java.io.Serializable;

public class Frog extends Reptile implements Serializable {
    
    private String food;

    public Frog(String food, String skin, String name, int price) {
        super(skin, name, price);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return super.toString().concat(" and my favorite food is " + food + ".");
    }
}
