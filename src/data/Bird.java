package data;

public abstract class Bird extends Animal{
    
    private String color;

    public Bird(String color, String name, int price) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString().concat(", my color is " + color);
    }
    
    
    
}
