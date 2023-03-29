public class HydrogenElectric extends ElectricMotor {
    String engineType; 
    int storageCapacity;

    public HydrogenElectric() {
        engineType = "NA";
        storageCapacity = 0;
    }

    public HydrogenElectric(int year, int doors, int power, double price, String manufacturer, String model, String country,
            String style, String layout, boolean inProduction, int maxRange, String engineType,
            int storageCapacity) {
        super(year, doors, power, price, manufacturer, model, country, style, layout, inProduction, maxRange);
        this.engineType = engineType;
        this.storageCapacity = storageCapacity;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String capacityToString() {
        return storageCapacity + " kWh";
    }
    
    @Override
    public String toString() {
        return "Hydrogen Fuel Cell Car: " + this.carNameToString() + " | " + doors + " door " 
        + layout + " " + style + ", " + power + " horsepower. " + "Engine Type: " + engineType +
        "Max range of " + this.maxRange + " miles."
        +". " + "Product of " + country + ". " + this.inProductionToString() + " " + formattedPrice();
    }
}
