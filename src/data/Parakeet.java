package data;

public class Parakeet extends Bird {
    
    private String chirping;

    public Parakeet(String chirping, String color, String name, int price) {
        super(color, name, price);
        this.chirping = chirping;
    }

    public String getChirping() {
        return chirping;
    }

    public void setChirping(String chirping) {
        this.chirping = chirping;
    }

    @Override
    public String toString() {
        return super.toString().concat(" and I chirp really " + chirping + ".");
    }
    
    
    
}
