package data;

public class Hamster extends SmallPet{
    
    private String hair;

    public Hamster(String hair, int size, String name, int price) {
        super(size, name, price);
        this.hair = hair;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    @Override
    public String toString() {
        
        return super.toString().concat(" and my hair is " + hair + "." );
        
    }
    
    
}
