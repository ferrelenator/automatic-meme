package data;

public class GuineaPig extends SmallPet{
    
    private String lifeSpan;

    public GuineaPig(String lifeSpan, int size, String name, int price) {
        super(size, name, price);
        this.lifeSpan = lifeSpan;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        
        return super.toString().concat(", and my lifespan is about " + lifeSpan );
                
    }
    
    
}
