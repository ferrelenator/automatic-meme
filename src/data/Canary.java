package data;

import java.io.Serializable;

public class Canary extends Bird implements Serializable {
    
    private String favoriteTune;

    public Canary(String favoriteTune, String color, String name, int price) {
        super(color, name, price);
        this.favoriteTune = favoriteTune;
    }

    public String getFavoriteTune() {
        return favoriteTune;
    }

    public void setFavoriteTune(String favoriteTune) {
        System.out.println("What's my favorite tune? ");
        this.favoriteTune = favoriteTune;
    }

    @Override
    public String toString() {
        return super.toString().concat(" and my favorite tune is " + favoriteTune + ".");
    }        
}
