public class Car {

//    // Variables before encapsulation
//    String model;
//    String color;
//    int year;
//    double price;

    // Variables after encapsulation
    private final String model; // final = can't be changed extra protection
    private String color;
    private int year;
    private double price;

    // Constructor
    Car(String model, String color, int year, double price) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    // GETTERS make the variables read-only
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getPrice() {
        if (price < 0.0) {
            return "Priceless";
        }
        return "€" + price;
    }

    // SETTERS make the variables write-only
    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
