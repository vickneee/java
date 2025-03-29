public class Part {

    // Encapsulated variables
    private String identifier;
    private String manufacturer;
    private String model;
    private double price;

    // Constructor
    public Part(String identifier, String manufacturer, String model, double price) {
        this.identifier = identifier;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    // Setters
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getIdentifier() {
        return identifier;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    // Override the toString() method to provide a string representation of the Part object
    @Override
    public String toString() {
        return model + " (" + price + "€)";
    }

    // Override the equals() method to compare Part objects
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Part compared = (Part) obj;

        return this.identifier != null && this.identifier.equals(compared.getIdentifier());
    }

}
