package src;
class Device {
    String name;
    int year;
    double price;
    String color;
    String type;
    public Device(String name, int year, double price, String color, String type) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Device{name='" + name + "', year=" + year + ", price=" + price + ", color='" + color + "', type='" + type + "'}";
    }
}
