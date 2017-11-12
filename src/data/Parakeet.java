package data;

import java.io.Serializable;

public class Parakeet extends Bird implements Serializable{
    
    private String chirping;

    public Parakeet(String chirping, String color, String name, int price) {
        super(color, name, price);
        this.chirping = chirping;
    }

    public String getChirping() {
        return chirping;
    }

    public void setChirping(String chirping) {
        System.out.println("Chirp loud, medium or soft?");
        this.chirping = chirping;
    }

    @Override
    public String toString() {
        return super.toString().concat(" and I chirp really " + chirping + ".");
    }
    
    
    
}
