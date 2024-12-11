package src;
public class Projector {
    String name;
    int year;
    double price;
    String manufacturer;
    public Projector(String name, int year, double price, String manufacturer) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.manufacturer = manufacturer;
    }
    @Override
    public String toString() {
        return "Projector{name='" + name + "', year=" + year + ", price=" + price + ", manufacturer='" + manufacturer + "'}";
    }
}
