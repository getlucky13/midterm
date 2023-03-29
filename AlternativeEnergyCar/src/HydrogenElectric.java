public class HydrogenElectric extends ElectricMotor {
    int storageCapacity;

    public HydrogenElectric() {
        storageCapacity = 0;
    }

    public HydrogenElectric(int year, int doors, int power, double price, String manufacturer, String model, String country,
            String style, String layout, boolean inProduction, int maxRange, int storageCapacity) {
        super(year, doors, power, price, manufacturer, model, country, style, layout, inProduction, maxRange);
        this.storageCapacity = storageCapacity;
    }


    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String capacityToString() {
        return storageCapacity + " kWh battery. ";
    }
    
    @Override
    public String toString() {
        return "Hydrogen Fuel Cell Car: " + this.carNameToString() + " | " + doors + " door " 
        + layout + " " + style + ", " + power + " horsepower. " + capacityToString() + "Max range of " + this.maxRange + " miles."
        +". " + "Product of " + country + ". " + this.inProductionToString() + " " + formattedPrice();
    }
}
