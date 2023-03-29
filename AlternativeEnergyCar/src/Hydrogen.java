public class Hydrogen extends Electric {
    String storageFormat, storageCapacity;

    public Hydrogen() {
        storageFormat = "NA";
        storageCapacity = "NA";
    }

    public Hydrogen(int year, int doors, int power, double price, String manufacturer, String model, String country,
            String style, String layout, boolean inProduction, int maxRange, String storageFormat,
            String storageCapacity) {
        super(year, doors, power, price, manufacturer, model, country, style, layout, inProduction, maxRange);
        this.storageFormat = storageFormat;
        this.storageCapacity = storageCapacity;
    }
    
}
