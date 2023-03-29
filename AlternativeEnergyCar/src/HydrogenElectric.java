public class HydrogenElectric extends ElectricMotor {
    protected String storageFormat;
    protected boolean isHybrid;

    public HydrogenElectric() {
        storageFormat = "NA";
        isHybrid = false;
    }

    public HydrogenElectric(int year, int doors, int power, double price, String manufacturer, String model, String country,
            String style, String layout, boolean inProduction, int maxRange, String storageFormat, double capacity, boolean isHybird) {
        super(year, doors, power, price, manufacturer, model, country, style, layout, inProduction, maxRange, capacity);
        this.storageFormat = storageFormat;
        this.isHybrid = isHybird;
    }

    public String getStorageFormat() {
        return storageFormat;
    }

    public void setStorageFormat(String storageFormat) {
        this.storageFormat = storageFormat;
    }

    public boolean isHybrid() {
        return isHybrid;
    }

    public void setHybrid(boolean isHybrid) {
        this.isHybrid = isHybrid;
    }

    public String formatCapacity() {
        return capacity + " kg hydrogen capicity. ";
    }

    public String formatPower(){
        return power + " kWs. ";
    }
    
    @Override
    public String toString() {
        return "Hydrogen Fuel Cell Car: " + this.carNameToString() + " | " + doors + " door " 
        + layout + " " + style + ", " + this.formatPower() + this.formatCapacity() + "Max range of " + this.maxRange + " miles."
        +". " + "Product of " + country + ". " + this.inProductionToString() + " " + formattedPrice();
    }

    @Override
    public void displayInfo() {
        System.out.println("Alternative Energy Car");
        System.out.println(this.carNameToString());
        System.out.println(formattedPrice());
        System.out.println(doors + " door " + layout + " " + style);
        System.out.println(this.formatPower() + this.formatCapacity());
        System.out.println("Max range: " + maxRange + " miles");
        System.out.println("Product of " + country);
        System.out.println(this.inProductionToString());
    }
}
