package data;

public abstract class Reptile extends Animal {
    
    private String skin;

    public Reptile(String skin, String name, int price) {
        super(name, price);
        this.skin = skin;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    @Override
    public String toString() {
        return super.toString().concat(", my skin is " + skin);
    }
    
    
    
}
