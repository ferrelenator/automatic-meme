package data;

public abstract class SmallPet extends Animal{
    
    private int size;

    public SmallPet(int size, String name, int price) {
        super(name, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    @Override
    public String toString (){
        return super.toString().concat(", I have a size of " + size + "cm of height");
    }
        
}
