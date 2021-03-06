package TreePrac;


/**
 *
 * @author Danny Agamera
 */
public class Land {
    private double size;
    private String location;
    private int price;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    //constructor with three parameters
    public Land(double size, String location, int price){
        this.size = size;
        this.location = location;
        this.price = price;
    }
    
    public String toString(){
        return "The size of the land in acres is " + this.size + " and the location of the land is " + this.location + " and the price of the land is " + this.price;
    }
    
}
